package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.collections.comparable.Task63_Employee;

public class Task63_StreamGroupingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Task63_Employee> employees = new ArrayList<>();
        employees.add(new Task63_Employee("Alice", "HR"));
        employees.add(new Task63_Employee("Bob", "IT"));
        employees.add(new Task63_Employee("Charlie", "HR"));
        employees.add(new Task63_Employee("David", "Finance"));
        employees.add(new Task63_Employee("Eva", "IT"));

        Map<String, List<Task63_Employee>> groupedByDept = employees.stream()
        		.collect(Collectors.groupingBy(emp -> emp.getDept()));
        groupedByDept.forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList);
        });
	}

}
