package Telas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.util.HashSet;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class TelaCadCli extends JFrame {

    public TelaCadCli() {
        super();
//   sas     setExtendedState(JFrame.MAXIMIZED_BOTH);//Abrir na tela toda
        setTitle("OS_System");
        setSize(1555, 878);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        TextCadastro();
        TextAreaCadastro();
        JPasswordLogin();
        ButtonCadastro();
        ComboBoxCadastro();
        LabelCadastro();
        CheckBoxCadastro();
        PainelCastro();
        

    }

    private void BotoesCadastro() {

    }

    private void TextCadastro() {

        Border txtGray = BorderFactory.createLineBorder(Color.black);
        Color obrigatorio = new Color(80, 182, 218);

        JTextField jtxtUsuario = new JTextField();
        jtxtUsuario.setBounds(285, 115, 150, 22);
        jtxtUsuario.setBorder(txtGray);
        jtxtUsuario.setBackground(obrigatorio);
        add(jtxtUsuario);

        JTextField jtxtCriadoP = new JTextField();
        jtxtCriadoP.setBounds(585, 115, 150, 22);
        jtxtCriadoP.setBorder(txtGray);
        add(jtxtCriadoP);

        JTextField jtxtNome = new JTextField();
        jtxtNome.setBounds(285, 165, 450, 22);
        jtxtNome.setBorder(txtGray);
        jtxtNome.setBackground(obrigatorio);
        add(jtxtNome);

        JTextField jtxtCadastro = new JTextField();
        jtxtCadastro.setBounds(285, 317, 80, 22);
        jtxtCadastro.setBorder(txtGray);
        add(jtxtCadastro);

        JTextField jtxtCadastroNome = new JTextField();
        jtxtCadastroNome.setBounds(373, 317, 362, 22);
        jtxtCadastroNome.setBorder(txtGray);
        add(jtxtCadastroNome);
        
        JTextField jtxtDTCriacao = new JTextField();
        jtxtDTCriacao.setBounds(635, 267, 100, 22);
        jtxtDTCriacao.setBorder(txtGray);
        add(jtxtDTCriacao);

    }

    private void TextAreaCadastro() {

        Border txtGray = BorderFactory.createLineBorder(Color.black);
        Color obrigatorio = new Color(80, 182, 218);

        JTextArea jtxtAObservacao = new JTextArea();
        jtxtAObservacao.setBounds(285, 416, 449, 80);
        jtxtAObservacao.setBorder(txtGray);
        jtxtAObservacao.setLineWrap(true);//Quebra a linha quando chegar ao fim dela
        add(jtxtAObservacao);
    }

    private void JPasswordLogin() {

        Border txtGray = BorderFactory.createLineBorder(Color.black);
        Color obrigatorio = new Color(80, 182, 218);

        JPasswordField jpsSenha = new JPasswordField();
        jpsSenha.setBounds(285, 215, 152, 22);
        jpsSenha.setBorder(txtGray);
        jpsSenha.setBackground(obrigatorio);
        add(jpsSenha);

    }

    private void LabelCadastro() {

        JLabel jlblTittulo = new JLabel("CADASTRO DE USUÁRIO");
        jlblTittulo.setBounds(550, 7, 500, 50);
        jlblTittulo.setFont(new Font("Serif", Font.BOLD, 40));
        jlblTittulo.setForeground(Color.WHITE);
        add(jlblTittulo);

        JLabel jlblUsuario = new JLabel("Usuário:");
        jlblUsuario.setBounds(200, 100, 100, 50);
        jlblUsuario.setFont(new Font("Serif", Font.BOLD, 20));
        jlblUsuario.setForeground(Color.WHITE);
        add(jlblUsuario);

        JLabel jlblCriadoP = new JLabel("Criado por:");
        jlblCriadoP.setBounds(473, 100, 110, 50);
        jlblCriadoP.setFont(new Font("Serif", Font.BOLD, 20));
        jlblCriadoP.setForeground(Color.WHITE);
        add(jlblCriadoP);

        JLabel jlblNome = new JLabel("Nome Completo:");
        jlblNome.setBounds(127, 150, 165, 50);
        jlblNome.setFont(new Font("Serif", Font.BOLD, 20));
        jlblNome.setForeground(Color.WHITE);
        add(jlblNome);

        JLabel jlblSenha = new JLabel("Senha:");
        jlblSenha.setBounds(213, 200, 100, 50);
        jlblSenha.setFont(new Font("Serif", Font.BOLD, 20));
        jlblSenha.setForeground(Color.WHITE);
        add(jlblSenha);

        JLabel jlblSetor = new JLabel("Setor:");
        jlblSetor.setBounds(218, 250, 80, 50);
        jlblSetor.setFont(new Font("Serif", Font.BOLD, 20));
        jlblSetor.setForeground(Color.WHITE);
        add(jlblSetor);
        
        JLabel jlblDtCriacao = new JLabel("Data de criação:");
        jlblDtCriacao.setBounds(490, 250, 150, 50);
        jlblDtCriacao.setFont(new Font("Serif", Font.BOLD, 20));
        jlblDtCriacao.setForeground(Color.WHITE);
        add(jlblDtCriacao);

        JLabel jlblCadastro = new JLabel("Cadastro:");
        jlblCadastro.setBounds(188, 300, 110, 50);
        jlblCadastro.setFont(new Font("Serif", Font.BOLD, 20));
        jlblCadastro.setForeground(Color.WHITE);
        add(jlblCadastro);

        JLabel jlblCadasro = new JLabel("Estabelecimento:");
        jlblCadasro.setBounds(125, 350, 150, 50);
        jlblCadasro.setFont(new Font("Serif", Font.BOLD, 20));
        jlblCadasro.setForeground(Color.WHITE);
        add(jlblCadasro);

        JLabel jlblObservacao = new JLabel("Observação:");
        jlblObservacao.setBounds(164, 400, 150, 50);
        jlblObservacao.setFont(new Font("Serif", Font.BOLD, 20));
        jlblObservacao.setForeground(Color.WHITE);
        add(jlblObservacao);
    }

    private void ButtonCadastro() {
        
        JButton jbtnRSenha = new JButton();
        jbtnRSenha.setBounds(445, 215, 22, 22);
        jbtnRSenha.setFont(new Font("Arial",Font.BOLD,15));
        add(jbtnRSenha); 
        
       
        
        JButton jbtnNovo = new JButton("Novo");
        jbtnNovo.setBounds(1388, 670, 130, 25);
        jbtnNovo.setFont(new Font("Arial",Font.BOLD,15));
        add(jbtnNovo);
        
        JButton jbtnSalvar = new JButton("Salvar");
        jbtnSalvar.setBounds(1388, 700, 130, 25);
        jbtnSalvar.setFont(new Font("Arial",Font.BOLD,15));
        add(jbtnSalvar);
        
        JButton jbtnDesfazer = new JButton("Desfazer");
        jbtnDesfazer.setBounds(1388, 730, 130, 25);
        jbtnDesfazer.setFont(new Font("Arial",Font.BOLD,15));
        add(jbtnDesfazer);
        
        JButton jbtnExcluir = new JButton("Excluir");
        jbtnExcluir.setBounds(1388, 760, 130, 25);
        jbtnExcluir.setFont(new Font("Arial",Font.BOLD,15));
        add(jbtnExcluir);
        
        JButton jbtnFechar = new JButton("Fechar");
        jbtnFechar.setBounds(1388, 790, 130, 25);
        jbtnFechar.setFont(new Font("Arial",Font.BOLD,15));
        add(jbtnFechar);
    }    
    private void ComboBoxCadastro() {
        String[] opcoeSetor = {"Administrativo", "Financeiro", "Compras", "Jurídico", "RH"};
        JComboBox<String> cbSetor = new JComboBox<>(opcoeSetor);
        cbSetor.setBounds(284, 266, 152, 25);
        cbSetor.setFont(new Font("Serif", Font.BOLD, 15));
        cbSetor.setForeground(Color.BLACK);
        add(cbSetor);

        String[] opcoesEstabelecimento = {"Duetto's Comércio Importação E Exportação", "Globaco Importação e Exportação", "DP Empresarial Indaial", "Cooper Centro Indaial", "Armazém do Fifo - Data Curta"};
        JComboBox<String> cbEstabelecimento = new JComboBox<>(opcoesEstabelecimento);
        cbEstabelecimento.setBounds(284, 366, 447, 25);
        cbEstabelecimento.setFont(new Font("Serif", Font.BOLD, 15));
        cbEstabelecimento.setForeground(Color.BLACK);
        add(cbEstabelecimento);
    }

    private void PainelCastro() {
        Border painelGray = BorderFactory.createLineBorder(Color.GRAY);
        Color fundo = new Color(113, 154, 183);
        Color fundoGray = new Color(160, 160, 160);

        JPanel jpnlTitulo = new JPanel();
        jpnlTitulo.setBounds(10, 5, 1516, 55);
        jpnlTitulo.setBorder(painelGray);
        jpnlTitulo.setBackground(fundo);
        add(jpnlTitulo);

        JPanel jpnlTela = new JPanel();
        jpnlTela.setBounds(10, 70, 1516, 760);
        jpnlTela.setBorder(painelGray);
        jpnlTela.setBackground(fundo);
        add(jpnlTela);

    }

    private void CheckBoxCadastro() {

        Color fundo = new Color(113, 154, 183);

        JRadioButton jrbAtivo = new JRadioButton("Ativo");
        jrbAtivo.setBounds(650, 218, 60, 20);
//        jrbAtivo.setBackground(new Color(0, 0, 0, 0));
        jrbAtivo.setHorizontalAlignment(SwingConstants.CENTER);//Define o texto no meio do JRadioButton
        jrbAtivo.setFont(new Font("Arial", NORMAL, 15));
        add(jrbAtivo);
        
        JRadioButton jrbAdministrador = new JRadioButton("Administrador");
        jrbAdministrador.setBounds(285, 550, 130, 20);
//        jrbAtivo.setBackground(new Color(0, 0, 0, 0));
        jrbAdministrador.setHorizontalAlignment(SwingConstants.CENTER);//Define o texto no meio do JRadioButton
        jrbAdministrador.setFont(new Font("Arial", NORMAL, 15));
        add(jrbAdministrador);
        
        JRadioButton jrbUsuario = new JRadioButton("Usuário");
        jrbUsuario.setBounds(450, 550, 130, 20);
//        jrbAtivo.setBackground(new Color(0, 0, 0, 0));
        jrbUsuario.setHorizontalAlignment(SwingConstants.CENTER);//Define o texto no meio do JRadioButton
        jrbUsuario.setFont(new Font("Arial", NORMAL, 15));
        add(jrbUsuario);
    }
}
