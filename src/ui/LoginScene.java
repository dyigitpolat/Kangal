package ui;

public class LoginScene extends Scene {

	Scene nextScn;
	
	public LoginScene(Screen scr) {
		super(scr);
		add(new LogoPanel());
		add(new LoginPanel(this));
		// TODO Auto-generated constructor stub
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
