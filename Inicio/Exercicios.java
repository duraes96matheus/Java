package Exercicios;
import java.lang.String;

public class Exercicios {
	public static void main(String[] args) {
		
		//declare uma varivel que reprensente um numero interio com o valor 10
		
		int i =10,  o =20;
		int resultado = i+o;
		
		System.out.println("Inteiro "+ i);
		System.out.println("resultado "+resultado);

		//declare tres variaveis diferentes e dpos atribua valor a uma delas
		
		String produto =new String ("Cimento");
		int unidade;
		float valor;
		
		unidade = 10;
		valor = 25.00f;
		float preco= unidade *valor;
		
		System.out.printf("O produto "+produto + "Comprado em unidades" +unidade +"Saiu a : "+preco);
		
		//crie uma variavel do tipo int atribuindo um valor a ela, e depois crie uma variavel do tipo 
		//double, atribuindo o valor da primeira variavel criada
		
		int i2 = 125;
		
		double d = i ;
		
		System.out.printf("O valor é "+d);
		
	}
}
