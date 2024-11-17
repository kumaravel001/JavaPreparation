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

}

class Main
{
    public static void main(String[] args) {
        MyBook newNovel = new MyBook();
        newNovel.setTitle("");
        System.out.println("The title is: "+newNovel.getTitle());
    }
}
