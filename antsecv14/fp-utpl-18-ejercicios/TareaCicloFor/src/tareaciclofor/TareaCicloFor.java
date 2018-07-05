/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaciclofor;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TareaCicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int edad;
        int est ;
        int nest ;
        double bim1;
        double bim2 ;
        double prom ;
        double sum ;
        double prome;
        int sume=0;
        double promt= 0;
        double sum2=0;
        double sumfi=0;
        double promfi;
        System.out.print("Ingrese la cantidad de estudiantes: ");
        nest = entrada.nextInt();
        String cadenafinal="";
        String cadenamen="";
        entrada.nextLine();
        for (int contp = 1; contp <= nest; contp++) {
            System.out.print("Ingrese el nombre del estudiante " + contp + " :\n");
            String nombre = entrada.nextLine();          
            System.out.printf("Ingrese la edad del estudiante : \n");
            edad = entrada.nextInt();
            System.out.print("Ingrese la cantidad de materias del estudiante " + contp + " :\n");
            est = entrada.nextInt();
            cadenafinal = String.format("%s \t\t\t%s\n %s%s\n %s%s\n %s \t\t%s \t\t%s \t\t%s\n",cadenafinal, "~Reporte de calificaciones~", "Nombre de estudiante: ",nombre,"Edad del estudiante: ", edad, "Materia", "bim1", "bim2", "Promedio");
            entrada.nextLine();
            for (int cont = 1; cont <= est; cont++) {
                System.out.println("Ingrese la materia "+ cont +" del estudiante "+contp+" :\n");
                String mat = entrada.nextLine();
                System.out.println("\nIngrese la nota del bimestre 1 de la materia  " + cont + " del estudiante " + contp+":\n");
                bim1 = entrada.nextDouble();
                System.out.println("Ingrese la nota del bimestre 2 de la materia  " + cont + " del estudiante " + contp+":\n");
                bim2 = entrada.nextDouble();
                sum = bim2 + bim1;
                prom = sum/2;
                sum2=sum2+prom;
                promt=sum2/est;
               
                cadenafinal = String.format("%s\n %-12s \t\t%.2f \t\t%.2f \t\t%.2f ", cadenafinal, mat, bim1, bim2, prom);
                entrada.nextLine();
            }
            sume=sume+edad;
            sumfi=sumfi+promt;
            cadenafinal = String.format("%s\n\t\t\t\t\t%s\t%.2f", cadenafinal, "Promedio",promt);
            if (promt >=19) {
                cadenafinal=String.format("%s\n El estudiante %s tiene un promedio sobresaliente\n", cadenafinal, nombre); 
            } else {
                if (promt<19 && promt>=16) {
                    cadenafinal=String.format("%s\n El estudiante %s tiene un promedio Muy bueno\n", cadenafinal, nombre);
                }else{
                    if(promt<16 && promt>=13){
                        cadenafinal=String.format("%s\n El estudiante %s tiene un promedio Bueno\n", cadenafinal, nombre);
                    }else{
                        if(promt<13){
                            cadenafinal=String.format("%s\n El estudiante %s tiene un promedio Regular\n", cadenafinal, nombre);
                        
                        
                        }
                    }

                }
            }
            sum2=0;
            promt = 0;
            prome=sume/nest;
            promfi=sumfi/nest;
            entrada.nextLine();
            cadenamen =String.format(" %s\n %s%s\n  %s%.2f\n %s\n %s\n %s\n %s\n %s\n %s\n", "Informacion global de los estudiantes", " Promedio de edad: ",prome,"Promedio de notas de los estudiantes: ",promfi,"-------------", "Adicionales","Sobresaliente -> mayor o igual a 19","Muy bueno -> mayor a 16 y menor a 19","Bueno -> mayor igual a 13 y menor a 16","Regular -> menor a 13");
        }
          System.out.print(cadenafinal);
          System.out.print(cadenamen);
          System.out.println();
    }
    
}
