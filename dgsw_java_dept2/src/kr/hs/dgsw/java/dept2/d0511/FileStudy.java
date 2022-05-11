package kr.hs.dgsw.java.dept2.d0511;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStudy {

	public void studyFileData() throws Exception {
		File file = new File("C:/90_ETC/javaStudy/sample.txt");
		
		/* ���� �̸� �˱� */
		String name = file.getName();
		System.out.println("���� �̸� �˱�");
		System.out.println(name);
		System.out.println();
		
		/* ������ ��� �˱� */
		File file2 = new File("./abc.txt");
		String path = file2.getPath();
		String absolutePath = file2.getAbsolutePath();
		String canonicalPath = file2.getCanonicalPath();
		
		System.out.println("���� ��� �˱�");
		System.out.println("  getPath() - " + path);
		System.out.println("  getAbsolutePath() - " + absolutePath);
		System.out.println("  getCanonicalPath() - " + canonicalPath);
		System.out.println();
		
		/* ������ ���� ���� */
		boolean exist = file.exists();
		System.out.println("������ ���� ����");
		System.out.println(name + "  " + exist);
		System.out.println(file2.getName() + "  " + file2.exists());
		System.out.println();
		
		/* ������ ũ�� */
		long size = file.length();
		System.out.println("������ ũ��");
		System.out.println(name + "  " + size);
		System.out.println(file2.getName() + "  " + file2.length());
		System.out.println();
		
		/* ������ ���� �ð� */
		long time = file.lastModified();
		System.out.println("������ �ð�");
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
