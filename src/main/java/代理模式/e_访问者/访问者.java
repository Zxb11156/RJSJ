package 代理模式.e_访问者;

import java.util.ArrayList;
import java.util.Iterator;

class Apple implements Product
{
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}

class Book implements Product
{
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}

interface Product
{
    void accept(Visitor visitor);
}

class BuyBasket
{
    private ArrayList list=new ArrayList();

    public void accept(Visitor visitor)
    {
        Iterator i=list.iterator();

        while(i.hasNext())
        {
            ((Product)i.next()).accept(visitor);
        }
    }

    public void addProduct(Product product)
    {
        list.add(product);
    }

    public void removeProduct(Product product)
    {
        list.remove(product);
    }
}

class Customer extends Visitor
{
    public void visit(Apple apple)
    {
        System.out.println("�˿�" + name + "ѡƻ����");
    }

    public void visit(Book book)
    {
        System.out.println("�˿�" + name + "���顣");
    }
}

class Saler extends Visitor
{
    public void visit(Apple apple)
    {
        System.out.println("����Ա" + name + "��ƻ�����ӣ�Ȼ�������۸�");
    }

    public void visit(Book book)
    {
        System.out.println("����Ա" + name + "ֱ�Ӽ�����ļ۸�");
    }
}

abstract class Visitor
{
    protected String name;

    public void setName(String name)
    {
        this.name=name;
    }

    public abstract void visit(Apple apple);

    public abstract void visit(Book book);
}

public class 访问者 {
    public static void main(String[] args) {
        Product b1=new Book();
        Product b2=new Book();
        Product a1=new Apple();
        Visitor visitor = null;

        BuyBasket basket=new BuyBasket();
        basket.addProduct(b1);
        basket.addProduct(b2);
        basket.addProduct(a1);

        basket.accept(visitor);
    }
}
