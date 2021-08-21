/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraaumento;

import java.util.Scanner;

/**
 *
 * @author warlen
 */
public class CalculadoraAumento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salario, salario_com_aumento, valor_do_aumento = 1.153;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: ");
        salario = leitor.nextDouble();
        
        salario_com_aumento = salario * valor_do_aumento;
        System.out.println("O valor do novo salário é: " + salario_com_aumento);
        leitor.close();
    }
    
}
