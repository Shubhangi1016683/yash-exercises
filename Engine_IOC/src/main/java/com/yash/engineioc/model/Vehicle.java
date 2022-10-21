package com.yash.engineioc.model;

public class Vehicle {
	
	private String vehicleName;
	private String vechicleType;
	private String vehicleMileage;
	private int vechiclePrice;
	private Engine engine;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String vehicleName, String vechicleType, String vehicleMileage, int vechiclePrice, Engine engine) {
		super();
		this.vehicleName = vehicleName;
		this.vechicleType = vechicleType;
		this.vehicleMileage = vehicleMileage;
		this.vechiclePrice = vechiclePrice;
		this.engine = engine;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVechicleType() {
		return vechicleType;
	}
	public void setVechicleType(String vechicleType) {
		this.vechicleType = vechicleType;
	}
	public String getVehicleMileage() {
		return vehicleMileage;
	}
	public void setVehicleMileage(String vehicleMileage) {
		this.vehicleMileage = vehicleMileage;
	}
	public int getVechiclePrice() {
		return vechiclePrice;
	}
	public void setVechiclePrice(int vechiclePrice) {
		this.vechiclePrice = vechiclePrice;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void show() {
		System.out.println("vehicleName :- "+vehicleName);
		System.out.println("vechicleType :- "+vechicleType);
		System.out.println("vehicleMileage:- "+vehicleMileage);
		System.out.println("vechiclePrice :-" +vechiclePrice);
		System.out.println("engine :- " +engine.getEngineType());
	}
	
	

}
