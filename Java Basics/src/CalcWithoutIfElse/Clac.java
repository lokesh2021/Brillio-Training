package CalcWithoutIfElse;

import java.util.Scanner;

abstract class Calc {

    int num1, num2;
    float num3;

    public void set(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public abstract void operate();

    public void display() {
        System.out.println(num3);
    }

    public Calc() {
        System.out.println("I am inside superclass");
    }

    public static void main(String[] args) {
        Calc array[] = new Calc[4];
        array[0] = new add();
        array[1] = new sub();
        array[2] = new mul();
        array[3] = new div();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter your choice 1-4 for add, sub, mul, div");
        int choice = sc.nextInt();
        choice -= 1;

        Calc obj = array[choice];
        obj.set(num1, num2);
        obj.operate();
        obj.display();
    }
}
