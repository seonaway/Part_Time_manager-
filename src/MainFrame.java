import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends WindowAdapter implements ActionListener {
	private Frame mainFrame;
	private Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	private Button b1, b2, b3, b4;
	private MenuBar mb;

	public void start() {
		mainFrame = new Frame("Part time Manager+");
		mb = new MenuBar();
		b1 = new Button("���üũ");
		b2 = new Button("����ϱ�");
		b3 = new Button("��������");
		b4 = new Button("�����ϱ�");
		b1.setSize(150, 100);
		b2.setSize(150, 100);
		b3.setSize(150, 100);
		b4.setSize(150, 100);
		b1.setLocation(0, 300);
		b2.setLocation(150, 300);
		b3.setLocation(300, 300);
		b4.setLocation(450, 300);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		mainFrame.setSize(600, 400);
		mainFrame.setLayout(null);
		mainFrame.setLocation(screenSize.width / 2 - 300, screenSize.height / 2 - 200);
		mainFrame.setVisible(true);
		mainFrame.add(b1);
		mainFrame.add(b2);
		mainFrame.add(b3);
		mainFrame.add(b4);

		mainFrame.addWindowListener(this);
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
			
		}
		if (e.getActionCommand().equals("�����ϱ�")) {
			System.exit(0);
		}
	}
}