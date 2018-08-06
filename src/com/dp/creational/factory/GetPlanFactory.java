/**
 * 
 */
package com.dp.creational.factory;

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
	public Plan getPlan(final String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase(String.valueOf(PlanEnum.DOMESTICPLAN))) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase(String.valueOf(PlanEnum.COMMERCIALPLAN))) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase(String.valueOf(PlanEnum.INSTITUTIONALPLAN))) {
			return new InstitutionalPlan();
		}
		return null;
	}

}
