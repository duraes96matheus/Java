package PowerPoint;
import java.lang.String;

public class Texto {
	public static void main(String[] args) {
		String xyz = new String("Isto é uma String do Java");
		String str ="Isto é uma String do Java";
	
		if(str == xyz) System.out.println("igual");
		else System.out.println("Diferente");
		
		System.out.println("Tamanho da String "+str.length());
		System.out.println("Substring "+str.substring(0,10));
		System.out.println("caracter na posição 5: "+str.charAt(8)+str.charAt(5) );
		
		//o metódo split quebra a String e varias outras,
		//pelo separador desejado
		
		String[] palavras =str.split("");
		int i = str.indexOf("Uma"); //retorna o indice da palavra na string
		
		if((str.startsWith("Seila")) || str.endsWith("Java") ){
			System.out.println("Igual");
			}
		else {
			System.out.println("Diferente");
		}
		//Testa o começo e o fim da string e retorna Boolean
		
		str = str.trim(); //elimina os espaços em branco no inicio e fim
		System.out.println(str.trim());
		
		str = str.replace('a', '@'); //Substitui os caracteres 
		System.out.println(str.replace('a', '@'));
		
		str = str.replaceAll("String", "Cadeia de caracteres");
		System.out.println(str.replaceAll(str, "java"));
	
	}

}
