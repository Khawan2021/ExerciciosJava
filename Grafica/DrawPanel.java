package Grafica;

import javax.swing.JPanel;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class DrawPanel extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = getWidth();
        int y = getHeight();

        int xI = (x / 14);
        int yI = (y / 14);
        //caso 1
		  /*for (int l = 0;l < 15; l++) {

			  g.drawLine(0, 0, x, yI);

			  yI += (y / 15 -1);
			  x -= xI;
		  }*/

        //caso 2
		/*for (int l = 0;l < 14; l++) {
			//System.out.println(x + " " + yI);
			x -= xI;
			g.drawLine(0, 0, x, yI);
			g.drawLine(getWidth(),y, x, yI);
			yI += (y / 14 );
		}
		x = getWidth();
		y = getHeight();

		xI = x - (x / 14);
		yI = (y / 14);

		for (int i = 0;i < 14; i++) {
			//System.out.println("segundo " + y + " " + xI);
			y -= yI;
			xI -= (x / 14 );
			g.drawLine(x, 0, xI, y);
			g.drawLine(0,getHeight(), xI, y);
		}*/

        //caso 3
        for (int i = 0;i < 10; i++) {
            g.drawLine(x, 0, 0, yI);

            yI += (y / 10);
            x -= xI;
        }
    }
}
