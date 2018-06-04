package ShoppingMallProject;

//쇼핑몰을 실행하기 위한 메인 메소드 클래스
public class ShopLaucher {

	public static void main(String[] args) {
		IShop shop = new MyShop();
		shop.setTitile("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}

}
