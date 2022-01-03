package spring.mvc.Controller;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.Entity.Attendance;
import spring.mvc.Entity.CompanyRequest;
import spring.mvc.Entity.Manpower;
import spring.mvc.Entity.RequestManpower;
import spring.mvc.Entity.SalaryFields;
import spring.mvc.Repository.AttendanceRepository;
import spring.mvc.Repository.CompanyRequestRepository;
import spring.mvc.Repository.ManpowerRepository;
import spring.mvc.Repository.RequestManpowerRepository;
import spring.mvc.Repository.SalaryRepository;

@Controller
public class DashboardController {
	@Autowired
	ManpowerRepository mpr;

	int employeeId;

	@RequestMapping("/dh")
	public String dash(Model m) {
		m.addAttribute("totalmanpower", mpr.findAll().size());
		m.addAttribute("requestManpower", rmrep.findByStatus("pending"));
		m.addAttribute("requestcompany", crr.findByStatus("pending"));
		return "dh";
	}

	@RequestMapping("/addnewmanpower")
	public String addnewmanpower(Model m) {
		m.addAttribute("totalmanpower", mpr.findAll().size());
		return "addnewmanpower";
	}

	// addmanpowerprocess for save//
	@PostMapping("/addmanpowerprocess")
	public String addmanpowerprocess(@ModelAttribute Manpower manpower, Model m) {
		mpr.save(manpower);
		m.addAttribute("totalmanpower", mpr.findAll().size());
		return "addnewmanpower";
	}

	@RequestMapping("/manpowerdetails")
	public String manpowerdetails(Model m) {
		List<Manpower> manpowerall = mpr.findAll();
		m.addAttribute("manpowerall", manpowerall);
		m.addAttribute("totalmanpower", manpowerall.size());
		return "manpowerdetails";
	}

	@RequestMapping("/update")
	public String manpowerUpdate(Model model) {
		Optional<Manpower> findById = mpr.findById(employeeId);
		Manpower manpower = findById.get();
		model.addAttribute("manpower", manpower);
		return "manpowerUpdateForm";
	}

	@RequestMapping("/manpowerUpdate/{empId}")
	public String manpowerUpdateForm(@PathVariable("empId") int empId) {
		employeeId = empId;
		System.out.println(empId);
		return "redirect:/update";
	}

	@RequestMapping("/manpowerDelete/{empId}")
	public String manpowerdelete(@PathVariable("empId") int empId) {
		mpr.deleteById(empId);
		return "redirect:/manpowerdetails";
	}

	@PostMapping("/updateManpowerProcess")
	public String updateManpowerProcess(@ModelAttribute Manpower manpower) {
		mpr.save(manpower);
		return "redirect:/manpowerdetails";
	}

	// ---------------------------------------Request Manpower
	// Mapping----------------------------------//
	@Autowired
	RequestManpowerRepository rmrep;
	int requestid;

	@RequestMapping("/index")
	public String index(Model model) {
		return "index";
	}

	@PostMapping("/AddRequestManpower")
	public String requestManpower(@ModelAttribute RequestManpower reqmanp) {
		rmrep.save(reqmanp);
		return "index";
	}

	@RequestMapping("/cancelrequest/{id}")
	public String cancelRequest(@PathVariable("id") int rid) {
		RequestManpower requestManpower = rmrep.findById(rid).get();
		requestManpower.setStatus("postpond");
		rmrep.save(requestManpower);
		return "redirect:/dh";
	}

	@RequestMapping("/requestUpdate")
	public String requestupdate(Model m) {
		RequestManpower requestmanpower = rmrep.findById(requestid).get();
		m.addAttribute("requestmanpower", requestmanpower);

		return "requestUpdateForm";
	}

	@RequestMapping("/requestupdateform/{id}")
	public String requestupdateForm(@PathVariable("id") int rid) {
		requestid = rid;
		System.out.println(rid);
		return "redirect:/requestUpdate";
	}

	@PostMapping("/approveRequest")
	public String approveRequest(@ModelAttribute Manpower manpower, @RequestParam("id") int id) {

		mpr.save(manpower);
		rmrep.deleteById(id);
		return "redirect:/dh";
	}

	// ---------------------------------------Company Request
	// Mapping----------------------------------//

	@Autowired
	CompanyRequestRepository crr;
	int companyId;

	@RequestMapping("/companyRequest")
	public String companyRequest(@ModelAttribute CompanyRequest crequest) {
		crr.save(crequest);
		return "index";
	}

	@RequestMapping("/cancelCompanyrequest/{id}")
	public String cancelCompany(@PathVariable("id") int cid) {
		CompanyRequest companyReq = crr.findById(cid).get();
		companyReq.setStatus("postpond");
		crr.save(companyReq);
		return "redirect:/dh";
	}

	@RequestMapping("/approveCompany/{id}")
	public String approveCompany(@PathVariable("id") int cid) {
		CompanyRequest companyReq = crr.findById(cid).get();
		companyReq.setStatus("Approved");
		crr.save(companyReq);
		return "redirect:/dh";
	}

	@RequestMapping("/companyDetails")
	public String companyDetails(Model m) {
		m.addAttribute("totalmanpower", mpr.findAll().size());
		m.addAttribute("companyall", crr.findByStatus("Approved"));
		return "companyDetails";
	}

	// -------------------------------------Attendance-----------------------//

	@Autowired
	AttendanceRepository att;

	@RequestMapping("/attendance")
	public String attendance(Model model) {
		model.addAttribute("empId", mpr.findAll());
		Manpower man = new Manpower();
		model.addAttribute("empDetails", man);
		return "attendance";
	}

	@RequestMapping("/getEmpDetails/{Id}")
	public String getEmpDetails(@PathVariable("Id") int Id, Model model) {
		model.addAttribute("empId", mpr.findAll());
		model.addAttribute("empDetails", mpr.findById(Id).get());
		return "attendance";
	}

	@PostMapping("/attendanceprocess")
	public String attendanceprocess(@ModelAttribute Attendance attendance) {
		att.save(attendance);
		return "redirect:/attendance";
	}

	@RequestMapping("/attendanceDetails")
	public String attendanceDetails(Model m) {
		List<Attendance> attendanceDetails = att.findAll();
		m.addAttribute("attendanceDetails", attendanceDetails);
		m.addAttribute("totalmanpower", mpr.findAll().size());
		return "attendanceDetails";
	}

	// -----------------------------------------Employee
	// LogIn----------------------------------//

	@PostMapping("/empLogIn")
	public String empLogIn(@ModelAttribute Manpower manpower) {
		List<Manpower> login = mpr.findByDobAndFirstname(manpower.getDob(), manpower.getFirstname());
		if(login.size()!=0) {
			return "redirect:/attendance";
		}
		else {
			return "index";
		}
	}
	
	//---------------------------------------------Salary------------------------------------------------//
	
	
	@Autowired
	SalaryRepository salaryRepository;
	
	@RequestMapping("/salaryForm")
	public String salaryForm(Model model) {
		model.addAttribute("empId",mpr.findAll());
		Manpower man = new Manpower();
		model.addAttribute("empDetails", man);
		return "salaryForm";
		}
	@RequestMapping("/getEmpSalaryDetails/{id}")
	public String getEmpSalaryDetails(@PathVariable("id") int Id ) {
		employeeId=Id;
		return "redirect:/jhamela";
	}
	@RequestMapping("/jhamela")
	public String jhamela(Model model) {
		model.addAttribute("empId", mpr.findAll());
		Manpower manpower = mpr.findById(employeeId).get();
		model.addAttribute("empDetails", manpower);
		
//------------------------------Salary Calculation----------------------------------//
	
	
		Double salary = manpower.getSalary();
		double houserent=(salary*30/100);
		model.addAttribute("houseRent",houserent);
		double medicalAllowance=(salary*20/100);
		model.addAttribute("medicalAllowance",medicalAllowance);
		double transport = (salary*10/100);
		model.addAttribute("transport",transport);
		double grossSalary=salary+houserent+medicalAllowance+transport;
		model.addAttribute("grossSalary",grossSalary);
		
		double providentfund=(salary*20/100);
		model.addAttribute("providentfund",providentfund);
		double tax=0.0;
		if(salary>=40000) {
			tax=(salary*5/100);
			model.addAttribute("tax",tax);
		}else {
			tax=0.0;
			model.addAttribute("tax",tax);
		}
		
		double absent=0.0;
		model.addAttribute("absent",absent);
		
		double totalDeduction = providentfund+tax+absent;
		model.addAttribute("totalDeduction",totalDeduction);
		
		double netSalary=grossSalary-totalDeduction;
		model.addAttribute("netSalary",netSalary);

		return "salaryForm";
	}
	@PostMapping("/salaryProcess")
	public String salaryProcess(@ModelAttribute SalaryFields salary) {
		salaryRepository.save(salary);
		return "redirect:/salaryForm";
		
	}
	
	@RequestMapping("/salaryInformations")
	public String SalaryInformations(Model m) {
		List<SalaryFields> salary = salaryRepository.findAll();
		m.addAttribute("salaryInformations", salary);
		m.addAttribute("totalmanpower", mpr.findAll().size());
		return "salaryInformations";
	}
}
