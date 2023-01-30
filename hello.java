import java.util.Scanner;

public class hello {
	public static void main (String[] Args ) {

    System.out.println(“¿que figura creamos cuadrado o circulo?”);

    Scanner entradas = new Scanner (System.in);
    String escrito = entradas.nextLine();

    while (true) { 
    System.out.println("ingrese un numero");
    System.out.println ("1. Compute area of a circle");
    System.out.println ("2. Compute circumference of a circle");
    System.out.println ("3. Compute area of a square");
    System.out.println ("4. Compute diagonal of a square");
    System.out.println ("5. Compute perimeter of a square");
    System.out.println ("6. Exit ");
    int opcion = Integer.parseInt(entradas.nextLine());
    
    
    Circulo circle = new Circulo (radio);
    Cuadrado square = new Cuadrado (lado);
    
    switch (opcion) {
    case 1: 
        System.out.print ("Enter the radius of the circle: ");
        double radio = Double.parseDouble (entradas.nextLine());
        Circulo circle = new Circulo (radio);
        System.out.println ("The area of the circle is " + circle.calcularArea());
        break;
      case 2: 
        System.out.print ("Enter the radius of the circle: ");
        double radio = Double.parseDouble (entradas.nextLine());
        Circulo circle = new Circulo (radio);
        System.out.println ("The circumference of the circle is " + circle.calcularCircunferencia());
        break;  
      case 3: 
        System.out.print ("Enter the side length of the square: ");
        double lado = Double.parseDouble (entradas.nextLine());
        Cuadrado square = new Cuadrado (lado);
        System.out.println ("The area of the square is " + square.calcularArea());
        break;
      case 4: 
        System.out.print ("Enter the side length of the square: ");
        double lado = Double.parseDouble (entradas.nextLine());
        Cuadrado square = new Cuadrado (lado);
        System.out.println ("The Diagonal of the square is " + square.calcularDiagonal());
        break;
       case 4: 
        System.out.print ("Enter the side length of the square: ");
        double lado = Double.parseDouble (entradas.nextLine());
        Cuadrado square = new Cuadrado (lado);
        System.out.println ("The area of the square is " + square.calcularPerimetro());
        break;

        
      case 6: 
        System.out.print ("Exiting...");
        System.exit(0);
        break;
        default:
        System.out.println ("Invalid choice. Please enter a valid choice. ");
        break; 
    }
  }

    entradas.close();
    }
}
