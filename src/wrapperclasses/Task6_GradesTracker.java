package wrapperclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task6_GradesTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> marks = new ArrayList<>();
        marks.add(78);
        marks.add(92);
        marks.add(85);
        marks.add(66);
        marks.add(90);

        marks.remove(Collections.min(marks)); // remove lowest mark

        int max = Collections.max(marks);
        int min = Collections.min(marks);
        double average = marks.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Max mark: " + max);
        System.out.println("Min mark: " + min);
        System.out.println("Average: " + average);

	}

}
