package Main;

import java.io.IOException;

import extensao.Extensao;

public class TesteExtensao {
	
	public static void main(String[] args) throws IOException {
		
	
	String Imagem = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/batmanLimpo.png";
	String Resultado = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/Batmanjpg.jpg";
	
	Extensao.PNGJPG(Imagem, Resultado);
	
	
	String Imagem2 = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/cryptex.jpg";
	String Resultado2 = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/cryptex.bmp";
	
	Extensao.JPGBMP(Imagem2, Resultado2);
	
	String Imagem3 = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/cryptex.bmp";
	String Resultado3 = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/cryptex5.jpg";
	
	Extensao.BMPJPG(Imagem3, Resultado3);
	
	String Imagem4 = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/cryptex.bmp";
	String Resultado4 = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/cryptex633.png";
	
	Extensao.BMPPNG(Imagem4, Resultado4);
	
	
	}

}
