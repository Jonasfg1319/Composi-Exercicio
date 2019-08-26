package primeiropacote;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entites.enums.WorkerLevel;

public class Worker {

	String name;
	WorkerLevel level;
	Double BaseSalary;
	
	Departament depar;
	List<HourContract> contracts = new ArrayList<>();
	//não usar lista nos construtores
	
	public Worker() 
	{
		
	}
	
	public Worker(String name, WorkerLevel level, Double BaseSalary) 
	{
		this.name = name;
		this.level = level;
		this.BaseSalary = BaseSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return BaseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		BaseSalary = baseSalary;
	}

	public Departament getDepar() {
		return depar;
	}

	public void setDepar(Departament depar) {
		this.depar = depar;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
   //setar os contratos da lista pode atrapalhar, pois a lista seria trocado por outra lista
	
	public void AddContract(HourContract contract) 
	{
		contracts.add(contract);
	}
	public void RemoveContract(HourContract contract) 
	{
		contracts.remove(contract);
	}
	
	public double IncomeYears(int year,int month) 
	{
		double sum = BaseSalary;
		Calendar cal = Calendar.getInstance();
		
		for(HourContract item : contracts) 
		{
		  cal.setTime(item.getData());
		  int item_year = cal.get(Calendar.YEAR);
		  int item_month = 1 + cal.get(Calendar.MONTH);
		  
		  if(year == item_year && month == item_month) 
		  {
				sum += item.TotalValue();
			    return sum;
		  }
		}
		
		return sum;
	}
	
}
