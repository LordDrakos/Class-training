import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calculadora extends JFrame {
    JTextField textField1, textField2, textField3;
    JLabel label1, label2, label3, label4;
    JButton bMas, bMenos, bPor, bDiv, salir, creditos;
    JPanel p1, p2;

    public static void main(String[] args) {

        calculadora c = new calculadora();
        c.pack();
        c.setVisible(true);

    }

    public calculadora() {



        label1 = new JLabel("Valor1");
        label2 = new JLabel("Valor2");
        label3 = new JLabel("Resultado");
        textField1 = new JTextField(4);
        textField2 = new JTextField(4);
        textField3 = new JTextField(4);
        bMas = new JButton("+");
        bMenos = new JButton("-");
        bPor = new JButton("*");
        bDiv = new JButton("/");
        textField3.setEditable(false); // el resultado no se puede modificar por
        label4 = new JLabel("Gracias por usar la calculadora");
        salir = new JButton("Salir");
        creditos = new JButton("Más info");
        setResizable(false);
        // usuario

        Container pantalla = getContentPane();
        pantalla.setPreferredSize(new Dimension(220, 170));
        pantalla.setLayout(new FlowLayout());
        pantalla.add(label1);
        pantalla.add(textField1);
        pantalla.add(label2);
        pantalla.add(textField2);
        pantalla.add(label3);
        pantalla.add(bMas);
        pantalla.add(bMenos);
        pantalla.add(bPor);
        pantalla.add(bDiv);
        pantalla.add(label3);
        pantalla.add(textField3);
        bMas.addActionListener(new evento());
        bMenos.addActionListener(new evento());
        bPor.addActionListener(new evento());
        bDiv.addActionListener(new evento());
        creditos.addActionListener(new creditos());
        salir.addActionListener(new salir());
        pantalla.setBackground(Color.decode("#ff913d"));


        p2 = new JPanel(new FlowLayout());
        p2.setPreferredSize(new Dimension(200, 70));
        p2.setBackground(Color.decode("#ffbd84"));
        p2.setBorder(BorderFactory.createLineBorder(Color.decode("#ff913d"),5,false));
        add(p2);
        p2.add(label4);
        p2.add(creditos);
        p2.add(salir);




    }


    private class evento implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int valor1, valor2, resultado = 0;
            valor1 = Integer.parseInt(textField1.getText());
            valor2 = Integer.parseInt(textField2.getText());
            if (e.getActionCommand().equals("+")) {
                resultado = valor1 + valor2;
            }
            if (e.getActionCommand().equals("-")) {
                resultado = valor1 - valor2;
            }
            if (e.getActionCommand().equals("*")) {
                resultado = valor1 * valor2;
            }
            if (e.getActionCommand().equals("/")) {
                resultado = valor1 / valor2;
            }


            textField3.setText(Integer.toString(resultado));

        }
    }
    private class salir implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.exit(0);

        }
    }
    private class creditos implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "Esta aplicación ha sido editada por Antonio Djigo");
        }
    }
}
