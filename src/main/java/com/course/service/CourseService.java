package com.course.service;

import com.course.model.CourseModel;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CourseService {

    List<CourseModel> getAllCourses(); //Abstract List method

    void saveCourses(CourseModel courseModel);

    CourseModel getCourseById(long id);

    void deleteCourseById(long id);

    void updateCourse(CourseModel courseModel);

    Page<CourseModel> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
