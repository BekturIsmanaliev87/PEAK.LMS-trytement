package dao;

import entity.Company;
import entity.Course;

import java.util.List;

public interface CourseDao {
    List<Company> getAllCourse();
    void addCourse(Course course);



    void updateCouse(Long id, String name, String month);

    void getById(Long id);
    void deleteCourse(Course course);

}
