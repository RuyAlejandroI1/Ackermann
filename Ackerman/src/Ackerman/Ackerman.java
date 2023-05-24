package Ackerman;

public class Ackerman {

    public static void main(String[] args) {
        int m=2;
        int n= 4;
        int resultado= Metodos.ackermann(m, n);
        
        System.out.println("El resultado de A("+ m + ", "+ n+ " )es :"+ resultado);
    }
    
}
