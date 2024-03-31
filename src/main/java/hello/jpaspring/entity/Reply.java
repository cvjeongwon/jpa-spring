package hello.jpaspring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Reply {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String content;
	//@BatchSize(size = 5)
	@ManyToOne( optional = false ) 
	@JoinColumn(name="refid")
	private Meeting refid;
}
