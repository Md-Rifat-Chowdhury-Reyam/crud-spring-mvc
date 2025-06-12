package com.course.dao;

import com.course.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //@Repository: Marks the class as a repository, indicating that it performs database operations.
//JpaRepository: JpaRepository is a JPA-specific extension of the Repository. It contains the full API of CrudRepository and PagingAndSortingRepository. So it contains API for basic CRUD operations and also API for pagination and sorting. Here we enable database operations for Employees.
public interface CourseRepository extends JpaRepository<CourseModel, Long> {
}
