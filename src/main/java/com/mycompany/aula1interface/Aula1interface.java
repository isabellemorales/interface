
package com.mycompany.aula1interface;
import javax.swing.JOptionPane;
public class Aula1interface {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual seu nome?", "Digite aqui");
        JOptionPane.showMessageDialog(null,"Seu nome é " +nome);
        String outronome = JOptionPane.showInputDialog(null, "Qual o outro nome?", "Entrada de dados", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, outronome, "O outro nome é", JOptionPane.ERROR_MESSAGE);
    }
}
