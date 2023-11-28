package main.java.View;

import javax.swing.*;
import java.awt.*;

public class TelaInicial extends JFrame {
    JComboBox<String> selecionarCargo;
    JLabel ltitulo;
    JLabel lsenha;
    JTextField senhaField;
    JButton login;
    Font fonte1 = new Font("Arial", Font.BOLD, 13);
    Font titulo = new Font("Arial", Font.BOLD, 20);

    public TelaInicial() {
        super();

        ltitulo = new JLabel("Título");

        selecionarCargo = new JComboBox<>();
        selecionarCargo.addItem("Gerente");
        selecionarCargo.addItem("Gestor de Estoque");
        selecionarCargo.addItem("Caixa");

        lsenha = new JLabel("Senha:");
        senhaField = new JTextField();

        login = new JButton("Login");

        // Configurando o tamanho preferencial dos componentes
        ltitulo.setFont(titulo);
        selecionarCargo.setPreferredSize(new Dimension(200, 30)); // Aumentando o tamanho do JComboBox
        login.setPreferredSize(new Dimension(100, 30)); // Aumentando o tamanho do JButton
        lsenha.setFont(fonte1);
        senhaField.setPreferredSize(new Dimension(100, 30));

        // Usando o GridBagLayout para controlar o tamanho dos componentes
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 10, 5, 10); // Espaçamento entre os componentes

        add(ltitulo, gbc);

        gbc.gridy = 1;
        add(selecionarCargo, gbc);

        gbc.gridy = 2;
        add(lsenha, gbc);

        gbc.gridy = 3;
        add(senhaField, gbc);

        gbc.gridy = 4;
        add(login, gbc);
    }

    public void run() {
        setSize(500, 500);
        setVisible(true);
    }
}
