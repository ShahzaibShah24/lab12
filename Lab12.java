package lab12;

import java.util.Scanner;

public class Lab12 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int[] array = { 4, 11, 13, 34, 312, 6, 10, 44, 25, 27 };
			System.out.print("Enter the index of Array : ");
			try {
				System.out.println("The Value Is : " + array[input.nextInt()]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds. ");
				System.out.println(array);
			}
		}
	}
}
