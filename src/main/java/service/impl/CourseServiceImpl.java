package service.impl;

import dao.CourseDao;
import entity.Company;
import entity.Course;
import org.springframework.stereotype.Service;
import service.CourseService;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    private final CourseDao courseDao;

    public CourseServiceImpl(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public List<Company> getAllCourse() {
        return courseDao.getAllCourse();
    }

    @Override
    public void addCourse(Course course) {
courseDao.addCourse(course);
    }

    @Override
    public void updateCouse(Long id ,String name, String month) {
courseDao.updateCouse(id,name,month);
    }

    @Override
    public void getById(Long id) {
courseDao.getById(id);
    }

    @Override
    public void deleteCourse(Course course) {
courseDao.deleteCourse(course);
    }
}
