package phan02;
/**
 * 
 * 4/ Thao tác với toán tử pre-increment và post-increment
 * 
 * @author
 * */
public class Bai04 {
	public static void main(String[] args) {
		int i = 3;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(--i);
		System.out.println(i--);
		System.out.println(i);
		
	}
}
/*
 * GIẢI THÍCH
 *
 * Dòng code 10: phần tử i ban đầu i = 3, sau khi i++ (dòng code 10) => i tăng 1 ==> i =4
 * Sòng code 12:
 * 
 * 
 * */