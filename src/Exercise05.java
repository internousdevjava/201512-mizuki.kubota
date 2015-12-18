
public class Exercise05 {


	public static void main(String[] args) {
		Employee[] employee = new Employee[6];
	    employee[0] = new Employee("矢沢　晃",5,28);
	    employee[1] = new Employee("宮本　純子",10,33);
	    employee[2] = new Employee("藤原　美和子",3,23);
	    employee[3] = new Employee("土浦　巧",25,45);
	    employee[4] = new Employee("野崎　りさ",18,38);
	    employee[5] = new Employee("浅井　真治",8,31);
	    
	    System.out.println("---------------------------------------");
	    System.out.println("*　　　　　社員名簿システム　　　　　*");
	    System.out.println("---------------------------------------");
	    
	    for(int i = 0; i < employee.length; i++){
	    	employee[i].display();
	    	System.out.println("---------------------------------------");
	      }
	    Employee.showTotalNumber();
	}


}
