package mx.urieban.minsait.crud.dax.dao.impl;

import java.sql.SQLWarning;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.SQLWarningException;
import org.springframework.stereotype.Service;

import mx.urieban.minsait.crud.dax.dao.StudentDAO;
import mx.urieban.minsait.crud.dax.dao.StudentRepository;
import mx.urieban.minsait.crud.dax.entity.Student;

/**
 * Clase que implementa a {@link StudentDAO}
 * 
 * @author uesteban
 *
 */
@Service
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private StudentRepository studentRepository;

	public Student save(Student student) throws DataAccessException {
		return this.getStudentRepository().save(student);
	}

	public Student findById(Long id) throws DataAccessException {
		Optional<Student> optional = this.getStudentRepository().findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			throw new SQLWarningException("No existe el estudiante",
					new SQLWarning("find by id", "No se pudo obtener informacion"));
		}
	}

	public List<Student> findAll() throws DataAccessException {
		return this.getStudentRepository().findAll();
	}

	public void delete(Long id) throws DataAccessException {
		this.getStudentRepository().deleteById(id);
	}

	public Student update(Student student) throws DataAccessException {
		return this.getStudentRepository().save(student);
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
