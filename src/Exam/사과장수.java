package Exam;

class AppleBuyer{
	private int MyMoney;
	private int AppleCnt;
	
	public AppleBuyer(int myMoney, int appleCnt) {
		super();
		MyMoney = myMoney;
		AppleCnt = appleCnt;
	}
	
	public void Payment(AppleSeller seller, int money) 
	{
		MyMoney -= money;
		int cnt = seller.Receive(money);
		AppleCnt += cnt;
		
	}
	public void ShowInfo() {

		System.out.println("-----구매자 정보-----");
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
	}
}

class AppleSeller{
	private int MyMoney;
	private int AppleCnt;
	public int Price;
	
	public AppleSeller(int myMoney, int appleCnt, int price) {
		super();
		MyMoney = myMoney;
		AppleCnt = appleCnt;
		Price = price;
	}
	public int Receive(int money) {
		MyMoney += money;
		int revcnt = money/Price;
		AppleCnt -= revcnt;
		return revcnt;
	}
	public void ShowInfo() {
		//속성 정보를 Console에 출력
		System.out.println("-----판매자 정보-----");
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
		System.out.println("개당 가격 : " + Price);
	}
}
public class 사과장수 {

	public static void main(String[] args) {
		AppleSeller 사과장수1 = new AppleSeller(100000,100,1000);
		AppleBuyer 홍길동 = new AppleBuyer(10000,0);
		AppleBuyer 이주현 = new AppleBuyer(20000,0);
		AppleBuyer 황다은 = new AppleBuyer(30000,0);
		홍길동.Payment(사과장수1,4000);
		사과장수1.ShowInfo();
		홍길동.ShowInfo();
	}

}
