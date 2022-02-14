import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class CompleteAddFrame extends CompleteJoinFrame {
   private Frame f;
   private Button b;
   private Label l1, l2;
   private Toolkit tk = Toolkit.getDefaultToolkit();
   Dimension screenSize = tk.getScreenSize();
   
   
   public void start() {
      f = new Frame("��ϿϷ�");
      f.setSize(250, 150);
      f.setLayout(null);
      f.addWindowListener(this);
      f.setLocation(screenSize.width / 2 - 300, screenSize.height / 2 - 200);

      l1 = new Label("��ϵǾ����ϴ�.");
      l2 = new Label("�� ȯ���մϴ�.");
      l1.setSize(100, 20);
      l1.setLocation(80, 40);
      l2.setSize(100, 20);
      l2.setLocation(90, 70);

      b = new Button("Ok");
      b.setSize(60, 30);
      b.setLocation(95, 100);
      b.addActionListener(this);
      f.add(l1);
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