package Calci;

public class Addition {
	int num1;
	int num2;
	int res;
	
	public Addition()
	{
		System.out.println("Non-Parameterized constructor");
	}
	public Addition(int n1)
	{
		System.out.println("Single Parameterized constructor with value: "+n1);
	}
	
	public void setData(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public void cal() {
		this.res = this.num1+this.num2;
	}
	public void display() {
		System.out.println("n1= "+this.num1+" n2= "+this.num2+", n1 + n2 = "+ this.res);
	}
	
	public void finalize()
	{
		System.out.println("Destructor called");
	}

}
