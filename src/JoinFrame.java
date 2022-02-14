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

public class JoinFrame extends WindowAdapter implements ActionListener {
	private Frame f;
	private TextField tf1, tf2;
	private Button b1;
	private Label lid, lpw;
	private Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();

	public void start() {
		f = new Frame("Join");
		f.setSize(300, 200);
		f.setLayout(null);
		f.addWindowListener(this);
		f.setLocation(screenSize.width / 2 - 300, screenSize.height / 2 - 200);

		b1 = new Button("Join");
		b1.setSize(270, 50);
		b1.setLocation(15, 140);

		lid = new Label("Name");
		lpw = new Label("Number");
		lid.setSize(55, 20);
		lpw.setSize(55, 20);
		lid.setLocation(225, 60);
		lpw.setLocation(225, 90);
		
		tf1 = new TextField();
		tf2 = new TextField();
		tf1.setSize(200, 20);
		tf2.setSize(200, 20);
		tf1.setLocation(15, 60);
		tf2.setLocation(15, 90);

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
		if (e.getActionCommand().equals("Join")) {
		}

	}
}