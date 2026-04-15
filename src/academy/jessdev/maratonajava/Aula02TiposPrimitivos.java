package academy.jessdev.maratonajava;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long , boolean
        int idade = (int) 100000000000L;
        long numeroGrande = (long) 155.33;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Jéssica Noronha de Souza";
        
        System.out.println("A idade é "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é "+nome);
    }
}
