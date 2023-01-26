public class Cuadrado {
 
  int lado;
	
  public Cuadrado(int lado) {
    this.lado = lado;
  }

  public Cuadrado() {
    this(25);
  }

  public double calcularDiagonal(int lado) {
    return Math.sqrt(2*((double) lado*(double) lado));
  }
   public double calcularPerimetro(int lado) {
    return lado*4;
  }
  public double calcularArea(int lado) {
    return lado*lado;
  }

}
