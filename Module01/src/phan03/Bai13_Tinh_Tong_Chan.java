package phan03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author Viết chương trình in ra tổng của 10 số chẵn đầu tiên
 *
 */
public class Bai13_Tinh_Tong_Chan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ban muon nhap bao nhieu so ?");
		System.out.print("Nhap: ");
		int n = sc.nextInt();
		int[] arr = {};
//		String[] arr = {};
//		List<String> mang = new ArrayList<>(Arrays.asList(arr));
		int tongChan = 0;
		int dem = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Moi ban nhap so thu '" + i + 1 + "'");
//			mang.add(sc.nextInt() + "");
			System.out.print("Nhap: ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				dem++;
				tongChan = tongChan + i;
			}
		}
		if (dem >= 10) {
			System.out.println("Tong 10 so chan dau tien = " + tongChan);
		} else {
			System.out.println("Tong " + dem + " so chan dau tien = " + tongChan);
			JOptionPane.showConfirmDialog(null, "Vi nhap chua du 10 so chan nen chi tinh " + dem + " so trong tong so da nhap");
		}
//	public static void main(String[] args) {
//		int[] arr = {1 , 22, 4, 6, 543, 8, 12, 15, 765, 45, 14, 16, 10, 32, 321, 11, 20};
//		int tongChan = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				tongChan = tongChan + i;
//			}
//		}
//		
//		System.out.println("Tong 10 so chan dau tien = " + tongChan);
//	}
	}
}
