package Configurador;

public class Configurador_m3 {

    private int largo;
    private int ancho;
    private int peso;
    private int motor;
    private String color;
    private String carroceria;
    private String llantas;
    private boolean asientos_cuero, techo_carbono, asientos_calefactables, paqueteMinterior, paqueteMexterior;

    public Configurador_m3() {

        largo = 4000;
        ancho = 1950;
        peso = 1500;
        motor = 4000;
    }

    //--------------------------------------------------------------
    //Setters
    public void establece_color(String color_coche) {

        color = color_coche;
    }

    public void establece_carroceria(String carroceria_coche) {

        carroceria = carroceria_coche;
    }

    public void establece_llantas(String llantas_coche) {

        llantas = llantas_coche;
    }


    public void asientos_cuero(String asientos_cuero) {

        if (asientos_cuero.equalsIgnoreCase("si")) {

            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }

    }

    public void techo_carbono(String techo_carbono) {

        if (techo_carbono.equalsIgnoreCase("si")) {

            this.techo_carbono = true;
        } else {
            this.techo_carbono = false;
        }

    }

    public void asientos_calefactables(String asientos_cuero) {

        if (asientos_cuero.equalsIgnoreCase("si")) {

            this.asientos_calefactables = true;
        } else {
            this.asientos_calefactables = false;
        }

    }

    public void paqueteMinterior(String paqueteMinterior) {

        if (paqueteMinterior.equalsIgnoreCase("si")) {

            this.paqueteMinterior = true;
        } else {
            this.paqueteMinterior = false;
        }

    }

    public void paqueteMexterior(String paqueteMinterior) {

        if (paqueteMinterior.equalsIgnoreCase("si")) {

            this.paqueteMexterior = true;
        } else {
            this.paqueteMexterior = false;
        }

    }
    //--------------------------------------------------------------
    //Getters

    public String datos_generales() {
        return "El coche mide " + largo/1000+ " metros de largo y " + ancho + " de ancho, su cilindrada es de " + motor+ " centimetros cubicos y tiene un peso en vacio" +
                " de inicio de "+ peso+" kg y sumandole los extras tiene un peso final de: " + dime_peso() + " kg." + "\n"+ "Su carroceria es " + dime_carroceria() + " es de color "+ dime_color()
                + " y como equipamiento exterior incorpora "+ dime_llantas() + " y " + dime_paqueteExterior() + "\n" + "Tambien " + dime_techo() + dime_paqueteInterior() + dime_calefactables() + dime_cuero() + " lo que suma" +
                " un precio total de " + precio_coche();
    }

    public String dime_color(){

        return color;
    }
    public String dime_carroceria(){

        return carroceria;
    }
    public String dime_llantas(){

        return "llantas de " + llantas;
    }
    public String dime_asientos() {

        if (asientos_cuero) {

            return "el coche tiene asientos de cuero";

        } else {
            return "el coche no tiene asientos de cuero";
        }

    }

    public String dime_calefactables() {

        if (asientos_calefactables) {

            return " tiene asientos calefactables";

        } else {
            return " no tiene asientos calefactables";
        }
    }
    public String dime_cuero() {

        if (asientos_cuero) {

            return " tiene asientos de cuer";

        } else {
            return " no tiene asientos de cuero";
        }
    }

    public String dime_techo() {

        if (techo_carbono) {

            return "el coche tiene techo de carbono";

        } else {
            return "el coche no tiene techo de carbono";
        }

    }
    public String dime_paqueteExterior() {

        if (paqueteMexterior) {

            return "el coche tiene pack M exterior";

        } else {
            return "el coche no tiene pack M exterior";
        }

    }

    public String dime_paqueteInterior() {

        if (paqueteMinterior) {

            return " coche tiene pack M interior";

        } else {
            return " coche no tiene pack M interior";
        }

    }

    public int dime_peso() {

        int peso_total = peso;


        if (asientos_cuero == true) {
            peso_total = peso_total + 50;
        }
        if (techo_carbono == true) {
            peso_total = peso_total - 10;
        }
        if (asientos_calefactables == true) {
            peso_total = peso_total + 20;
        }
        if (paqueteMexterior == true) {
            peso_total = peso_total + 10;
        }
        if (paqueteMinterior == true) {
            peso_total = peso_total + 5;
        }

        return peso_total;

    }

    public int precio_coche() {

        int precio_final = 95000;

        if (asientos_cuero == true) {

            precio_final += 2000;

        }
        if (asientos_calefactables == true) {

            precio_final += 1500;

        }
        if (techo_carbono == true) {

            precio_final += 3000;

        }
        if (paqueteMinterior == true) {

            precio_final += 3500;

        }
        if (paqueteMexterior == true) {

            precio_final += 1500;

        }
        return precio_final;


    }

}






