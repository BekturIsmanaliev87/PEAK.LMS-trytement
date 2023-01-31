package service.impl;

import dao.CompanyDao;
import entity.Company;
import entity.Course;
import org.springframework.stereotype.Service;
import service.CompanyService;

import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyDao companyDao;

    public CompanyServiceImpl(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    @Override
    public List<Company> getAllCompany() {
        return companyDao.getAllCompany();
    }

    @Override
    public void addCompany(Company company) {
companyDao.addCompany(company);
    }

    @Override
    public void updateCompany(Long id, String name, String country) {
        companyDao.updateCompany(id,name,country);
    }

    @Override
    public void getById(Long id) {
        companyDao.getById(id);
    }

    @Override
    public void deleteCompany(Company company) {
companyDao.deleteCompany(company);
    }

    @Override
    public List<Course> getCoursesByCompanyId(Long id) {
        return companyDao.getCoursesByCompanyId(id);
    }
}
