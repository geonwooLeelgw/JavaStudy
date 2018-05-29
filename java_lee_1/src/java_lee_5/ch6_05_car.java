package java_lee_5;
//생성자 (Constructor)Overloading
public class ch6_05_car {
	//field선언
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	//여러 종류의 생성자 선언해보기
	/* 1.기본생성자
	 * 2. model을 매개변수로 하는 생성자
	 * 3. model, color를 매개변수로 하는 생성자
	 * 4. model, color, maxSpeed를 매개변수로 하는 생성자
	 */
	ch6_05_car(){} //1번
	
	ch6_05_car(String model){ //2번
		this.model=model;
	}
	ch6_05_car(String model,String color){ //3번
		/*model=m;
		color=c;*/
		this.model=model;
		this.color=color;
	}
	ch6_05_car(String model,String color, int maxSpeed){ //4번
		/*model=m;
		color=c;
		maxSpeed=ma;*/
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
