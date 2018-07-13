package data;

import java.time.LocalDate;


public class Player {
	
	private String name;
	private Nationality nationality;
	private LocalDate birthdate;
	private KangalPicture picture;
	
	public Player(String name, LocalDate birthdate, Nationality nationality)
	{
		picture = null;
		this.name = name;
		this.birthdate = birthdate;
		this.nationality = nationality;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Nationality getNationality()
	{
		return nationality;
	}
	
	public LocalDate getBirthdate()
	{
		return birthdate;
	}
}


