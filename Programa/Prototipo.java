public class Prototipo{
  int maxTam = 5;
  int frente,fin;
  String cola[];
  public Prototipo(){
    cols = new String [5];
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
