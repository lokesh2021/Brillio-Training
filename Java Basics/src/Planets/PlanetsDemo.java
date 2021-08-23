package Planets;

import java.util.Scanner;

public class PlanetsDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Planets obj;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day MON-SUN");
        String day = sc.next();
        obj = Planets.valueOf(day);

        System.out.println(obj);
        System.out.println(obj.color);
        System.out.println(obj.name);
    }

}
