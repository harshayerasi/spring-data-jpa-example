/**
 * 
 */
package in.jpa.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import in.jpa.example.constant.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author HarshaYerasi
 *
 */
@Entity(name = "employees")
@Getter @Setter @ToString
public class Employee {
	
	@Id
	@Column(name = "emp_no")
	@NotNull
	private Integer empNo;

	@Column(name = "birth_date")
	@NotNull
	private LocalDate birthDate;

	@Column(name = "first_name")
	@NotNull
	private String firstName;

	@Column(name = "last_name")
	@NotNull
	private String lastName;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Column(name = "hire_date")
	@NotNull
	private LocalDate hireDate;
}
