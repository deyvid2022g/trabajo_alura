import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.Spring;

public class App {
    public static void main(String[] args) throws Exception {
        
        Object[] options = {"convertir divisas" , "convertir temperatura" , "salir"};
        int elige = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", "Concersor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,options,options[0]);

        if (elige == 2){
            JOptionPane.showMessageDialog(null, "Programa cerrado");
            System.exit(0);
        }
        if(elige ==0){
            DecimalFormat formatearDivisa = new DecimalFormat("#.##");
            boolean ContinuarPrograma = true;
            while (ContinuarPrograma){
                String[] opciones = {"COP a USD", "COP a GBP", "COP a JPY", "COP a EUR", "COP a MEX"};
                String cambio = (String) JOptionPane.showInputDialog( null,  "Elija una Opcion",  "conversor de moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog(null, "ingrese cantidad de COP");
                double COP = 0.0;;
                try{
                    COP = Double.parseDouble(input);
                }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                }
  


                if(cambio.equals("COP a USD")){
                    double USD = COP / 4300;
                    JOptionPane.showMessageDialog(null, COP + "COP Colombiano son: " + formatearDivisa.format(USD) + "USD");
                }
                else if(cambio.equals("COP a GBP")){
                    double GBP = COP / 1300;
                    JOptionPane.showMessageDialog(null, COP + "COP Colombiano son: " + formatearDivisa.format(GBP) + "GBP");
                }
                else if(cambio.equals("COP a JPY")){
                    double JPY = COP / 1300;
                    JOptionPane.showMessageDialog(null, COP + "COP Colombiano son: " + formatearDivisa.format(JPY) + "JPY");
                }
                else if(cambio.equals("COP a EUR")){
                    double EUR = COP / 5000;
                    JOptionPane.showMessageDialog(null, COP + "COP Colombiano son: " + formatearDivisa.format(EUR) + "EUR");
                }
                else if(cambio.equals("COP a MEX")){
                    double MEX = COP / 0.0028;
                    JOptionPane.showMessageDialog(null, COP + "COP Colombiano son: " + formatearDivisa.format(MEX) + "MEX");
                }
                int confirma = JOptionPane.showConfirmDialog(null, "¿Deseas continuar usando el programa?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
                    if(confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION){
                        ContinuarPrograma = false;
                        JOptionPane.showMessageDialog(null, "progrma finalizado");
                }
            }
        }
        if   (elige == 1){
            boolean seguirPrograma = true;
            while(seguirPrograma){
                String[] opciones = {"Celsius a Faren", "Faren a celsius"};
                int opcion = JOptionPane.showOptionDialog( null,  "Elija una Opcion",  "conversor de temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
            double valor = 0.0;
            try{
                valor = Double.parseDouble(valorNominal);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "valor no valido");
                System.exit(0);
            }

            double resultado = 0;
            if (opcion == 0){
                resultado = (valor *9/5)+32;
                JOptionPane.showMessageDialog(null, valor + "Grados Celsius son: " + resultado + "Grados");
                }else if(opcion == 1){
                    resultado = (valor * 9 / 5 ) + 32;
                    JOptionPane.showMessageDialog(null, valor + "Grados Fahrenheit son: " + resultado + "Grados");
                }
                int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas segir usando el progrma?",  "",JOptionPane.YES_NO_CANCEL_OPTION );
                if (continuar == JOptionPane.NO_OPTION) {
                seguirPrograma = false;
                JOptionPane.showMessageDialog(null, "progrma finalizado");
                }
            }
        }
    }
}
