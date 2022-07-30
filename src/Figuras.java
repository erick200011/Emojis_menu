import javax.swing.*;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Figuras extends JPanel {

    private int opcion;

    public Figuras(int opcionUsuario){
        opcion=opcionUsuario;
    }

    public void paintComponent(Graphics g){
        char [] a = {'M','A','R','T','I','N'};
        super.paintComponent(g);

            switch(opcion){
                case 1:
                    g.drawLine(300,500,300,0);
                    g.drawLine(320,500,320,0);

                    g.drawLine(320,0,500,250);
                    g.drawLine(500,250,680,0);

                    g.drawLine(680,500,680,0);
                    g.drawLine(700,500,700,0);

                    //---------------------------------------//

                    g.drawLine(750,0,750,500);
                    g.drawLine(770,0,770,500);

                    g.drawLine(770,0,1000,250);
                    g.drawLine(1000,250,770,250);
                    g.drawLine(770,250,1000,500);
                    break;
                case 2:
                  //Erick
                    break;
                case 3:
                    //Erick
                    break;
                case 4:
                    //Kevin
                    break;
                case 5:
                    //Kevin
                    break;
                case 6:
                    //Kevin
                    break;
                case 7:
                    //Martin
                    break;
                case 8:
                    //Martin
                    break;
                case 9:
                    //Martin
                    break;
                case 10:
                    //emoji secreto erick
                    // Ya me dio miedo XDD
                    
                    break;



            }

    }

}
