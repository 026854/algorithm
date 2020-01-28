package day0128;

import java.util.Scanner;

public class PalindromeNum {
	public static void main(String[] args) {

		System.out.println("¸î°³?");
		Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		int[] numarr = new int[num];
		
		numarr[0] = scan.nextInt();
		numarr[1] = scan.nextInt();
		numarr[2] = scan.nextInt();
		int number=0,palNum=0;
		
		
		for (int i : numarr) {
			number = i+Integer.parseInt((new StringBuffer(i+"")).reverse().toString());
			palNum = Integer.parseInt((new StringBuffer(number+"")).reverse().toString());
			if(palNum==number)System.out.println("true");
			else System.out.println("false");
		}
		
		
	}
}
