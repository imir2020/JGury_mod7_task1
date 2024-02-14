package by.javagury.spring.dto;

import lombok.Builder;
import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Value
@Builder
//@Component
public class CompanyDto{
    Integer id;
    String name;
   // Map<String,String> locales;
}
