package ua.gfg.javarush.JavaCore.Level6.ImageReader;

import ua.gfg.javarush.JavaCore.Level6.ImageReader.common.ImageReader;


// JpgReader PngReader BmpReader   ImageTypes ImageReaderFactory ImageReader  new IllegalArgumentException("Неизвестный тип картинки")

public class FactoryMethodPattern {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(null);
        System.out.println(reader.getClass().getSimpleName());
    }
}


