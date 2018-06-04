package ShoppingMallProject;

public class CellPhone extends Product{
	
	int i;//상품 번호를 매기기위한 변수
	String carrier;
	
	public CellPhone(String pName, int price, String carrier){
		this.pName = pName;
		this.price = price;
		this.carrier = carrier;
	}
	
	
	@Override
	public void printExtra() {
		
	}
}
