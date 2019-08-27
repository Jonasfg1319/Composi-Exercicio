package primeiropacote;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entites.enums.WorkerLevel;



public class ClassePrincipal {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		HourContract contra; 
		
		
		System.out.println("Enter Departament name");
		String dd = sc.next();
		System.out.println("Enter Worker Data:");
		System.out.println("name: ");
		String name = sc.next();
		System.out.println("Level: ");
		String level = sc.next();
		System.out.println("Base Salary: ");
        Double BaseSalary = sc.nextDouble();
        Worker wo = new Worker(name,WorkerLevel.valueOf(level),BaseSalary,new Departament(dd));
        
        System.out.println("How mani contracts?");
        int ctq = sc.nextInt();
        
        for(int i = 0; i < ctq; i++) 
        {
        	System.out.print(i+1+"#Contract: ");
        	System.out.println("Date(YY/MM/YYYY)");
        	Date dt = sdf.parse(sc.next());
        	System.out.println("Value per hour");
        	Double valueper = sc.nextDouble();
        	System.out.println("Hour");
        	Integer hour = sc.nextInt();
        	contra = new HourContract(dt,valueper,hour);
        	wo.AddContract(contra);
        }
        
        System.out.println("Enter month and yer for calcule income");
        String monthandyear = sc.next();
        int month = Integer.parseInt(monthandyear.substring(0, 2));
        int year = Integer.parseInt(monthandyear.substring(3));
        wo.IncomeYears(year, month);
        System.out.println("Departament: "+wo.departament.getDepar());
        System.out.println("Name: "+wo.getName());
        System.out.println("Income for "+month+"/"+year+" : "+wo.IncomeYears(year, month));
        
       
		
		
		
		
		sc.close();
	}

}
