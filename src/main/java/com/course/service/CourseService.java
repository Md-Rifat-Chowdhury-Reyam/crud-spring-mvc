package com.course.service;

import com.course.dao.CourseRepository;
import com.course.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository repository;

    public Course saveCourse(Course course) {
        return repository.save(course);
    }

    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    public Course getCourseById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Course getCourseByName(String name) {
        return repository.findByName(name);
    }

    public String deleteCourse(Long id) {
        repository.deleteById(id);
        return "Course removed: " + id;
    }

    public Course updateCourse(Course course) {
        Course existingCourse = repository.findById(course.getId()).orElse(null);
        if (existingCourse != null) {
            existingCourse.setName(course.getName());
            existingCourse.setInstructor(course.getInstructor());
            existingCourse.setEmail(course.getEmail());
            return repository.save(existingCourse);
        }
        return null;
    }

    public Page<Course> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ?
                Sort.by(sortField).ascending() : Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return repository.findAll(pageable);
    }
}