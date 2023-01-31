package controller;
import entity.Company;
import entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CompanyService;
import service.CourseService;

import java.util.List;

@Controller
@RequestMapping("companies")
public class CompanyController {
   private final CompanyService companyService;
@Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
@GetMapping("companies")
public String companies(Model model){
    model.addAttribute("companies",companyService.getAllCompany());
    return "company/companies";
}
@GetMapping("/addCompany")
    public String add(Model model){
    model.addAttribute("company",new Company());
            return "company/addCompany";
}
@PostMapping("/saveCompany")
    public String save(@ModelAttribute("company") Company company){
    companyService.addCompany(company);
    return "redirect:/companies";
}}
