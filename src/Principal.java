import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("1\n"+"2\n"+"3\n"+"4\n"+"5\n"+"6\n"+"7\n"+"8\n"+"9\n"+"10\n"+"11\n"+"12\n");
        int opcion=Integer.parseInt(entrada);

        Figuras panel =new Figuras (opcion);
        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(1280,900);
        aplicacion.setVisible(true);

    }
}
