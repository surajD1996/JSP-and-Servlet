package com.bridgelabz.servlet;

public class Users 
{
	private String userName;
	private String mailID;
	private String mobileNumber;
	private String password;
	
	public String getUserName() 
	{
		return userName;
	}
	
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	
	public String getMailID() 
	{
		return mailID;
	}
	
	public void setMailID(String mailID) 
	{
		this.mailID = mailID;
	}
	
	public String getMobileNumber() 
	{
		return mobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber) 
	{
		this.mobileNumber = mobileNumber;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	@Override
	public String toString() 
	{
		return "Users [userName=" + userName + ", mailID=" + mailID + ", mobileNumber=" + mobileNumber + ", password="
				+ password + "]";
	}
	
	
}
