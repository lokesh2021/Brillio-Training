package Calci;

public class Demo {
	public static void main(String[] args) {
		Addition obj = new Addition();
		Addition obj1 = new Addition(21);
		obj.setData(100,200);
		obj.cal();
		obj.display();
		obj=null;
		System.gc();
	}

}
