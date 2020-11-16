package com.company;


public class Main {

    public static void main(String[] args) {
       System.out.println("Antonio Gibbs");
       System.out.println("7");
       System.out.println("70");

        System.out.println("Estudiante " + args[0] +" "+ args[1] +" con " + args[2]+ " modulos, dedica " + args[3] + " horas semanales a estudiar" );
    }
    private static String veredicto (String valor1, String valor2){

        if (valor2.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor2) < Integer.valueOf(valor2)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
}
