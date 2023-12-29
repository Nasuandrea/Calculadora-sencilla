import java.util.Scanner;

// no implementado el MEM.
public class Main {
    public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   int userNum1;
   int userNum2;
   String opciones="";
   double resultado;

while (!opciones.equalsIgnoreCase("ac"))
{
    System.out.println("Introduce un primer numero: ");
    userNum1= sc.nextInt();
    System.out.println("Introduce el segundo numero: ");
    userNum2= sc.nextInt();
    System.out.println("Introduce la operación que deseas realizar (S,R,M,D).Para usar el resultado como primer número: MEM. AC para salir");
    sc.nextLine();
    opciones=sc.nextLine();

    switch (opciones)
    {
        case "S":

            resultado= userNum1+userNum2;
            System.out.println("Resultado: "+resultado);
            break;
        case "R":

            resultado = userNum1-userNum2;
            System.out.println("Resultado: "+resultado);
            break;
        case "M":

            resultado = userNum1*userNum2;
            System.out.println("Resultado: "+resultado);
            break;
        case "D":

            resultado= (double)userNum1/userNum2;
            System.out.println("Resultado: "+resultado);
            break;
        case "AC": break;
        default:

    }
}




    }

}