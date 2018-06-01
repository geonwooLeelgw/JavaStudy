package java_lee_12;

import java.io.*;
public class FileClass_01 {

	public static void main(String[] args) {
		//기존 파일을 새로운 파일로 저장하기
		File rfile = new File("D:\\test\\testfile.txt");
		//새롭게 만들 파일에 대한 객체 생성
		File wfile = new File("D:\\\\test\\\\testfile_new.txt");
		
		try {
			//기존 파일을 읽어오기 위한 reader 객체생성
			BufferedReader reader = new BufferedReader(new FileReader(rfile));
			//기존 파일을 쓰기 위한 writer 객체생성
			BufferedWriter writer = new BufferedWriter(new FileWriter(wfile));
			
			String s;
			//기존 파일에 있는 내용을 읽어서 s에저장
			while((s=reader.readLine()) !=null) {
				//s에 저장된 내용 및 추가 문자열 새로운 파일인 wfile에 저장.
				writer.write(s+"-새로 쓰여진 파일");
			}
			reader.close();
			writer.close();
			rfile.delete();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("새로 쓰기 완료");
	}

}
