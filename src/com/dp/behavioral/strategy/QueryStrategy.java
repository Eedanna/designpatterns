/**
 * 
 */
package com.dp.behavioral.strategy;

/**
 * The Interface QueryStrategy.
 *
 */

public interface QueryStrategy {

	/**
	 * Process query request.
	 *
	 * @param queryRequest
	 *            the query request
	 * @return the data frame
	 */
	public void processQueryRequest(final QueryRequest queryRequest);

	/**
	 * Gets the query strategy type.
	 *
	 * @return the query strategy type
	 */
	public QueryStrategyType getQueryStrategyType();

}
