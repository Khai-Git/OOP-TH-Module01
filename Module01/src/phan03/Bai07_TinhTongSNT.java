package phan03;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Tính tổng các số nguyên tố nhỏ hơn N.
 * @author BeekaiPC
 *
 */

public class Bai07_TinhTongSNT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n = ");
		int n = sc.nextInt();
		if (n < 2) {
			System.out.println("Khong co SNT de tinh tong !!!");
		} else {
			System.out.println("Tong cac SNT < n = " + TinhTongSNT(n));
		}
	}
   public static boolean SNT(int n) {
       if (n < 2) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(n); i++) {
           if (n % i == 0) {
               return false;
           }
       }
       return true;
   }
   public static int TinhTongSNT(int n) {
		int tong = 0;
		for (int i = 0; i < n; i++) {
			if (SNT(i)) {
				tong = tong + i;
			}
		}
		return tong;
   }
}
