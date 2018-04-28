/**
 * 
 */
package com.dp.creational.factory;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating GetPlan objects.
 */
public class GetPlanFactory {

	/**
	 * Gets the plan.
	 *
	 * @param planType
	 *            the plan type
	 * @return the plan
	 */
	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}
		return null;
	}

}
