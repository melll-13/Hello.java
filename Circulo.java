public class Circulo {
  public String ID; 
  public int Radio;
  public int Circunferencia; 
  public int perimetro; 
  public int area;

  public Cuadrado(String ID, int Radio, int Circunferencia, int area){
    this.ID = ID;
    this.Radio = Radio;
    this.Circunferencia = Circunferencia;
    this.area = area;
  }
  public double calculaCircunferencia(int Radio){
    return 2*3.14*Radio;
  }
  public float calculaArea(int Radio){
    return 3.14*Math.pow(Radio,2);
  }
  }
public class Hello {
  public static void main(String[] args) {
    Circulo Cinco = new Circulo ("Cinco", 5);
      System.out.println(Cinco.calculaCircunferencia(5));
      System.out.println(Cinco.calculaArea(5));
  }
}
