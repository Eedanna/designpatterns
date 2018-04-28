/**
 * 
 */
package com.dp.behavioral.strategy;

/**
 * The Class StrategyContext.
 *
 */
public class StrategyContext {

	/** The query strategy. */
	private QueryStrategy queryStrategy;

	/**
	 * Instantiates a new strategy context.
	 *
	 * @param reqQueryStrategy
	 *            the req query strategy
	 */
	public StrategyContext(final String reqQueryStrategy) {
		QueryStrategyType queryStrategyType = null;
		try {
			queryStrategyType = QueryStrategyType.valueOf(reqQueryStrategy);
		} catch (Exception e) {
			e.getMessage();
		}
		queryStrategy = QueryStrategyFactory.getQueryStrategy(queryStrategyType);
	}

	/**
	 * Instantiates a new strategy context.
	 */
	public StrategyContext() {
		queryStrategy = QueryStrategyFactory.getQueryStrategy(null);
	}

	/**
	 * Sets the query strategy.
	 *
	 * @param queryStrategy
	 *            the new query strategy
	 */
	public void setQueryStrategy(final QueryStrategy queryStrategy) {
		this.queryStrategy = queryStrategy;
	}

	/**
	 * Process query request.
	 *
	 * @param queryRequest
	 *            the query request
	 * @return the data frame
	 */
	public void processQueryRequest(final QueryRequest queryRequest) {
		this.queryStrategy.processQueryRequest(queryRequest);
	}

	/**
	 * Gets the query strategy type.
	 *
	 * @return the query strategy type
	 */
	public QueryStrategyType getQueryStrategyType() {
		return queryStrategy.getQueryStrategyType();
	}
}
