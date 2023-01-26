public class holamundo {
	public static void main (String[] Args ) {

    System.out.println(“¿que figura creamos cuadrado o circulo?”);

    Scanner entradas = new Scanner (System.in);
    String escrito = entradas.nextLine();

    if (escrito.contains(“cuadrado”)) {
		System.out.println(“¿cuanto mide su lado?”);
		String lado = entradas.nextLine();
		int lado2 = Integer.parseInt(lado);
		Cuadrado miCuadrado = new Cuadrado(lado2);

		System.out.println(“¿que desea calcular?”);
		System.out.println(“1. Diagonal”);
		System.out.println(“2. Perimetro”);
		System.out.println(“3. Area”);

		int respuesta = entradas.nextInt();

		if (respuesta ==1) {
	        System.out.println(miCuadrado.calcularDiagonal());	
		
        }else if (respuesta ==2) {
            System.out.println(miCuadrado.calcularPerimetro());

        }else if (respuesta ==3) {
	        System.out.println(miCuadrado.calcularArea());

        }else {
	        System.out.println(“no se puede hacer eso”);
        }

    } else if (escrito.contains(“circulo”)) {
		System.out.println(“¿cuanto mide su radio?”);
		String radio = entradas.nextLine();
		int radio2= Integer.parseInt(radio);
		Cuadrado miCirculo = new Cuadrado(radio2);

        System.out.println(“¿que desea calcular?”);
		System.out.println(“1. Circunferencial”);
		System.out.println(“2. Area”);

		int respuesta = entradas.nextInt();

		if (respuesta ==1) {
	        System.out.println(miCirculo.calcularCircunferencial());	
		
        }else if (respuesta ==2) {
            System.out.println(miCirculo.calcularArea());

        }else {
        	System.out.println(“no se puede hacer eso”);
        }

        }else {
		    System.out.println(“no se puede hacer eso”);
        }
    entradas.close();
    }
}
