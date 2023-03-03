package mx.urieban.minsait.crud.dax.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.urieban.minsait.crud.dax.entity.Student;

/**
 * Repositorio para la Clase Student
 * 
 * @author uesteban
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
