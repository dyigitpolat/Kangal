package ui;

import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class SearchResultsPanel extends KangalPanel {

	public SearchResultsPanel() {
		
		setPreferredSize( new Dimension( 600, 600));
		render();
	}
		
}
