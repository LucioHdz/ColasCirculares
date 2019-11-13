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
  public insertar(String productos){
    
  }
  public quitar(){
  
  }
  private boolean vacia(){
    return frente ==siguiente(fin);
  }
  private boolean llena(){
    return frente==siguiente(siguiente(fin));
  }
}
