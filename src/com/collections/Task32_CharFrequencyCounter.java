package com.collections;

import java.util.HashMap;
import java.util.Scanner;

public class Task32_CharFrequencyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to count frequency: ");
		input = sc.nextLine();

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            // Increment count if character exists, else set to 1
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Frequencies: " + frequencyMap);
        
        sc.close();
	}

}
