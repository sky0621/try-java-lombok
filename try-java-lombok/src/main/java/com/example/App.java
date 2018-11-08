package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Book b = new Book();
        b.setId(1);
        b.setName("マイクロサービスアーキテクチャ");
        System.out.println(b.getName());
    }
}
