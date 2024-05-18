import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //CONDICIONAL IF-IF ELSE
        Scanner entrada = new Scanner(System.in);
        int edad;

        System.out.println("Ingresa tu edad: ");
        edad = entrada.nextInt();

        if(edad<=18) System.out.println("Usted es menor de edad.");
        else if(edad>=18) System.out.println("Usted es mayor de edad.");

        Scanner teclado = new Scanner(System.in);
        int x, y;

        System.out.println("Ingresa un numero: ");
        x = teclado.nextInt();
        System.out.println("Ingresa otro numero: ");
        y = teclado.nextInt();

        if(x<y)
            System.out.println("El numero menor es: " + x);
        else {
            System.out.println("El numero mayor es: " + y);
        }

        Scanner leer = new Scanner(System.in);
        int dato,n;

        System.out.println("Ingresa un numero: ");
        dato = leer.nextInt();
        n = dato % 2;

        if(n == 0)
            System.out.println("El numero es par ");
        else {
            System.out.println("El numero es impar ");
        }

        //ITERATIVAS FOR-WHILE
        Scanner fact = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int f = fact.nextInt();
        int factorial = 1;

        while (f !=1){
            factorial = factorial * f;
            f = f - 1;
        }
        System.out.println("El factorial de"+f+"es: " + factorial);

        Scanner ipm = new Scanner(System.in);
        int nm1;

        System.out.println("Ingresa un numero mayor que 10 y menor que 30: ");
        nm1 = ipm.nextInt();

        while (nm1<10||nm1>30){
            System.out.println("Ingresa un numero mayor que 10 y menor que 30: ");
            nm1 = ipm.nextInt();
        }

        for (int i =1; i<=nm1; i+=2){
            System.out.println(i);
        }

        Scanner ent = new Scanner(System.in);
        int numero, contadorimpar = 1;

        System.out.println("Ingresa un numero mayor que 10 y menor que 30: ");
        numero = entrada.nextInt();

        while (contadorimpar < numero){

            contadorimpar += 2; System.out.println(contadorimpar);

        }

        //SWITCH
        Scanner day = new Scanner(System.in);
        int dia;
        System.out.println("Ingresa un numero entre 1 y 5: ");
        dia = day.nextInt();

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
        }

    }
}