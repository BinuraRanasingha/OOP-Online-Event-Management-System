package com.media;

import java.util.ArrayList;



import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MediaDBUtil 
{
	
	private static boolean success;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean validate(String mediacode,String medianame)
	{
		try
		{
			con = DatabaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from media where MediaCode='"+mediacode+"' and MediaName='"+medianame+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				success = true;
			}
			
			else
			{
				success = false;
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return success;
	}
	
	/*public static List<Media> validate(String mediacode, String medianame)
	{
		ArrayList<Media>med = new ArrayList<Media>();
		
		
		try 
		{
			con = DatabaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from media where MediaCode='"+mediacode+"'and MediaName='"+medianame+"'";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				int id = rs.getInt(1);
				String mediacod = rs.getString(2);
				String name = rs.getString(3);
				String email = rs.getString(4);
				String location = rs.getString(5);
				String phone = rs.getString(6);
				
				Media m = new Media(id,mediacod,name,email,location,phone);
				med.add(m);
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return med;
	}*/
	
	public static boolean insertMedia(String code,String name,String email,String location,String phone)
	{
		boolean success = false;
		
		try
		{
			con = DatabaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "Insert into media values('0','"+code+"','"+name+"','"+email+"','"+location+"','"+phone+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0)
				success = true;
			else
				success = false;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return success;
	}

	public static boolean updateMedia(String id,String code,String name,String email,String location,String phone)
	{
		
		try
		{
			con = DatabaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update media set MediaCode='"+code+"',MediaName='"+name+"',email='"+email+"',location='"+location+"',phonenumber='"+phone+"'"
					+ "where id='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0)
			{
				success = true;
			}
			else
			{
				success = false;
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return success;
	}
	
	public static List<Media> getMediaDetails(String id)
	{
		int convertedID = Integer.parseInt(id);
		
		ArrayList<Media> med = new ArrayList<Media>();
		
		try
		{
			con = DatabaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from media where id='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				int mid = rs.getInt(1);
				String code = rs.getString(2);
				String name = rs.getString(3);
				String email = rs.getString(4);
				String location = rs.getString(5);
				String phone = rs.getString(6);
				
				Media m = new Media(mid,code,name,email,location,phone);
				med.add(m);
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return med;
	}
	
	public static List<Media> getDetails(String mediacode)
	{
		//int convertedID = Integer.parseInt(id);
		
		ArrayList<Media> med = new ArrayList<Media>();
		
		try
		{
			con = DatabaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from media where MediaCode='"+mediacode+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				int mid = rs.getInt(1);
				String code = rs.getString(2);
				String name = rs.getString(3);
				String email = rs.getString(4);
				String location = rs.getString(5);
				String phone = rs.getString(6);
				
				Media m = new Media(mid,code,name,email,location,phone);
				med.add(m);
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return med;
	}
	
	public static boolean deleteMedia(String id)
	{
		int Convid = Integer.parseInt(id);
		
		try
		{
			con = DatabaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from media where id='"+Convid+"'";
			int result = stmt.executeUpdate(sql);
			
			if(result > 0)
			{
				success = true;
			}
			
			else
			{
				success = false;
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return success;
	}


}




