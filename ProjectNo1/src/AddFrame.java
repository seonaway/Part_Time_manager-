import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class AddFrame extends Frame1 {
	private Frame f;
	private Frame f2 = new Frame("Error");
	private TextField tf1, tf2, tf3, tf4;
	private Button b1;
	private Label lid, lpw, lpw2, ltel, l1;
	private Choice role;
//	private Toolkit tk = Toolkit.getDefaultToolkit();
//	Dimension screenSize = tk.getScreenSize();
	private String str1, str2;

	public void start() {

		f = new Frame("등록");
		f.setSize(300, 500);
		f.setLayout(null);
		f.setLocation(screenSize.width / 2 - 300, screenSize.height / 2 - 200);
		f.addWindowListener(this);

		lid = new Label("성명");
		lpw = new Label("비밀번호");
		lpw2 = new Label("비밀번호 확인");
		ltel = new Label("연락처");
		
		lid.setSize(55, 20);
		lpw.setSize(55, 20);
		lpw2.setSize(55, 20);
		ltel.setSize(55, 20);
		lid.setLocation(225, 60);
		lpw.setLocation(225, 90);
		lpw2.setLocation(225, 120);
		ltel.setLocation(225, 150);
		

		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		tf4 = new TextField();
		tf1.setSize(200, 20);
		tf2.setSize(200, 20);
		tf3.setSize(200, 20);
		tf4.setSize(200, 20);
		tf1.setLocation(15, 60);
		tf2.setLocation(15, 90);
		tf3.setLocation(15, 120);
		tf4.setLocation(15, 150);

		str1 = tf2.getText();
		str2 = tf3.getText();

		b1 = new Button("등록");
		b1.setSize(270, 50);
		b1.setLocation(15, 440);
		b1.addActionListener(this);

		role = new Choice();
		role.add("직원");
		role.add("매니저");
		role.setSize(100, 100);
		role.setLocation(100, 300);

		f.add(lid);
		f.add(lpw);
		f.add(lpw2);
		f.add(ltel);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tf4);
		f.add(b1);
		f.add(role);
		f.setVisible(true);

	}

	public void frame() {

		Button b2 = new Button("확인");
		l1 = new Label("확인하세요.",Label.CENTER);
		f2.setSize(250, 150);
		f2.setLayout(null);
		f2.addWindowListener(this);
		f2.setLocation(screenSize.width / 2 - 300, screenSize.height / 2 - 200);

		l1.setSize(250, 20);
		l1.setLocation(0, 55);
		b2 = new Button("확인");
		b2.setSize(60, 30);
		b2.setLocation(95, 100);
		b2.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f2.dispose();

			}
		});

		f2.add(b2);
		f2.add(l1);
		f2.setVisible(true);
	}

	public void windowClosing(WindowEvent E) {
		f.dispose();
	}

	public void actionPerformed(ActionEvent e) {
		CompleteAddFrame caf = new CompleteAddFrame();

		if (tf1.getText().equals("")) {
			frame();
			l1.setText("성명을 입력하세요.");
		} else if (tf2.getText().equals("")) {
			l1.setText("비밀번호를 입력하세요.");
			frame();
		} else if (tf3.getText().equals("")) {
			l1.setText("비밀번호를 입력하세요.");
			frame();
		} else if (tf4.getText().equals("")) {
			l1.setText("연락처를 입력하세요.");
			frame();
		} else {caf.start();}
	}
}