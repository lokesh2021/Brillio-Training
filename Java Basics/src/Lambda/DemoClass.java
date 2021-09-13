package Lambda;

interface Mathematics {
    public int calc(int a, int b);
}

public class DemoClass {
    public static void main(String[] args) {
        Mathematics obj = (a, b) -> (a + b);
        Mathematics obj1 = (a, b) -> {return a-b;};
        Mathematics obj2 = (a, b) -> {
            int c;
            c=a/b;
            return c;
        };
        System.out.println(obj2.calc(10,20));
    }
}
