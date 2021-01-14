package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuePerHoour;
	private Integer hours;
	
	public HourContract() {
		
	}

	public HourContract(Date date, Double valuePerHoour, Integer hours) {
		
		this.date = date;
		this.valuePerHoour = valuePerHoour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHoour() {
		return valuePerHoour;
	}

	public void setValuePerHoour(Double valuePerHoour) {
		this.valuePerHoour = valuePerHoour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
}
