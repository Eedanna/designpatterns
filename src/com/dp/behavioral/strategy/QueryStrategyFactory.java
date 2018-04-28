/**
 * 
 */
package com.dp.behavioral.strategy;

/**
 * A factory for creating QueryStrategy objects.
 *
 */
public class QueryStrategyFactory {

	/**
	 * Gets the query strategy.
	 *
	 * @param queryStrategyType
	 *            the query strategy type
	 * @return the query strategy
	 */
	public static QueryStrategy getQueryStrategy(final QueryStrategyType queryStrategyType) {
		switch (queryStrategyType) {
		case ALLJOINSTRATEGY:
			return new StrategyWithGroup();
		default:
			return new StrategyWithGroup(); // we can use different strategy
											// class
		}
	}
}
