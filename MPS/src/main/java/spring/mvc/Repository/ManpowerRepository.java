package spring.mvc.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.mvc.Entity.Manpower;

@Repository
public interface ManpowerRepository extends JpaRepository<Manpower, Integer>{
	public List<Manpower> findByDobAndFirstname(Date dob,String firstname);

}
