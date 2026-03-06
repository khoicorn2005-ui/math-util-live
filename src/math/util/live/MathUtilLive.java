package math.util.live;

public class MathUtilLive {
	public static void main(String[] args) {
		long result = MathUtil.getFactorial(5);
		System.out.println("5! = 120; actual: " + result);
		
		System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));
		
		System.out.println("0! = 1; actual: " + MathUtil.getFactorial(0));
		
		//MathUtil.getFactorial(-5); ném ngoại lệ thật rồi
		
		//THÊM CODE SAU KHI ĐẨY LÊN GITHUB 10:19 PM 06/03/2026
		System.out.println("1! = 1; actual: " + MathUtil.getFactorial(1));
		System.out.println("3! = 6; actual: " + MathUtil.getFactorial(3));
		
		//kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì
		//expected value: 5! = 120
		//hàm viết khi chạy thực tế là mấy - actual, giả sử 120
		//if expected == actual, hàm ngon trong tình huống này
	}
}
