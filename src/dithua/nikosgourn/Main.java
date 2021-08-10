package dithua.nikosgourn;

import dithua.nikosgourn.Currencies.*;
import dithua.nikosgourn.assets.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {

        JFrame win = new JFrame();
        win.setResizable(false);
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(600, 400);


        for (Nomisma currency : Utils.currencies.values()) {
            currency.setExchangeRates();
        }

        JComboBox<Nomisma> startCurr = new JComboBox<>(Utils.currencies.values().toArray(new Nomisma[0]));
        JComboBox<Nomisma> endCurr = new JComboBox<>(Utils.currencies.values().toArray(new Nomisma[0]));
        startCurr.setBounds(50, 100, 200, 50);
        endCurr.setBounds(50, 200, 200, 50);

        JLabel conversionLabel = new JLabel();
        conversionLabel.setText("Convert to :");
        conversionLabel.setBounds(75, 150, 200, 50);


        JTextField input = new JTextField();
        input.setBounds(370, 100, 150, 50);
        input.setVerifyInputWhenFocusTarget(true);
        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("peos");
            }
        });

        JLabel convertedCurrency = new JLabel();
        convertedCurrency.setBorder(BorderFactory.createEtchedBorder());
        convertedCurrency.setBounds(370, 200, 150, 50);

        JButton but = new JButton();
        but.setIcon(new ImageIcon("src/dithua/nikosgourn/assets/trade.png"));
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nomisma startCurrency = (Nomisma) startCurr.getSelectedItem();
                Nomisma toCurrency = (Nomisma) endCurr.getSelectedItem();

                double num = Double.parseDouble(input.getText());

                var x = startCurrency.getExchangeRate().get(toCurrency);

                convertedCurrency.setText(Double.toString(num * x));

            }
        });
        but.setBounds(280, 150, 50, 50);


        win.add(startCurr);
        win.add(endCurr);
        win.add(conversionLabel);
        win.add(but);
        win.add(convertedCurrency);
        win.add(input);

        win.setVisible(true);
    }

}
