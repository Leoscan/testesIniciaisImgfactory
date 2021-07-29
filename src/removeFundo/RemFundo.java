package removeFundo;

import static marvin.MarvinPluginCollection.*;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

import java.awt.Color;

public class RemFundo {
	
	public static void removerFundo(String srcImg, String SalvarEm) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg);
		boundaryFill(image.clone(), image, 0, 0, Color.white, 150);
		image.setAlphaByColor(0, 0xFFFFFFFF);
		alphaBoundary(image, 5);
		MarvinImageIO.saveImage(image, SalvarEm);
	}

}
