package data;

import java.time.LocalDate;

public class LoadBehaviour {
	DatabaseManager dbm;
	
	public LoadBehaviour( DatabaseManager dbm) {
		this.dbm = dbm;
	}
	
	public Player perform( String s) {
		String[] attrib = s.split(" , ");
		for( int i = 0; i < attrib.length; i++)
		{
			attrib[i].trim();
			System.out.println(attrib[i]);
		}
		
		return new Player("name", LocalDate.now(), Nationality.TURKEY);
	}
}
