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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class TelaAndamentoOS extends JFrame {

    public TelaAndamentoOS() {
        super();
//        setExtendedState(JFrame.MAXIMIZED_BOTH);//Abrir na tela toda
        setTitle("OS_System");
        setSize(1555, 878);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        TextCadastro();
        TextAreaCadastro();
        ButtonCadastroOS();
        ComboBoxCadastro();
        LabelCadastro();
        CheckBoxCadastro();
        PainelCastroOS();

    }

    private void LabelCadastro() {

        JLabel jlblTitulo = new JLabel("ORDEM DE SERVIÇO");
        jlblTitulo.setBounds(550, 7, 650, 50);
        jlblTitulo.setFont(new Font("Serif", Font.BOLD, 40));
        jlblTitulo.setForeground(Color.WHITE);
        add(jlblTitulo);

        JLabel jlblNumeroOS = new JLabel("Número");
        jlblNumeroOS.setBounds(200, 100, 100, 50);
        jlblNumeroOS.setFont(new Font("Serif", Font.BOLD, 20));
        jlblNumeroOS.setForeground(Color.WHITE);
        add(jlblNumeroOS);

        JLabel jlblDtCriacao = new JLabel("Data de Criação");
        jlblDtCriacao.setBounds(379, 100, 140, 50);
        jlblDtCriacao.setFont(new Font("Serif", Font.BOLD, 20));
        jlblDtCriacao.setForeground(Color.WHITE);
        add(jlblDtCriacao);

        JLabel jlblSolicitante = new JLabel("Solicitante");
        jlblSolicitante.setBounds(178, 150, 140, 50);
        jlblSolicitante.setFont(new Font("Serif", Font.BOLD, 20));
        jlblSolicitante.setForeground(Color.WHITE);
        add(jlblSolicitante);

        JLabel jlblSetorLocalizacao = new JLabel("Setor de Localização");
        jlblSetorLocalizacao.setBounds(90, 200, 185, 50);
        jlblSetorLocalizacao.setFont(new Font("Serif", Font.BOLD, 20));
        jlblSetorLocalizacao.setForeground(Color.WHITE);
        add(jlblSetorLocalizacao);

        JLabel jlblEquipamento = new JLabel("Equipamento");
        jlblEquipamento.setBounds(158, 250, 110, 50);
        jlblEquipamento.setFont(new Font("Serif", Font.BOLD, 20));
        jlblEquipamento.setForeground(Color.WHITE);
        add(jlblEquipamento);

        JLabel jlblPatrimonio = new JLabel("Patrimônio");
        jlblPatrimonio.setBounds(472, 250, 110, 50);
        jlblPatrimonio.setFont(new Font("Serif", Font.BOLD, 20));
        jlblPatrimonio.setForeground(Color.WHITE);
        add(jlblPatrimonio);

        JLabel jlblBreveDesc = new JLabel("Breve Descrição");
        jlblBreveDesc.setBounds(129, 300, 180, 50);
        jlblBreveDesc.setFont(new Font("Serif", Font.BOLD, 20));
        jlblBreveDesc.setForeground(Color.WHITE);
        add(jlblBreveDesc);

        JLabel jlblPrioridade = new JLabel("Prioridade");
        jlblPrioridade.setBounds(180, 350, 100, 50);
        jlblPrioridade.setFont(new Font("Serif", Font.BOLD, 20));
        jlblPrioridade.setForeground(Color.WHITE);
        add(jlblPrioridade);

        JLabel jlblStatusEquip = new JLabel("Status do Equipamento");
        jlblStatusEquip.setBounds(75, 400, 200, 50);
        jlblStatusEquip.setFont(new Font("Serif", Font.BOLD, 20));
        jlblStatusEquip.setForeground(Color.WHITE);
        add(jlblStatusEquip);

        JLabel jlblDescComple = new JLabel("Descrição Completa");
        jlblDescComple.setBounds(99, 450, 200, 50);
        jlblDescComple.setFont(new Font("Serif", Font.BOLD, 20));
        jlblDescComple.setForeground(Color.WHITE);
        add(jlblDescComple);

        //********ANDAMENTO***********
        JLabel jlblTituloAndamento = new JLabel("ANDAMENTO");
        jlblTituloAndamento.setBounds(1050, 68, 200, 50);
        jlblTituloAndamento.setFont(new Font("Serif", Font.BOLD, 30));
        jlblTituloAndamento.setForeground(Color.WHITE);
        add(jlblTituloAndamento);

        JLabel jlblProfissional = new JLabel("Profissional");
        jlblProfissional.setBounds(850, 150, 150, 50);
        jlblProfissional.setFont(new Font("Serif", Font.BOLD, 20));
        jlblProfissional.setForeground(Color.WHITE);
        add(jlblProfissional);

        JLabel jlblDtrevista = new JLabel("Datas Previstas");
        jlblDtrevista.setBounds(900, 200, 200, 50);
        jlblDtrevista.setFont(new Font("Serif", Font.BOLD, 20));
        jlblDtrevista.setForeground(Color.WHITE);
        add(jlblDtrevista);

        JLabel jlblDtInicio = new JLabel("Início");
        jlblDtInicio.setBounds(975, 240, 80, 50);
        jlblDtInicio.setFont(new Font("Serif", Font.BOLD, 20));
        jlblDtInicio.setForeground(Color.WHITE);
        add(jlblDtInicio);

        JLabel jlblDtFim = new JLabel("Fim");
        jlblDtFim.setBounds(990, 280, 80, 50);
        jlblDtFim.setFont(new Font("Serif", Font.BOLD, 20));
        jlblDtFim.setForeground(Color.WHITE);
        add(jlblDtFim);

        JLabel jlblDtFimGarantia = new JLabel("Fim Garantia");
        jlblDtFimGarantia.setBounds(910, 320, 120, 50);
        jlblDtFimGarantia.setFont(new Font("Serif", Font.BOLD, 20));
        jlblDtFimGarantia.setForeground(Color.WHITE);
        add(jlblDtFimGarantia);

        JLabel jlblSituacao = new JLabel("Situação");
        jlblSituacao.setBounds(1200, 200, 80, 50);
        jlblSituacao.setFont(new Font("Serif", Font.BOLD, 20));
        jlblSituacao.setForeground(Color.WHITE);
        add(jlblSituacao);

        JLabel jlblDtReal = new JLabel("Datas Reais");
        jlblDtReal.setBounds(900, 450, 200, 50);
        jlblDtReal.setFont(new Font("Serif", Font.BOLD, 20));
        jlblDtReal.setForeground(Color.WHITE);
        add(jlblDtReal);

        JLabel jlblDtRealInicio = new JLabel("Início");
        jlblDtRealInicio.setBounds(975, 490, 80, 50);
        jlblDtRealInicio.setFont(new Font("Serif", Font.BOLD, 20));
        jlblDtRealInicio.setForeground(Color.WHITE);
        add(jlblDtRealInicio);

        JLabel jlblDtRealFim = new JLabel("Fim");
        jlblDtRealFim.setBounds(990, 530, 80, 50);
        jlblDtRealFim.setFont(new Font("Serif", Font.BOLD, 20));
        jlblDtRealFim.setForeground(Color.WHITE);
        add(jlblDtRealFim);

        JLabel jlblComplexidade = new JLabel("Complexidade");
        jlblComplexidade.setBounds(850, 600, 150, 50);
        jlblComplexidade.setFont(new Font("Serif", Font.BOLD, 20));
        jlblComplexidade.setForeground(Color.WHITE);
        add(jlblComplexidade);

        JLabel jlblDescricaoPS = new JLabel("Descrição do Problema/Solução");
        jlblDescricaoPS.setBounds(850, 650, 300, 50);
        jlblDescricaoPS.setFont(new Font("Serif", Font.BOLD, 20));
        jlblDescricaoPS.setForeground(Color.WHITE);
        add(jlblDescricaoPS);

    }

    private void TextCadastro() {

        Border txtGray = BorderFactory.createLineBorder(Color.black);
        Color obrigatorio = new Color(80, 182, 218);

        JTextField jtxtNumeroOS = new JTextField();
        jtxtNumeroOS.setBounds(272, 115, 80, 22);
        jtxtNumeroOS.setBorder(txtGray);
        add(jtxtNumeroOS);

        JTextField jtxtDtCriacao = new JTextField();
        jtxtDtCriacao.setBounds(522, 115, 127, 22);
        jtxtDtCriacao.setBorder(txtGray);
        add(jtxtDtCriacao);

        JTextField jtxtPatrimonio = new JTextField();
        jtxtPatrimonio.setBounds(570, 265, 80, 22);
        jtxtPatrimonio.setBorder(txtGray);
        add(jtxtPatrimonio);

        JTextField jtxtCodSolicitante = new JTextField();
        jtxtCodSolicitante.setBounds(272, 165, 80, 22);
        jtxtCodSolicitante.setBorder(txtGray);
//        jtxtCodSolicitante.setBackground(obrigatorio);
        add(jtxtCodSolicitante);

        JTextField jtxtNomeSolicitante = new JTextField();
        jtxtNomeSolicitante.setBounds(360, 165, 290, 22);
        jtxtNomeSolicitante.setBorder(txtGray);
        add(jtxtNomeSolicitante);

        JTextField jtxtBDesc = new JTextField();
        jtxtBDesc.setBounds(272, 315, 378, 22);
        jtxtBDesc.setBorder(txtGray);
//        jtxtBDesc.setBackground(obrigatorio);
        add(jtxtBDesc);

        //********ANDAMENTO***********
        JTextField jtxtProfissional = new JTextField();
        jtxtProfissional.setBounds(955, 165, 450, 22);
        jtxtProfissional.setBorder(txtGray);
        jtxtProfissional.setBackground(obrigatorio);
        add(jtxtProfissional);

        JTextField jtxtDtInicio = new JTextField();
        jtxtDtInicio.setBounds(1029, 255, 100, 22);
        jtxtDtInicio.setBorder(txtGray);
        add(jtxtDtInicio);

        JTextField jtxtDtFim = new JTextField();
        jtxtDtFim.setBounds(1029, 295, 100, 22);
        jtxtDtFim.setBorder(txtGray);
        add(jtxtDtFim);

        JTextField jtxtDtGarantia = new JTextField();
        jtxtDtGarantia.setBounds(1029, 335, 100, 22);
        jtxtDtGarantia.setBorder(txtGray);
        add(jtxtDtGarantia);

        JTextField jtxtDtRealInicio = new JTextField();
        jtxtDtRealInicio.setBounds(1029, 510, 100, 22);
        jtxtDtRealInicio.setBorder(txtGray);
        add(jtxtDtRealInicio);

        JTextField jtxtDtRealFim = new JTextField();
        jtxtDtRealFim.setBounds(1029, 547, 100, 22);
        jtxtDtRealFim.setBorder(txtGray);
        jtxtProfissional.setBackground(obrigatorio);
        add(jtxtDtRealFim);
    }

    private void ComboBoxCadastro() {
        Color obrigatorio = new Color(80, 182, 218);
        
        String[] setor = {"...", "Administrativo", "Financeiro", "Compras", "Jurídico", "RH"};
        JComboBox<String> cbSetor = new JComboBox<>(setor);
        cbSetor.setBounds(272, 215, 180, 22);
        cbSetor.setFont(new Font("Arial", Font.BOLD, 15));
        cbSetor.setForeground(Color.BLACK);
        add(cbSetor);

        String[] equipamento = {"...", "Computador", "Monitor", "Mouse", "Teclado", "Webcam", "Impressora", "Outros"};
        JComboBox<String> cbEquiapmento = new JComboBox<>(equipamento);
        cbEquiapmento.setBounds(272, 265, 180, 22);
        cbEquiapmento.setFont(new Font("Arial", Font.BOLD, 15));
        cbEquiapmento.setForeground(Color.BLACK);
        add(cbEquiapmento);

        String[] prioridade = {"...", "Urgente", "Alta", "Média", "Baixa"};
        JComboBox<String> cbPrioridade = new JComboBox<>(prioridade);
        cbPrioridade.setBounds(272, 365, 120, 24);
        cbPrioridade.setFont(new Font("Arial", Font.BOLD, 15));
        cbPrioridade.setForeground(Color.BLACK);
        add(cbPrioridade);

        String[] statusEquipamento = {"...", "Parado", "Rodando ", "Liga/Desliga"};
        JComboBox<String> cbStatusEquipamento = new JComboBox<>(statusEquipamento);
        cbStatusEquipamento.setBounds(272, 415, 120, 24);
        cbStatusEquipamento.setFont(new Font("Arial", Font.BOLD, 15));
        cbStatusEquipamento.setForeground(Color.BLACK);
        add(cbStatusEquipamento);

        String[] cComplexidade = {"...", "Alta", "Baixa ", "Moderada"};
        JComboBox<String> cbComplexidade = new JComboBox<>(cComplexidade);
        cbComplexidade.setBounds(975, 615, 100, 24);
        cbComplexidade.setFont(new Font("Arial", Font.BOLD, 15));
        cbComplexidade.setBackground(obrigatorio);
        cbComplexidade.setForeground(Color.BLACK);
        add(cbComplexidade);
    }

    private void TextAreaCadastro() {

        Border txtGray = BorderFactory.createLineBorder(Color.black);
        Color obrigatorio = new Color(80, 182, 218);

        JTextArea jtxtDescCompleta = new JTextArea();
//        jtxtDescCompleta.setBounds(272, 468,379, 80);
        jtxtDescCompleta.setBorder(txtGray);
//        jtxtDescCompleta.setBackground(obrigatorio);
        jtxtDescCompleta.setLineWrap(true);//Quebra a linha quando chegar ao fim dela
        jtxtDescCompleta.setWrapStyleWord(true);
//        add(jtxtDescCompleta);
        JScrollPane jspDescCompleta = new JScrollPane(jtxtDescCompleta);//Encapsula o jtxtDescCompleta no jspDescCompleta
        jspDescCompleta.setBounds(272, 468, 379, 100);
        getContentPane().add(jspDescCompleta);

        JTextArea jtxtDescPS = new JTextArea();
//        jtxtDescCompleta.setBounds(272, 468,379, 80);
        jtxtDescPS.setBorder(txtGray);
        jtxtDescPS.setBackground(obrigatorio);
        jtxtDescPS.setLineWrap(true);//Quebra a linha quando chegar ao fim dela
        jtxtDescPS.setWrapStyleWord(true);
//        add(jtxtDescCompleta);
        JScrollPane jspDescPS = new JScrollPane(jtxtDescPS);//Encapsula o jtxtDescCompleta no jspDescCompleta
        jspDescPS.setBounds(850, 700, 450, 100);
        getContentPane().add(jspDescPS);
    }

    private void CheckBoxCadastro() {

        Color fundo = new Color(113, 154, 183);

        JRadioButton jrbAtivo = new JRadioButton("AGUARDANDO ATENDIMENTO");
        jrbAtivo.setBounds(1210, 255, 250, 20);
//        jrbAtivo.setBackground(new Color(0, 0, 0, 0));
//        jrbAtivo.setHorizontalAlignment(SwingConstants.CENTER);//Define o texto no meio do JRadioButton
        jrbAtivo.setFont(new Font("Arial", NORMAL, 15));
        add(jrbAtivo);

        JRadioButton jrbAndamento = new JRadioButton("EM ANDAMENTO");
        jrbAndamento.setBounds(1210, 295, 150, 20);
//        jrbAtivo.setBackground(new Color(0, 0, 0, 0));
//        jrbAndamento.setHorizontalAlignment(SwingConstants.CENTER);//Define o texto no meio do JRadioButton
        jrbAndamento.setFont(new Font("Arial", NORMAL, 15));
        add(jrbAndamento);

        JRadioButton jrbAguardandoResposta = new JRadioButton("AGUARDANDO RESPOSTA");
        jrbAguardandoResposta.setBounds(1210, 335, 220, 20);
//        jrbAtivo.setBackground(new Color(0, 0, 0, 0));
//        jrbAndamento.setHorizontalAlignment(SwingConstants.CENTER);//Define o texto no meio do JRadioButton
        jrbAguardandoResposta.setFont(new Font("Arial", NORMAL, 15));
        add(jrbAguardandoResposta);

        JRadioButton jrbConcluido = new JRadioButton("CONCLUÍDO");
        jrbConcluido.setBounds(1210, 375, 120, 20);
//        jrbAtivo.setBackground(new Color(0, 0, 0, 0));
//        jrbAndamento.setHorizontalAlignment(SwingConstants.CENTER);//Define o texto no meio do JRadioButton
        jrbConcluido.setFont(new Font("Arial", NORMAL, 15));
        add(jrbConcluido);

        JRadioButton jrbCancelado = new JRadioButton("CANCELADO");
        jrbCancelado.setBounds(1210, 415, 120, 20);
//        jrbAtivo.setBackground(new Color(0, 0, 0, 0));
//        jrbAndamento.setHorizontalAlignment(SwingConstants.CENTER);//Define o texto no meio do JRadioButton
        jrbCancelado.setFont(new Font("Arial", NORMAL, 15));
        add(jrbCancelado);

    }

    private void ButtonCadastroOS() {

        JButton jbtnRSenha = new JButton();
        jbtnRSenha.setBounds(455, 215, 22, 22);
        jbtnRSenha.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnRSenha);

        JButton jbtnNovo = new JButton("Novo");
        jbtnNovo.setBounds(690, 680, 100, 25);
        jbtnNovo.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnNovo);

        JButton jbtnSalvar = new JButton("Salvar");
        jbtnSalvar.setBounds(690, 710, 100, 25);
        jbtnSalvar.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnSalvar);

        JButton jbtnDesfazer = new JButton("Desfazer");
        jbtnDesfazer.setBounds(690, 740, 100, 25);
        jbtnDesfazer.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnDesfazer);

        JButton jbtnEditar = new JButton("Editar");
        jbtnEditar.setBounds(690, 770, 100, 25);
        jbtnEditar.setFont(new Font("Arial", Font.BOLD, 15));
        add(jbtnEditar);

        JButton jbtnFechar = new JButton("Fechar");
        jbtnFechar.setBounds(690, 800, 100, 25);
        jbtnFechar.setFont(new Font("Arial", Font.BOLD, 15));
            add(jbtnFechar);

    }

    private void PainelCastroOS() {
        Border painelGray = BorderFactory.createLineBorder(Color.GRAY);
        Color fundo = new Color(113, 154, 183);
        Color fundoTitulo = new Color(34,73,119);
        Color fundoSecundario = new Color(53,92,138);
        Color fundoGray = new Color(160, 160, 160);

        JPanel jpnlTitulo = new JPanel();
        jpnlTitulo.setBounds(10, 5, 1516, 55);
        jpnlTitulo.setBorder(painelGray);
        jpnlTitulo.setBackground(fundoTitulo);
        add(jpnlTitulo);

        JPanel jpnlCadOs = new JPanel();
        jpnlCadOs.setBounds(10, 70, 670, 760);
        jpnlCadOs.setBorder(painelGray);
        jpnlCadOs.setBackground(fundo);
        add(jpnlCadOs);

        JPanel jpnlOsTituloExecucao = new JPanel();
        jpnlOsTituloExecucao.setBounds(800, 70, 720, 50);
        jpnlOsTituloExecucao.setBorder(painelGray);
        jpnlOsTituloExecucao.setBackground(fundoSecundario);
        add(jpnlOsTituloExecucao);

        JPanel jpnlsExecucao = new JPanel();
        jpnlsExecucao.setBounds(800, 130, 720, 700);
        jpnlsExecucao.setBorder(painelGray);
        jpnlsExecucao.setBackground(fundoSecundario);
        add(jpnlsExecucao);

        JPanel jpnlBotoes = new JPanel();
        jpnlBotoes.setBounds(687, 70, 105, 760);
        jpnlBotoes.setBorder(painelGray);
        jpnlBotoes.setBackground(fundoTitulo);
        add(jpnlBotoes);

    }


    }


