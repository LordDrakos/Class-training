import java.util.Scanner;

/**
 * Created by adn on 24/01/17.
 */


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main (String[]args){

       String dni,name;
        int an = 0;

        Scanner sc =new Scanner(System.in);
        Alumnos alum = new Alumnos();
        Profesores profe = new Profesores();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("¿Es usted Alumno o Profesor?\n" +
                "1 - Alumno \n" +
                "2 - Profesor\n");

        int opt = sc.nextInt();
        switch (opt){
            case 1:
                sc.nextLine();
                System.out.print("Introduzca su Nombre: ");
                name = sc.nextLine();
                System.out.print("Introduzca su DNI: ");
               

                dni = sc.nextLine();
                System.out.print("Introduzca su Fecha de Nacimiento DD/MM/YYYY: ");
                alum.setFnac(LocalDate.parse(sc.next(), formato));
                an = alum.edad(alum.getFnac());
                System.out.print("Introduzca su CIAL");
                sc.nextLine();
                String cial = sc.nextLine();
                System.out.print("Introduzca su curso (EJ 1DAM)");
                String curso = sc.nextLine();

                alum.setName(name);
                alum.setDNI(dni);
                alum.setCIAL(cial);
                alum.setRama(curso);
                break;
            case 2:
                sc.nextLine();
                System.out.println("Introduzca su Nombre: ");
                name = sc.nextLine();
                System.out.println("Introduzca su DNI: ");
                dni = sc.nextLine();
                System.out.println("Introduzca su Fecha de Nacimiento DD/MM/YYYY: ");
                alum.setFnac(LocalDate.parse(sc.next(), formato));
                an = profe.edad(alum.getFnac());
                System.out.println("Introduzca su Centro de Procedencia");
                int nrp = sc.nextInt();
                sc.nextLine();
                System.out.println("Introduzca su Especialidad");
                String especialidad = sc.nextLine();

                System.out.println("Introduzca su Centro de Destino");
                String instituto = sc.nextLine();

                profe.setDNI(dni);
                profe.setNRP(nrp);
                profe.setName(name);
                profe.setESP(especialidad);
                profe.setDestino(instituto);
                break;
        }







        System.out.print("A continuación se mostraran los datos introducidos \n");

        if (opt == 1){
            System.out.println("Alumnos");
            System.out.println(alum.getName());
            System.out.println(an);
            System.out.println(alum.getCIAL());
            System.out.println(alum.getRama());

        }

        if (opt == 2){
            System.out.println("Profesores");
            System.out.println(profe.getName());
            System.out.println(profe.getDNI());
            System.out.println(an);
            System.out.println(profe.getNRP());
            System.out.println(profe.getESP());
            System.out.println(profe.getDestino());
        }




    }
}
