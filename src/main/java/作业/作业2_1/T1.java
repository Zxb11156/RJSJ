package 作业.作业2_1;

public class T1 implements APP{
    @Override
    public void cutout() {
        System.out.println("使用木刻滤镜");
    }

    @Override
    public void blur() {
        System.out.println("使用模糊滤镜");
    }

    @Override
    public void sharpen() {
        System.out.println("使用锐化滤镜");
    }

    @Override
    public void texlure() {
        System.out.println("使用纹理滤镜");
    }
}
