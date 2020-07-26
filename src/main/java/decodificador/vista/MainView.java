package decodificador.vista;

import decodificador.funcion.MainFunction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame {

    private JPanel mainPanel;
    private JButton decodificarButton;
    private JTextField sequenceAText;
    private JTextField sequenceBText;
    private JLabel mainLabel;
    private JLabel sequenceALabel;
    private JLabel sequenceBLabel;
    private JLabel resultLabel;
    private JLabel sequenceResult;

    public MainView(String title) {
        super(title);

        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        decodificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sequenceA = sequenceAText.getText();
                String sequenceB = sequenceBText.getText();
                String result;

                if (!sequenceA.isEmpty() && !sequenceB.isEmpty()) {
                    //Acciones para decodificar
                    MainFunction funcion = new MainFunction();
                    result = funcion.decoderFunction(sequenceA, sequenceB);

                    if (result.length() > 1) {
                        sequenceResult.setForeground(Color.BLACK);
                        sequenceResult.setText(result);
                    } else {
                        sequenceResult.setForeground(Color.RED);
                        sequenceResult.setText("--Sin Coincidencias--");
                    }
                } else {
                    //System.out.println("Cadenas vacias");
                    JOptionPane.showMessageDialog(null, "Debe llenar ambos campos para poder Decodificar", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
