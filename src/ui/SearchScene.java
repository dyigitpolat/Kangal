package ui;

public class SearchScene extends Scene {

	private SearchBarPanel sbp;
	private SearchResultsPanel srp;
	
	public SearchScene(Screen scr) {
		super(scr);
		add( new SearchBarPanel());
		// TODO Auto-generated constructor stub
		
		render();
	}

}
