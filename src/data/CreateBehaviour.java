package data;

import java.lang.reflect.Field;

public class CreateBehaviour {
	DatabaseManager dbm;
	
	public CreateBehaviour( DatabaseManager dbm) {
		this.dbm = dbm;
	}
	
	public void perform( Player p) {
		//TODO: generic implementation
		System.out.println("user creation init..");
		System.out.println(p);
		
	}
}
