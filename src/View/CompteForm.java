package View;

import javax.swing.*;
import java.awt.*;

public class CompteForm extends JFrame {

    private JTextField txtNumero;
    private JTextField txtSolde;
    private JComboBox<String> cbTypeCompte;
    private JButton btnEnregistrer;

    public CompteForm() {

        setTitle("Formulaire Compte");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Champs
        txtNumero = new JTextField(20);
        txtSolde = new JTextField(20);

        cbTypeCompte = new JComboBox<>();
        cbTypeCompte.addItem("Compte Simple");
        cbTypeCompte.addItem("Compte Epargne");
        cbTypeCompte.addItem("Compte Payant");

        btnEnregistrer = new JButton("Enregistrer");

        // Ligne 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Numéro : "), gbc);

        gbc.gridx = 1;
        panel.add(txtNumero, gbc);

        // Ligne 2
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Solde : "), gbc);

        gbc.gridx = 1;
        panel.add(txtSolde, gbc);

        // Ligne 3
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Type Compte : "), gbc);

        gbc.gridx = 1;
        panel.add(cbTypeCompte, gbc);

        // Bouton
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(btnEnregistrer, gbc);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CompteForm();
    }
}
