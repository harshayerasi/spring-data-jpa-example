/**
 * 
 */
package in.jpa.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author HarshaYerasi
 *
 */
@Entity(name = "departments")
@Getter @Setter @ToString
public class Department {

	@Id
	@Column(name = "dept_no")
	@NotNull
	private String deptNo;
	
	@Column(name = "dept_name")
	@NotNull
	private String deptName;
	
}
