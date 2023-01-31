package dao.impl;

import dao.CompanyDao;
import entity.Company;
import entity.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class CompanyDaoImpl implements CompanyDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Company> getAllCompany() {
        return entityManager.createQuery("from Company").getResultList();
    }

    @Override
    public void addCompany(Company company) {
        entityManager.persist(company);

    }



    @Override
    public void updateCompany(Long id, String name, String country) {
        Company company1=entityManager.find(Company.class,id);
        company1.setCompanyName(name);
        company1.setLocatedCountry(country);
        entityManager.merge(company1);
    }

    @Override
    public void getById(Long id) {
        entityManager.find(Company.class,id);

    }

    @Override
    public void deleteCompany(Company company) {
entityManager.remove(company);
    }

    @Override
    public List<Course> getCoursesByCompanyId(Long id) {
        return entityManager.createQuery("from Course, Company where Course.id=Company.id").getResultList();
    }
}
