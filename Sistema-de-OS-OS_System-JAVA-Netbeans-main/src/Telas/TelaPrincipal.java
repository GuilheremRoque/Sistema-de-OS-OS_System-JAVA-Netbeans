package Telas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {

        super();
//        setExtendedState(JFrame.MAXIMIZED_BOTH);//Abrir na tela toda
        setTitle("OS_System");
        setSize(800, 590);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        
        ButtonPrincipal();
        TabelaPrincipal();
        PainelPrincipal();
        
    }

    private void LabelRelatorio() {

//        JLabel jlblTittulo = new JLabel("RELATÓRIOS");
//        jlblTittulo.setBounds(80, 7, 500, 50);
//        jlblTittulo.setFont(new Font("Serif", Font.BOLD, 40));
//        jlblTittulo.setForeground(Color.WHITE);
//        add(jlblTittulo);
//
//        JLabel jlblCodigo = new JLabel("Tipo:");
//        jlblCodigo.setBounds(45, 80, 150, 50);
//        jlblCodigo.setFont(new Font("Serif", Font.BOLD, 20));
//        jlblCodigo.setForeground(Color.WHITE);
//        add(jlblCodigo);

    }

    private void TabelaPrincipal() {
    
    
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

    private void ButtonPrincipal() {

        JButton jbtnCliente = new JButton("Cad Cliente");
        jbtnCliente.setBounds(50, 70, 200, 200);
        jbtnCliente.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnCliente);
        
        JButton jbtnCadPF = new JButton("Cad Pessoa");
        jbtnCadPF.setBounds(50, 280, 200, 200);
        jbtnCadPF.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnCadPF);
        
        JButton jbtnCadUser = new JButton("Cad Usuário");
        jbtnCadUser.setBounds(540, 70, 200, 200);
        jbtnCadUser.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnCadUser);
        
        JButton jbtnOS = new JButton("OS");
        jbtnOS.setBounds(300, 70, 200, 200);
        jbtnOS.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnOS);
        
        JButton jbtnAndOS = new JButton("Andamento OS");
        jbtnAndOS.setBounds(300, 280, 200, 200);
        jbtnAndOS.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnAndOS);
        
        JButton jbtnRel = new JButton("Relatório");
        jbtnRel.setBounds(540, 280, 200, 200);
        jbtnRel.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnRel);
        
        JButton jbtnSair = new JButton("Sair");
        jbtnSair.setBounds(700, 520, 80, 20);
        jbtnSair.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnSair);
        
        



    }

    private void PainelPrincipal() {
        Border painelGray = BorderFactory.createLineBorder(Color.GRAY);
        Color fundo = new Color(169,169,169);
        Color fundoGray = new Color(160, 160, 160);

//        JPanel jpnlTitulo = new JPanel();
//        jpnlTitulo.setBounds(10, 5, 385, 55);
//        jpnlTitulo.setBorder(painelGray);
//        jpnlTitulo.setBackground(fundo);
//        add(jpnlTitulo);

        JPanel jpnlTela = new JPanel();
        jpnlTela.setBounds(10, 5, 863,548);
        jpnlTela.setBorder(painelGray);
        jpnlTela.setBackground(fundo);
        add(jpnlTela);

//        JPanel jpnlBotoes = new JPanel();
//        jpnlBotoes.setBounds(880, 70, 100, 200);
//        jpnlBotoes.setBorder(painelGray);
//        jpnlBotoes.setBackground(fundo);
//        add(jpnlBotoes);

    }

}
