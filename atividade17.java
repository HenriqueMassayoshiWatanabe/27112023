package exJ2;
import java.util.*;
public class atividade17 {
   public static void main(String[] args) {
        try {
            Scanner scnLargura = new Scanner(System.in);
            System.out.println("Digite a largura");
            Double largura = scnLargura.nextDouble();

            Scanner scnAltura = new Scanner(System.in);
            System.out.println("Digite a Altura");
            Double altura = scnAltura.nextDouble();

            System.out.println("O total de metros quadrados é: " + (largura * altura));

            scnLargura.close();
            scnAltura.close();
        } catch (InputMismatchException e) {
            System.out.println("Ops! Ocorreu o erro: " + e);
        }
    }
}
