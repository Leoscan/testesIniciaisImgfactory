package Main;

import removeFundo.RemFundo;

public class TesteRemFundo {

	public static void main(String[] args) {
		String Imagem1 = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/cryptex.jpg";		
		String Resultado1 = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/limpo.png";
		
		RemFundo.removerFundo(Imagem1, Resultado1);
		
		String Imagem2 = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/batman.jpg";		
		String Resultado2 = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/batmanLimpo.png";
		
		RemFundo.removerFundo(Imagem2, Resultado2);

	}

}
