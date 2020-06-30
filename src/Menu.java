import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton binToHex;
    JButton binToDec;
    JButton hexToBin;
    JButton hexToDec;
    JButton decToHex;
    JButton decToBin;
    Decimal decimal;
    Binary binary;
    Hexadecimal hexadecimal;

    public Menu (Decimal decimal, Binary binary, Hexadecimal hexadecimal){

        this.decimal = decimal; this.binary = binary; this.hexadecimal = hexadecimal;

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

    void show (){

    }

    @Override
    public void actionPerformed(ActionEvent e){

    }

    public void display() {

    }
}
