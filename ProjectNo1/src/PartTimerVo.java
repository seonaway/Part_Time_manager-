
public class PartTimerVo {

	private String name; // 이름
	private String pw; // 비밀번호
	private String tel; // 연락처
	private String role; // 역할


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
