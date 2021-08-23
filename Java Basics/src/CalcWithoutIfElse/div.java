package CalcWithoutIfElse;

public class div extends Calc {
    public void operate()
    {
        num3=num1/num2;
    }
    public void display() {
        System.out.println("Division result");
        super.display();
    }
    public div() {
        super();
        System.out.println("I am inside subclass");
        // TODO Auto-generated constructor stub
    }
}
