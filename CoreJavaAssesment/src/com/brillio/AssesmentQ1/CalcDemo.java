package com.brillio.AssesmentQ1;

public class CalcDemo {
    public static void main(String[] args) {

        Arithmetic myMethods[] = new Arithmetic[4];
        myMethods[0] = new Add();
        myMethods[1] = new Sub();
        myMethods[2] = new Mul();
        myMethods[3] = new Div();

        System.out.println("Enter number 1:: ");
        int a = Reader.read.nextInt();

        System.out.println("Enter number 2:: ");
        int b = Reader.read.nextInt();

        int choice;
        System.out.println("Enter your choice\n1) Add\n2) Sub.\n3) Mul.\n4) Div.\n");
        choice = Reader.read.nextInt();

        Arithmetic res = myMethods[choice - 1];
        res.setData(a, b);
        res.calculate();
        res.display();

    }
}
