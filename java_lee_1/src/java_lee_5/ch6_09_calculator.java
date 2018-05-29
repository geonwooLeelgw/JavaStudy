package java_lee_5;
//method overloading p.232
public class ch6_09_calculator {
	
		double width;
		double height;
	
		//정사각형의 넓이를 구하는 메소드
		double areaRectangle(double width) {
			//this.width=width*width;
			double result = width*width;
			return result;
		}
		//메소드 이름 : areaRectangle
		//직사각형의 넓이를 구하는 메소드
		double areaRectangle(double wirdth, double height) {
			double result = width*height;
			return result;
		}
		
	
	}


