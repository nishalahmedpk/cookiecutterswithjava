import java.io.*;
import java.util.ArrayList;
public class WriteFile {
	public WriteFile(ArrayList<Employee> data, String filename) throws IOException {
		FileWriter writer = new FileWriter(filename);
		for (Employee empinfo : data) {
			writer.write(empinfo.getName()+" "+empinfo.getSalary()+"\n");}
		writer.close();	
	}
	
}
