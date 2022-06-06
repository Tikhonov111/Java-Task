package factory_method.common;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) {
        try {
            ImageReader imageReader = null;
            if (type.equals(ImageTypes.BMP)) {

                imageReader = new BmpReader();
                System.out.println("Это BMP формат");
            } else if (type.equals(ImageTypes.JPG)) {
                imageReader = new JpgReader();
                System.out.println("Это JPG формат");

            } else if (type.equals(ImageTypes.PNG)) {
                imageReader = new PngReader();
                System.out.println(" ЭТо Png формат");
            }
            return imageReader;
        } catch (IllegalArgumentException e) {
            System.out.println("Неизвестный тип картинки");
            return null;
        }
    }
}

