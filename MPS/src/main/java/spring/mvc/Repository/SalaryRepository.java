package spring.mvc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.mvc.Entity.SalaryFields;

@Repository
public interface SalaryRepository extends JpaRepository<SalaryFields, Integer>{

}
