package java_lee_10;

public class EmployExample {

	public static void main(String[] args) {
		Employee_2 emp = new Employee_2("오양춘",2000000);
		Manager_2 gm = new Manager_2("양만득",2000000,500000);
		Executive_2 ex = new Executive_2("김필승",2000000,500000,50);
		
		
		System.out.println("이름: "+emp.name+" 급여: "+(int)emp.price+"원"+"인상된 급여: "
							+(int)emp.priceUp()+"원");
		System.out.println("----------------------------------------------");
		System.out.println("이름: "+gm.name+" 급여: "+(int)gm.price+"원"+" 보너스: "+(int)gm.bonas
							+"원"+" 최종급여: "+(int)gm.priceUp()+"원");
		System.out.println("----------------------------------------------");
		System.out.println("이름: "+ex.name+" 급여: "+(int)ex.price+"원"+" 보너스: "+(int)ex.bonas+
							"원"+" 최종급여: "+(int)ex.priceUp()+"원"+" 주식: "+ex.josic+"주");
	}

}
