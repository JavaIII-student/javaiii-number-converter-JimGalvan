import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton binToHex = new JButton();
    JButton binToDec = new JButton();
    JButton hexToBin = new JButton();
    JButton hexToDec = new JButton();
    JButton decToHex = new JButton();
    JButton decToBin = new JButton();
    Decimal decimal = new Decimal();
    Binary binary = new Binary();
    Hexadecimal hexadecimal = new Hexadecimal();

    public Menu(Decimal decimal, Binary binary, Hexadecimal hexadecimal) {

        this.decimal = decimal;
        this.binary = binary;
        this.hexadecimal = hexadecimal;

        createUI();

    }

    private void createUI() {

        frame.setVisible(true);
        frame.add(panel);
        panel.add(binToHex);
        panel.add(binToDec);
        panel.add(hexToBin);
        panel.add(hexToDec);
        panel.add(decToHex);
        panel.add(decToBin);

        binToHex.setText("Bin to Hex");
        binToDec.setText("Bin to Dec");
        hexToBin.setText("Hex to Bin");
        hexToDec.setText("Hex to Dec");
        decToHex.setText("Dec to Hex");
        decToBin.setText("Dec to Bin");

        frame.pack();

        binToHex.addActionListener(this);
        binToDec.addActionListener(this);
        hexToBin.addActionListener(this);
        hexToDec.addActionListener(this);
        decToHex.addActionListener(this);
        decToBin.addActionListener(this);


    }

    void show() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == binToHex) binary.convertToHexadecimal();

        if (e.getSource() == binToDec) binary.convertToDecimal();

        if (e.getSource() == hexToBin) hexadecimal.convertToBinary();

        if (e.getSource() == hexToDec) hexadecimal.convertToDecimal();

        if (e.getSource() == decToHex) decimal.convertToHexadecimal();

        if (e.getSource() == decToBin) decimal.convertToBinary();

    }
}
