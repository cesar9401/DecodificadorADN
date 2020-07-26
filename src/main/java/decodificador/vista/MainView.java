package decodificador.vista;

import javax.swing.*;

public class MainView extends JFrame {

    private JPanel mainPanel;

    public MainView(String title) {
        super(title);

        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
