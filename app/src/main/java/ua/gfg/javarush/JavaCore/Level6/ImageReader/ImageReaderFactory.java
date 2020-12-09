package ua.gfg.javarush.JavaCore.Level6.ImageReader;

import ua.gfg.javarush.JavaCore.Level6.ImageReader.common.BmpReader;
import ua.gfg.javarush.JavaCore.Level6.ImageReader.common.ImageReader;
import ua.gfg.javarush.JavaCore.Level6.ImageReader.common.ImageTypes;
import ua.gfg.javarush.JavaCore.Level6.ImageReader.common.JpgReader;
import ua.gfg.javarush.JavaCore.Level6.ImageReader.common.PngReader;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
        ImageReader imageReader;

        if (imageTypes == ImageTypes.BMP) {
            imageReader = new BmpReader();
        } else if (imageTypes == ImageTypes.JPG) {
            imageReader = new JpgReader();
        } else if (imageTypes == ImageTypes.PNG) {
            imageReader = new PngReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return imageReader;
    }
}
