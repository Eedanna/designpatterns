package com.dp.behavioral.observer;

/**
 * The Class User.
 */
public class User implements Observer {

	/** The article. */
	private String article;
	
	/** The blog. */
	private Subject blog;

	/* (non-Javadoc)
	 * @see com.dp.behavioral.observer.Observer#setSubject(com.dp.behavioral.observer.Subject)
	 */
	public void setSubject(final Subject blog) {
		this.blog = blog;
		article = "No New Article!";
	}

	/* (non-Javadoc)
	 * @see com.dp.behavioral.observer.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("State change reported by Subject.");
		article = (String) blog.getUpdate();
	}

	/**
	 * Gets the article.
	 *
	 * @return the article
	 */
	public String getArticle() {
		return article;
	}
}