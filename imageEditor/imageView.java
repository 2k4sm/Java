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
            BufferedImage mirror = monochromeImage(inputImage);

            File mirrorImg = new File("mirrorImg1.jpg");
            ImageIO.write(mirror,"jpg", mirrorImg);

            
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
    public static BufferedImage Brightness(BufferedImage image,int brightPercent){
        int height = image.getHeight();
        int width = image.getWidth();
        BufferedImage outputImage = new BufferedImage(width, height,BufferedImage.TYPE_3BYTE_BGR);

        for(int i = 0; i<height;i++){
            for(int j = 0; j<width;j++){
                int rgb = image.getRGB(j,i);
                
                Color color = new Color(rgb);
                int red = color.getRed() + (int)Math.ceil(color.getRed()*(brightPercent/100.0));
                int green=color.getGreen() + (int)Math.ceil(color.getGreen()*(int)Math.ceil(brightPercent/100.0));
                int blue=color.getBlue() + (int)Math.ceil(color.getBlue()*(int)Math.ceil(brightPercent/100.0));
                
                if (red > 255){
                    red = 255;
                }
                 if (green > 255){
                    green = 255;
                }
                 if (blue > 255){
                    blue = 255;
                }
                int bgr = new Color(red,green,blue).getRGB();

                outputImage.setRGB(j,i, bgr);
            }
        }
        return outputImage;

    }
    public static BufferedImage monochromeImage(BufferedImage image){
        int height = image.getHeight();
        int width = image.getWidth();
        BufferedImage outputImage = new BufferedImage(width, height,BufferedImage.TYPE_3BYTE_BGR);

        for(int i = 0; i<height;i++){
            for(int j = 0; j<width;j++){
                int rgb = image.getRGB(j,i);
                
                Color color = new Color(rgb);
                int red = color.getRed();
                int green=color.getGreen();
                int blue=color.getBlue();
                
                int avgCol = (int)Math.ceil((red+green+blue)/3.0);

                int bgr = new Color(avgCol,avgCol,avgCol).getRGB();
                
                outputImage.setRGB(j,i, bgr);
            }
        }
        return outputImage;
    }
    public static BufferedImage mirrorImage(BufferedImage image){
        int imageHeight = image.getHeight();
        int imageWidth = image.getWidth();
        BufferedImage outimage = new BufferedImage(imageWidth,imageHeight,BufferedImage.TYPE_3BYTE_BGR);
        for(int i = 0; i<imageHeight;i++){
            for(int j = 0; j<imageWidth/2;j++){
                outimage.setRGB(imageWidth-1-j,i,image.getRGB(j,i));                
                outimage.setRGB(j,i,image.getRGB(imageWidth-1-j,i));
            }
        }
        return outimage;



    }
    public static BufferedImage rotateImage(BufferedImage image){
        int imageHeight = image.getHeight();
        int imageWidth = image.getWidth();

        BufferedImage outImage = new BufferedImage(imageHeight,imageWidth,BufferedImage.TYPE_3BYTE_BGR);

        for(int i = 0; i<imageWidth;i++){
            for(int j = 0; j<imageHeight;j++){
                
                outImage.setRGB(j, i,image.getRGB(i,j));
                
            }
        }
        outImage = mirrorImage(outImage);

        return outImage;
    }

}
