package Pdv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Regra3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double total, desconto, totalDesconto, valorPago, troco;
		double x, y, valor;

		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");

		System.out.println("PDV");
		System.out.println("Valor total: ");
		total = teclado.nextDouble();
		
		System.out.println("Desconto % : ");
		desconto = teclado.nextDouble();
	
		totalDesconto = total - (desconto * total) / 100;
		
		System.out.println("Total com desconto: R$ " + formatador.format(totalDesconto));
	
		System.out.println("____________________");
		System.out.print("Valor pago em dinheiro: ");
		valorPago = teclado.nextDouble();
		
		troco = valorPago - totalDesconto;
		
		System.out.println("Troco: R$ "+ formatador.format(troco));
		teclado.close();
		
		
	}

}
