package phan03;

import java.util.Scanner;

/**
 * Viết hàm tách chuỗi gốc thành chuỗi con
 * @author BeekaiPC
 *
 */

public class Bai09_Split_String {
	public static void main(String[] args) {
		String chuoi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		chuoi = sc.nextLine();
		
		String[] arr = tachChuoi(chuoi);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static String[] tachChuoi(String s) {
		String ss = s.trim();
		while (ss.contains("  ")) {
			ss = ss.replaceAll("  ", "");
		}
		String[] kq = ss.split(" ");
		return kq;
	}
//	public static void main(String[] args) {
//	    String chuoi;
//	    char kyTu;
//	    Scanner sc = new Scanner(System.in);
//	         
//	    System.out.print("Nhap vao chuoi bat ky: ");
//	    chuoi = sc.nextLine();
//	         
//	    for (int i = 0; i < chuoi.length(); i++) {
//	    	kyTu = chuoi.charAt(i);
//	        
//	    	if (Character.isSpace(kyTu)) {
//	    		System.out.println();
//	    	} else {
//	            System.out.print(kyTu);
//	        }
//	    }
//	}
}
