package spring.mvc.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.mvc.Entity.CompanyRequest;
import spring.mvc.Entity.RequestManpower;

public interface CompanyRequestRepository extends JpaRepository<CompanyRequest, Integer>{
	public List<CompanyRequest> findByStatus(String status);
}
