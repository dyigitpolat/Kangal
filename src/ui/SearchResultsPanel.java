package ui;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import data.DatabaseManager;
import data.Player;
import data.SearchOperator;

public class SearchResultsPanel extends KangalPanel {

	SearchScene parent;
	List<Player> results;
	public SearchResultsPanel( SearchScene parent) {
		this.parent = parent;
		setPreferredSize( new Dimension( 600, 600));
		performSearch("", SearchOperator.EQUALS);
		render();
	}
	
	
	public void performSearch( String attr, SearchOperator op) {
		results = parent.getDatabaseManager().searchPlayer(attr, 0, op);
		updateResults();
	}
	
	public void updateResults() {
		for( Player p : results) {
			add( new SearchResult(p, ""+Math.floor(Math.random()*100), this));
			System.out.println(p.getName());
		}
		render();
	}
		
	public void playerSelected( Player p) {
		parent.navigate(p);
	}
}
