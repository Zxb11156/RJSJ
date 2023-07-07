package 作业.作业2_2;

public class Facade {
    private AddressBook obj1 = new AddressBook();
    private Note obj2 = new Note();
    private Photograph obj3 = new Photograph();
    private Music obj4 = new Music();

    public void method() {
        obj1.method();
        obj2.method();
        obj3.method();
        obj4.method();
    }
}
