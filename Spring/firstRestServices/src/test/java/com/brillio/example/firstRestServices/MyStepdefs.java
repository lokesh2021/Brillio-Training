package com.brillio.example.firstRestServices;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class MyStepdefs extends CucumberSpringConfiguration {

    @Autowired
    CrudController crudController;
    StudentDTo student;
    String res;


    @Given("A Student enrolls")
    public void aStudentEnrolls() {
        student = new StudentDTo();
    }

    @When("The data is collected")
    public void theDataIsCollected() {
        student.setSid("151");
        student.setFname("Lokesh");
        student.setLname("bm");
        student.setAddress("bangalore, 61");
        student.setDb1("2000-01-16");

        res = crudController.insertStudent(student);
    }

    @Then("Data is added in the database")
    public void dataIsAddedInTheDatabase() {
        assertEquals(res, "Data is Inserted");    }
}
