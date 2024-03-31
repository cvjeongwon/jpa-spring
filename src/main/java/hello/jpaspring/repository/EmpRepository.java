package hello.jpaspring.repository;

import hello.jpaspring.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpRepository extends JpaRepository<Emp, Integer>{

}
