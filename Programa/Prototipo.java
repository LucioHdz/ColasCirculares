public class Prototipo{
  int maxTam = 5;
  int frente,fin;
  String cola[];
  public Prototipo(){
    this.cola = new String [5];
    this.frente = 0;
    this.fin= maxTam-1;
  }
  private int siguiente(int dato){
    return (dato+1)%maxTam;
  }
  public void insertar(String productos){
    if (!llena()){
      fin = siguiente(fin);
      cola[fin]=productos;//usamos fin porque se añaden por el final de la cola
    }else{
      JOptionPane.showMessageDialog(null,"Cola llena :´c");
    }
  public void quitar(){
    if(!vacia()){
      frente = siguiente(frente);
    }else{
      JOptionPane.showMessageDialog(null,"Cola vacia, inserte datos");
    }
  }
  public void borrarCola(){
    int i = frente;
    String datos="";
    do{
      datos+="\nlaCircular ["+i+"]"+cola[i];
      i = siguiente(i);
    }while(i!=fin+1);
    JOptionPane.showMessageDialog(null,datos);
  }
  private boolean vacia(){
    return frente ==siguiente(fin);
  }
  private boolean llena(){
    return frente==siguiente(siguiente(fin));
  }
}
