public class Circulo {

    int radio;
	
	public Circulo(int radio) {
    this.radio = radio;
  }

  public Circulo() {
    this(25);
  }

  public double calcularCircunferencia(int radio) {
    return Math.PI* 2*radio;
  }
  public double calcularArea(int radio) {
    return Math.PI*radio*radio;
  }
}
