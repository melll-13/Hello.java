public class Cuadrado {
  public String ID; 
  public int longitud;
  public int diagonal; 
  public int perimetro; 
  public int area;

  public Cuadrado(String ID, int longitud, int perimetro, int area){
    this.ID = ID;
    this.longitud = longitud;
    this.diagonal = diagonal;
    this.perimetro = perimetro;
    this.area = area;
  }
  public double calculaDiagonal(int longitud){
    return longitud*Math.sqrt(2);
  }
  public float calculaPerimetro(int longitud){
    return longitud*4;
  }
  public float calculaArea(int longitud){
    return longitud*longitud;
  }
  }
public class Hello {
  public static void main(String[] args) {
    Cuadrado Cinco = new Cuadrado ("Cinco", 5);
      System.out.println(Cinco.calculaDiagonal(5));
      System.out.println(Cinco.calculaPerimetro(5));
      System.out.println(Cinco.calculaArea(5));
  }
}
