package phan02;
/**
 * Thao tác với toán tử pre-increment và post-increment
 * @author BeekaiPC
 *
 */
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
 * Line 10: phần tử i ban đầu i = 3, 
 * Line 11: sau khi i++ (tạo ra bản copy của giá trị ban đầu sau đó cộng vào i) ==> i tăng 1 ==> i = 4
 * Line 12: xuất ra kết quả từ phép toán
 * 
 * Line 13: sau khi ++i (cộng thẳng trên giá trị ban đầu) ==> i tăng 1 ==> i = 5
 * 
 * toán tử i++/++i tương tự i--/--i
 */