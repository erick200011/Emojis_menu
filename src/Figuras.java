import javax.swing.*;
import java.awt.*;
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

                    //Cara

                    g.setColor(Color.YELLOW);
                    g.fillOval(0,50,700,700);

                    //Ojos

                    g.setColor(Color.WHITE);
                    g.fillOval(170,200,100,100);

                    g.setColor(Color.BLACK);
                    g.fillOval(170,200,50,90);

                    g.setColor(Color.WHITE);
                    g.fillOval(370,200,100,100);

                    g.setColor(Color.BLACK);
                    g.fillOval(370,200,50,90);


                    //Boca

                    g.fillRect(300,500,100,5);

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
                    //erick
                    break;
                case 11:
                    //Martin
                    break;
                case 12:
                    //Kevin
                    break;
                case 13:
                    //emoji secreto erick
                    // Ya me dio miedo XDD

                    break;



            }

    }

}
