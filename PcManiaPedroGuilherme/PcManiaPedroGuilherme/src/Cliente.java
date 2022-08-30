public class Cliente {

    public String nome;
    public long cpf;

    public MemoriaUSB []memoUSB = new MemoriaUSB[3]; // Seguindo DIagrama
    public Cliente(String nomeCliente,long cpf){
        this.nome=nomeCliente;
        this.cpf=cpf;

    }

    Computador[] computadores = new Computador[300];

    Computador computador1 = new Computador("Positivo", 1300, "Linux", 32, "Pentium Core i3", 1200, memoUSB[0] );
    Computador computador2 = new Computador("Acer", 1800, "Windows", 64, "Pentium Core i5", 2260, memoUSB[1] );
    Computador computador3 = new Computador("Vaio", 2800, "Windows", 64, "Pentium Core i7", 3500, memoUSB[2] );

    int comp1 = 0;
    int comp2 = 0;
    int comp3 = 0;


    public float calculaTotalCompra(){
        float soma = 0;
        soma = comp1 *  computador1.preco + comp2 *  computador2.preco + comp3 *  computador3.preco ;
        return soma;


    }

}
