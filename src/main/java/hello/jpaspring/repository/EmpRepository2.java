package hello.jpaspring.repository;

import hello.jpaspring.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmpRepository2 extends JpaRepository<Emp, Integer>{
	public List<Emp> findByEname(String name);
	public List<Emp> findByEnameIgnoreCase(String name);
	public List<Emp> findByJob(String job);
	public List<Emp> findByJobOrDeptno(String job, int dno);
	public List<Emp> findByJobAndDeptno(String job, int dno);
	public List<Emp> findDistinctByJob(String job);
	public List<Emp> findByDeptno(int dno);
	public List<Emp> findBySalGreaterThan(int inputsal);
	public List<Emp> findBySalGreaterThanEqual(int inputsal);
	public List<Emp> findBySalLessThan(int inputsal);
	public List<Emp> findBySalLessThanEqual(int inputsal);
	public List<Emp> findBySalBetween(int minsal, int maxsal);
	public List<Emp> findByCommNull();
	public List<Emp> findByCommNotNull();
	public List<Emp> findByHiredateAfter(java.sql.Date d);
	public List<Emp> findByHiredateBefore(java.sql.Date d);
	public List<Emp> findByEnameStartsWith(String partname);
	public List<Emp> findByEnameContains(String partname); // like in(partname1, partname2. ...)
	public List<Emp> findByDeptnoOrderBySalDesc(int dno);
	public List<Emp> findTop3ByDeptnoOrderBySalDesc(int dno); // 월급 많은 순으로 정렬해서 limit 3 , 메소드만 선언하면 수행코드는 스프링이 제공한다.
}
/**
 * 작명한 메소드가 수행할 Controller 는 없다.우리는 웹에서 요청해서 테스트 해야 하는데?
 * 이 EmpRepository2.java 에 있는 메소드가 수행되는지를 알아보기위해 test 프로그램을 작성합니다.
 * test > java  폴더에 있는 hello.jpaspring > JPA_EmpRepository2Test2
 */