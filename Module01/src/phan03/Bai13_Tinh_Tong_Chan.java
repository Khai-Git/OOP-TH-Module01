package phan03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * Viết chương trình in ra tổng của 10 số chẵn đầu tiên
 * @author BeekaiPC
 *
 */
public class Bai13_Tinh_Tong_Chan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ban muon nhap bao nhieu so ?");
		System.out.print("Nhap: ");
		int n = sc.nextInt();
		int arr[];
		List<Integer> mang = new ArrayList<>(Arrays.asList());
		int tongChan = 0;
		int dem = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Moi ban nhap so thu '" + (i + 1) + "'");
			System.out.print("Nhap: ");
			mang.add(sc.nextInt());
		}
		
		System.out.println("Mang vua nhap la: " + mang);
		
		for (int i = 0; i < mang.size(); i++) {
			if (mang.get(i) % 2 == 0) {
				dem++;
				tongChan = tongChan + mang.get(i);
			}
		}
		if (dem >= 10) {
			System.out.println("Tong 10 so chan dau tien = " + tongChan);
		} else {
			System.out.println("Tong " + dem + " so chan dau tien = " + tongChan);
		}
	}
}
