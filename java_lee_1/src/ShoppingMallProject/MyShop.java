package ShoppingMallProject;

import java.util.*;

//IShop 인터페이스 의 구현 클래스
public class MyShop implements IShop {	
		//회원 정보 등록을 위한 배열 선언
		User[] users = new User[2];
		
		//상품 정보 등록을 위한 배열 선언
		Product[] Products = new Product[4];
		
		//상품 추가를 위한 장바구니
		ArrayList<Product> cart = new ArrayList<Product>();
		
		Scanner sc = new Scanner(System.in);
		
		int selUser;

		String title;
		
		@Override
		public void genUser() {
			User user1 = new User("사용자1",payType.card);
			users[0] = user1;
			User user2 = new User("사용자2",payType.cash);
			users[1] = user2;
			
		}

		@Override
		public void genProduct() {
			CellPhone cp = new CellPhone("갤럭시 S9",1000000,"SKT");
			Products[0] = cp;
			cp = new CellPhone("애플 아이폰x",980000,"KT");
			Products[1] = cp;
			cp = new CellPhone("삼성 3D Smart TV",1000000,"4K");
			Products[2] = cp;
			cp = new CellPhone("LG Samrt TV",1000000,"Full HD");
			Products[3] = cp;
		}

		@Override
		public void start() {
			System.out.println(title+" : 메인화면 - 계정 선택");
			System.out.println("========================");
			for(int i=0;i<users.length;i++) {
				System.out.println("["+i+"]"+users[i].getName()+users[i].getPayType());
			}
			System.out.println("[x]종료");
			System.out.print("선택 : ");
			String sel = sc.next();
			System.out.println("## "+sel + "선택 ##");
			
			switch(sel) {
			case "x" : System.exit(0);
						break;
			default :
				selUser = Integer.parseInt(sel);
				ProductList();
			}
			
		}

		private void ProductList() {
			System.out.println(title+" : 상품목록 - 상품선택");
			System.out.println("=========================");
			int i=0;
			for(Product p : Products) {
				System.out.println("["+i+"]");
				p.printDeatail();
				i++;
			}
			System.out.println("[h] 메인화면");
			System.out.println("[c] 체크아웃");
			System.out.println("선택 : ");
			String sel = sc.next();
			System.out.println("## "+sel+"선택 ##");
			
			switch(sel) {
			case "h" :
				start();
				break;
			case "c" :
				checkOut();
				break;
			default :
				int psel = Integer.parseInt(sel);
				cart.add(Products[psel]);
				ProductList();
			}
		}

		private void checkOut() {
			System.out.println(title +" : 체크아웃");
			System.out.println("=========================");
			int total=0;
			int i=0;
			
			//장바구니에 담긴 상품 정보 출력
			for(Product p : cart) {
				System.out.println("["+(i++)+"]"+p.pName+"   "+p.price);
				total = total + p.price;
			}
			System.out.println("==========================");
			
			System.out.println("결제 방법 : "+users[selUser].getPayType());
			
			System.out.println("합계 : "+ total+" 원 입니다.");
			System.out.println("[p]이전, [q]결제 완료");
			System.out.println("선택 : ");
			String sel = sc.next();
			
			switch(sel) {
			case "p" :
				ProductList();
				break;
			case "q" :
				System.out.println("##결제가 완료되었습니다. 종료합니다.");
				System.exit(0);
				break;
			default :
				checkOut();
			}
			
		}

		@Override
		public void setTitile(String title) {
			this.title = title;
			
		}
	
	}
