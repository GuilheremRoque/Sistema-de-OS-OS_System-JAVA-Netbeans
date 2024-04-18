/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telas;

import java.awt.Color;
import static java.awt.Color.gray;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author TI-Centralis
 */
public class TelaLogin extends JFrame {

    public TelaLogin() {
        super();
        setSize(450, 350);
        setTitle("OS_System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null); 

        JlbLogin();
        BotoesLogin();//Chama JButton
        TxtLogin();
        SenhaLogin();//Chama JPasswordField
        PaianelLogin();

    }

    private void JlbLogin() {
        JLabel jlbUsuario = new JLabel("Usuário:");
        jlbUsuario.setBounds(120, 110, 80, 25);
        jlbUsuario.setFont(new Font("Arial", Font.BOLD, 13));
        add(jlbUsuario);

        JLabel jlbPass = new JLabel("Senha:");
        jlbPass.setBounds(120, 148, 80, 25);
        jlbPass.setFont(new Font("Arial", Font.BOLD, 13));
        add(jlbPass);
    }

    private void BotoesLogin() {
        JButton jbtnLogin = new JButton("Login");
        jbtnLogin.setBounds(125, 185, 95, 20);
        jbtnLogin.setFont(new Font("Arial", Font.BOLD, 13));
        add(jbtnLogin);
        

        JButton jbtnCancela = new JButton("Cancelar");
        jbtnCancela.setBounds(226, 185, 95, 20);
        jbtnCancela.setFont(new Font("Arial", Font.BOLD, 13));
        add(jbtnCancela);

    }

    private void TxtLogin() {
        JTextField jtfUsuario = new JTextField();
        jtfUsuario.setBounds(180, 113, 150, 20);
        add(jtfUsuario);

    }

    private void SenhaLogin() {

        JPasswordField jpsPass = new JPasswordField();
        jpsPass.setBounds(180, 150, 150, 20);
        add(jpsPass);

    }

    private void PaianelLogin() {
        Border painelGray = BorderFactory.createLineBorder(Color.GRAY);
//        Border brd = BorderFactory.createRaisedBevelBorder();

        JPanel jpTitulo = new JPanel();
        jpTitulo.setBounds(112, 10, 220, 35);
        jpTitulo.setBorder(painelGray);
        add(jpTitulo);

        JPanel jpUser = new JPanel();
        jpUser.setBounds(112, 110, 220, 25);
        jpUser.setBorder(painelGray);
        add(jpUser);

        JPanel jpPass = new JPanel();
        jpPass.setBounds(112, 147, 220, 25);
        jpPass.setBorder(painelGray);
        add(jpPass);

    }
}
