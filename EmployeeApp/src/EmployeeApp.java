import java.io.IOException;
import java.util.*;

public class EmployeeApp {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		String filename = "Employee.txt";
		new CreateFile(filename);
		while (true) {
			System.out.print("1.Add \n2.Delete \n3.Show All\n4.Update \nChoice: ");
			Scanner inputer = new Scanner(System.in);
			String choice = inputer.next();
			if (choice.equals("1")) {
				ReadFile reader = new ReadFile(filename);
				ArrayList<Employee> data = reader.getdata();
				System.out.print("Name: ");
				String name = inputer.next();
				System.out.print("Salary: ");
				String salary = inputer.next();
				System.out.print("\n");
				data.add(new Employee(name,salary));
				new WriteFile(data,filename);
			} else if (choice.equals("2")) {
				System.out.print("Empid: ");
				int empid = inputer.nextInt();
				ReadFile reader = new ReadFile(filename);
				ArrayList<Employee> data = reader.getdata();
				int i = 0;
				for (Employee empinfo : data) {
					i++;
					if (i==empid) {
						data.remove(i-1);
					}
				new WriteFile(data,filename);
				}				
			} else if (choice.equals("3")) {
				ReadFile reader = new ReadFile(filename);
				ArrayList<Employee> data = reader.getdata();
				int i = 0;
				for (Employee empinfo : data) {
					i++;
					System.out.println(i+"."+empinfo.getName()+" Salary: "+empinfo.getSalary());
				}
			} else if (choice.equals("4")) {
				System.out.print("Empid: ");
				int empid = inputer.nextInt();
				System.out.print("Salary: ");
				String salary = inputer.next();
				ReadFile reader = new ReadFile(filename);
				ArrayList<Employee> data = reader.getdata();
				int i = 0;
				for (Employee empinfo : data) {
					i++;
					if (i==empid) {
						empinfo.setSalary(salary);;
					}
				new WriteFile(data,filename);
				}							
			} else {
				System.out.println("Exited.."); break;
			}
		}
	}

}