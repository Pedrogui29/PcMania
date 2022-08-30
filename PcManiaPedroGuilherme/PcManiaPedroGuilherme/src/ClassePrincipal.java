import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {


            Cliente cliente = new Cliente("Pedro ", 793056656);
            Computador []promocao = new Computador[300];
             MemoriaUSB []memoUSB = new MemoriaUSB[3]; // Seguindo DIagrama


            MemoriaUSB novaMemoria = new MemoriaUSB("Pen-drive", 16);


            MemoriaUSB novaMemoria2 = new MemoriaUSB("Pen-drive", 32);


            MemoriaUSB novaMemoria3 = new MemoriaUSB("HD externo", 1000);

            Computador computador1 = new Computador("Positivo", 1300, "Linux", 32, "Pentium Core i3", 1200, null );
            Computador computador2 = new Computador("Acer", 1800, "Windows", 64, "Pentium Core i5", 2260, null );
            Computador computador3 = new Computador("Vaio", 2800, "Windows", 64, "Pentium Core i7", 3500, null);

           computador1 = promocao[0];
           computador2 = promocao[1];
           computador3 = promocao[2];

            boolean flag = true;

            while (flag == true) {
                System.out.println("---Bem vindo a loja ----");
                System.out.println("Selecione qual promocao voce deseja comprar: 1 2 3  ");
                System.out.println(" Ou tecle 0 para sair ");
                int opcao = sc.nextInt(); // Atribuindo a entrada de dados a variável opção
                sc.nextLine();
                switch (opcao) {
                    case 1:
                       cliente.comp1++;
                        break;

                    case 2:
                        cliente.comp2++;
                            break;
                    case 3:
                        cliente.comp3++;
                        break;
                    case 0:
                        System.out.println("---Obrigado por comprar conosco---");
                        System.out.println("----Segue nota fiscal -----");
                        System.out.println("Nome do cliente: " + cliente.nome);
                        System.out.println("Cpf: " + cliente.cpf);
                        System.out.println("---Computadores comprados:----");
                        if (cliente.comp1 > 0){
                            System.out.println("Voce comprou "+ cliente.comp1+ " PC da 1 promoção");

                        }
                        if (cliente.comp2 > 0){
                            System.out.println("Voce comprou "+ cliente.comp2+ " PC da 2 promoção");
                        }
                        if (cliente.comp3 > 0){
                            System.out.println("Voce comprou "+ cliente.comp3+ " PC da 3 promoção");
                        }

                        float total = cliente.calculaTotalCompra();
                        System.out.println("Total da compra: R$"+total);

                        flag = false;

                        break;
                    default:
                        System.out.println("Opção inválida !!");
                        break;


                }


                }
        }


    }
}

