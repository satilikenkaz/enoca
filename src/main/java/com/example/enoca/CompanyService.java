package com.example.enoca;

import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company updateCompany(Long id, Company company) {
        Company existingCompany = companyRepository.findById(company.getId()).orElse(null);
        if (existingCompany != null) {
            existingCompany.setName(company.getName());
            return companyRepository.save(existingCompany);
        }
        return null;
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
    public Company createCompany(Company company) {
        if (StringUtils.isBlank(company.getName())) {
            throw new IllegalArgumentException("Company name cannot be null or empty.");
        }

        return companyRepository.save(company);
    }
}
