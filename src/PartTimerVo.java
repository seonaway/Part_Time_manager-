
public class PartTimerVo {

	private String name; // �̸�
	private String tel; // ����ó
	private String part; // �ٹ��ð���
	private String role; // ����


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
