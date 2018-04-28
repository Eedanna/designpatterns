package com.dp.creational.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class PrototypeDemo.
 */
public class PrototypeDemo {

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
			System.out.print("Enter Employee Id: ");
			int eid = Integer.parseInt(br.readLine());
			System.out.print("\n");

			System.out.print("Enter Employee Name: ");
			String ename = br.readLine();
			System.out.print("\n");

			System.out.print("Enter Employee Address: ");
			String eaddress = br.readLine();
			System.out.print("\n");

			System.out.print("Enter Employee Salary: ");
			double esalary = Double.parseDouble(br.readLine());
			System.out.print("\n");

			EmployeeRecord e1 = new EmployeeRecord(eid, ename, eaddress, esalary);

			e1.showRecord();
			System.out.println("\n");
			EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
			e2.showRecord();
		} catch (Exception ex) {
			System.out.println("Exception Occured due to : " + ex.getMessage());
		}
	}

}
