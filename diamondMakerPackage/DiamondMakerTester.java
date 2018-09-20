package diamondMakerPackage;

import javax.swing.JOptionPane;

public class DiamondMakerTester {
	public static void main(String[] args) {
		// Ask user for the desired Diamond side width
		String userSideWidthString = JOptionPane.showInputDialog("What length of each side would you like for your diamond?");
		//change to an int
		int userSideWidth = Integer.parseInt(userSideWidthString);
		// construct
		DiamondMaker jamionsDiamond = new DiamondMaker(userSideWidth);
		// do the work
		jamionsDiamond.constructDiamond();
	}
}
