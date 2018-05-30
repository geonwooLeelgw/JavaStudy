package java_lee_10;
//인터페이스 RemoteControl의 구현 클래스
public class ch8_01_Odio implements ch8_01_RemoteControl{
	//필드 선언
	private int volume;
	private boolean mute;
	
	//인터페이스에서 선언한 turnOn 실체 메소드 선언
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume>ch8_01_RemoteControl.MAX_VOLUME) {
			this.volume =ch8_01_RemoteControl.MAX_VOLUME;
		}
		else if(volume>ch8_01_RemoteControl.MIN_VOLUME) {
			this.volume =ch8_01_RemoteControl.MIN_VOLUME;
		}else {
			this.volume =volume;
		}
		System.out.println("현재 Audio 볼륨: "+ volume);
	}
	@Override
	//인터페이스에서 정의한 디폴트 메소드를 재정의할 때
	//접근제한자를 default에서 public으로
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio를 무음 처리 합니다.");
		} else {
			System.out.println("Audio를 무음 해제 합니다.");
		}
	}
	
}
