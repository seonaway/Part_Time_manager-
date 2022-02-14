import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckJoinFrame extends WindowAdapter implements ActionListener {
	private Frame f;
	private Button b1, b2;
	private Label l1,l2;
	private Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();

	public void start() {
		f = new Frame("CheckJoin");
		f.setSize(250, 160);
		f.setLayout(null);
		f.setLocation(screenSize.width / 2 - 300, screenSize.height / 2 - 200);
		f.addWindowListener(this);
		
		l1 = new Label("현재시간은"+"입니다.");
		l2 = new Label("출근할까요?");
		l1.setSize(100,20);
		l2.setSize(100,20);
		l1.setLocation(75,50);
		l2.setLocation(75,80);
		
		b1 = new Button("네");
		b2 = new Button("아니요");
		b1.setSize(50, 30);
		b2.setSize(50, 30);
		b1.setLocation(75, 120);
		b2.setLocation(125, 120);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				CompleteJoinFrame cjf = new CompleteJoinFrame();
				cjf.start();
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
