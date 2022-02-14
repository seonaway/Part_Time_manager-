import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class JoinFrame extends WindowAdapter implements ActionListener {
	private Frame f;
	private TextField tf1, tf2;
	private Button b1;
	private Label lid, lpw;
	private Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	private PartTimerJoinDAO dao = new PartTimerJoinDAO();

	public void start() {
		f = new Frame("����ϱ�");
		f.setSize(250, 240);
		f.setLayout(null);
		f.addWindowListener(this);
		f.setLocation(screenSize.width / 2 - 300, screenSize.height / 2 - 200);

		lid = new Label("����");
		lpw = new Label("��й�ȣ");
		lid.setSize(55, 20);
		lpw.setSize(55, 20);
		lid.setLocation(30, 40);
		lpw.setLocation(30, 100);

		tf1 = new TextField();
		tf2 = new TextField();
		tf1.setSize(200, 20);
		tf2.setSize(200, 20);
		tf1.setLocation(25, 65);
		tf2.setLocation(25, 125);

		b1 = new Button("����ϱ�");
		b1.setSize(200, 50);
		b1.setLocation(25, 160);
		b1.addActionListener(this);

		f.add(b1);
		f.add(tf1);
		f.add(tf2);
		f.add(lid);
		f.add(lpw);
		f.setVisible(true);
	}

	public void windowClosing(WindowEvent E) {
		f.dispose();
	}

	public void actionPerformed(ActionEvent e) {

		CheckJoinFrame chjf = new CheckJoinFrame();
		InputYourName iyn = new InputYourName();
		InputYourPassword iyp = new InputYourPassword();
		CheckNameOrPassword cnp = new CheckNameOrPassword();
		if (tf1.getText().equals("")) {
			iyn.start();
		} else if (tf2.getText().equals("")) {
			iyp.start();
		} else {
			ArrayList<PartTimerVo> list = dao.list(tf1.getText());
			if (list.size() == 0) {
				cnp.start();
			} 
			else {
				PartTimerVo data = (PartTimerVo) list.get(0);
				String pswd = data.getPw();
				if (tf2.getText().equals(pswd)) {
					chjf.start();
					f.dispose();
				} else {
					cnp.start();
				}
			}
		}
	}
}