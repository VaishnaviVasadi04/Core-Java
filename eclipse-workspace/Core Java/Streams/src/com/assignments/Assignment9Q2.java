package com.assignments;

import java.util.ArrayList;

class News{
	private int newsid;
	private String postedByUser;
	private String commentByUser;
	private String comment;
	public News(int newsid, String postedByUser, String commentByUser, String comment) {
		this.newsid=newsid;
		this.commentByUser=commentByUser;
		this.postedByUser=postedByUser;
		this.comment=comment;
	}
	public int getNewsid() {
		return newsid;
	}
	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String toString() {
		return "newsid="+newsid+",postedByUser="+postedByUser+",commentByUser="+commentByUser+",comment="+comment;
	}
}	
	
public class Assignment9Q2{
	public static void main(String[] args) {
		News o1 = new News(1,"Vaishnavi","Vasadi","Good");
		News o2 = new News(2,"Priyanka","Sarma","Good");
		News o3 = new News(3,"Swati","Mishra","Budget");
		News o4 = new News(4,"Chandini","Raghupatruni","Good");
		
		
		ArrayList<News> al = new ArrayList<>();
		al.add(o1);
		al.add(o2);
		al.add(o3);
		al.add(o4);
		
		al.stream().filter(p->p.getComment().equals("Good")).forEach(p->System.out.println(p.getNewsid()));
		al.stream().filter(p->p.getComment().equals("Good")).forEach(p->System.out.println(p.getPostedByUser()));
		var v1 = al.stream().filter(p->p.getComment().contains("Budget")).count();
		System.out.println(v1);
		
			
	}
}