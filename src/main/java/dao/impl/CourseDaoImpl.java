package dao.impl;

import dao.CourseDao;
import entity.Company;
import entity.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
@Transactional
public class CourseDaoImpl implements CourseDao {
    @PersistenceContext
    private EntityManager entity;
    @Override
    public List<Company> getAllCourse() {
        return entity.createQuery("from Course").getResultList();
    }

    @Override
    public void addCourse(Course course) {
entity.persist(course);
    }

    @Override
    public void updateCouse(Long id, String name, String month) {
        Course course1=entity.find(Course.class,id);
        course1.setCourseName(name);
        course1.setDurationMonth(month);
        entity.merge(course1);
    }

    @Override
    public void getById(Long id) {
entity.createQuery("from Course where Course.id=id");
    }

    @Override
    public void deleteCourse(Course course) {
entity.remove(course);
    }
}
