package service;

import entity.Company;
import entity.Course;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompany();
    void addCompany(Company company);


    void updateCompany(Long id, String name, String country);

    void getById(Long id);
    void deleteCompany(Company company);
    List<Course> getCoursesByCompanyId(Long id);
}
