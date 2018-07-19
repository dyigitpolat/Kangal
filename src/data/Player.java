package data;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class Player {
	
	private String name;
	private Nationality nationality;
	private LocalDate birthdate;
	private KangalPicture picture;
	
	public Player(String name, LocalDate birthdate, Nationality nationality) {
		//init player with provided data
		picture = null;
		this.name = name;
		this.birthdate = birthdate;
		this.nationality = nationality;
	}
	
	public String getName() {
		return name;
	}
	
	public Nationality getNationality() {
		return nationality;
	}
	
	public LocalDate getBirthdate() {
		return birthdate;
	}
	
	public KangalPicture getPicture() {
		return picture;
	}
	
	public void setPicture( KangalPicture picture) {
		this.picture = picture;
	}
	
	public String toString() {
		String str = "";
		str += "type: generic";
		str += " , ";
		str += "name: " + name;
		str += " , ";
		str += "nationality: " + nationality;
		str += " , ";
		str += "birthdate: " + birthdate;
		str += " , ";
		if(picture != null)
			str += "picture: " + picture.getPath();
		else
			str += "picture: null";
		str += "";
		
		return str;
	}
}


