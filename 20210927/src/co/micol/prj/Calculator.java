package co.micol.prj;

public class Calculator { // Class ����,�����
	private int firstNum;
	private int secondNum;
	
	public Calculator() {//�⺻������
		
	}
	public Calculator (int n) {
		
	}
	
	Calculator(int n, int m ){ //�����ڸ� ���� �� ���� ���.
		this.firstNum = n;
		this.secondNum = m;
	}
	
	public void setFirstNum(int n) {//setter
		this.firstNum = n;
	}
	public int getFirstNum() {//getter
		return firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public int sum() {
		return firstNum + secondNum;
	}
	public int sub() {
		return firstNum - secondNum;
	}
	
	
	
}
