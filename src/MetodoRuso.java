public class MetodoRuso {
    int multiplicador;
    int multiplicando;
    int sumatorio;
    public MetodoRuso(int multiplicador, int multiplicando){
        this.multiplicador=multiplicador;
        this.multiplicando=multiplicando;
    }
    public void rusiando(){
        while (multiplicador>=1){
            if (multiplicador% 2 == 1){
                sumatorio+=multiplicando;
            }
            multiplicador=multiplicador/2;
            multiplicando=multiplicando*2;
        }
        System.out.println("результат операции: " + sumatorio);
    }
}
