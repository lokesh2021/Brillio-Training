package com.brillio.jdbc_demo;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {
    public static void main(String[] args) {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRe = null;

        try {
            myConn = DBConnectivity.getConnection();
            System.out.println("Connection is successful");

            myStmt = myConn.createStatement();
            int rowsAffected = myStmt.executeUpdate("insert into employees "+"(last_name, first_name, email, department, salary) "
            +"values "+"('BM','Lokesh','lokesh@gmail.com','sde','450000.00')");
            System.out.println(rowsAffected);
            myRe = myStmt.executeQuery("select * from employees");
            while (myRe.next()){
                System.out.println(myRe.getString("last_name")+" , "+myRe.getString("first_name"));
            }

//            SchoolDAOB schoolDAOB = new SchoolDAOB();
//            List<SDetailsDTO> l1 = schoolDAOB.getAllStudents();

           // l1.forEach(System.out::println);

//            System.out.print("Enter sid to display:: ");
//            Scanner sc = new Scanner(System.in);
//            String s1 = sc.nextLine();

            //System.out.println(schoolDAOB.getAnyStudent(s1));
        } catch (Exception e) {
            System.out.println("Connection failure - " + e.getMessage());
        }
    }
}
