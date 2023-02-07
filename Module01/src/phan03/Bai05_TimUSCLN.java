package phan03;

import java.util.Scanner;
/**
 * 
 * @author Viết chương trình tìm USCLN của 2 số nhập vào.
 *
 */
public class Bai05_TimUSCLN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong a = ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen duong b = ");
        int b = sc.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN cua " + a + " va " + b + " la: " + USCLN(a, b));
	}
	
	public static int USCLN(int a, int b) {
	    int temp1 = a;
	    int temp2 = b;
	    while (temp1 != temp2) {
	        if (temp1 > temp2) {
	            temp1 -= temp2;
	        } else {
	            temp2 -= temp1;
	        }
	    }
	    int uscln = temp1;
	    return uscln;
	}
}