package Package;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame_Draw extends JPanel {
	static int pointCount = 0;
	private Point[] points = new Point[10000];
	private static int tam = 4;

	public Frame_Draw() {
		addMouseMotionListener(new MouseMotionAdapter() {

			public void mouseDragged(MouseEvent event) {

				if (pointCount < points.length) {

					points[pointCount] = event.getPoint();

					pointCount++;

					repaint();

				}

			}

		}

		);

	}
	
	public static void pointPlus() {
		tam++;
	}
	
	public static void pointMinus() {
		if(tam > 1)
			tam--;
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		repaint();

		for (int i = 0; i < pointCount; i++) {

			g.setColor(Frame_Exec_2.color);

			g.fillOval(points[i].x, points[i].y, tam, tam);

		}

	}
}