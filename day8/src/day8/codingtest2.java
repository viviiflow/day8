package day8;

import java.util.Scanner;

public class codingtest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문제 1
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 13, 54, 17, 42, 1 };
		int[] c = new int[5];
		int n = 0;
		for (int i = 0; i < 5; i++) {
			if ((a[i] + b[i]) % 2 == 0) {
				c[n] = a[i] + b[i];
				n++;
			}
		}
		System.out.print("1. c = [ ");
		for (int i = 0; i < 5; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println("]");

		// 문제 2
		int[] num = { 1001, 1002, 1003 };
		int[] score = { 50, 83, 78 };
		int[] win = new int[3];
		n = 0;
		for (int i = 0; i < 3; i++) {
			if (score[i] >= 60) {
				win[n] = num[i];
				n++;
			}
		}
		System.out.print("2. win = [ ");
		for (int i = 0; i < 3; i++) {
			System.out.print(win[i] + " ");
		}
		System.out.println("]");

		// 문제 3
		int[] data = { 1001, 80, 1002, 23, 1003, 78 };
		int[] win2 = new int[3];
		n = 0;
		for (int i = 0; i < 6; i++) {
			if ((i % 2 != 0) && (data[i] >= 60)) {
				win2[n] = data[i - 1];
				n++;
			}
		}
		System.out.print("3. win2 = [ ");
		for (int i = 0; i < 3; i++) {
			System.out.print(win2[i] + " ");
		}
		System.out.println("]");

		// 문제 4
		b = new int[5];
		System.out.println("4. 값 입력:");
		n = sc.nextInt();
		int idx = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] != n) {
				b[idx] = a[i];
				idx++;
			} else {
				continue;
			}
		}
		System.out.print("b = [ ");
		for (int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");

		// 문제 5
		int[] c1 = { 1001, 40, 1002, 65, 1003, 70 };
		int[] d = new int[6];
		System.out.println("5. 번호 입력:");
		n = sc.nextInt();
		idx = 0;
		for (int i = 0; i < 6; i++) {
			if ((c1[i] == n) || (i== idx+1)) {
				continue;
			} else {
				d[idx] = c1[i];
				idx++;
			}
		}
		System.out.print("d = [ ");
		for (int i = 0; i < 6; i++) {
			System.out.print(d[i] + " ");
		}
		System.out.println("]");

		// 문제 5-2
		int[] arr = { 10, 20, 30, 40, 50 };
		b = new int[5];
		idx=0;
		System.out.print("5-2. ");
		while (idx < 5) {
			System.out.println("숫자 입력 "+(idx+1)+":");
			n = sc.nextInt();
			for (int i = 0; i < 5; i++) {
				if (arr[i] == n) {
					b[idx] = i+1;	
				}
			}
			idx++;
		}
		for (int i = 0; i < 5; i++) {
			b[i]=b[i]-1;
		}
		System.out.print("b = [ ");
		for (int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");

	}
}