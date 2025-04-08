import javax.swing.*;

public class PesquisaSatisfacao {
    public static void main(String args[]) {

//Declarando as variáveis de input
        int avaliacao, i;

//Variaveis de avaliação
        int excelente = 0, bom = 0, ruim = 0;

//Utilizando o comando "For" para a soma das avaliações
        for (i = 0; i <= 10; i++) {
            avaliacao = Integer.parseInt(JOptionPane.showInputDialog("Bem-vindo a pesquisa de satisfação da TudoWeb. Como você avalia os nossos servios em uma esaca de 1 a 3. \n" + " 1 - Excelente. \n" + " 2 - Bom. \n" + " 3 - Ruim"));

        if (avaliacao == 1) {
            JOptionPane.showMessageDialog(null,"Você avaliou a TudoWeb como Excelente! ");
            excelente++;
        }
        else if (avaliacao == 2) {
            JOptionPane.showMessageDialog(null,"Você avaliou a TudoWeb como Bom!");
            bom++;
        }
        else if (avaliacao == 3) {
            JOptionPane.showMessageDialog(null,"Você avaliou a TudoWeb como Ruim. ");
            ruim++;
        }
        else{
            JOptionPane.showMessageDialog(null,"Digito incorreto. Tente novamente");
            i--;
        }
     }
        JOptionPane.showMessageDialog(null,"Resultado da pesquisa:\n"+"Excelente: "+excelente+"\n"+"Bom: "+bom+"\n"+"Ruim: "+ruim+"\n");
    }
}
