package java_lee_9;

public class ch7_09_kumhoTire extends ch7_09_Tire {
	//생성자
	public ch7_09_kumhoTire(String location, int maxRotion) {
		super(location, maxRotion);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+" kumhoTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** "+location+" kumhoTire 펑크 ***");
			return false;
		}
	}
}