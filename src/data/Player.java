package data;

import java.util.Date;

enum Nationality 
{
	TURKEY, GERMANY, ENGLAND;
}

public class Player {
	private String name;
	private Nationality nationality;
	private Date birthday;
	private Picture picture;
	
	public Player(String name, Date bday, Nationality nation)
	{
		picture = null;
		this.name = name;
		birthday = bday;
		nationality = nation;
	}
}


