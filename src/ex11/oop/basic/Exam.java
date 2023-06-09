package ex11.oop.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Exam {
	int kor;
	int eng;
	int math;

	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Exam() {
		this(3, 4, 5);
	}

	public void print() {
		System.out.printf("kor:%d, eng:%d, math:%d\n", kor, eng, math);
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("kor:");
		kor = scan.nextInt();
		System.out.print("eng:");
		eng = scan.nextInt();
		System.out.print("math:");
		math = scan.nextInt();
	}

	public int total() {
		// TODO Auto-generated method stub
		return kor + eng + math;
	}

	public float avg() {
		// TODO Auto-generated method stub
		return kor + eng + math / 3f;
	}

	public void save(String fileName) throws IOException {
		// 데이터를 가져온다.
		String path = "res/ex11/" + fileName;

		FileOutputStream fos = new FileOutputStream(path);
		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

		// 값을 넣는다
		fout.printf("%d,%d,%d\n", kor, eng, math);

		fout.close();
		fos.close();
	}

	public void load(String fileName) throws IOException {
		String path = "res/ex11/" + fileName;
		FileInputStream fis = new FileInputStream(path);
		Scanner sc = new Scanner(fis);

		String line = sc.nextLine();
		String[] scores = line.split(",");

		kor = Integer.parseInt(scores[0]);
		eng = Integer.parseInt(scores[1]);
		math = Integer.parseInt(scores[2]);

		sc.close();
		fis.close();
	}
}
