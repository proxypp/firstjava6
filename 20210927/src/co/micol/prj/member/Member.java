package co.micol.prj.member;

public class Member {
	private String id;
	private String password;
	private String name;
	private String address;
	
	public Member(String id, String password, String name, String address) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
	}
	
	private void memberPrint() { // ��������.
		System.out.print("���̵� : "+id +" ");
		System.out.print("�н����� : "+password +" ");
		System.out.print("�� �� : "+name +" ");
		System.out.println("�� �� : "+address +" ");
			
	}
	public void run() {
		memberPrint();
	}
}
