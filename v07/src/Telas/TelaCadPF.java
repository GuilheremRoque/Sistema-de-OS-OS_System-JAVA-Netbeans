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

public class TelaCadPF extends JFrame {

    public TelaCadPF() {
        super();
        setTitle("OS_System");
        setSize(879, 878);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        LabelCadastroPF();
        CheckBoxCadastro();
        ButtonCadastro();
        TextCadastroPF();
        ComboBoxCadastro();
        PainelCastroPF();

    }

    private void LabelCadastroPF() {

        JLabel jlblTittulo = new JLabel("CADASTRO DE USUÁRIO");
        jlblTittulo.setBounds(190, 7, 500, 50);
        jlblTittulo.setFont(new Font("Serif", Font.BOLD, 40));
        jlblTittulo.setForeground(Color.WHITE);
        add(jlblTittulo);

        JLabel jlblCodigo = new JLabel("Código");
        jlblCodigo.setBounds(150, 100, 150, 50);
        jlblCodigo.setFont(new Font("Serif", Font.BOLD, 20));
        jlblCodigo.setForeground(Color.WHITE);
        add(jlblCodigo);

        JLabel jlblDtCadastro = new JLabel("Data Cadastro");
        jlblDtCadastro.setBounds(390, 100, 150, 50);
        jlblDtCadastro.setFont(new Font("Serif", Font.BOLD, 20));
        jlblDtCadastro.setForeground(Color.WHITE);
        add(jlblDtCadastro);

        JLabel jlblNmCompleto = new JLabel("Nome Completo");
        jlblNmCompleto.setBounds(74, 150, 150, 50);
        jlblNmCompleto.setFont(new Font("Serif", Font.BOLD, 20));
        jlblNmCompleto.setForeground(Color.WHITE);
        add(jlblNmCompleto);

        JLabel jlblNmSocial = new JLabel("Nome Social");
        jlblNmSocial.setBounds(103, 200, 150, 50);
        jlblNmSocial.setFont(new Font("Serif", Font.BOLD, 20));
        jlblNmSocial.setForeground(Color.WHITE);
        add(jlblNmSocial);

        JLabel jlblDtNascimento = new JLabel("Data Nascimento");
        jlblDtNascimento.setBounds(64, 250, 150, 50);
        jlblDtNascimento.setFont(new Font("Serif", Font.BOLD, 20));
        jlblDtNascimento.setForeground(Color.WHITE);
        add(jlblDtNascimento);

        JLabel jlblIdade = new JLabel("Idade");
        jlblIdade.setBounds(400, 250, 150, 50);
        jlblIdade.setFont(new Font("Serif", Font.BOLD, 20));
        jlblIdade.setForeground(Color.WHITE);
        add(jlblIdade);

        JLabel jlblSexo = new JLabel("Sexo");
        jlblSexo.setBounds(167, 300, 150, 50);
        jlblSexo.setFont(new Font("Serif", Font.BOLD, 20));
        jlblSexo.setForeground(Color.WHITE);
        add(jlblSexo);

        JLabel jlblEscolaridade = new JLabel("Escolaridade");
        jlblEscolaridade.setBounds(100, 350, 150, 50);
        jlblEscolaridade.setFont(new Font("Serif", Font.BOLD, 20));
        jlblEscolaridade.setForeground(Color.WHITE);
        add(jlblEscolaridade);

        JLabel jlblContato = new JLabel("Contato");
        jlblContato.setBounds(140, 400, 150, 50);
        jlblContato.setFont(new Font("Serif", Font.BOLD, 20));
        jlblContato.setForeground(Color.WHITE);
        add(jlblContato);

        JLabel jlblEmail = new JLabel("E-mail");
        jlblEmail.setBounds(399, 400, 150, 50);
        jlblEmail.setFont(new Font("Serif", Font.BOLD, 20));
        jlblEmail.setForeground(Color.WHITE);
        add(jlblEmail);

        JLabel jlblCPF = new JLabel("CPF");
        jlblCPF.setBounds(171, 450, 150, 50);
        jlblCPF.setFont(new Font("Serif", Font.BOLD, 20));
        jlblCPF.setForeground(Color.WHITE);
        add(jlblCPF);

        JLabel jlblRG = new JLabel("RG");
        jlblRG.setBounds(400, 450, 150, 50);
        jlblRG.setFont(new Font("Serif", Font.BOLD, 20));
        jlblRG.setForeground(Color.WHITE);
        add(jlblRG);

        JLabel jlblOrgaoEmis = new JLabel("Órgão Emissor");
        jlblOrgaoEmis.setBounds(81, 500, 150, 50);
        jlblOrgaoEmis.setFont(new Font("Serif", Font.BOLD, 20));
        jlblOrgaoEmis.setForeground(Color.WHITE);
        add(jlblOrgaoEmis);

        JLabel jlblEdereco = new JLabel("Cep/ Rua/ Número");
        jlblEdereco.setBounds(50, 550, 180, 50);
        jlblEdereco.setFont(new Font("Serif", Font.BOLD, 20));
        jlblEdereco.setForeground(Color.WHITE);
        add(jlblEdereco);

        JLabel jlblCidade = new JLabel("Cidade");
        jlblCidade.setBounds(148, 600, 150, 50);
        jlblCidade.setFont(new Font("Serif", Font.BOLD, 20));
        jlblCidade.setForeground(Color.WHITE);
        add(jlblCidade);

        JLabel jlblBairro = new JLabel("Bairro");
        jlblBairro.setBounds(153, 650, 150, 50);
        jlblBairro.setFont(new Font("Serif", Font.BOLD, 20));
        jlblBairro.setForeground(Color.WHITE);
        add(jlblBairro);

        JLabel jlblComplemento = new JLabel("Complemento");
        jlblComplemento.setBounds(91, 700, 150, 50);
        jlblComplemento.setFont(new Font("Serif", Font.BOLD, 20));
        jlblComplemento.setForeground(Color.WHITE);
        add(jlblComplemento);

        JLabel jlblCargo = new JLabel("Cargo");
        jlblCargo.setBounds(155, 750, 150, 50);
        jlblCargo.setFont(new Font("Serif", Font.BOLD, 20));
        jlblCargo.setForeground(Color.WHITE);
        add(jlblCargo);

    }

    private void TextCadastroPF() {
        Border txtGray = BorderFactory.createLineBorder(Color.black);
        Color obrigatorio = new Color(80, 182, 218);

        JTextField jtxtCodigo = new JTextField();
        jtxtCodigo.setBounds(212, 117, 80, 22);
        jtxtCodigo.setBorder(txtGray);
        jtxtCodigo.setBackground(obrigatorio);
        add(jtxtCodigo);

        JTextField jtxtPesquisaCodigo = new JTextField();
        jtxtPesquisaCodigo.setBounds(295, 117, 80, 22);
        jtxtPesquisaCodigo.setBorder(txtGray);
        add(jtxtPesquisaCodigo);

        JTextField jtxtDtCadastro = new JTextField();
        jtxtDtCadastro.setBounds(517, 117, 100, 22);
        jtxtDtCadastro.setBorder(txtGray);
        add(jtxtDtCadastro);

        JTextField jtxtNmCompleto = new JTextField();
        jtxtNmCompleto.setBounds(212, 166, 447, 22);
        jtxtNmCompleto.setBorder(txtGray);
        jtxtNmCompleto.setBackground(obrigatorio);
        add(jtxtNmCompleto);

        JTextField jtxtNmSocial = new JTextField();
        jtxtNmSocial.setBounds(212, 215, 447, 22);
        jtxtNmSocial.setBorder(txtGray);
//        jtxtNmSocial.setBackground(obrigatorio);
        add(jtxtNmSocial);

        JTextField jtxtDtNascimento = new JTextField();
        jtxtDtNascimento.setBounds(212, 267, 100, 22);
        jtxtDtNascimento.setBorder(txtGray);
        jtxtDtNascimento.setBackground(obrigatorio);
        add(jtxtDtNascimento);

        JTextField jtxtIdade = new JTextField();
        jtxtIdade.setBounds(450, 267, 30, 22);
        jtxtIdade.setBorder(txtGray);
//        jtxtIdade.setBackground(obrigatorio);
        add(jtxtIdade);

        JTextField jtxtDDD = new JTextField();
        jtxtDDD.setBounds(212, 415, 40, 22);
        jtxtDDD.setBorder(txtGray);
        jtxtDDD.setBackground(obrigatorio);
        add(jtxtDDD);

        JTextField jtxtContato = new JTextField();
        jtxtContato.setBounds(262, 415, 100, 22);
        jtxtContato.setBorder(txtGray);
        jtxtContato.setBackground(obrigatorio);
        add(jtxtContato);

        JTextField jtxtEmail = new JTextField();
        jtxtEmail.setBounds(460, 415, 200, 22);
        jtxtEmail.setBorder(txtGray);
//        jtxtEmail.setBackground(obrigatorio);
        add(jtxtEmail);

        JTextField jtxtCPF = new JTextField();
        jtxtCPF.setBounds(212, 466, 150, 22);
        jtxtCPF.setBorder(txtGray);
        jtxtCPF.setBackground(obrigatorio);
        add(jtxtCPF);

        JTextField jtxtRG = new JTextField();
        jtxtRG.setBounds(434, 466, 150, 22);
        jtxtRG.setBorder(txtGray);
        jtxtRG.setBackground(obrigatorio);
        add(jtxtRG);

        JTextField jtxtOrgEmissor = new JTextField();
        jtxtOrgEmissor.setBounds(212, 518, 150, 22);
        jtxtOrgEmissor.setBorder(txtGray);
//        jtxtOrgEmissor.setBackground(obrigatorio);
        add(jtxtOrgEmissor);

        JTextField jtxtCep = new JTextField();
        jtxtCep.setBounds(212, 568, 60, 22);
        jtxtCep.setBorder(txtGray);
//        jtxtOrgEmissor.setBackground(obrigatorio);
        add(jtxtCep);

        JTextField jtxtRua = new JTextField();
        jtxtRua.setBounds(280, 568, 300, 22);
        jtxtRua.setBorder(txtGray);
        jtxtRua.setBackground(obrigatorio);
        add(jtxtRua);

        JTextField jtxtNumero = new JTextField();
        jtxtNumero.setBounds(589, 568, 80, 22);
        jtxtNumero.setBorder(txtGray);
        jtxtNumero.setBackground(obrigatorio);
        add(jtxtNumero);

        JTextField jtxtCidade = new JTextField();
        jtxtCidade.setBounds(212, 617, 200, 22);
        jtxtCidade.setBorder(txtGray);
        jtxtCidade.setBackground(obrigatorio);
        add(jtxtCidade);

        JTextField jtxtBairro = new JTextField();
        jtxtBairro.setBounds(212, 668, 200, 22);
        jtxtBairro.setBorder(txtGray);
        jtxtBairro.setBackground(obrigatorio);
        add(jtxtBairro);

        JTextField jtxtComplemento = new JTextField();
        jtxtComplemento.setBounds(212, 718, 200, 22);
        jtxtComplemento.setBorder(txtGray);
//        jtxtComplemento.setBackground(obrigatorio);
        add(jtxtComplemento);

    }

    private void ComboBoxCadastro() {
        String[] opcoesSexo = {"Masculino", "Feminino", "Não Informar"};
        JComboBox<String> cbSexo = new JComboBox<>(opcoesSexo);
        cbSexo.setBounds(212, 315, 120, 25);
        cbSexo.setFont(new Font("Arial", Font.BOLD, 15));
        cbSexo.setForeground(Color.BLACK);
        add(cbSexo);

        String[] opcoesEscolaridade = {"Ensino Fundamental Incompleto", "Ensino Fundamental Completo",
            "Ensino Médio Incompleto", "Ensino Médio Incompleto",
            "Ensino Superior Incompleto", "Ensino Superior Completo"};
        JComboBox<String> cbEscolaridade = new JComboBox<>(opcoesEscolaridade);
        cbEscolaridade.setBounds(212, 365, 260, 25);
        cbEscolaridade.setFont(new Font("Arial", Font.BOLD, 15));
        cbEscolaridade.setForeground(Color.BLACK);
        add(cbEscolaridade);

        String[] opcoesCargo = {"Contator", "Comprador", "Auxiliar de RH", "Advogado", "Auxiliar Administrativo", "Motorista", "Auditor"};
        JComboBox<String> cbCargo = new JComboBox<>(opcoesCargo);
        cbCargo.setBounds(212, 765, 180, 25);
        cbCargo.setFont(new Font("Arial", Font.BOLD, 15));
        cbCargo.setForeground(Color.BLACK);
        add(cbCargo);

    }

    private void CheckBoxCadastro() {

        Color fundo = new Color(113, 154, 183);

        JRadioButton jrbAtivo = new JRadioButton("Ativo");
        jrbAtivo.setBounds(760, 650, 80, 18);
//        jrbAtivo.setBackground(new Color(0, 0, 0, 0));
        jrbAtivo.setHorizontalAlignment(SwingConstants.CENTER);//Define o texto no meio do JRadioButton
        jrbAtivo.setFont(new Font("Arial", NORMAL, 15));
        add(jrbAtivo);
    }

    private void ButtonCadastro() {

        JButton jbtnNovo = new JButton("Novo");
        jbtnNovo.setBounds(750, 680, 100, 25);
        jbtnNovo.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnNovo);

        JButton jbtnSalvar = new JButton("Salvar");
        jbtnSalvar.setBounds(750, 710, 100, 25);
        jbtnSalvar.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnSalvar);

        JButton jbtnDesfazer = new JButton("Desfazer");
        jbtnDesfazer.setBounds(750,740, 100, 25);
        jbtnDesfazer.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnDesfazer);

        JButton jbtnEditar = new JButton("Editar");
        jbtnEditar.setBounds(750, 770, 100, 25);
        jbtnEditar.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnEditar);

        JButton jbtnFechar = new JButton("Fechar");
        jbtnFechar.setBounds(750, 800, 100, 25);
        jbtnFechar.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnFechar);
    }

    private void PainelCastroPF() {
        Border painelGray = BorderFactory.createLineBorder(Color.GRAY);
        Color fundo = new Color(113, 154, 183);
        Color fundoGray = new Color(160, 160, 160);

        JPanel jpnlTitulo = new JPanel();
        jpnlTitulo.setBounds(10, 5, 842, 55);
        jpnlTitulo.setBorder(painelGray);
        jpnlTitulo.setBackground(fundo);
        add(jpnlTitulo);

        JPanel jpnlTela = new JPanel();
        jpnlTela.setBounds(10, 70, 730, 760);
        jpnlTela.setBorder(painelGray);
        jpnlTela.setBackground(fundo);
        add(jpnlTela);

        JPanel jpnlBotoes = new JPanel();
        jpnlBotoes.setBounds(747, 70, 105, 760);
        jpnlBotoes.setBorder(painelGray);
        jpnlBotoes.setBackground(fundo);
        add(jpnlBotoes);

    }
}
