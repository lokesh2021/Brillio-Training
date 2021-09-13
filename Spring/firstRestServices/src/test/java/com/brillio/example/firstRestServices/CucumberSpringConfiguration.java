package com.brillio.example.firstRestServices;

import com.brillio.example.firstRestServices.CrudController;
import com.brillio.example.firstRestServices.FirstRestServicesApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CucumberSpringConfiguration {

}