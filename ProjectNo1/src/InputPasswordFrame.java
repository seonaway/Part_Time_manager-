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

public class InputPasswordFrame extends WindowAdapter implements ActionListener {
	private Frame f;
	private TextField tf1;
	private Button b1;
	private Label lpw;
	private Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();

	public void start() {
		f = new Frame("Input Password");
		f.setSize(300, 180);
		f.setLayout(null);
		f.addWindowListener(this);
		f.setLocation(screenSize.width / 2 - 300, screenSize.height / 2 - 200);

		tf1 = new TextField("");
		tf1.setSize(150, 20);
		tf1.setLocation(75, 80);

		b1 = new Button("Ok");
		b1.setSize(150, 50);
		b1.setLocation(75, 120);
		b1.addActionListener(this);
		lpw = new Label("��й�ȣ�� �Է��ϼ���.");
		lpw.setSize(130, 20);
		lpw.setLocation(85, 60);
		f.add(b1);
		f.add(tf1);
		f.add(lpw);
		f.setVisible(true);
	}

	public void windowClosing(WindowEvent E) {
		f.dispose();
	}

	public void actionPerformed(ActionEvent e) {
		ManagingFrame mngf = new ManagingFrame();
		SetPasswordClass sp = new SetPasswordClass();
		InputPasswordErrorFrame ipef = new InputPasswordErrorFrame();


	}
}
