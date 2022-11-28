
package com.kindalab.elevator.app;

import com.kindalab.elevator.entities.Ascensor;
import com.kindalab.elevator.entities.AscensorPublico;
import com.kindalab.elevator.entities.Keycard;
import java.util.Scanner;

public class ElevatorApp {


    public static void main(String[] args) {

        // ------------------------------------------------ //
        // Menú para manejar los ascensores de forma manual //
        // ------------------------------------------------ //    
        
        // Declaro las variables que voy a necesitar         
        Scanner input = new Scanner(System.in);
        Ascensor ascensorCarga = new Ascensor();
        AscensorPublico ascensorPublico = new AscensorPublico();
        boolean salir = false;

        while (!salir) {
            System.out.println("Ingrese el número de ascensor al que desee subir");
            System.out.println("Ascensor público [1]");
            System.out.println("Ascensor de carga [2]");
            System.out.println("Salir [3]");

            int rta = input.nextInt();

            switch (rta) {

                case 1:

                    System.out.println("Ingrese la carga del ascensor en kgs.");
                    int peso = input.nextInt();

                    System.out.println("A qué piso quiere ir?");
                    int nroPiso = input.nextInt();

                    if (ascensorPublico.requiereKeycard(nroPiso)) {
                        System.out.println("Posee una keycard? (s/n)");
                        String tieneono = input.next();
                        if (tieneono.equalsIgnoreCase("s")) {
                            System.out.println("Ingrese los números");
                            Keycard kc = new Keycard(input.nextInt());
                            ascensorPublico.puedeIrAlPiso(nroPiso, peso, kc);
                        } else {
                            ascensorPublico.msjErrorAutorizacion();
                            break;
                        }
                    } else {
                        ascensorPublico.puedeIrAlPiso(nroPiso, peso);
                    }

                    break;

                case 2:
                    System.out.println("Ingrese la carga del ascensor en kgs.");
                    peso = input.nextInt();
                    System.out.println("A qué piso quiere ir?");
                    int piso = input.nextInt();
                    ascensorCarga.puedeIrAlPiso(piso, peso);
                    break;

                case 3:
                    System.out.println("Adiós!");
                    salir = true;
            }
        }

    }
}
    
