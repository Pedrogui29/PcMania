public class Computador {

       String marca;
       float preco;

       public MemoriaUSB []memoUSB = new MemoriaUSB[3]; // Seguindo DIagrama
       public SistemaOperacional SO;
       public HardwareBasico HB;

       public Cliente[] clientes;

       public  Computador(String marca, float preco, String nomeSO, int tipoSO, String nomeHW, float capacidadeHw, MemoriaUSB memoUSB  ){
              this.marca = marca;
              this.preco = preco;
              this.memoUSB[0] = null;
              this.memoUSB[1] = null;
              this.memoUSB[2] = null;

              SO = new SistemaOperacional(nomeSO, tipoSO);
              HB = new HardwareBasico(nomeHW, capacidadeHw);

       }

       public void mostraPcConfig(){

              System.out.println("Marca:" + marca);
              System.out.println("Preco: " + preco);

              for (int i = 0; i < memoUSB.length; i++) {
                     //Verificando se temos memoria usb
                     if (memoUSB[i] == null) {
                            addMemoriaUsb(memoUSB[i]);
                            System.out.println("----Memoria USB: ------ ");
                            System.out.println("Nome: " + memoUSB[i].nome);
                            System.out.println("Capacidade: " + memoUSB[i].capacidade);
                     }
              }

              System.out.println("-----Sistema operacional -----");
              System.out.println("Nome: "+SO.nome);
              System.out.println("Tipo: "+ SO.tipo);

              System.out.println("----Hardware basico -----");
              System.out.println("Nome:"+ HB.nome);
              System.out.println("Capacidade: "+ HB.capacidade);



       }

       public void addMemoriaUsb(MemoriaUSB musb){
              if(memoUSB == null){
                memoUSB[0] = new MemoriaUSB("Pen-drive", 16);
                memoUSB[1] = new MemoriaUSB("Pen-drive", 32);
                memoUSB[2] = new MemoriaUSB("HD-externo", 1000);

              }

              else{
                     System.out.println("Ja existe um armazenamento USB neste dispositivo");
              }
       }


}
