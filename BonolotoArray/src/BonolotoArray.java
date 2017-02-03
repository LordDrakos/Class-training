/**
 * Created by adn on 17/01/17.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class BonolotoArray extends JFrame {

    private static final long serialVersionUID = 1L;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7,tf8;
    JTextField tf11, tf12, tf13, tf14, tf15, tf16, tf17,tf18;
    JTextField tf21, tf22, tf23, tf24, tf25, tf26, tf27,tf28;
    JLabel label1, label2, label3, label4, label5, label6, label7, label8, premios;
    JLabel label11, label12, label13, label14, label15, label16, label17, label18;
    JLabel r1, r2 ,r3 ,r4 ,r5;
    JButton calc, salir,salirr,comprobar, creditos, button1, button2, reroll;
    JPanel p1, p2;


    public static void main(String[] args) {

        BonolotoArray c = new BonolotoArray();

        c.pack();
        c.setVisible(true);
    }

    public BonolotoArray(){
        button1= new JButton("Introducir a mano");
        button2= new JButton("Bonoloto aleatoria");
        calc = new JButton("Registrar Bonoloto");
        label1 = new JLabel("Número 1");
        label2 = new JLabel("Número 2");
        label3 = new JLabel("Número 3");
        label4 = new JLabel("Número 4");
        label5 = new JLabel("Número 5");
        label6 = new JLabel("Número 6");
        label7 = new JLabel("Número Complementario");
        label8 = new JLabel("Reintegro");
        tf1 = new JTextField(5);
        tf2 = new JTextField(5);
        tf3 = new JTextField(5);
        tf4 = new JTextField(5);
        tf5 = new JTextField(5);
        tf6 = new JTextField(5);
        tf7 = new JTextField(5);
        tf8 = new JTextField(5);
        label11 = new JLabel("Número 1");
        label12 = new JLabel("Número 2");
        label13 = new JLabel("Número 3");
        label14 = new JLabel("Número 4");
        label15 = new JLabel("Número 5");
        label16 = new JLabel("Número 6");
        label17 = new JLabel("Número Complementario");
        label18 = new JLabel("Reintegro");
        tf11 = new JTextField(5);
        tf12 = new JTextField(5);
        tf13 = new JTextField(5);
        tf14 = new JTextField(5);
        tf15 = new JTextField(5);
        tf16 = new JTextField(5);
        tf17 = new JTextField(5);
        tf18 = new JTextField((int) Math.random());
        creditos = new JButton("Creditos");
        salir = new JButton("Salir");
        reroll = new JButton("Volver a tirar");
        salirr = new JButton("Salir");
        comprobar = new JButton("Comprobar");
        premios = new JLabel("Premios :");

        tf21 = new JTextField(2);
        tf22 = new JTextField(2);
        tf23 = new JTextField(2);
        tf24 = new JTextField(2);
        tf25 = new JTextField(2);
        tf26 = new JTextField(2);
        tf27 = new JTextField(2);
        tf28 = new JTextField(2);



        Container pantalla = getContentPane();
        pantalla.setPreferredSize(new Dimension(600, 250));
        pantalla.setLayout(new FlowLayout());
        pantalla.setBackground(Color.decode("#000000"));
        pantalla.add(button1);
        button1.addActionListener(new button1());
        pantalla.add(button2);
        button2.addActionListener(new button2());

        p1 = new JPanel(new FlowLayout());
        add(p1);
        p1.setVisible(false);
        p1.setPreferredSize(new Dimension(600, 200));
        p1.setBackground(Color.decode("#ffbd84"));
        p1.add(label1);
        p1.add(tf1);
        p1.add(label2);
        p1.add(tf2);
        p1.add(label3);
        p1.add(tf3);
        p1.add(label4);
        p1.add(tf4);
        p1.add(label5);
        p1.add(tf5);
        p1.add(label6);
        p1.add(tf6);
        p1.add(label7);
        p1.add(tf7);
        p1.add(label8);
        p1.add(tf8);



        p1.add(calc);
        calc.addActionListener(new calc());
        p1.add(salir);
        salir.addActionListener(new salir());
        p1.add(premios);
        p1.add(tf21);
        p1.add(tf22);
        p1.add(tf23);
        p1.add(tf24);
        p1.add(tf25);
        p1.add(tf26);
        p1.add(tf27);
        p1.add(tf28);




        p2 = new JPanel(new FlowLayout());
        add(p2);
        p2.setVisible(false);
        p2.setPreferredSize(new Dimension(600, 200));
        p2.setBackground(Color.decode("#ffbd20"));
        p2.add(label11);
        p2.add(tf11);
        tf11.setEditable(false);
        p2.add(label12);
        p2.add(tf12);
        tf12.setEditable(false);
        p2.add(label13);
        p2.add(tf13);
        tf13.setEditable(false);
        p2.add(label14);
        p2.add(tf14);
        tf14.setEditable(false);
        p2.add(label15);
        p2.add(tf15);
        tf15.setEditable(false);
        p2.add(label16);
        p2.add(tf16);
        tf16.setEditable(false);
        p2.add(label17);
        p2.add(tf17);
        tf17.setEditable(false);
        p2.add(label18);
        p2.add(tf18);
        tf18.setEditable(false);
        p2.add(reroll);
        reroll.addActionListener(new reroll());
        p2.add(salirr);
        salirr.addActionListener(new salir());


    }
    private class button1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            p1.setVisible(true);
            p2.setVisible(false);
            SwingUtilities.updateComponentTreeUI(p1);

        }

    }


    public class calc implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int manual[]= new int[8];

            tf1.setBackground(Color.white);
            tf2.setBackground(Color.white);
            tf3.setBackground(Color.white);
            tf4.setBackground(Color.white);
            tf5.setBackground(Color.white);
            tf6.setBackground(Color.white);
            tf7.setBackground(Color.white);
            tf8.setBackground(Color.white);

            tf1.setEditable(false);
            tf2.setEditable(false);
            tf3.setEditable(false);
            tf4.setEditable(false);
            tf5.setEditable(false);
            tf6.setEditable(false);
            tf7.setEditable(false);
            tf8.setEditable(false);

            tf21.setEditable(false);
            tf22.setEditable(false);
            tf23.setEditable(false);
            tf24.setEditable(false);
            tf25.setEditable(false);
            tf26.setEditable(false);
            tf27.setEditable(false);
            tf28.setEditable(false);


            manual[0] = Integer.parseInt(tf1.getText());
            if (manual[0] > 49 || manual[0] < 1) {
                tf1.setEditable(true);
                tf1.setText("ERROR");
            }

            manual[1] = Integer.parseInt(tf2.getText());
            if (manual[1] > 49 || manual[1] < 1 || manual[1]== manual[0]) {
                tf2.setEditable(true);
                tf2.setText("ERROR");

            }
            manual[2] = Integer.parseInt(tf3.getText());
            if (manual[2] > 49 || manual[2] < 1 || manual[2]== manual[1] || manual[2] == manual[0]) {
                tf3.setEditable(true);
                tf3.setText("ERROR");

            }
            manual[3] = Integer.parseInt(tf4.getText());
            if (manual[3] > 49 || manual[3] < 1 || manual[3] == manual[2] ||manual[3] == manual[1] || manual[3] == manual[0]) {
                tf4.setEditable(true);
                tf4.setText("ERROR");

            }
            manual[4] = Integer.parseInt(tf5.getText());
            if (manual[4] > 49 || manual[4] < 1 || manual[4] == manual[3] || manual[4] == manual[2] || manual[4] == manual[1] || manual[4] == manual[0]) {
                tf5.setEditable(true);
                tf5.setText("ERROR");


            }
            manual[5] = Integer.parseInt(tf6.getText());
            if (manual[5] > 49 || manual[5] < 1 || manual[5]==manual[4] || manual[5] == manual[3] || manual[5] == manual[2]|| manual[5] == manual[1] || manual[5] == manual[0]) {
                tf6.setEditable(true);
                tf6.setText("ERROR");

            }
            manual[6] = Integer.parseInt(tf7.getText());
            if (manual[6] > 49 || manual[6] < 1 || manual[6] == manual[0] || manual[6] == manual[1] || manual[6] == manual[2] || manual[6] == manual[3] || manual[6] == manual[4]|| manual[6] == manual[5]) {
                tf7.setEditable(true);
                tf7.setText("ERROR");
            }
            manual[7] = Integer.parseInt(tf8.getText());
            if (manual[7] > 9 || manual[7] < 1) {
                tf8.setEditable(true);
                tf8.setText("ERROR");
            }


            int premio = 0, premior = 0;
            int aleatorio[] = new int[8];

            Bonoclass sorteo = new Bonoclass();

            sorteo.getSorteo();

            tf21.setText(String.valueOf(aleatorio[0]));
            tf22.setText(String.valueOf(aleatorio[1]));
            tf23.setText(String.valueOf(aleatorio[2]));
            tf24.setText(String.valueOf(aleatorio[3]));
            tf25.setText(String.valueOf(aleatorio[4]));
            tf26.setText(String.valueOf(aleatorio[5]));
            tf27.setText(String.valueOf(aleatorio[6]));
            tf28.setText(String.valueOf(aleatorio[7]));

            if (aleatorio[0] == manual[0]) {
                tf1.setBackground(Color.GREEN);
                premio++;
            } else {
                tf1.setBackground(Color.RED);
            }
            if (aleatorio[1] == manual[1]) {
                tf2.setBackground(Color.GREEN);
                premio++;
            } else {
                tf2.setBackground(Color.RED);
            }
            if (aleatorio[2] == manual[2]) {
                tf3.setBackground(Color.GREEN);
                premio++;
            } else {
                tf3.setBackground(Color.RED);
            }
            if (aleatorio[3] == manual[3]) {
                tf4.setBackground(Color.GREEN);
                premio++;
            } else {
                tf4.setBackground(Color.RED);
            }
            if (aleatorio[4] == manual[4]) {
                tf5.setBackground(Color.GREEN);
                premio++;
            } else {
                tf5.setBackground(Color.RED);
            }
            if (aleatorio[5] == manual[5]) {
                tf6.setBackground(Color.GREEN);
                premio++;
            } else {
                tf6.setBackground(Color.RED);
            }
            if (aleatorio[6] == manual[6]) {
                tf7.setBackground(Color.GREEN);
                premio++;
            } else {
                tf7.setBackground(Color.RED);
            }
            if (aleatorio[7] == manual[7]) {
                tf8.setBackground(Color.GREEN);
                premior++;
            } else {
                tf8.setBackground(Color.RED);
            }

            if (premior == 1){
                JOptionPane.showMessageDialog(null, "Ha conseguido 2 euros de premio por el reintegro");
            }
            if (premio <= 2) {
                JOptionPane.showMessageDialog(null, "Ha conseguido " + premio + " aciertos y 0 euros");

            }
            if  (premio == 3){
                JOptionPane.showMessageDialog(null, "Ha conseguido " + premio + " aciertos y 6,50€");

            }

            if  (premio == 4){
                JOptionPane.showMessageDialog(null, "Ha conseguido " + premio + " aciertos y 1025,16€");

            }

            if  (premio == 5){
                JOptionPane.showMessageDialog(null, "Ha conseguido " + premio + " aciertos y  159800,50 € ");

            }
            if  (premio == 6){
                JOptionPane.showMessageDialog(null, "Ha conseguido " + premio + " aciertos y 200150,25€ ");

            }
        }

    }

    private class button2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            p2.setVisible(true);
            p1.setVisible(false);

            int v1,v2,v3,v4,v5,v6,c,r;
            Bonoclass sorteo = new Bonoclass();
            sorteo.getSorteo();
            int hold[] = new int[8];

            tf11.setText(Integer.toString(sorteo.getSorteo()));


            tf12.setText(Integer.toString(sorteo.getSorteo()));


            tf13.setText(Integer.toString(sorteo.getSorteo()));


            tf14.setText(Integer.toString(sorteo.getSorteo()));


            tf15.setText(Integer.toString(sorteo.getSorteo()));


            tf16.setText(Integer.toString(sorteo.getSorteo()));

            tf17.setText(Integer.toString(sorteo.getSorteo()));

            tf18.setText(Integer.toString(sorteo.getSorteo()));

        }
    }
    private class reroll implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int v1, v2, v3, v4, v5, v6, c, r;

            v1 = (int) (49 * Math.random() + 1);
            tf11.setText(Integer.toString(v1));

            v2 = (int) (49 * Math.random() + 1);
            do {
                v2 = (int)(49 * Math.random() + 1);
            }
            while (v2 == v1);
            tf12.setText(Integer.toString(v2));

            v3 = (int) (49 * Math.random() + 1);
            do {
                v3 = (int) (49 * Math.random() + 1);
            }
            while (v3 == v1 || v3 == v2);
            tf13.setText(Integer.toString(v3));

            v4 = (int) (49 * Math.random() + 1);
            do {
                v4 = (int) (49 * Math.random() + 1);
            }
            while (v4 == v1 || v4 == v2 || v4 == v3);
            tf14.setText(Integer.toString(v4));

            v5 = (int)(49 * Math.random() + 1);
            do {
                v5 = (int)(49 * Math.random() + 1);
            }
            while (v5 == v1 || v5 == v2 || v5 == v3 || v5 == v4);
            tf15.setText(Integer.toString(v5));

            v6 = (int) (49 * Math.random() + 1);
            do {
                v6 = (int) (49 * Math.random() + 1);
            }
            while (v6 == v1 || v6 == v2 || v6 == v3 || v6 == v4 || v6 == v5);
            tf16.setText(Integer.toString(v6));

            c = (int) (49 * Math.random() + 1);
            do {
                c = (int) (49 * Math.random() + 1);
            }
            while (c == v1 || c == v2 || c == v3 || c == v4 || c == v5 || c == v6);
            tf17.setText(Integer.toString(c));

            r = (int) (9*Math.random() +1);
            tf18.setText(Integer.toString(r));

        }

    }

    private class salir implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

}
