package com.brillio.example.firstRestServices;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FirstRestServicesApplicationTests {

    @Autowired
    MyRestController controller;
    CrudController crudController;

    @Test
    @Order(1)
    public void testDTOAvailableOrNot() {
        try {
            StudentDTo studentDTo = new StudentDTo();
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @Order(2)
    public void testDTOAvailableOrNot1() {
        try {
            StudentDTo studentDTo = new StudentDTo();
            studentDTo.getAddress();
            studentDTo.getFname();
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @Order(3)
    public void testController1() {
        try {
            List<StudentDTo> list = controller.getStudent();
            if (list == null) throw new Exception();
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @Order(4)
    public void testController2() {
        try {
            List<StudentDTo> list = controller.getStudent();
            assertNotNull(list);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @Order(5)
    public void testController3() {
        try {
            Optional<StudentDTo> list= controller.getAnyStudent("5000");
            assertEquals(list,Optional.empty());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @Order(6)
    public void testCrudControllerInsertion() {
        try {
            StudentDTo student = new StudentDTo();
            student.setSid("115");
            student.setAddress("bangalore, 61");
            student.setFname("hello");
            student.setLname("world");
            student.setDb1("2000-01-16");
            String res = crudController.insertStudent(student);

        } catch (Exception e) {
            fail();
        }
    }

}
