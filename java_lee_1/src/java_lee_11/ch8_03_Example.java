package java_lee_11;

public class ch8_03_Example {

	public static void main(String[] args) {
		ch8_03_ImplemetationC impl = new ch8_03_ImplemetationC();
		
		ch8_03_InterfaceA ia = impl;
		ia.mothhodA();
		
		ch8_03_InterfaceB ib = impl;
		ib.methodB();
		
		ch8_03_InterfaceC ic = impl;
		ic.mothhodA();
		ic.methodB();
		ic.methodC();
	}

}
