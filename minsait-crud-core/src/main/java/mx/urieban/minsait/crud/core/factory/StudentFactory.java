package mx.urieban.minsait.crud.core.factory;

import mx.urieban.minsait.crud.core.dto.StudentDTO;
import mx.urieban.minsait.crud.dax.entity.Student;

/**
 * Clase Factory para transformar Objetos Studen
 * 
 * @author uesteban
 *
 */
public class StudentFactory {

	/**
	 * M&eacute;todo para transforfar Student en StudentDTO
	 * @param student
	 * @return
	 */
	public static StudentDTO factoryDTO(Student student) {
		StudentDTO dto = new StudentDTO();
		dto.setId(student.getId());
		dto.setName(student.getName());
		dto.setLastName(student.getLastName());
		dto.setAge(student.getAge());
		return dto;
	}

	/**
	 * M&eacute;todo para transforfar StudentDTO en Student
	 * @param dto
	 * @return
	 */
	public static Student factoryEntity(StudentDTO dto) {
		Student student = new Student();
		student.setId(dto.getId());
		student.setName(dto.getName());
		student.setLastName(dto.getLastName());
		student.setAge(dto.getAge());
		return student;
	}

}
