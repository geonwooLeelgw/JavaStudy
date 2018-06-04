package ShoppingMallProject;

import javax.annotation.Resource;

public class SmartTV extends Product{
	
	String resolution;
	
	public  SmartTV(String pName, int price, String resolution){
		this.pName = pName;
		this.price = price;
		this.resolution = resolution;
	}
	
	public void product() {
		
	}

	@Override
	public void printExtra() {
		System.out.println("해상도 :" +resolution);
		
	}
}
