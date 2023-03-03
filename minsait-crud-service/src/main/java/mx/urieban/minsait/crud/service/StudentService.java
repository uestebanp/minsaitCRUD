package mx.urieban.minsait.crud.service;

import java.util.List;

import mx.urieban.minsait.crud.core.dto.StudentDTO;
import mx.urieban.minsait.crud.core.exception.MinsaitDataAccessException;

public interface StudentService {
	
	/**
	 * DAX que salva al estudiante en Tabla
	 * 
	 * @param student
	 * @return
	 * @throws RepositoryCreationException
	 */
	public StudentDTO save(StudentDTO student)throws MinsaitDataAccessException;

	/**
	 * DAX para obtener informaci&oacute;n de un estudiante por id
	 * 
	 * @param id
	 * @return
	 * @throws DataAccessException
	 */
	public StudentDTO findById(Long id)throws MinsaitDataAccessException;

	/**
	 * DAX para obtener todos los estudiantes
	 * 
	 * @return
	 * @throws DataAccessException
	 */
	public List<StudentDTO> findAll() throws MinsaitDataAccessException;

	/**
	 * DAX para eliminar un estudiante por ID
	 * 
	 * @param id
	 * @return
	 * @throws DataAccessException
	 */
	public void delete(Long id) throws MinsaitDataAccessException;

	/**
	 * DAX para actualizar estudiante
	 * 
	 * @param student
	 * @return
	 * @throws DataAccessException
	 */
	public StudentDTO update(StudentDTO student) throws MinsaitDataAccessException;

}
