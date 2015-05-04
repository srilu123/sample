package com.parsa.sample;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] anArray;
		int[] smallArray = { 1, 2, 3, 4, 5, 6 };
		String[][] names = { { "lohit", "parsa", "kante" },
				{ "akshay", "ramesh", "sagar" } };
		char[] copyFrom = { 'L', 'O', 'H', 'I', 'T', 'A', 'K', 'S', 'H', 'A',
				'Y' };
		 char[] copyTo=new char[11];
		char[] copyTo1 = java.util.Arrays.copyOfRange(copyFrom, 0, 5);

		anArray = new int[10];
		anArray[0] = 100;
		anArray[1] = 20;
		anArray[2] = 30;
		anArray[3] = 40;
		anArray[4] = 50;
		anArray[5] = 60;
		anArray[6] = 70;
		anArray[7] = 80;
		anArray[8] = 90;
		anArray[9] = 120;
		System.out.println("array element index 0:" + anArray[0] + anArray[1]);
		System.out.println(smallArray[0]);
		System.out.println(smallArray[1]);
		System.out.println(smallArray[2]);
		System.out.println(smallArray[3]);
		System.out.println(names[0][0] + names[1][0]);
		System.out.println(names[0][1] + names[1][1]);
		System.out.println(names[0][2] + names[1][2]);
		System.arraycopy(copyFrom, 0, copyTo, 0, 11);
		System.out.println(copyTo);
		System.out.println(new String(copyTo1));

	}
}