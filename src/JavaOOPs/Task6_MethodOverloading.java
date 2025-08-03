package javaoops;

public class Task6_MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Task6_MethodOverloading calc = new Task6_MethodOverloading();

        System.out.println("int add: " + calc.add(10, 20));
        System.out.println("double add: " + calc.add(5.5, 4.5));
        System.out.println("string add: " + calc.add("Hello, ", "World!"));
    }
}
