package Configurador;

import javax.swing.*;

public class Reporte {
    public static void main(String[] args) {

        Configurador_m3 primerM3 = new Configurador_m3();
        Configurador_m4 primerM4 = new Configurador_m4(5000);

       primerM3.establece_color("Verde");
       primerM3.asientos_calefactables("si");
       primerM3.techo_carbono("si");
       primerM3.asientos_cuero("si");
       primerM3.establece_carroceria("berlina");
       primerM3.establece_llantas("Aleacion");
       primerM3.paqueteMexterior("si");
       primerM3.paqueteMinterior("si");

        System.out.println( primerM3.datos_generales());


        primerM4.establece_color("Azul");
        primerM4.asientos_calefactables("no");
        primerM4.techo_carbono("si");
        primerM4.asientos_cuero("si");
        primerM4.establece_carroceria("coupe");
        primerM4.establece_llantas("carbono");
        primerM4.paqueteMexterior("si");
        primerM4.paqueteMinterior("si");

        System.out.println(primerM4.datos_generales());

    }

}
