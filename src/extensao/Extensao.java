package extensao;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

public class Extensao {

	public static void JPGPNG(String srcImg, String SalvarEm) {
		
		MarvinImage image = MarvinImageIO.loadImage(srcImg);		
		MarvinImageIO.saveImage(image, SalvarEm);
	}
	
	public static void PNGJPG(String srcImg, String SalvarEm) {
		
		MarvinImage image = MarvinImageIO.loadImage(srcImg);		
		MarvinImageIO.saveImage(image, SalvarEm);
	}
	
	public static void JPGBMP(String srcImg, String SalvarEm) throws IOException {
		
		File input = new File(srcImg);  

		//Read the file to a BufferedImage  
		BufferedImage image = ImageIO.read(input);

		//Create a file for the output  
		File output = new File(SalvarEm);  

		//Write the image to the destination as a bmp  
		ImageIO.write(image, "bmp", output);
	}
	
	public static void BMPJPG(String srcImg, String SalvarEm) throws IOException {
		File input = new File(srcImg);  

		//Read the file to a BufferedImage  
		BufferedImage image = ImageIO.read(input);

		//Create a file for the output  
		File output = new File(SalvarEm);  

		//Write the image to the destination as a bmp  
		ImageIO.write(image, "jpg", output);
	}
	
	public static void BMPPNG(String srcImg, String SalvarEm) throws IOException {
		File input = new File(srcImg);  

		//Read the file to a BufferedImage  
		BufferedImage image = ImageIO.read(input);

		//Create a file for the output  
		File output = new File(SalvarEm);  

		//Write the image to the destination as a bmp  
		ImageIO.write(image, "png", output);
	}
}
