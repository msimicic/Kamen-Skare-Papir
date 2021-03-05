package projekt;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener {

    private JButton kamen, skare, papir;
    private JLabel naslov, kompjuter, odabirKompjuteraLabel,rezultatLabel;
    private JLabel pobjede,pobjede1,izgubljeni,izgubljeni1,izjednaceni,izjednaceni1;
    private JPanel odabirKompjuteraPanel, rezultatPanel;
    private int random,brojacPobjeda,brojacIzgubljenih,brojacIzjednacenih;

    MyFrame() {
        //tekst naslova
        naslov = new JLabel("Odaberi kamen,škare ili papir.");
        naslov.setFont(new Font("Agency FB", Font.PLAIN, 20));
        naslov.setBounds(110, 0, 250, 30);
        
        pobjede = new JLabel("Pobjede");
        pobjede.setBounds(70, 150, 100, 30);
        
        pobjede1 = new JLabel();
        pobjede1.setBounds(90, 170, 100, 30);
        
        izgubljeni = new JLabel("Izgubljeno");
        izgubljeni.setBounds(170, 150, 100, 30);
        
        izgubljeni1 = new JLabel();
        izgubljeni1.setBounds(190, 170, 100, 30);
        
        izjednaceni = new JLabel("Izjednačeno");
        izjednaceni.setBounds(270, 150, 100, 30);
        
        izjednaceni1 = new JLabel();
        izjednaceni1.setBounds(300, 170, 100, 30);

        kompjuter = new JLabel("Kompjuter:");
        kompjuter.setFont(new Font("Agency FB", Font.PLAIN, 20));
        kompjuter.setBounds(50, 100, 200, 30);

        odabirKompjuteraPanel = new JPanel();
        odabirKompjuteraPanel.setBounds(120, 100, 100, 30);
        odabirKompjuteraPanel.setBackground(Color.WHITE);

        odabirKompjuteraLabel = new JLabel();
        odabirKompjuteraLabel.setBounds(150, 100, 100, 30);
        odabirKompjuteraPanel.add(odabirKompjuteraLabel);
        
        //tekst rezultat
        rezultatLabel = new JLabel();
        rezultatLabel.setBounds(230, 100, 100, 30);

        //tipka kamen
        kamen = new JButton("Kamen");
        kamen.setBounds(80, 50, 75, 30);
        kamen.setBackground(Color.GRAY);
        kamen.addActionListener(this);
        kamen.setFocusable(false);//mice mali okvir oko teksta na gumbu
        kamen.setBorder(BorderFactory.createRaisedBevelBorder());

        //tipka škare
        skare = new JButton("Škare");
        skare.setBounds(160, 50, 75, 30);
        skare.setBackground(Color.GRAY);
        skare.addActionListener(this);
        skare.setFocusable(false);
        skare.setBorder(BorderFactory.createRaisedBevelBorder());

        //tipka papir
        papir = new JButton("Papir");
        papir.setBounds(240, 50, 75, 30);
        papir.setBackground(Color.GRAY);
        papir.addActionListener(this);
        papir.setFocusable(false);
        papir.setBorder(BorderFactory.createRaisedBevelBorder());

        //okvir i sve sto je na okviru
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Kamen-Škare-Papir");
        this.setLayout(null);
        this.setSize(420, 250);
        this.setVisible(true);
        this.add(naslov);
        this.add(kamen);
        this.add(skare);
        this.add(papir);
        this.add(kompjuter);
        this.add(odabirKompjuteraLabel);
        this.add(odabirKompjuteraPanel);
        this.add(rezultatLabel);
        this.add(pobjede);
        this.add(pobjede1);
        this.add(izgubljeni);
        this.add(izgubljeni1);
        this.add(izjednaceni);
        this.add(izjednaceni1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //uvjet ako je gumb koji je stisnut >kamen<
        if (e.getSource() == kamen) {
            random = (int) (Math.random() * 3);//random generator koji baca jednu od 3 opcije
            if (random == 0) {
                odabirKompjuteraLabel.setText("Kamen");
                rezultatLabel.setText("Izjednačeno");
                brojacIzjednacenih++;
                izjednaceni1.setText(String.format("%d",brojacIzjednacenih));
            } else if (random == 1) {
                odabirKompjuteraLabel.setText("Škare");
                rezultatLabel.setText("Pobijedio si");
                brojacPobjeda++;
                pobjede1.setText(String.format("%d",brojacPobjeda));
            } else if (random == 2) {
                odabirKompjuteraLabel.setText("Papir");
                rezultatLabel.setText("Izgubio si");
                brojacIzgubljenih++;
                izgubljeni1.setText(String.format("%d",brojacIzgubljenih));
            }
        //uvjet ako je gumb koji je stisnut >škare<
        } else if (e.getSource() == skare) {
            random = (int) (Math.random() * 3);
            if (random == 0) {
                odabirKompjuteraLabel.setText("Kamen");
                rezultatLabel.setText("Izgubio si");
                brojacIzgubljenih++;
                izgubljeni1.setText(String.format("%d",brojacIzgubljenih));
            } else if (random == 1) {
                odabirKompjuteraLabel.setText("Škare");
                rezultatLabel.setText("Izjednačeno");
                brojacIzjednacenih++;
                izjednaceni1.setText(String.format("%d",brojacIzjednacenih));
            } else if (random == 2) {
                odabirKompjuteraLabel.setText("Papir");
                rezultatLabel.setText("Pobijedio si");
                brojacPobjeda++;
                pobjede1.setText(String.format("%d",brojacPobjeda));
            }
        //uvjet ako je gumb koji je stisnut >papir<
        } else {
            random = (int) (Math.random() * 3);
            if (random == 0) {
                odabirKompjuteraLabel.setText("Kamen");
                rezultatLabel.setText("Pobijedio si");
                brojacPobjeda++;
                pobjede1.setText(String.format("%d",brojacPobjeda));
            } else if (random == 1) {
                odabirKompjuteraLabel.setText("Škare");
                rezultatLabel.setText("Izgubio si");
                brojacIzgubljenih++;
                izgubljeni1.setText(String.format("%d",brojacIzgubljenih));
            } else if (random == 2) {
                odabirKompjuteraLabel.setText("Papir");
                rezultatLabel.setText("Izjednačeno");
                brojacIzjednacenih++;
                izjednaceni1.setText(String.format("%d",brojacIzjednacenih));
            }
        }
    }
    
    
    
}
