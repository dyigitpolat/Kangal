package ui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import data.Player;

public class SearchResult extends KangalPanel {

	Player p;
	SearchResultsPanel parent;
	String attrib;
	
	KangalLabel playerName;
	KangalLabel cut;
	KangalLabel attribute;
	JButton selectButton;
	
	public SearchResult(Player p, String attrib, SearchResultsPanel parent) {
		this.p = p;
		this.parent = parent;
		this.attrib = attrib;
		
		selectButton = new JButton("Select");
		playerName = new KangalLabel(p.getName(), 20);
		cut = new KangalLabel("|", 40);
		cut.setBounds(300, 0, 10, 40);
		playerName = new KangalLabel(attrib, 20);
		selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerSelected( p);
            }
        });

		add(playerName);
		add(cut);
		add(attribute);
		
		setPreferredSize( new Dimension(600, 40));
		render();
	}
	
	public void playerSelected( Player p) {
		parent.playerSelected( p);
	}
}
