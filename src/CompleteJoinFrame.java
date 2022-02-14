import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CompleteJoinFrame extends WindowAdapter implements ActionListener {
	private Frame f;
	private Button b;
	private Label l1, l2;
	private Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();

	public void start() {
		f = new Frame("Joined");
		f.setSize(250, 150);
		f.setLayout(null);
		f.addWindowListener(this);
		f.setLocation(screenSize.width / 2 - 300, screenSize.height / 2 - 200);

		l1 = new Label("출근했습니다.");
		l2 = new Label("님 반갑습니다.");
		l1.setSize(100, 50);
		l1.setLocation(100, 40);
		l2.setSize(100, 50);
		l2.setLocation(75, 45);

		b = new Button("Ok");
		b.setSize(60, 30);
		b.setLocation(95, 100);
		b.addActionListener(this);
//		f.add(l1);
		f.add(l2);
		f.add(b);
		f.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		f.dispose();

	}

	public void windowClosing(WindowEvent E) {
		f.dispose();
	}

}
