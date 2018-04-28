package com.dp.behavioral.strategy;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// TODO: Auto-generated Javadoc
/**
 * The Class QueryRequest.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryRequest {

	/** The query strategy. */
	@JsonProperty("queryStrategy")
	String queryStrategy;
	
	/** The filters. */
	@JsonProperty("filterMap")
	Map<String, String>[] filters;
	
	/** The calculation type. */
	@JsonProperty("calculationType")
	String calculationType;
	
	/** The break down. */
	@JsonProperty("breakDown")
	List<String> breakDown;

	/**
	 * Gets the query strategy.
	 *
	 * @return the query strategy
	 */
	public String getQueryStrategy() {
		return queryStrategy;
	}

	/**
	 * Sets the query strategy.
	 *
	 * @param queryStrategy the new query strategy
	 */
	public void setQueryStrategy(String queryStrategy) {
		this.queryStrategy = queryStrategy;
	}

	/**
	 * Gets the calculation type.
	 *
	 * @return the calculation type
	 */
	public String getCalculationType() {
		return calculationType;
	}

	/**
	 * Sets the calculation type.
	 *
	 * @param calculationType the new calculation type
	 */
	public void setCalculationType(String calculationType) {
		this.calculationType = calculationType;
	}

	/**
	 * Gets the break down.
	 *
	 * @return the break down
	 */
	public List<String> getBreakDown() {
		return breakDown;
	}

	/**
	 * Sets the break down.
	 *
	 * @param breakDown the new break down
	 */
	public void setBreakDown(List<String> breakDown) {
		this.breakDown = breakDown;
	}

	/**
	 * Gets the filters.
	 *
	 * @return the filters
	 */
	public Map<String, String>[] getFilters() {
		return filters;
	}

	/**
	 * Sets the filters.
	 *
	 * @param filters the filters
	 */
	public void setFilters(Map<String, String>[] filters) {
		this.filters = filters;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(queryStrategy).append(calculationType);
		for (String bstr : breakDown) {
			sb.append(bstr);
		}
		for (Map<String, String> filterMap : filters) {
			for (String fstr : filterMap.keySet()) {
				sb.append(fstr).append(filterMap.get(fstr));
			}
		}
		return sb.toString();

	}

	/**
	 * Gets the request code.
	 *
	 * @return the request code
	 */
	public String getRequestCode() {
		return (this.hashCode() + "").replaceAll("-", "_");
	}

}
