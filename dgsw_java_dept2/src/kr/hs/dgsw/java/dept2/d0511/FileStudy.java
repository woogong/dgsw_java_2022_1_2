package kr.hs.dgsw.java.dept2.d0511;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStudy {

	public void studyFileData() throws Exception {
		File file = new File("C:/90_ETC/javaStudy/sample.txt");
		
		/* 파일 이름 알기 */
		String name = file.getName();
		System.out.println("파일 이름 알기");
		System.out.println(name);
		System.out.println();
		
		/* 파일의 경로 알기 */
		File file2 = new File("./abc.txt");
		String path = file2.getPath();
		String absolutePath = file2.getAbsolutePath();
		String canonicalPath = file2.getCanonicalPath();
		
		System.out.println("파일 경로 알기");
		System.out.println("  getPath() - " + path);
		System.out.println("  getAbsolutePath() - " + absolutePath);
		System.out.println("  getCanonicalPath() - " + canonicalPath);
		System.out.println();
		
		/* 파일의 존재 여부 */
		boolean exist = file.exists();
		System.out.println("파일의 존재 여부");
		System.out.println(name + "  " + exist);
		System.out.println(file2.getName() + "  " + file2.exists());
		System.out.println();
		
		/* 파일의 크기 */
		long size = file.length();
		System.out.println("파일의 크기");
		System.out.println(name + "  " + size);
		System.out.println(file2.getName() + "  " + file2.length());
		System.out.println();
		
		/* 파일의 수정 시간 */
		long time = file.lastModified();
		System.out.println("수정된 시각");
		System.out.println(name + "  " + formatDate(convertToDate(time)));
		System.out.println(file2.getName() + "  " + file2.lastModified());
		System.out.println();
		
		
	}
	
	public void showFileData(File file) {
		// TODO
	}
	
	public Date convertToDate(long unixTime) {
		return new Date(unixTime);
	}
	
	public String formatDate(Date date) {
		SimpleDateFormat dateFormat = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
	
	public static void main(String[] args) throws Exception {
		FileStudy fileStudy = new FileStudy();
		//fileStudy.studyFileData();
		
		File file = new File("C:/90_ETC/javaStudy/sample.txt");
		fileStudy.showFileData(file);
	}
	
}
