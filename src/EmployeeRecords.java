import java.util.HashMap;

public class EmployeeRecords {

	public static void main(String[] args) {
		
		HashMap<String, Integer> employeerecords = new HashMap<String, Integer>();
		
		//Employee name and employee number
		
		employeerecords.put("John", 100);
		employeerecords.put("Jay", 101);
		employeerecords.put("Paul", 102);
		employeerecords.put("Peter", 103);
		employeerecords.put("James", 104);
		employeerecords.put("Andy", 105);
		
		System.out.println(employeerecords);

	}

}
