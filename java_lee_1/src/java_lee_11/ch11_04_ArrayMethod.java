package java_lee_11;

import java.util.Arrays;
import java.util.Collections;

public class ch11_04_ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] score = {100,80,90};
		String[] score = {"가나다","하하하","롸롸롸"};
		for(int i = 0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		System.out.println();
		Arrays.sort(score);//오름차순! , Collections.reverseOrder()내림차순
		for(int i = 0;i<score.length;i++) {
			System.out.println(score[i]);
		}
	}

}
