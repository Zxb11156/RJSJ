package 作业.作业2_1;

public abstract class Picture {
    private APP app;

    public Picture(APP app) {
        this.app = app;
    }

    void cutout() {
        this.app.cutout();
    }
    void blur() {
        this.app.blur();
    }
    void sharpen() {
        this.app.sharpen();
    }
    void texlure() {
        this.app.texlure();
    }
}
