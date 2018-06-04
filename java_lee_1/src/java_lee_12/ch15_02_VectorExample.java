package java_lee_12;

import java.util.*;

public class ch15_02_VectorExample {

	public static void main(String[] args) {
		List<ch15_02_Board> list = new Vector<ch15_02_Board>();
		

		list.add(new ch15_02_Board("제목1", "글내용", "사용자1"));
		list.add(new ch15_02_Board("제목2", "글내용", "사용자2"));
		list.add(new ch15_02_Board("제목3", "글내용", "사용자3"));
		list.add(new ch15_02_Board("제목4", "글내용", "사용자4"));
		list.add(new ch15_02_Board("제목5", "글내용", "사용자5"));
		System.out.println((ch15_02_Board)list.get(0));
		System.out.println();
		for(int i=0;i<list.size();i++) {
	
			ch15_02_Board board = list.get(i);
			
			System.out.print(board.subject+" ");
			System.out.print(board.content);
			System.out.print(board.writer);
			System.out.println();
		}
		
	}

}
