import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class ReadFile {
	public ArrayList<Employee> listofemployees;
	public ReadFile(String filename) throws FileNotFoundException {
		File fileobj = new File(filename);
		listofemployees = new ArrayList<Employee>();
		Scanner reader = new Scanner(fileobj);
		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			String[] splitted = line.split(" ");
			listofemployees.add(new Employee(splitted[0],splitted[1]));
			}
	}
	public ArrayList<Employee> getdata() {
		return listofemployees;
	}
}
