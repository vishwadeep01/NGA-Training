package wrapperclasses;

 
public class Task5_Generics<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
    	Task5_Generics<Integer> intBox = new Task5_Generics<>();
        intBox.setValue(50); // autoboxing int to Integer
        
        System.out.println("Integer value: " + intBox.getValue());

        Task5_Generics<Double> doubleBox = new Task5_Generics<>();
        doubleBox.setValue(99.99); // autoboxing double to Double
        System.out.println("Double value: " + doubleBox.getValue());
    }
}