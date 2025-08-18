class Employee{
    
    private String firstName;
    private String lastName;
    private double monthlySalary;  

    public Employee(String firstName,String lastName,double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = salary;
    }

    public void setSalary(double sal){
        this.monthlySalary = sal;
    }

    public void display(){
        System.out.println(firstName +" "+ lastName +" ->" + monthlySalary);
        
    }

};

public class Q11_employeeInfo {
    public static void main(String[] arg){
        Employee emp1 = new Employee("Shubham", "Medewar",2400);
        emp1.display();
        emp1.setSalary(2640);
        emp1.display();
    }
}
