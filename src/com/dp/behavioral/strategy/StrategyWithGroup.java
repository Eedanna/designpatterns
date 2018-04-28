package com.dp.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class StrategyWithGroup.
 * 
 */
public class StrategyWithGroup implements QueryStrategy {

	/** The logger. */
	private static Logger LOGGER = LoggerFactory.getLogger(StrategyWithGroup.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see queryfwk.QueryStrategy#getQueryStrategyType()
	 */
	@Override
	public QueryStrategyType getQueryStrategyType() {
		return QueryStrategyType.ALLJOINSTRATEGY;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see queryfwk.QueryStrategy#processQueryRequest(request.dto.QueryRequest)
	 */
	@Override
	public void processQueryRequest(final QueryRequest queryRequest) {

	}

}
