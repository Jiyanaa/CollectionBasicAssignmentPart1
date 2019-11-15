package com.training.assignments;

import java.util.Objects;

public class Car implements Comparable<Car>{
		
	private String carMake;
	private String model;
	private String year;
	private Double price;
	
	
	public Car(String carMake, String model, String year, double price) {
		super();
		this.carMake = carMake;
		this.model = model;
		this.year = year;
		this.price = price;
	}


	public String getCarMake() {
		return carMake;
	}


	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public int hashCode() {
		return Objects.hash(carMake,model);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carMake == null) {
			if (other.carMake != null)
				return false;
		} else if (!carMake.equals(other.carMake))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return true;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return true;
		return true;
	}


	@Override
	public String toString() {
		return "Car [carMake=" + carMake + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}


	public int compareTo(Car car) {				
		return this.year.compareTo(car.year);
	}
	
	

}
