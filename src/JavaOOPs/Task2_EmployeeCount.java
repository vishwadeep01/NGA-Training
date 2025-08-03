package javaoops;

public class Task2_EmployeeCount {
	
	 static int count = 0;
	 int id;
	 
	 Task2_EmployeeCount(int id) {
	 this.id = id;
	 count++; 
	 }
	 
	 void show() {
	 System.out.println("Employee Id: " + id);
	 }
	 
	 static void showCount() {
	 System.out.println("Total Employees: " + count);
	 }


    public static void main(String[] args) {
    	Task2_EmployeeCount e1 = new Task2_EmployeeCount(23);
    	Task2_EmployeeCount e2 = new Task2_EmployeeCount(35);
    	Task2_EmployeeCount e3 = new Task2_EmployeeCount(54);
    	e1.show();
    	e2.show();
    	e3.show();
        Task2_EmployeeCount.showCount();
    }

}
