
public class PartTimerVo {

	private String name; // 이름
	private String tel; // 연락처
	private String part; // 근무시간대
	private String role; // 역할


	public PartTimerVo() {
	}

	public PartTimerVo(String name, String tel, String part, String role) {
		this.name = name;
		this.tel = tel;
		this.part = part;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getPart() {
		return part;
	}

	public String getRole() {
		return role;
	}
}
