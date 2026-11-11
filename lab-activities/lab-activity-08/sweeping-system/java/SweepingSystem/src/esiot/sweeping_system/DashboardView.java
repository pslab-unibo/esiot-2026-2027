package esiot.sweeping_system;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

import javax.swing.*;

class DashboardView extends JFrame implements ActionListener  {

	private JButton start;
	private JButton stop;
	
	private JTextField sweepingCount;
	
	private DashboardController controller;	
	
	public DashboardView(){
		super(".:: Sweeping System ::.");
		setSize(600,150);
		this.setResizable(false);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.add(Box.createRigidArea(new Dimension(0,20)));
		
		JPanel infoLine = new JPanel();
		infoLine.setLayout(new BoxLayout(infoLine, BoxLayout.LINE_AXIS));
		sweepingCount = new JTextField("--");
		sweepingCount.setEditable(false);
		sweepingCount.setPreferredSize(new Dimension(200,15));
		infoLine.add(new JLabel("Sweeping count:"));
		infoLine.add(sweepingCount);
		
		mainPanel.add(infoLine);
		mainPanel.add(Box.createRigidArea(new Dimension(0,20)));
		mainPanel.setPreferredSize(new Dimension(200,20));

		JPanel buttonPanel = new JPanel();
		start = new JButton("Start");
		start.setEnabled(false);
		start.addActionListener(this);
		stop = new JButton("Stop");
		stop.setEnabled(false);
		stop.addActionListener(this);
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));	    
		buttonPanel.add(stop);
		buttonPanel.add(start);
		
		mainPanel.add(buttonPanel);
		mainPanel.add(Box.createRigidArea(new Dimension(0,20)));
		setContentPane(mainPanel);	
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent ev){
				System.exit(-1);
			}
		});
	}
	
	public void display() {
		SwingUtilities.invokeLater(() -> {
			this.setVisible(true);
		});
	}

	public void registerController(DashboardController contr){
		this.controller = contr;
	}
	
	public void actionPerformed(ActionEvent ev){
		  try {
			  /*
			  if (ev.getSource() == ...){
			  */ 
		  } catch (Exception ex){
			  ex.printStackTrace();

		  }
	}
}
