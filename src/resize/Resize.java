package resize;

import static marvin.MarvinPluginCollection.*;

import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

public class Resize {
	
	
	public static void redimensionar(String srcImg, String SalvarEm, int Altura, int Largura) {
		
		MarvinImage image = MarvinImageIO.loadImage(srcImg);
		scale(image.clone(), image, Altura, Largura); // 500 and 400 are the new width and height.
		MarvinImageIO.saveImage(image, SalvarEm);
	}
}
