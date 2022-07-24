package com.media;

public class Media 
{
	private int id;
	private String mediaCode;
	private String mediaName;
	private String email;
	private String location;
	private String phonenumber;
	
	public Media(int id,String mediaCode,String mediaName,String email, String location, String phonenumber)
	{
		this.id = id;
		this.mediaCode = mediaCode;
		this.mediaName = mediaName;
		this.email = email;
		this.location = location;
		this.phonenumber = phonenumber;
	}

	public int getId() 
	{
		return id;
	}

	public String getMediaCode() 
	{
		return mediaCode;
	}

	public String getMediaName() 
	{
		return mediaName;
	}

	public String getEmail() 
	{
		return email;
	}

	public String getLocation() 
	{
		return location;
	}

	public String getPhonenumber() 
	{
		return phonenumber;
	}


	
	
}
