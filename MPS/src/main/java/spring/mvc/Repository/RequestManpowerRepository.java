package spring.mvc.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.mvc.Entity.RequestManpower;
@Repository
public interface RequestManpowerRepository extends JpaRepository<RequestManpower, Integer>{
	
	public List<RequestManpower> findByStatus(String status);

}
