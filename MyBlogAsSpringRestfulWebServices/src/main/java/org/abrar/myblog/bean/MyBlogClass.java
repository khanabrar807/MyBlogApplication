package org.abrar.myblog.bean;

public class MyBlogClass{
	
	int blogId;
	String blogTitle;	
	String blogDescription ;
	
	public MyBlogClass() {
		super();
	}
	public MyBlogClass(int i, String blogTitle,String blogDescription) {
		super();
		this.blogId = i;
		this.blogTitle = blogTitle;
		this.blogDescription=blogDescription;
	}
	public int getblogId() {
		return blogId;
	}
	public void setblogId(int blogId) {
		this.blogId = blogId;
	}
	public String getblogTitle() {
		return blogTitle;
	}
	public void setblogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getblogDescription() {
		return blogDescription;
	}
	public void setblogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}	
	
}