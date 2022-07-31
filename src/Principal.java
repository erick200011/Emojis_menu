import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Escriba 1 para mostrar el emoji '😀'\n"+"Escriba 2 para mostrar el emoji '🙃'\n"+"\"Escriba 3 para mostrar el emoji '😑'\n"+"Escriba 4 para el emoji (Desconfiado)\n"+"Escriba 5 para el emoji Catface\n"+"6 Pacman\n"+"Escriba 7 para mostrar el emoji '⛔'\n"+ "Escriba 8 para mostrar '❗'\n"+ "Escriba 9 para mostrar '☹'\n"+"Escriba 10 para mostrar el emoji '🤢'\n"+ "Escriba 11 para mostrar '🙄'\n"+"11\n"+"escriba 12 para preocupado\n");
        int opcion=Integer.parseInt(entrada);

        Figuras panel =new Figuras (opcion);
        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(500,600);
        aplicacion.setVisible(true);

    }
}
