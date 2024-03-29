package com.javatechie.springboot.di.bean;

public class UserService {
	
	public void DisplayFeed()
	{
		//To use getFeed() from social media app, we need to 
		SocialMediaFeed cc = new SocialMediaFeed();
		cc.getFeed();
	}
	
	public static void main(String s[])
	{
		UserService  uu = new UserService();
		uu.DisplayFeed();
	}

}
