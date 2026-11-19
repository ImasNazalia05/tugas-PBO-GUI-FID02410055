import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test3 extends JFrame implements ActionListener{
    BorderLayout layoutUtama;
    GridLayout layoutTombol;
    JPanel panelTombol;
    JPanel panelUtama;
    JLabel labelHari;
    JButton tombolSenin;
    JButton tombolSelasa;
    JButton tombolRabu;
    JButton tombolKamis;
    JButton tombolJumat;
    JButton tombolSabtu;

    public Test3 (){
        layoutUtama = new BorderLayout(8,8);
        layoutTombol = new GridLayout(2,3,8,8);

        panelUtama = new JPanel();
        panelTombol = new JPanel();

        labelHari = new JLabel("Pilih Hari", SwingConstants.CENTER);
        tombolSenin = new JButton("Senin");
        tombolSelasa = new JButton("Selasa");
        tombolRabu = new JButton("Rabu");
        tombolKamis = new JButton("Kamis");
        tombolJumat = new JButton("Jumat");
        tombolSabtu = new JButton("Sabtu");

        tombolSenin.addActionListener(this);
        tombolSelasa.addActionListener(this);
        tombolRabu.addActionListener(this);
        tombolKamis.addActionListener(this);
        tombolJumat.addActionListener(this);
        tombolSabtu.addActionListener(this);

        panelTombol.add(tombolSenin);
        panelTombol.add(tombolSelasa);
        panelTombol.add(tombolRabu);
        panelTombol.add(tombolKamis);
        panelTombol.add(tombolJumat);
        panelTombol.add(tombolSabtu);
        panelTombol.setLayout(layoutTombol);
       
        setLayout(layoutUtama);
        add(labelHari, BorderLayout.NORTH);
        add(panelTombol, BorderLayout.CENTER);

        setSize(530,320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Test3");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e){
        String hariDipilih = e.getActionCommand();
        labelHari.setText("Hari yang dipilih: " + hariDipilih);
    }

    public static void main(String[] args) {
        Test3 T3 = new Test3();
    }
}
