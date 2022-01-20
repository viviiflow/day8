package day8;

import java.util.Scanner;

public class codingtest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문제 1
		int[] a = { 10, 4, 5, 3, 1 };
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += a[i];
		}
		System.out.println("1. 전체 합: " + sum);

		// 문제 2
		System.out.println("2. 값 입력:");
		int n = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			if (a[i] == n) {
				n = i;
				break;
			}
		}
		System.out.println(n);

		// 문제 3
		int[] b = new int[5];
		for (int i = 0; i < 5; i++) {
			if (a[i] % 2 != 0) {
				b[i] = a[i];
			}
		}
		System.out.print("3. b = [ ");
		for (int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");

		// 문제 4
		int[] c = new int[5];
		int idx = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] % 2 != 0) {
				c[idx] = a[i];
				idx++;
			}
		}
		System.out.print("4. c = [ ");
		for (int i = 0; i < 5; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println("]");

		// 문제 4(2)
		int[] aa = { 10, 20, 30, 40, 50 };
		System.out.println("4(2). 인덱스 번호 입력:");
		idx = sc.nextInt();
		System.out.println(aa[idx]);

		// 문제 5
		int[] b1 = { 12, 54, 23, 87, 1 };
		int max = 0;
		for (int i = 0; i < 5; i++) {
			if (max < b1[i]) {
				max = b1[i];
			}
		}
		System.out.println("5. 가장 큰 값: " + max);

		// 문제 6
		int[] c1 = { 12, 54, 23, 87, 1 };
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			if (c1[i] % 2 != 0) {
				cnt++;
			}
		}
		System.out.println("6. 홀수의 개수: " + cnt + "개");

		// 문제 7
		int[] d = { 1, 2, 3, 4, 5 };
		int[] arr = { 1, 2, 3, 4, 5 };
		idx = 0;
		for (int i = 4; i >= 0; i--) {
			arr[idx] = d[i];
			idx++;
		}
		System.out.print("7. d 뒤집기 = [ ");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");

		// 문제 8
		int[] a1 = { 10, 20, 30, 40, 50 };
		System.out.println("8. 값 입력:");
		n = sc.nextInt();
		for (int i = 0; i < 4; i++) {
			a1[i] = a1[i + 1];
		}
		a1[4] = n;
		System.out.print("a = [ ");
		for (int i = 0; i < 5; i++) {
			System.out.print(a1[i] + " ");
		}
		System.out.println("]");

		// 문제 9
		int[] b2 = { 10, 20, 30, 40, 50 };
		System.out.println("8. 값 입력:");
		n = sc.nextInt();
		for (int i = 4; i > 0; i--) {
			b2[i] = b2[i - 1];
		}
		b2[0] = n;
		System.out.print("b = [ ");
		for (int i = 0; i < 5; i++) {
			System.out.print(b2[i] + " ");
		}
		System.out.println("]");

	}
}
