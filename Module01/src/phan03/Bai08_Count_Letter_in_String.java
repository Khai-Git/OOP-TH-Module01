package phan03;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 * @author Viết chương trình in ra số lần kí tự ‘a’ xuất hiện trong một chuỗi.
 *
 */
public class Bai08_Count_Letter_in_String {
	public static void main(String[] args) {
		String chuoi;
		char kyTu = 'a';
		int dem = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao mot chuoi bat ky: ");
		chuoi = sc.nextLine();
		
		for (int i = 0; i < chuoi.length(); i++) {
			if (chuoi.charAt(i) == kyTu) {
				dem++;
			}
		}
		
		System.out.println("So lan xuat hien cua ky tu " + kyTu + " trong chuoi '" + chuoi + "' la " + dem);
	}
	
	/**
	 * @author Dem so tu trong chuoi (bonus)
	 */
//	public static final char SPACE = ' ';
//	public static final char TAB = '\t';
//	public static final char BREAK_LINE = '\n';
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhap chuoi: ");
//		String chuoi = sc.nextLine();
//		System.out.println("So tu trong chuoi da nhap la: " + countWords(chuoi));
//	}
//	
//	public static int countWords(String input) {
//		int count = 0;
//		boolean notCounted = true;
//		if (input == null) {
//			return -1;
//		}
//		for (int i = 0; i < input.length(); i++) {
//			if(input.charAt(i) != SPACE && input.charAt(i) != TAB && input.charAt(i) != BREAK_LINE) {
//				if (notCounted) {
//					count ++;
//					notCounted = false;
//				}
//			} else {
//				notCounted = true;
//			}
//		}
//		return count;
//	}
}
