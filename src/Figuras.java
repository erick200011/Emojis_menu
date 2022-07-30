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

                    //Cara

                    g.setColor(Color.YELLOW);
                    g.fillOval(0,50,700,700);

                    //Ojos

                    g.setColor(Color.WHITE);
                    g.fillOval(170,200,100,100);

                    g.setColor(Color.BLACK);
                    g.fillOval(200,200,50,90);

                    g.setColor(Color.WHITE);
                    g.fillOval(430,200,100,100);

                    g.setColor(Color.BLACK);
                    g.fillOval(450,200,50,90);


                    //Boca
                    g.drawLine(175,450,200,500);
                    g.drawLine(200,500,350,450);
                    g.drawLine(350,450,500,500);
                    g.drawLine(500,500,525,450);
                    break;
                case 6:
                    //Kevin

                    //Cara
                    g.setColor(Color.YELLOW);
                    g.fillOval(0,50,700,700);

                    //Ojos



                    g.setColor(Color.BLACK);
                    g.fillOval(200,200,50,90);



                    g.setColor(Color.BLACK);
                    g.fillOval(450,200,50,90);


                    //Boca
                    g.drawLine(150,500,600,300);
                    g.drawLine(150,500,540,700);


                    break;
                case 7:
                    //Martin
                    g.setColor(Color.red);
                    g.fillArc(10,30,500,500,360,360);

                    int[] x={100, 100, 420, 420};
                    int[] y={335, 235, 235, 335};
                    g.setColor(Color.white);
                    g.fillPolygon(x, y, x.length);
                    //---------------------------------------//
                    break;
                case 8:
                    //Martin
                    int[] x2={100, 100, 250, 250};
                    int[] y2={335, 45, 45, 335};
                    g.setColor(Color.red);
                    g.fillPolygon(x2, y2, x2.length);

                    g.setColor(Color.red);
                    g.fillOval(75,335,200,200);

                    g.setColor(Color.white);
                    g.fillOval(126,350,100,100);

                    //---------------------------------------//
                    break;
                case 9:
                    //Martin
                    g.setColor(Color.yellow);
                    g.fillArc(10,30,500,500,360,360);

                    g.setColor(Color.black);
                    g.fillOval(120,160,100,100);
                    g.fillOval(300,160,100,100);

                    g.fillArc(115,310,300,225,0,180);

                    g.setColor(Color.yellow);
                    g.fillArc(140,325,250,200,0,180);
                    break;


                case 10:
                    //erick
                    break;
                case 11:
                    g.setColor(Color.yellow);
                    g.fillArc(10,30,500,500,360,360);

                    g.setColor(Color.white);
                    g.fillOval(65,140,200,200);
                    g.fillOval(255,140,200,200);

                    g.setColor(Color.black);
                    g.fillOval(120,140,90,90);
                    g.fillOval(310,140,90,90);
                    g.fillArc(95,370,350,20,0,360);
                    //Martin
                    break;
                case 12:
                    //Kevin

                    //Cara
                    g.setColor(Color.YELLOW);
                    g.fillOval(0,50,700,700);

                    //Ojos
                    g.setColor(Color.BLACK);
                    g.fillOval(200,200,50,90);

                    g.setColor(Color.BLACK);
                    g.fillOval(450,200,50,90);

                    //cejas

                    g.drawLine(250,100,100,250);
                    g.drawLine(450,100,600,250);


                    //Boca
                    g.fillOval(350,400,50,100);
                    break;
                case 13:
                    //emoji secreto erick
                    // Ya me dio miedo XDD
                    //xD

                    break;



            }

    }

}
