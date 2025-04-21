/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите операцию: ");
        System.out.println("1. Сложение ");
        System.out.println("2. Вычитание ");
        System.out.println("3. Уммножение ");
        System.out.println("4. Деление ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int operation = scanner.nextInt();
        System.out.println("Введите второе число ");
    }
    
}
