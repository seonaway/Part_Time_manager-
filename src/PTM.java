
public class PTM {

	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
		JoinFrame jf = new JoinFrame();
		CompleteJoinFrame cjf = new CompleteJoinFrame();
		CompleteOutFrame cof = new CompleteOutFrame();
		CheckJoinFrame chjf = new CheckJoinFrame();
		CheckOutFrame chof = new CheckOutFrame();
		InputPasswordFrame ipf = new InputPasswordFrame();
		ManagingFrame mngf = new ManagingFrame();
		AddFrame af = new AddFrame();
		mf.start();
		jf.start();
		cjf.start();
		cof.start();
		chjf.start();
		chof.start();
		ipf.start();
		mngf.start();
		af.start();
	}

}
