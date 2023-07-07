package 代理模式.L_桥接;

public class BMP extends Picture {
    public BMP(APP app) {
        super(app);
    }

    void cutout() {
        super.cutout();
        System.out.println("BMP格式图片");
    }
    void blur() {
        super.blur();
        System.out.println("BMP格式图片");
    }
    void sharpen() {
        super.sharpen();
        System.out.println("BMP格式图片");
    }
    void texlure() {
        super.texlure();
        System.out.println("BMP格式图片");
    }
}
