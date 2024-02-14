package by.javagury.spring.database.repository;

import by.javagury.spring.database.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface CompanyRepository extends JpaRepository<Company, Integer> {

    Optional<Company> findById(Integer companyId);

}
