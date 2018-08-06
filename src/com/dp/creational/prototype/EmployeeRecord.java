package com.dp.creational.prototype;

import org.apache.log4j.Logger;

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

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(EmployeeRecord.class);

	/**
	 * Instantiates a new employee record.
	 */
	public EmployeeRecord() {
		logger.info("   Employee Records ::  ");
		logger.info("<< --------------------------------------------- >>");
		logger.info("Eid" + "\t" + "Ename" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t\t" + "Eaddress");

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
	public EmployeeRecord(final int id, final String name, final String address, final double salary) {
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
	public void setId(final int id) {
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
	public void setName(final String name) {
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
	public void setAddress(final String address) {
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
	public void setSalary(final double salary) {
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
		logger.info(id + "::\t" + name + "::\t" + address + "::\t" + salary);
	}

}
