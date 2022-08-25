public class Computador {

       String marca;
       float preco;

       public MemoriaUSB armazenamento;
       public SistemaOperacional SO = new SistemaOperacional();
       public HardwareBasico HB = new HardwareBasico();

       public Cliente[] clientes;

       public void mostraPcConfig(){

              System.out.println("Marca:" + marca);
              System.out.println("Preco: " + preco);

              // Verificando se temos memoria usb
             // if( armazenamento != null)
              System.out.println("----Memoria USB: ------ ");
              System.out.println("Nome: "+armazenamento.nome);
              System.out.println("Capacidade: "+armazenamento.capacidade);


              System.out.println("-----Sistema operacional -----");
              System.out.println("Nome: "+SO.nome);
              System.out.println("Tipo: "+ SO.tipo);

              System.out.println("----Hardware basico -----");
              System.out.println("Nome:"+ HB.nome);
              System.out.println("Capacidade: "+ HB.capacidade);



       }
/*
       public void addMemoriaUsb(){
              if(armazenamento == null){


              }

              else{
                     System.out.println("Ja existe um armazenamento USB neste dispositivo");
              }
       }
*/

}
