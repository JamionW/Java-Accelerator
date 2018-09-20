package diamondMakerPackage;

public class DiamondMaker {
	// get our private vars set up
	private int diamondSideWidth = 0;
	private int boxSideWidth = 0;

	// grab the proper vars from the main program
	public DiamondMaker(int userSideWidth) {
		diamondSideWidth = userSideWidth;
		boxSideWidth = ((diamondSideWidth * 2) - 1);
	}
	
	// construct the diamond by using the absolute value
	//  of the width as a function of height in order to
	//  determine if an asterisk or a blank should be printed
	public void constructDiamond() {
		for (int h = 1; h <= boxSideWidth; h++)
		{
			for (int w = 1; w <= boxSideWidth; w++)
			{
				if ((h > Math.abs(diamondSideWidth - w)) && (h < ((boxSideWidth + 1) - Math.abs(diamondSideWidth - w)))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
