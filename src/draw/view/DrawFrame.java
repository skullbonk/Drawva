package draw.view;

import javax.swing.JFrame;
import draw.controller.*;
import draw.model.*;

public class DrawFrame extends JFrame
{

	private DrawController app;
	
	public DrawFrame(DrawController app)
	{
		super();
		this.app = app;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		
	}

}
