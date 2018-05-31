package java_lee_11;

public class B_CountableTest {

	public static void main(String[] args) {
		B_Countable[] m = {new B_Bird("뻐꾸기",1), new B_Bird("독수리",2), new B_Tree("사과나무",3), new B_Tree("밤나무",4)};
		
		//System.out.println(m[0].getClass()); //클래스값을 얻게해준다.
		
		//ch5_14 class에 있음
		for(B_Countable e: m) {
			e.count();
			
			//첫번째 반복문
			//e.m[0] == new B_Bird("뻐꾸기") ...3까지
		}
		for (int i=0;i<m.length; i++) {
			//타입에 따라 fly() 또는 ripen() 메서드를 호출하는
			//=>instanceof사용(강제 형변환)
			//조건문을 이용해서 배열에 저장된 각 요소가 Bird클래스 타입인지확인
			//m[i]배열이 B_Bird타입인지 확인해주는 것
			if(m[i] instanceof B_Bird) { //ch7_11_Instanceof
				((B_Bird)m[i]).fly();
			}else {
				((B_Tree)m[i]).ripen();
			}
			
			/*if(m[i].getClass() == m[0].getClass())
			m[i].fly();
			else
			m[i].ripen();*/
			
			/*B_Bird bird = new B_Bird("뻐꾸기");
			bird.fly();*/

		}
	}

}
