package CalcWithoutIfElse;

public class mul extends Calc {
    public void operate()
    {
        num3=num1*num2;
    }
    public void display() {
        System.out.println("Multiplication result");
        super.display();
    }
    public mul() {
        super();
        //System.out.println("I am inside subclass");
        // TODO Auto-generated constructor stub
    }
}
