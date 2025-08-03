package wrapperclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7_TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> celsiusStrings = Arrays.asList("36", "38", "40");
        List<Integer> celsiusValues = new ArrayList<>();
        List<Double> fahrenheitValues = new ArrayList<>();

        for (String temp : celsiusStrings) {
            int celsius = Integer.parseInt(temp);
            double fahrenheit = (celsius * 9.0 / 5) + 32;

            celsiusValues.add(celsius);
            fahrenheitValues.add(fahrenheit);
        }

        System.out.println("Celsius Values: " + celsiusValues);
        System.out.println("Fahrenheit Values: " + fahrenheitValues);

	}

}
