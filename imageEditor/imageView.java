package imageEditor;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class imageView {
    public static void main(String[] args) {
        File fileinput = new File("abc.jpg");
        try {
            BufferedImage inputImage = ImageIO.read(fileinput);
            //printPixelValues(inputImage);
            //BufferedImage grayScale = convertToGrayScale(inputImage);
            BufferedImage fullBright = fullBrightness(inputImage);

            File fullBrightimg = new File("fullBrightimg.jpg");
            ImageIO.write(fullBright,"jpg", fullBrightimg);

            
        } catch (IOException e) {
                e.printStackTrace();
        }

    }
    public static void printPixelValues(BufferedImage image){
        int height = image.getHeight();        
        int width = image.getHeight();

        for (int i = 0;i<height;i++){
            for(int j = 0; j<width;j++){
                // System.out.print(image.getRGB(i, j)+" ");
                Color pixel = new Color(image.getRGB(j, i));
                System.out.print(pixel.getRed()+" "+pixel.getBlue()+" "+pixel.getGreen()+" ");
            }
            System.out.println();
        }
    }
    public static BufferedImage convertToGrayScale(BufferedImage image){
        int height = image.getHeight();        
        int width = image.getWidth();

        BufferedImage outputImage = new BufferedImage(width, height,BufferedImage.TYPE_BYTE_GRAY);
        for(int i = 0; i<height;i++){
            for (int j = 0; j<width;j++){
                outputImage.setRGB(j, i, image.getRGB(j, i));
            }
        }
        return outputImage;

    }
    public static BufferedImage fullBrightness(BufferedImage image,int increase){
        int height = image.getHeight();
        int width = image.getWidth();

        BufferedImage outimage = new BufferedImage(width, height,BufferedImage.TYPE_3BYTE_BGR);

        for (int i = 0; i<height;i++){
            for(int j = 0; j<width;j++){
                Color pixel = new Color(image.getRGB(j, i));
                int red = pixel.getRed();                
                int green = pixel.getGreen();
                int blue = pixel.getBlue();

                red += red*increase/100;
                green += green*increase/100;
                blue += blue*increase/100;
                outimage.setRGB(j, i,);
            }
        }

        return outimage;

    }

}
