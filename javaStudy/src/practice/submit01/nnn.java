package practice.submit01;

public class nnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String TypeAll = "가나다라마바사아자차카";
		String stringCoupon = "가나";
		int io_coupon = TypeAll.indexOf(stringCoupon);
		String coupon;

		coupon = TypeAll.substring(io_coupon+stringCoupon.length()+2,
				(TypeAll.substring(io_coupon).indexOf("마")+io_coupon));

		System.out.println(stringCoupon+" : "+ coupon);
		System.out.println(io_coupon);
		System.out.println(coupon);
	}

}