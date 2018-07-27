package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import data.BasketballPlayer;
import data.Player;
import data.SoccerPlayer;
import data.TennisPlayer;

public class DetailScene extends Scene{

	Scene nextScn;
	LogoPanel logoPanel;
	Player player;
	
	public DetailScene( Screen scr, SoccerPlayer p) {
		super(scr);
		player = p;
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                back();
            }
        });
		
		add(back);
		add(new IDPanel(p));
		add(new SoccerPlayerStatsPanel(p));
		// TODO Auto-generated constructor stub
	}
	public DetailScene( Screen scr, BasketballPlayer p) {
		super(scr);
		player = p;
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                back();
            }
        });
		
		add(back);
		add(new IDPanel(p));
		add(new BasketballPlayerStatsPanel(p));
		// TODO Auto-generated constructor stub
	}
	public DetailScene( Screen scr, TennisPlayer p) {
		super(scr);
		player = p;
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                back();
            }
        });
		
		add(back);
		add(new IDPanel(p));
		add(new TennisPlayerStatsPanel(p));
		// TODO Auto-generated constructor stub
	}
	public void setNext( Scene nextScn) {
		this.nextScn = nextScn;
	}
	/*public void setDetailPanel( DetailPanel detailPanel) {
		removeAll();
		this.detailPanel = detailPanel;
		add(new IDPanel(player));
		add(detailPanel);
	}*/
	

	public void back() {
		getScreen().setScene( new SearchScene(getScreen().dbm, getScreen()));
	}
}
