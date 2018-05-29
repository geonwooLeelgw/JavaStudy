package java_lee_8;

public class ch7_04_SuperMain {

	public static void main(String[] args) {
		ch7_04_Super su = new ch7_04_Super();
		
		su.takeOff();
		su.fly();
		su.flyMode=ch7_04_Super.SUPERSONIC;
		su.fly();
		su.flyMode=ch7_04_Super.NORMAL;
		su.fly();
		su.land();
	}

}
