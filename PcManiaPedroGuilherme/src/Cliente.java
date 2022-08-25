public class Cliente {

    public String nome;
    public long cpf;

    public Cliente(String nomeCliente,long cpf){
        this.nome=nomeCliente;
        this.cpf=cpf;

    }


    Computador []computadores = new Computador[300];

    public void addComputador(Computador c){
        // Percorrendo o array de estudantes
        for(int i=0;i< computadores.length;i++){
            // Comparando as posições para verificar se não existe nenhum computador
            if(computadores[i]==null){
             computadores[i]=c; // Adicionando um computador  na posição i do meu array de computadores
                break;
            }
        }
    }



}
