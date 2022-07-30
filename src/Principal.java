import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("1\n"+"2\n"+"3\n"+"4\n"+"5\n"+"6\n"+"Escriba 7 para mostrar el emoji '⛔'\n"+ "Escriba 8 para mostrar '❗'\n"+ "Escriba 9 para mostrar '☹'\n"+"10\n"+ "Escriba 11 para mostrar '🙄'\n"+"11\n"+"12\n");
        int opcion=Integer.parseInt(entrada);

        Figuras panel =new Figuras (opcion);
        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(1280,900);
        aplicacion.setVisible(true);

    }
}
