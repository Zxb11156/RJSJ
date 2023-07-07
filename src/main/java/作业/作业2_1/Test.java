package 作业.作业2_1;

public class Test {

    //桥接模式
    public static void main(String[] args) {
        BMP bmp = new BMP(new T1());
        bmp.texlure();
        bmp.blur();
        bmp.cutout();
        bmp.sharpen();
        System.out.println("---------------------");
        GIF gif = new GIF(new T1());
        gif.blur();
        gif.texlure();
        gif.cutout();
        gif.sharpen();
        System.out.println("---------------------");
        JPG jpg = new JPG(new T1());
        jpg.blur();
        jpg.texlure();
        jpg.cutout();
        jpg.sharpen();
        jpg.cutout();
    }
}
