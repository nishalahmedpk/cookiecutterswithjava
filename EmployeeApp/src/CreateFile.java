import java.io.File;
import java.io.IOException;
import java.lang.Thread;
public class CreateFile {
	public CreateFile(String filename) throws InterruptedException {
		System.out.print("File Status: ");
		Thread.sleep(1000);
		File fileobj = new File(filename);
		try {
			String status = (fileobj.createNewFile()) ? "File Created  " : "File Already Exists";
			System.out.print(status+"\n");
		} catch (IOException e) {
			System.out.print("Something went wrong \n");
		}
	}
	
}
