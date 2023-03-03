package mx.urieban.minsait.crud.dax.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.core.RepositoryCreationException;

import mx.urieban.minsait.crud.dax.entity.Student;

/**
 * Interface de comunicaci&oacute;n para acceso a base de datos para la tabla
 * STUDENT
 * 
 * @author uesteban
 *
 */
public interface StudentDAO {

	/**
	 * DAX que salva al estudiante en Tabla
	 * 
	 * @param student
	 * @return
	 * @throws RepositoryCreationException
	 */
	public Student save(Student student) throws DataAccessException;

	/**
	 * DAX para obtener informaci&oacute;n de un estudiante por id
	 * 
	 * @param id
	 * @return
	 * @throws DataAccessException
	 */
	public Student findById(Long id) throws DataAccessException;

	/**
	 * DAX para obtener todos los estudiantes
	 * 
	 * @return
	 * @throws DataAccessException
	 */
	public List<Student> findAll() throws DataAccessException;

	/**
	 * DAX para eliminar un estudiante por ID
	 * 
	 * @param id
	 * @return
	 * @throws DataAccessException
	 */
	public void delete(Long id) throws DataAccessException;

	/**
	 * DAX para actualizar estudiante
	 * 
	 * @param student
	 * @return
	 * @throws DataAccessException
	 */
	public Student update(Student student) throws DataAccessException;

}
