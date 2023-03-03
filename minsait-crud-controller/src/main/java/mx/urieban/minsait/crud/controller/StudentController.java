package mx.urieban.minsait.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.urieban.minsait.crud.core.dto.StudentDTO;
import mx.urieban.minsait.crud.service.StudentService;

/**
 * Controlador para CRUD de Estudiantes
 * 
 * @author uesteban
 *
 */
@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/api/minsait/student/v1")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public ResponseEntity<StudentDTO> saveStudent(@RequestBody StudentDTO studentDTO) {
		try {
			return new ResponseEntity<>(this.getStudentService().save(studentDTO), HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<StudentDTO> updateStudent(@RequestBody StudentDTO studentDTO){
		try {
			return new ResponseEntity<>(this.getStudentService().update(studentDTO), HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<StudentDTO> findStudentById(@PathVariable("id") Long id){
		try {
			return new ResponseEntity<>(this.getStudentService().findById(id), HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<StudentDTO>> findAllStudents(){
		try {
			return new ResponseEntity<>(this.getStudentService().findAll(), HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable("id") Long id){
		try {
			this.getStudentService().delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * @return the studentService
	 */
	public StudentService getStudentService() {
		return studentService;
	}

	/**
	 * @param studentService the studentService to set
	 */
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

}
