package com.brillio.AssesmentQ1;

public abstract class Arithmetic {
    private int num1, num2, res;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public void setData(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void display() {
        System.out.println(String.format("Num1 = %s\nNum2 = %s\nResult = %s", getNum1(), getNum2(), getRes()));
    }

    public abstract void calculate();
}
