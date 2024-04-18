/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telas;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Frame.NORMAL;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author guilherme_lr_santos
 */
public class TelaRelatorio extends JFrame {

    public TelaRelatorio() {

        super();
//        setExtendedState(JFrame.MAXIMIZED_BOTH);//Abrir na tela toda
        setTitle("OS_System");
        setSize(420, 458);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        LabelRelatorio();
        ButtonRelatorio();
        ComboBoxRelatório();
        PainelRelatorio();
    }

    private void LabelRelatorio() {

        JLabel jlblTittulo = new JLabel("RELATÓRIOS");
        jlblTittulo.setBounds(80, 7, 500, 50);
        jlblTittulo.setFont(new Font("Serif", Font.BOLD, 40));
        jlblTittulo.setForeground(Color.WHITE);
        add(jlblTittulo);

        JLabel jlblCodigo = new JLabel("Tipo:");
        jlblCodigo.setBounds(45, 80, 150, 50);
        jlblCodigo.setFont(new Font("Serif", Font.BOLD, 20));
        jlblCodigo.setForeground(Color.WHITE);
        add(jlblCodigo);

    }

    private void TextCadastroPF() {

    }

    private void ComboBoxRelatório() {
        Color obrigatorio = new Color(80, 182, 218);

        String[] setor = {"...", "Quantidade Total de OSs", "OSs Concluída", "OSs não Concluída", "OSs Pendentes", "Quantidade de Usuários"};
        JComboBox<String> cbSetor = new JComboBox<>(setor);
        cbSetor.setBounds(95, 97, 250, 22);
        cbSetor.setFont(new Font("Arial", Font.BOLD, 15));
        cbSetor.setForeground(Color.BLACK);
        add(cbSetor);
    }

    private void ButtonRelatorio() {
        
        JButton jbtnVisualizar = new JButton("Visualizar");
        jbtnVisualizar.setBounds(15, 370, 120, 25);
        jbtnVisualizar.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnVisualizar);

        JButton jbtnLimpar = new JButton("Limpar");
        jbtnLimpar.setBounds(140, 370, 120, 25);
        jbtnLimpar.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnLimpar);

        JButton jbtnDesfazer = new JButton("Fechar");
        jbtnDesfazer.setBounds(265, 370, 120, 25);
        jbtnDesfazer.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnDesfazer);


    }

    private void PainelRelatorio() {
        Border painelGray = BorderFactory.createLineBorder(Color.GRAY);
        Color fundo = new Color(113, 154, 183);
        Color fundoGray = new Color(160, 160, 160);

        JPanel jpnlTitulo = new JPanel();
        jpnlTitulo.setBounds(10, 5, 385, 55);
        jpnlTitulo.setBorder(painelGray);
        jpnlTitulo.setBackground(fundo);
        add(jpnlTitulo);

        JPanel jpnlTela = new JPanel();
        jpnlTela.setBounds(10, 70, 385, 280);
        jpnlTela.setBorder(painelGray);
        jpnlTela.setBackground(fundo);
        add(jpnlTela);

        JPanel jpnlBotoes = new JPanel();
        jpnlBotoes.setBounds(10, 362, 385, 45);
        jpnlBotoes.setBorder(painelGray);
        jpnlBotoes.setBackground(fundo);
        add(jpnlBotoes);

    }
}
