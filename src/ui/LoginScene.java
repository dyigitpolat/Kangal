package ui;

public class LoginScene extends Scene {

	Scene nextScn;
	LogoPanel logoPanel;
	LoginPanel loginPanel;
	
	public LoginScene(Screen scr) {
		super(scr);
		logoPanel = new LogoPanel();
		loginPanel = new LoginPanel(this);
		add(logoPanel);
		add(loginPanel);
		// TODO Auto-generated constructor stub
	}
	
	public void setLogoPanel( LogoPanel logoPanel) {
		removeAll();
		this.logoPanel = logoPanel;
		add(logoPanel);
		add(loginPanel);
		
	}
	
	public void tryLogin(String user, String pass) {
		System.out.println(user + " " + pass);
		if( user.equals("robinho") && pass.equals("sivas")) {
			System.out.println("login success");
			getScreen().add(nextScn);
			getScreen().remove(this);
			getScreen().render();
		}
	}
	
	public void setNext( Scene nextScn) {
		this.nextScn = nextScn;
	}

}
