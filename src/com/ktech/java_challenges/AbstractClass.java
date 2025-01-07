package com.ktech.java_challenges;

public abstract class  AbstractClass {
    String title;
    public String getTitle()
    {
        return title;
    }

    public  abstract void setTitle(String title);
}

class MyBook extends AbstractClass
{
    @Override
    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "{"+title+"}";
    }

}

class Main
{
    public static void main(String[] args) {
        MyBook newNovel = new MyBook();
        newNovel.setTitle("A tale of two cities");
        System.out.println(newNovel);
    }
}
