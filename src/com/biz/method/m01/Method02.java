package com.biz.method.m01;
import java.util.Scanner;
public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int intStars = (int)8.0;
		for (int i = 0; i < intStars; i++) {
			for (int j = 0; j < intStars; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		makeStars(6);
		
	}
	public static void makeStars(int intStars) {
	// int intStars = 6;
	for (int i = 0; i < intStars; i++) {
		for (int j = 0; j < intStars; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
