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
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Departament name");
		Departament dp = new Departament();
		dp.Depar = sc.next();
		System.out.println("Enter Worker Data:");
		System.out.println("name: ");
		String name = sc.next();
		System.out.println("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.next());
		System.out.println("Base Salary: ");
        Double BaseSalary = sc.nextDouble();
        Worker wo;
        wo = new Worker(name,level,BaseSalary);
        
        System.out.println("How mani contracts?");
        int ctq = sc.nextInt();
        
        for(int i = 0; i < ctq; i++) 
        {
        	System.out.println(i+1+"#Contract: ");
        	System.out.println("Date(YY/MM/YYYY)");
        	String ano = sc.next();
        	Date dt = sdf.parse(ano);
        	System.out.println("Value per hour");
        	Double valueper = sc.nextDouble();
        	System.out.println("Hour");
        	Integer hour = sc.nextInt();
        	contra = new HourContract(dt,valueper,hour);
        	wo.AddContract(contra);
        }
        
        System.out.println("Enter month and yer for calcule income");
        int month = sc.nextInt();
        int yer = sc.nextInt();
        wo.IncomeYears(yer, month);
        System.out.println("Departament: "+dp.getDepar());
        System.out.println("Name: "+wo.getName());
        System.out.println("Income for "+month+"/"+yer+" : "+wo.IncomeYears(yer, month));
        
       
		
		
		
		
		sc.close();
	}

}
