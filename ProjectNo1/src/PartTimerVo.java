
public class PartTimerVo {

	private String name; // �̸�
	private String pw; // ��й�ȣ
	private String tel; // ����ó
	private String role; // ����


	public PartTimerVo() {
	}

	public PartTimerVo(String name,  String pw, String tel, String role) {
		this.name = name;
		this.pw = pw;
		this.tel = tel;
		this.role = role;
	}

	public String getName() {
		return name;
	}
	
	public String getPw() {
		return pw;
	}
	
	public String getTel() {
		return tel;
	}



	public String getRole() {
		return role;
	}
}
