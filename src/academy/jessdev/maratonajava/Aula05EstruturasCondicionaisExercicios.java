package academy.jessdev.maratonajava;

public class Aula05EstruturasCondicionaisExercicios {
    public static void main(String[] args) {
        // Dado um determinado salario eu quero saber qual o valor que tenho que pagar
        // De 0 até 34.712 - 9.70%, de 34.713 até 68.507 - 37.35%, de 68.508 pra cima 49.50%

        double sal1 = 68.509;
        String imposto;

        if(sal1 <= 34.712) {
            imposto = "9.70%";
        }else if(sal1 <= 68.507) {
            imposto = "37.35%";
        }else {
            imposto = "49.50%";
        }
        System.out.println(imposto);

        // CORRETO

        double salarioAnual = 70000;

        double primeiraFaixa = 9.70 / 100; // 0.097
        double segundaFaixa = 37.35 / 100; // 0.3735
        double terceiraFaixa = 49.50 / 100; // 0.495

        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("Valor do imposto: " + valorImposto);

    }

}
