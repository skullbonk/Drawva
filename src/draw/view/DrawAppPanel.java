package draw.view;

import java.awt.GridLayout;
import java.util.Hashtable;

import javax.swing.*;
import draw.controller.DrawController;

public class DrawAppPanel
{
	private DrawController app;
	private DrawPanel canvas;
	private JPanel colorPanel;
	private JPanel menuPanel;
	private JScrollPane canvasPage;
	private SpringLayout appLayout;
	private JSlider widthSlider;
	
	private JButton redButton;
	private JButton greenButton;
	private JButton blueButton;
	private JButton whiteButton;
	private JButton blackButton;
	private JButton purpleButton;
	private JButton orangeButton;
	private JButton yellowButton;
	
	private JButton saveButton;
	private JButton loadButton;
	private JButton clearButton;
	
	private final int MINIMUM_LINE = 1;
	private final int MAXIMUM_LINE = 25;

	public DrawAppPanel(DrawController controller)
	{
		super();
		this.app = app;
		
	}
	
	private void setupMenuPanels()
	{
		redButton = new JButton("red");
		greenButton = new JButton("green");
		blueButton = new JButton("blue");
		blackButton = new JButton("black");
		whiteButton = new JButton("white");
		purpleButton = new JButton("purple");
		orangeButton = new JButton("orange");
		yellowButton = new JButton("yellow");
		
		saveButton = new JButton("save panel");
		loadButton = new JButton("load new panel");
		clearButton = new JButton("clear panel");
		widthSlider = new JSlider(MINIMUM_LINE, MAXIMUM_LINE);
		colorPanel = new JPanel(new GridLayout(0, 1));
		menuPanel = new JPanel(new GridLayout(0, 1));
		
		setupMenuPanels();
		setupSlider();
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupScrollPane()
	{
		
	}
	
	private void setupSlider()
	{
		Hashtable<Integer, JLabel> scaleLabels = new Hashtable<Integer, JLabel>();
		scaleLabels.put(MINIMUM_LINE, new JLabel("<HTML>Small<BR>Line</HTML>"));
		scaleLabels.put(MAXIMUM_LINE, new JLabel("<HTML>Large<BR>Line</HTML>"));
		widthSlider.setLabelTable(scaleLabels);
		widthSlider.setSnapToTicks(true);
		widthSlider.setMajorTickSpacing(5);
		widthSlider.setMinorTickSpacing(1);
		widthSlider.setPaintTicks(true);
		widthSlider.setPaintLabels(true);
		widthSlider.setValue((MAXIMUM_LINE + MINIMUM_LINE) / 2);
	}
	
	private void setupPanel()
	{

	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
