package hello.jpaspring.repository;

import hello.jpaspring.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisitorRepository extends JpaRepository<Visitor, Integer>{

	public List<Visitor> findByMemoContains(String keyword);	
	
}
