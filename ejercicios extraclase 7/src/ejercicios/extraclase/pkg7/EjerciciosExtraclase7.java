package ejercicios.extraclase.pkg7;

import java.util.Scanner;

public class EjerciciosExtraclase7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int materias;
        int alumno;
        int edad;
        double promedio;
        double sumapromedio = 0;
        double promediototal = 0;
        int suma_edad = 0;
        int cont;
        int cont2;
        int notabim1;
        int notabim2;
      
        System.out.print("REPORTE CALIFICACIONES DE LOS ESTUDIANTES.\n");
        System.out.print("Ingrese el Numero de Estudiantes a Evaluar: ");
        alumno = entrada.nextInt();
        String cadena = String.format("Reporte de calificaciones de estudiantes\n\n");
        entrada.nextLine();
        for (cont = 1; cont <= alumno; cont++) {
            System.out.print("\n");
            System.out.print("Ingrese el nombre del estudiante " + cont + ": ");
            String nombre = entrada.nextLine();
            nombre = nombre.toUpperCase();
            System.out.print("Ingrese el segundo nombre del estudiante " + cont + ": ");
            String nombre2 = entrada.nextLine();
            nombre2 = nombre2.toUpperCase();
            System.out.print("Ingrese el apellido paterno del estudiante " + cont + ": ");
            String apellido = entrada.nextLine();
            apellido = apellido.toUpperCase();
            System.out.print("Ingrese el apellido materno del estudiante " + cont + ": ");
            String apellido2 = entrada.nextLine();
            apellido2 = apellido2.toUpperCase();
            System.out.print("Ingrese la edad del estudiante " + nombre + " " + apellido + ": ");
            edad = entrada.nextInt();
            System.out.print("Ingrese la cantidad de materias que cursa el estudiante " + nombre + " " + apellido + ": ");
            materias = entrada.nextInt();
            suma_edad = suma_edad + edad;
            cadena = String.format("%sNombre de Estudiante %d: %s %s %s %s\nEdad: %d\nNumero de asignaturas: %d\n\n%-12s\t%s\t%s\t%s\n",
                     cadena, cont, apellido, apellido2, nombre, nombre2, edad, materias, "Asignaturas", "Bim:1", "Bim:2", "Promedio");
            for (cont2 = 1; cont2 <= materias; cont2++) {
                entrada.nextLine();
                System.out.print("Ingrese el nombre de la materia " + cont2 + ": ");
                String nom_asig = entrada.nextLine();
                System.out.print("Ingrese la nota del estudiante " + nombre + " " + apellido + " en el bimestre 1 :");
                notabim1 = entrada.nextInt();
                System.out.print("Ingrese la nota del estudiante " + nombre + " " + apellido + " en el bimestre 2 :");
                notabim2 = entrada.nextInt();
                promedio = (notabim1 + notabim2) / materias;
                sumapromedio = sumapromedio + promedio;
                cadena = String.format("%s%-12s\t%d\t%d\t%.0f\n", cadena, nom_asig, notabim1, notabim2, promedio);
            }
            promedio = sumapromedio / materias;
            cadena = String.format("%s\t\tPromedio:\t%.0f\n\n", cadena, promedio);

            if (promedio >= 19) {
                cadena = String.format("%s%s %s %s %s tiene un promedio de Sobresaliente\n\n", cadena, apellido, apellido2, nombre, nombre2);
            } else {
                if (promedio >= 16 && promedio < 19) {
                    cadena = String.format("%s%s %s %s %s tiene un promedio de Muy bueno\n\n", cadena, apellido, apellido2, nombre, nombre2);
                } else {
                    if (promedio >= 13 && promedio < 16) {
                        cadena = String.format("%s%s %s %s %s tiene un promedio de Bueno\n\n", cadena, apellido, apellido2, nombre, nombre2);
                    } else {
                        cadena = String.format("%s%s %s %s %s tiene un promedio de Regular\n\n", cadena, apellido, apellido2, nombre, nombre2);
                    }
                }
            }
            promediototal = promediototal + promedio;
            entrada.nextLine();
        }
        double prom_edad = suma_edad / alumno;
        double prom_global = promediototal / alumno;
        cadena = String.format("%sInformación global de los estudiantes:\nPromedio de edad es: %.2f\n El promedio de Notas de los estudiantes es de: %.2f\n",
                 cadena, prom_edad, prom_global);
        System.out.print(cadena);
    }
}
