package LT_Chuong3;

public class Test {
	public static void main(String[] args) {
		HinhChuNhat h = new HinhChuNhat(10,5);
//		h.setcDai(10);
//		h.setcRong(5);
		
		System.out.println("Chu vi = " + h.tinhChuVi());
		System.out.println("Dien tich = " + h.tinhDienTich());
		System.out.println("Chieu dai = " + h.getcDai());
		System.out.println("Chieu rong = " + h.getcRong());
		
		System.out.println(h.toString());
	}
}
