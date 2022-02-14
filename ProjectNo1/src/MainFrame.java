import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.MenuBar;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainFrame extends WindowAdapter implements ActionListener {
	private Frame f;
	private Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	private Button b1, b2, b3, b4;
	private Label l1;


	public void start() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a HH�� mm���Դϴ�.");
		f = new Frame("Part time Manager+");
		f.setSize(450, 400);
		f.setLayout(null);
		f.setLocation(screenSize.width / 2 - 300, screenSize.height / 2 - 200);

		b1 = new Button("���üũ");
		b2 = new Button("����ϱ�");
		b3 = new Button("��������");
//		b4 = new Button("�����ϱ�");
		b1.setSize(150, 100);
		b2.setSize(150, 100);
		b3.setSize(150, 100);
//		b4.setSize(150, 100);
		b1.setLocation(0, 300);
		b2.setLocation(150, 300);
		b3.setLocation(300, 300);
//		b4.setLocation(450, 300);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
//		b4.addActionListener(this);

//	
//		l1 = new Label(year + "�� " + month + "�� " + date + "�� " + strampm + hour + "�� " + minute + "��" + "�Դϴ�."+day,
//				Label.LEFT);
		
		l1 = new Label(sdf.format(now));
		l1.setSize(300, 20);
		l1.setLocation(20, 40);
		f.add(b1);
		f.add(b2);
		f.add(b3);
//		f.add(b4);
		f.add(l1);

		f.setVisible(true);
		f.addWindowListener(this);
	}

	public void mb() {

	}

	public void windowClosing(WindowEvent E) {
		System.exit(0);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("���üũ")) {
			JoinFrame jf = new JoinFrame();
			jf.start();
		}
		if (e.getActionCommand().equals("����ϱ�")) {
			OutFrame of = new OutFrame();
			of.start();
		}
		if (e.getActionCommand().equals("��������")) {
			ManagingFrame mngf = new ManagingFrame();
			mngf.start();
		}

	}
}