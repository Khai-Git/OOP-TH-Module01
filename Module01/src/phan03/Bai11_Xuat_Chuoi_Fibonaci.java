package phan03;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Viết chương trình nhập vào số nguyên n và thực hiện: Xuất ra màn hình n số đầu tiên của chuỗi Fibonaci (có hai giá trị đầu là 1 và 1)
 * @author BeekaiPC
 *
 */
public class Bai11_Xuat_Chuoi_Fibonaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao 1 so nguyen: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print( checkFibonaci(i) + " ");
		}
	}
	
	public static int checkFibonaci(int n) {
		int f0 = 0;
		int f1 = 1;
		int fn = 1;
		
		if (n < 0) {
			return -1;
		} else if(n == 0 || n == 1) {
			return n;
		} else {
			for (int i = 2; i < n; i++) {
				f0 = f1;
				f1 = fn;
				fn = f0 + f1;
			}
		}
		
		return fn;
	}
}
