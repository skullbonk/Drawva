package draw.view;

import javax.swing.JPanel;
import draw.controller.DrawController;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class DrawPanel
{
	private DrawController controller;
	private Color currentColor;
	private BufferedImage currentCanvas;
	private int previousX;
	private int previousY;
	
	
	public DrawPanel(DrawController controller)
	{
		super();
		this.controller = controller;
		this.currentCanvas = new BufferedImage(700, 700, BufferedImage.TYPE_INT_ARGB);
		setupPanel();
		resetPoint();
	}

	public void resetPoint()
	{
		previousX = Integer.MIN_VALUE;
		previousY = Integer.MIN_VALUE;
	}
	
	public void clearImage()
	{
		
	}
	
	@Override
	protected void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		graphics.drawImage(currentCanvas, 0, 0, null);
	}

	public void drawLine(int currentX, int currentY, int width)
	{
		
	}
	
	public void drawDot(int currentX, int currentY, int width)
	{
		Graphics2D current = currentCanvas.createGraphics();
		current.setColor(currentColor);
		current.setStroke(new BasicStroke(width));
		current.drawOval(currentX, currentY, width, width);
		repaint();
	}
	
	public void setCurrentColor(String color)
	{
		if(color.equalsIgnoreCase("Black"))
		{
			currentColor = Color.BLACK;
		}
		else if(color.equals("purple"))
		{
			currentColor = new Color(75, 0, 130);
		}
		else
		{
			currentColor = randomColor();
		}
	}
	
	private Color randomColor()
	{
		int red = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256);
		int blue = (int)(Math.random() * 256);
		int alpha = (int)(Math.random() * 256);
		
		Color randomColor = new Color(red, green, blue, alpha);
		return randomColor;
	}
	
	public void setupPanel()
	{
		this.setPreferredSize(new Dimension(700, 700));
		this.setBackground(Color.DARK_GRAY);
		this.currentColor = Color.BLUE;
	}
}
