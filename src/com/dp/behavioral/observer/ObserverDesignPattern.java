package com.dp.behavioral.observer;

/**
 * The Class ObserverDesignPattern.
 */
public class ObserverDesignPattern {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		
		final Blog blog = new Blog();
		
		final User user1 = new User();
		
		final User user2 = new User();
		
		blog.registerObserver(user1);
		blog.registerObserver(user2);
		
		user1.setSubject(blog);
		user2.setSubject(blog);

		System.out.println(user1.getArticle());
		
		blog.postNewArticle();
		System.out.println(user1.getArticle());
	}

}
