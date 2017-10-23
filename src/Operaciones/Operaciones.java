/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author daniel.riveraa
 */
public class Operaciones {
    
    public static double Convertir(double angulo){
        //Convertir de grados a radianes
        double conversion;
        conversion = angulo*2.0*Math.PI/360.0;
        return conversion;
        
    }
    public static double dosDecimales(double num){
        //Metodo que me devuelve un número con dos decimales
        double x;
        String format;
        format = Double.toString((double)(Math.round(num*100d)/100d));
        x = Double.parseDouble(format);
        return x;
    }
    public static double seno(double angulo){
            double seno;           
            seno = Math.sin(Convertir(angulo));
            return dosDecimales(seno);
        }
    public static double coseno(double angulo){
        double coseno;
        coseno = Math.cos(Convertir(angulo));
        return dosDecimales(coseno);
    }
    public static double tangente(double angulo){
        double tangente;
        tangente = Math.tan(Convertir(angulo));
        return dosDecimales(tangente);
    }
    public static double secante(double angulo){
            double secante = Math.toRadians(angulo); 
            secante = 1 / Math.cos(secante); 
            return dosDecimales(secante);
        }
    public static double cosecante(double angulo){
        double cosecante = Math.toRadians(angulo); 
            cosecante = 1 / Math.sin(cosecante); 
            return dosDecimales(cosecante);
    }
    public static double cotangente(double angulo){
            double cotangente = Math.toRadians(angulo); 
            cotangente = 1 / Math.tan(cotangente); 
            return dosDecimales(cotangente);
    }




      public static double calcularLogaritmosBase10(double n1){
        
        double n2;
        if(n1>0){
            n2=Math.log(n1);
            return n2;
            }      
        return 0;     
      }
    

 public double calcularPotencia(String base, String potencia) {
        double a = Double.parseDouble(base);
        double b = Double.parseDouble(potencia);
        double resultado;
        
        resultado = Math.pow(a, b);

        return resultado;
    }

    public static double calcularRaiz(String indice, String radicando) {
        double a = Double.parseDouble(indice);
        double b = Double.parseDouble(radicando);
        
        double resultado = Math.pow(b, 1 / a);
        

        return resultado;
    }


    public static double sumar(double numero1, double numero2){
        double suma;
        suma= numero1+numero2;
        return suma;       
    }
    public static double restar(double numero1, double numero2){
        double resta;
        resta= numero1-numero2;
        return resta;
    }
    public static double multiplicar(double numero1, double numero2){
        double multi;
        multi= numero1*numero2;
        return multi;       
    }
    public static double dividir(double numero1, double numero2){
        double dividir;
        dividir= numero1/numero2;
        return dividir;
    }

    
    public static int factorial (int numero) {
      if (numero==0)
        return 1;
      else
        return numero * factorial(numero-1);
    }
    
    public static int permutacion(int elementos,int cantAtomar){
        int resultado;
        return resultado=((factorial(elementos))/((factorial(elementos-cantAtomar))));         
    }
    

    public static int mod(String i, String j){
        int modulo = (Integer.parseInt(i) % Integer.parseInt(j));
        return modulo;
    }    
   

   
    public static double potencia(String x,String y){
      double z = Math.pow(Double.parseDouble(x), Double.parseDouble(y));
      return z;
    }
   
    public static double logaritmoNatural(String y){
      double x = 0;
      try{
      x = Math.log(Double.parseDouble(y));
      return x;
      }catch(Exception e){
              System.out.print("Math Error");
              }
        return x;
    }
    
    
    public static String toBinary(int numero)
     {String binario;
     
     binario=Integer.toBinaryString(numero);
       return binario;
     }
    
    public static String toHexa(int numero)
     {String hex;
     
     hex=Integer.toHexString(numero);
       return hex;
     }
    
    
}
    



    

    

