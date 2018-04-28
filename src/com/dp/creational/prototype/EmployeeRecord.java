package com.dp.creational.prototype;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeRecord.
 */
public class EmployeeRecord implements Prototype {

	/** The id. */
	private int id;

	/** The name. */
	private String name;

	/** The address. */
	private String address;

	/** The salary. */
	private double salary;

	/**
	 * Instantiates a new employee record.
	 */
	public EmployeeRecord() {
		System.out.println("   Employee Records of Oracle Corporation ");
		System.out.println("---------------------------------------------");
		System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t\t" + "Eaddress");

	}

	/**
	 * Instantiates a new employee record.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param address
	 *            the address
	 * @param salary
	 *            the salary
	 */
	public EmployeeRecord(int id, String name, String address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address
	 *            the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the salary.
	 *
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Sets the salary.
	 *
	 * @param salary
	 *            the new salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dp.creational.prototypedp.Prototype#getClone()
	 */
	@Override
	public Prototype getClone() {
		return new EmployeeRecord(id, name, address, salary);
	}

	/**
	 * Show record.
	 */
	public void showRecord() {
		System.out.println(id + "::\t" + name + "::\t" + address + "::\t" + salary);
	}

}
