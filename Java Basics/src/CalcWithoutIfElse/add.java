package CalcWithoutIfElse;

public class add extends Calc {

    public void operate()
    {
        num3=num1+num2;
    }
    public void display() {
        System.out.println("Addition result");
        super.display();
    }
    public add() {
        super();
        //System.out.println("I am inside subclass");
        // TODO Auto-generated constructor stub
    }

}
