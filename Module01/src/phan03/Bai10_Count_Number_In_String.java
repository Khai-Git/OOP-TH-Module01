package phan03;

import java.util.Scanner;

/**
 * 
 * @author Viết chương trình để đếm số lượng ký tự là số có trong chuỗi s. Chuỗi s được nhập từ bàn phím
 *
 */

public class Bai10_Count_Number_In_String {
	public static void main(String[] args) {
		String chuoi;
		Scanner sc = new Scanner(System.in);
		int dem = 0;
		
		System.out.print("Nhap vao mot chuoi bat ky: ");
		chuoi = sc.nextLine();
		
		for (int i = 0; i < chuoi.length(); i++) {
			if(chuoi.charAt(i) >= 48 && chuoi.charAt(i) <= 57) {
				dem++;
			}
		}
		
		System.out.println("So lan xuat hien cua ky tu so trong chuoi '" + chuoi + "' la " + dem);
	}
}