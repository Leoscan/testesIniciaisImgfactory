package Main;

import resize.Resize;

public class TesteResize {

	public static void main(String[] args) {
		String Imagem = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/800x729.jpg";
		String Resultado1 = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/500x400.jpg";
		String Resultado2 = "/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/500x400.png";
		int altura = 500;
		int largura = 400;
		//String srcImg, String SalvarEm, int Altura, int Largura
		Resize.redimensionar(Imagem, Resultado1, altura, largura);
		Resize.redimensionar(Imagem, Resultado2, altura, largura);

	}

}
