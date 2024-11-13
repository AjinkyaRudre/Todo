package spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.project.entity.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
