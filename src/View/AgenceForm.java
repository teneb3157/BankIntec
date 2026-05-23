package View;

import Entites.Agence;

import javax.swing.*;
import java.awt.*;

public class AgenceForm extends JFrame {

    private JTextField txtNumAgence;
    private JTextField txtNom;
    private JTextField txtAdresse;
    private JTextField txtContact;
    private JTextField txtEmail;
    private JTextField txtNbp;

    private JButton btnListe;
    private JButton btnEnregistrer;
    private JButton btnSupprimer;

    public AgenceForm() {

        setTitle("Formulaire d'agence");
        setSize(500, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // ====== TITRE ======
        JLabel titre = new JLabel("FORMULAIRE D'AGENCE");
        titre.setFont(new Font("Arial", Font.BOLD, 20));
        titre.setHorizontalAlignment(SwingConstants.CENTER);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;

        panel.add(titre, gbc);

        // ====== CHAMPS ======
        txtNumAgence = new JTextField(20);
        txtNom = new JTextField(20);
        txtAdresse = new JTextField(20);
        txtContact = new JTextField(20);
        txtEmail = new JTextField(20);
        txtNbp = new JTextField(20);

        // ====== BOUTONS ======
        btnListe = new JButton("Liste");
        btnEnregistrer = new JButton("Enregistrer");
        btnSupprimer = new JButton("Supprimer");

        // ====== LIGNE 1 ======
        gbc.gridwidth = 1;

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("N° Agence : "), gbc);

        gbc.gridx = 1;
        panel.add(txtNumAgence, gbc);

        // ====== LIGNE 2 ======
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Nom : "), gbc);

        gbc.gridx = 1;
        panel.add(txtNom, gbc);

        // ====== LIGNE 3 ======
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Adresse : "), gbc);

        gbc.gridx = 1;
        panel.add(txtAdresse, gbc);

        // ====== LIGNE 4 ======
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(new JLabel("Contact : "), gbc);

        gbc.gridx = 1;
        panel.add(txtContact, gbc);

        // ====== LIGNE 5 ======
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(new JLabel("Email : "), gbc);

        gbc.gridx = 1;
        panel.add(txtEmail, gbc);

        // ====== LIGNE 6 ======
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(new JLabel("N.B.P : "), gbc);

        gbc.gridx = 1;
        panel.add(txtNbp, gbc);

        // ====== BOUTONS ======
        JPanel panelBouton = new JPanel();

        panelBouton.add(btnListe);
        panelBouton.add(btnEnregistrer);
        panelBouton.add(btnSupprimer);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;

        panel.add(panelBouton, gbc);

        // ====== ACTION BOUTON ENREGISTRER ======
        btnEnregistrer.addActionListener(e -> {

            Agence agence = new Agence();

            agence.setNumAgence(
                    Integer.parseInt(txtNumAgence.getText()));

            agence.setNom(txtNom.getText());

            agence.setAdresse(txtAdresse.getText());

            agence.setContact(txtContact.getText());

            agence.setEmail(txtEmail.getText());

            agence.setNbpersonne(
                    Integer.parseInt(txtNbp.getText()));

            JOptionPane.showMessageDialog(null,
                    "Agence enregistrée avec succès !");
        });

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {

        new AgenceForm();
    }
}