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

	public void studyManage() throws Exception {
		/* ���� ����� */
		File file = new File("C:/90_ETC/javaStudy/hello.txt");
		boolean created = file.createNewFile();
		System.out.println("���� �����");
		System.out.println(file.getName() + "  " + created);
		System.out.println();
		
		/* ���� �����ϱ� */
		boolean deleted = file.delete();
		System.out.println("���� �����ϱ�");
		System.out.println(file.getName() + "  " + deleted);
		System.out.println();
		
		/* ���丮 ����� */
		File dir = new File("C:/90_ETC/javaStudy/subDir1");
		created = dir.mkdir();
		System.out.println("���丮 �����");
		System.out.println(dir.getName() + "  " + created);
		System.out.println();
		
		/* ���丮 �����ϱ� */
		deleted = dir.delete();
		System.out.println("���丮 �����ϱ�");
		System.out.println(dir.getName() + "  " + deleted);
		System.out.println();
		
		/* ���丮 ����� 2 */
		File dir2 = new File("C:/90_ETC/javaStudy/child/images");
		created = dir2.mkdirs();
		System.out.println("���丮 �����2");
		System.out.println(dir2.getName() + "  " + created);
		System.out.println();
		
		/* ���ϰ� ���丮 �����ϱ� */
		File some1 = new File("C:/90_ETC/javaStudy/sample.txt");
		File some2 = new File("C:/90_ETC/javaStudy/child");
		File some3 = new File("C:/90_ETC/javaStudy/void");
		
		System.out.println("���ϰ� ���丮 �����ϱ�");
		System.out.println(some1.getName() + "  " + some1.isFile() + "  " + some1.isDirectory());
		System.out.println(some2.getName() + "  " + some2.isFile() + "  " + some2.isDirectory());
		System.out.println(some3.getName() + "  " + some3.isFile() + "  " + some3.isDirectory());
	
		/* ������ �̸� �ٲٱ� */
		File sample = new File("C:/90_ETC/javaStudy/sample.txt");
		File newName = new File("C:/90_ETC/javaStudy/child/����.txt");
		sample.renameTo(newName);
		
	}
	
	public void studyList() {
		File dir = new File("C:/");
		
		String[] children = dir.list();
		for (String name : children) {
			System.out.println(name);
		}
		
		System.out.println("-------------------------");
		
		File[] childrenFiles = dir.listFiles();
		for (File file : childrenFiles) {
			System.out.println(file.getAbsolutePath());
		}
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
		fileStudy.studyManage();
		//fileStudy.studyList();
		
		/*File file = new File("C:/90_ETC/javaStudy/sample.txt");
		fileStudy.showFileData(file);*/
	}
	
}
