package com.math.app;

import com.math.util.Task42_MathUtil;
import static com.math.util.Task42_MathUtil.PI;
import static com.math.util.Task42_MathUtil.square;

public class Task42_StaticImportDemo {
    public static void main(String[] args) {
    	
    	//Accessed directly from import
        System.out.println("Using PI directly: " + PI);
        System.out.println("Square of 5: " + square(5));

        Task42_MathUtil util = new Task42_MathUtil();
        
      //Accessed from obj refernce to the class
        System.out.println("Access via class name (allowed): " + util.square(3));
    }
}

