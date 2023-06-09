package ex18.oop.poly.inter;

public class NewExam extends Exam implements PrintListener{
	
	private int com;
	
	public NewExam() {
		this(0,0,0,0);
	}
	
	public NewExam(int kor, int eng, int math, int com) {
		super(kor,eng,math);
		this.com = com;
	}

	@Override
	public int total() {
		return super.total()+com;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/4.0f;
	}


	public int getCom() {
		return com;
	}
	
	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public void printBanner() {
		System.out.println("뉴렉 고등학교 성적표!");
		
	}

	@Override
	public void printEx() {
		System.out.println("com:"+com);
	}
}
