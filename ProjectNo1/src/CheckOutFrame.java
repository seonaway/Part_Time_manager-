import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

public class CheckOutFrame extends WindowAdapter implements ActionListener {
	private Frame f;
	private Button b1, b2;
	private Label l1, l2;
	private Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();

	private Calendar now = Calendar.getInstance();
	private int ampm = now.get(Calendar.AM_PM);
	private String strampm = null;
	private int hour = now.get(Calendar.HOUR);
	private int minute = now.get(Calendar.MINUTE);

	public void start() {
		f = new Frame("CheckOut");
		f.setSize(250, 160);
		f.setLayout(null);
		f.addWindowListener(this);
		f.setLocation(screenSize.width / 2 - 300, screenSize.height / 2 - 200);

		if (ampm == Calendar.AM) {
			strampm = "���� ";
		} else {
			strampm = "���� ";
		}

		l1 = new Label("���� �ð��� " + strampm + hour + " �� " + minute + "�� " + "�Դϴ�.",Label.CENTER);
		l2 = new Label("����ұ��?",Label.CENTER);
		l1.setSize(250, 20);
		l2.setSize(250, 20);
		l1.setLocation(0, 50);
		l2.setLocation(0, 80);

		b1 = new Button("��");
		b2 = new Button("�ƴϿ�");
		b1.setSize(50, 30);
		b2.setSize(50, 30);
		b1.setLocation(75, 120);
		b2.setLocation(125, 120);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				CompleteOutFrame cof = new CompleteOutFrame();
				cof.start();
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

		f.add(b1);
		f.add(b2);
		f.add(l1);
		f.add(l2);
		f.setVisible(true);

	}

	public void windowClosing(WindowEvent E) {
		f.dispose();
	}

	public void actionPerformed(ActionEvent e) {

	}
}
