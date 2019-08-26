package primeiropacote;

import java.util.Date;

public class HourContract {

	private Date data;
	private Double ValuePerHour;
	private Integer Hour;
	
	public HourContract() 
	{
		
	}
	public HourContract(Date data, Double ValuePerHour,Integer Hour) 
	{
		this.data = data;
		this.ValuePerHour = ValuePerHour;
		this.Hour = Hour;
		
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValuePerHour() {
		return ValuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		ValuePerHour = valuePerHour;
	}
	public Integer getHour() {
		return Hour;
	}
	public void setHour(Integer hour) {
		Hour = hour;
	}
	
	public Double TotalValue() 
	{
		return ValuePerHour * Hour;
	}
	
	
}
