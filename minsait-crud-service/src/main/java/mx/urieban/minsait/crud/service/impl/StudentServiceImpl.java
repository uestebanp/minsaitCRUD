package mx.urieban.minsait.crud.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.urieban.minsait.crud.core.dto.StudentDTO;
import mx.urieban.minsait.crud.core.exception.MinsaitDataAccessException;
import mx.urieban.minsait.crud.core.factory.StudentFactory;
import mx.urieban.minsait.crud.dax.dao.StudentRepository;
import mx.urieban.minsait.crud.dax.entity.Student;
import mx.urieban.minsait.crud.service.StudentService;

/**
 * Clase que implementa a {@link StudentService}
 * 
 * @author uesteban
 *
 */
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public StudentDTO save(StudentDTO student) throws MinsaitDataAccessException {
		return StudentFactory.factoryDTO(this.getStudentRepository().save(StudentFactory.factoryEntity(student)));
	}

	@Override
	public StudentDTO findById(Long id) throws MinsaitDataAccessException {
		Optional<Student> optional = this.getStudentRepository().findById(id);
		if (optional.isPresent()) {
			return StudentFactory.factoryDTO(optional.get());
		} else {
			throw new MinsaitDataAccessException("No existe el estudiante");
		}
	}

	@Override
	public List<StudentDTO> findAll() throws MinsaitDataAccessException {
		List<StudentDTO> allStudent = new ArrayList<>();
		this.getStudentRepository().findAll().forEach(action->{
			allStudent.add(StudentFactory.factoryDTO(action));
		});
		return allStudent;
	}

	@Override
	public void delete(Long id) throws MinsaitDataAccessException {
		this.getStudentRepository().deleteById(id);

	}

	@Override
	public StudentDTO update(StudentDTO student) throws MinsaitDataAccessException {
		return StudentFactory.factoryDTO(this.getStudentRepository().save(StudentFactory.factoryEntity(student)));
	}

	/**
	 * @return the studentRepository
	 */
	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	/**
	 * @param studentRepository the studentRepository to set
	 */
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

}
