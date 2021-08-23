package CalcWithoutIfElse;

public class sub extends Calc {
    public void operate()
    {
        num3=num1-num2;
    }
    public void display() {
        System.out.println("Subrtaction result");
        super.display();
    }
    public sub() {
        super();
        //System.out.println("I am inside subclass");
        // TODO Auto-generated constructor stub
    }
}
