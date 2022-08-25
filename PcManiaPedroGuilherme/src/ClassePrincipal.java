import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

       Cliente cliente = new Cliente("Pedro ", 793056656);


        Computador promocao1 = new Computador();
        promocao1.marca = "Positivo";
        promocao1.preco = 1300;
        promocao1.SO.nome = "Linux";
        promocao1.SO.tipo = 32;
        promocao1.HB.nome = "Pentium Core i3";
        promocao1.HB.capacidade = 1200;
        promocao1.armazenamento.nome = "Pen-drive";
        promocao1.armazenamento.capacidade = 16;

        Computador promocao2 = new Computador();
        promocao2.marca = "Acer";
        promocao2.preco = 1800;
        promocao2.SO.nome = "Windows 8";
        promocao2.SO.tipo = 64;
        promocao2.HB.nome = "Pentium Core i5";
        promocao2.HB.capacidade = 2260;
        promocao2.armazenamento.nome = "Pen-drive";
        promocao2.armazenamento.capacidade = 32;

        Computador promocao3 = new Computador();
        promocao3.marca = "Vaio";
        promocao3.preco = 2800;
        promocao3.SO.nome = "Windows 10";
        promocao3.SO.tipo = 64;
        promocao3.HB.nome = "Pentium Core i7";
        promocao3.HB.capacidade = 3500;
        promocao3.armazenamento.nome = "HD externo";
        promocao3.armazenamento.capacidade = 10000;

        boolean flag = true;

        while(flag == true) {
           System.out.println("---Bem vindo a loja ----");
           System.out.println("Selecione qual promocao voce deseja comprar: 1 2 3  ");
           System.out.println(" Ou tecle 4 para sair ");
            int opcao=sc.nextInt(); // Atribuindo a entrada de dados a variável opção
            sc.nextLine();
            Computador c = new Computador();
            switch(opcao){
                case 1:

                c = promocao1;
                cliente.addComputador(c);


                    break;

                case 2:

                    c = promocao2;
                    cliente.addComputador(c);

                    break;
                case 3:

                    c = promocao3;
                    cliente.addComputador(c);
                    break;
                case 0:
                    System.out.println("---Obrigado por comprar conosco---");
                    System.out.println("----Segue nota fiscal -----");
                    System.out.println("NOme do cliente: "+ cliente.nome);
                    System.out.println("Cpf: "+ cliente.cpf);


                    flag=false;

                    break;
                default:
                    System.out.println("Opção inválida !!");
                    break;


            }


        }







    }

}
