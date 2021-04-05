package com.coforge.training;
class User {
String name;
String city;
int userId;
public User() {
	System.out.println("NO PARAMETERS");
}
public User(String name, String city, int userId) {
	this(name,userId);
	this.city = city;
}
public User(String name, int userId) {
	this();
	this.name = name;
	this.userId = userId;
}
public void getDetails() {
	if(name!=null)
	{
		System.out.println(name);
	}
if(userId>0)
{
	System.out.println(userId);
}
if(city!=null)
{
	System.out.println(city);
}
}

}
public class ConstructorOverload{
	public static void main(String[] args) {
		User user1=new User("Helen",123);
		User user2=new User("Helen","delhi",567);
		user1.getDetails();
		user2.getDetails();
	}
}
