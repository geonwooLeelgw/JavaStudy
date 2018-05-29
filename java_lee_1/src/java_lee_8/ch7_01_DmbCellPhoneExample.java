package java_lee_8;

public class ch7_01_DmbCellPhoneExample {
	public static void main(String[] args) {
	//DmbCellPhone에 대한 객체 생성
	ch7_01_dmbcellPhone dmb = new ch7_01_dmbcellPhone("i-phone","black",101);
	
	// model, color는
	//부모클래스에 필드값이지만 상속을 받아서 자식클래스에서 접근가능
	System.out.println("모델: "+dmb.model);
	System.out.println("색상: "+dmb.color);
	System.out.println("채널: "+dmb.channel);
	
	//부모 클래스에서 선언한 메소드 각각 호출
	dmb.PowerOn();
	dmb.PowerOff();
	dmb.bell();
	dmb.sendVoice("안농");
	dmb.receiveVoice("그래, 안농");
	dmb.hangUp();
	
	//자식 클래스에서 선언한 메소드 각각 호출
	dmb.turnOnDmb();
	dmb.changeChannelDmb(201);
	dmb.turnOffdmb();
}
}
