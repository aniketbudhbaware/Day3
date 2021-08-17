
public class WageUC3 {
	int age;
    String name, address, gender;
    Scanner get = new Scanner(System.in);
    Employee()
    {
        System.out.println("Enter Name of the Employee:");
        name = get.nextLine();
        System.out.println("Enter Gender of the Employee:");
        gender = get.nextLine();
        System.out.println("Enter Address of the Employee:");
        address = get.nextLine();
        System.out.println("Enter Age:");
        age = get.nextInt();
    }

    void display()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
    }
}



class partTimeEmployees extends WageUC3
{
    int workinghrs, rate;
    partTimeEmployees()
    {
        System.out.println("Enter Number of Working Hours:");
        workinghrs = get.nextInt();
    }
    void calculatepay()
    {
        rate = 8 * workinghrs;
    }

    void display()
    {
        System.out.println("------"+"\n"+"Part Time Employee Details"+"\n"+"------"+"\n");
        super.display();
        System.out.println("Number of Working Hours: "+workinghrs);
        System.out.println("Salary for "+workinghrs+" working hours is: $"+rate);
    }
}

class Employees
{
    public static void main(String args[])
    {
        
        partTimeEmployees ob = new partTimeEmployees();
        System.out.println("------"+"\n"+"Enter Part Time Employee Details"+"\n"+"-------"+"\n");
        
        ob.calculatepay();
        ob.display();
    }
}
