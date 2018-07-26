package ui;

import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import data.DatabaseManager;
import data.SearchOperator;

public class SearchResultsPanel extends KangalPanel {

	SearchScene parent;
	public SearchResultsPanel() {
		
		setPreferredSize( new Dimension( 600, 600));
		render();
	}
	
	
	public void performSearch( String attr, SearchOperator op) {
		parent.getDatabaseManager().searchPlayer(attr, 0, op);
	}
		
}
