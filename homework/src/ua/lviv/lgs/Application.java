package ua.lviv.lgs;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

		byte a1 = 2;
		short a2 = 2;
		int a3 = 2;
		long a4 = 2L;
		char a5 = '2';
		float a6 = 2F;
		double a7 = 2.1;
		boolean a8 = true;
		String a9 = "read";  // не є примітивом =)

		System.out.println("var a1 = " + a1);
		System.out.println("var a2 = " + a2);
		System.out.println("var a3 = " + a3);
		System.out.println("var a4 = " + a4);
		System.out.println("var a5 = " + a5);
		System.out.println("var a6 = " + a6);
		System.out.println("var a7 = " + a7);
		System.out.println("var a8 = " + a8);
		System.out.println("var a9 = " + a9);

		System.out.println("Byte min. = " + Byte.MIN_VALUE);
		System.out.println("Byte max. = " + Byte.MAX_VALUE);
		
		System.out.println("Short min. = " + Short.MIN_VALUE);
		System.out.println("Short max. = " + Short.MAX_VALUE);
		
		System.out.println("Int min. = " + Integer.MIN_VALUE);
		System.out.println("Int max. = " + Integer.MAX_VALUE);
		
		System.out.println("Long min. = " + Long.MIN_VALUE);
		System.out.println("Long max. = " + Long.MAX_VALUE);
		
		System.out.println("Char min. = " + Character.MIN_VALUE); // '\u0000'
		System.out.println("Char max. = " + Character.MAX_VALUE); // '\uFFFF'
		
		System.out.println( "Char min.: " + (int)Character.MIN_VALUE);
		System.out.println( "Char max.: " + (int)Character.MAX_VALUE);
		
		System.out.println("Float min. = " + Float.MIN_VALUE);
		System.out.println("Float max. = " + Float.MAX_VALUE);
		
		System.out.println("Double min. = " + Double.MIN_VALUE);
		System.out.println("Double max. = " + Double.MAX_VALUE);
		
		final boolean MIN_VALUE = false;
		final boolean MAX_VALUE = true;
		
		System.out.println("Boolean min. = " + MIN_VALUE);
		System.out.println("Boolean max. = " + MAX_VALUE);
		
		int [] array = new int [10];

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();

        System.out.println("Array min. = " + min);
		System.out.println("Array max. = " + max);
        
		// First commit to gitHub 
	}
 
}
