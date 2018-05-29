package java_lee_9;

public class ch7_09_Tire {
	
	//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//생성자
	public ch7_09_Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation; //0으로 시작해서 1씩 증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else { //maxRotation 값이 0보다 작아지면 펑크!
			System.out.println("***" +location+"Tire 펑크 ***");
			return false;
		}
	}
	
}
