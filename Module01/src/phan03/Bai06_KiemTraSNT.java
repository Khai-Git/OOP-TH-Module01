package phan03;

import java.util.Scanner;

/**
 * Viết chương trình kiểm tra số nhập vào có phải là số nguyên tố hay không.
 * @author BeekaiPC
 *
 */
public class Bai06_KiemTraSNT {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap vao mot so bat ky de kiem tra so nguyen to : ");
       int n = sc.nextInt();
       if (SNT(n)) {
           System.out.println("So " + n + " la so nguyen to");
       } else {
           System.out.println("So " + n + " khong la so nguyen to");
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
}
