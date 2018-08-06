package com.dp.creational.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

/**
 * The Class PrototypeDemo.
 */
public class PrototypeDemo {

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(PrototypeDemo.class);

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {

		try (final BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			logger.info("\n");
			logger.info("Enter Employee Id: ");
			int eid = Integer.parseInt(br.readLine());
			logger.info("\n");

			logger.info("Enter Employee Name: ");
			String ename = br.readLine();
			logger.info("\n");

			logger.info("Enter Employee Address: ");
			String eaddress = br.readLine();
			logger.info("\n");

			logger.info("Enter Employee Salary: ");
			double esalary = Double.parseDouble(br.readLine());
			logger.info("\n");

			EmployeeRecord e1 = new EmployeeRecord(eid, ename, eaddress, esalary);

			e1.showRecord();
			logger.info("\n");
			final EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
			e2.showRecord();
		} catch (final Exception ex) {
			logger.error("Exception Occured due to : " + ex.getMessage());
		}
	}

}
