import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("= Jokenpô =");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha sua jogada:");
        System.out.println("[1]PEDRA\n[2]PAPEL\n[3]TESOURA");

        try {
            byte jogoUser = teclado.nextByte();
            double jogoPC = Math.floor(Math.random() * 3) + 1;

            if (jogoUser == jogoPC) {
                String opPC;

                if (jogoPC == 1) {
                    opPC = "pedra";
                }
                if (jogoPC == 2) {
                    opPC = "papel";
                } else {
                    opPC = "tesoura";
                }
                System.out.println("O computador escolheu:" + opPC);
                System.out.println("Empate! Jogue novamente!");

            } else if ((jogoUser == 1) && (jogoPC == 2)) {
                System.out.println("O computador escolheu: Papel");
                System.out.println("Papel vence a pedra! Você perdeu!");
            } else if ((jogoUser == 1) && (jogoPC == 3)) {
                System.out.println("O computador escolheu: Tesoura");
                System.out.println("Pedra vence a tesoura! Você ganhou!");
            } else if ((jogoUser == 2) && (jogoPC == 1)) {
                System.out.println("O computador escolheu: Pedra");
                System.out.println("Papel vence a pedra! Você ganhou!");
            } else if ((jogoUser == 2) && (jogoPC == 3)) {
                System.out.println("O computador escolheu: Tesoura");
                System.out.println("Tesoura vence o papel! Você perdeu!");
            } else if ((jogoUser == 3) && (jogoPC == 1)) {
                System.out.println("O computador escolheu: Pedra");
                System.out.println("Pedra vence a tesoura! Você perdeu!");
            } else if ((jogoUser == 3) && (jogoPC == 2)) {
                System.out.println("O computador escolheu: Papel");
                System.out.println("Tesoura vence o papel! Você ganhou!");
            } else
                System.out.println("Dígito inválido, programa encerrado.");
        } catch (Exception ex) {
            System.out.println("Dígito inválido, programa encerrado.");
        }
        teclado.close();
    }
}
