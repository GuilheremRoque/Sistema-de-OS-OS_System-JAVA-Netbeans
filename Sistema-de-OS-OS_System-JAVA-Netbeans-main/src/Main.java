
import Telas.TelaAndamentoOS;
import Telas.TelaCadUser;
import Telas.TelaCadOS;
import Telas.TelaCadPF;
import Telas.TelaLogin;
import Telas.TelaPrincipal;
import Telas.TelaRelatorio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author TI-Centralis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Construtor Tela Login
        TelaLogin tLogin = new TelaLogin();
        tLogin.setVisible(true);

        TelaCadUser tCadCli = new TelaCadUser();
        tCadCli.setVisible(true);

        TelaCadOS tCadOS = new TelaCadOS();
        tCadOS.setVisible(true);
//
        TelaAndamentoOS tAndOS = new TelaAndamentoOS();
        tAndOS.setVisible(true);
//
        TelaCadPF tCadPF = new TelaCadPF();
        tCadPF.setVisible(true);
//
        TelaRelatorio tRel = new TelaRelatorio();
        tRel.setVisible(true);
//
        TelaPrincipal tPrin = new TelaPrincipal();
        tPrin.setVisible(true);
    }

}
