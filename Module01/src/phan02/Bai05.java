package phan02;
/**
 * Thao tác với các toán tử quan hệ, toán tử so sánh trong ngôn ngữ lập trình Java. 
 * @author BeekaiPC
 *
 */
public class Bai05 {
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		
		System.out.println("value1 == value2: " + (value1 == value2));
		System.out.println("value1 != value2: " + (value1 != value2));
		System.out.println("value1 > value2: " + (value1 > value2));
		System.out.println("value1 < value2: " + (value1 < value2));
		System.out.println("value1 <= value2: " + (value1 <= value2));
		System.out.println("(value1 <= value2) && (value1 == value2): " + ((value1 <= value2) && (value1 == value2)));
		System.out.println("(value1 <= value2) || (value1 == value2): " + ((value1 <= value2) || (value1 == value2)));
	}
}


/*
 * GIẢI THÍCH
 * 
 * Line 10: giá trị value1 = 1
 * Line 11: giá trị value2 = 2
 * 
 * Line 13:  1 = 2 (sai) ==> Theo logic 1 < 2 ==> kết quả là sai nên giá trị về sẽ là boolean ==> false
 * Line 14:  1 khác 2 (đúng) ==> Theo logic 1 < 2 ==> kết quả là đúng nên giá trị về sẽ là boolean ==> true
 * Line 15:  1 > 2 (sai) ==> Theo logic 1 < 2 ==> kết quả là sai nên giá trị về sẽ là boolean ==> false
 * Line 16:  1 < 2 (đúng) ==> Theo logic 1 < 2 ==> kết quả là đúng nên giá trị về sẽ là boolean ==> true
 * Line 17:  1 <= 2 (đúng) ==> Theo logic 1 < 2 ==> kết quả là đúng nên giá trị về sẽ là boolean ==> true
 * Line 18:  Dòng này có 2 ý: 1. (1 <= 2) (đúng)
 * Line 18:  				  2. (1 == 2) (sai)
 * Line 18:  và toán tử "&&" thể hiện ý: "và"
 * Line 18:  ==> kết hợp 1, 2 lại thì ta có: (1 <= 2) và (1 == 2) ==> kết quả sai bởi vì theo logic 1 < 2 và 1 bằng 2 (Điều kiện: buộc phải thỏa mãn đủ 2 điều kiện) ==> nên giá trị về sẽ là boolean ==> false
 * 
 * Line 19:  Dòng này có 2 ý: 1. (1 <= 2) (đúng)
 * Line 19:  				  2. (1 == 2) (sai)
 * Line 19:  và toán tử "||" thể hiện ý: "hoặc"
 * Line 19:  ==> kết hợp 1, 2 lại thì ta có: (1 <= 2) hoặc (1 == 2)  ==> kết quả đúng bởi vì theo logic 1 < 2 và 1 bằng 2 (Điều kiện: chỉ cần thỏa mãn đủ 1 trong 2 điều kiện) ==> nên giá trị về sẽ là boolean ==> true
 * */