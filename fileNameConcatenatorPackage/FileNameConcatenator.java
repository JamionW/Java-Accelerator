package fileNameConcatenatorPackage;

public class FileNameConcatenator {
	private String driveLetter;
	private String pathName;
	private String fileName;
	private String fileExtension;
	private String fullName;
	
	// grab input from the main program
	public FileNameConcatenator(String driveLetterInput, String pathNameInput, String fileNameInput, String fileExtensionInput) {
		driveLetter = driveLetterInput;
		pathName = pathNameInput;
		fileName = fileNameInput;
		fileExtension = fileExtensionInput;
	}
	
	// concatenate the string together with escaped backslash
	public void stringConcatenator() {
		fullName = driveLetter + ":" + pathName + "\\" + fileName + "." + fileExtension;
	}
	
	// return to main
	public String getFullName() {
		return fullName;
	}
}
