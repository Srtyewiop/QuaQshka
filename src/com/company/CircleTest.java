package com.company;

import java.time.Year;

class Circle{
    float length;
    float diameter;
    float surface;
    float pi = 3.1415f;
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
        this.diameter = length/pi;
        this.surface = pi*(0.5f * diameter)* (0.5f * diameter);
        System.out.printf("Now length of this circle is %f",length);
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
        this.length = pi * diameter;
        this.surface = pi*(0.5f * diameter)* (0.5f * diameter);
        System.out.printf("Now diameter of this circle is %f",diameter);
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
        this.diameter = (float) (2*Math.sqrt(surface/pi));
        this.length = pi * diameter;
        System.out.printf("Now surface of this circle is %f",surface);
    }
}

class Book{
    String name;
    int pages;
    int year;
    String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String name, int pages, int year, String author) {
        this.name = name;
        this.pages = pages;
        this.year = year;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

   public void ShowStats(){
        System.out.println();
       System.out.print("Name of the book: ");
       System.out.println(name);
        System.out.print("Author of the book: ");
        System.out.println(author);
        System.out.print("Year of the book's creation: ");
        System.out.println(year);
        System.out.print("Number of pages in the book: ");
        System.out.println(pages);
   }
}

class Head{

    String type = "Head";
    float health = 100.f;

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public String getType() {
        return type;
    }
}
class Hand{
    String type;
    boolean Left;

    public Hand(boolean left) {
        Left = left;
        if (Left){
            type = "Left Hand";
        } else {
            type = "Right Hand";
        }
    }

    float health = 100.f;
    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }
    public String getType() {
        return type;
    }
}
class Leg{
    String type;
    boolean Left;

    public Leg(boolean left) {
        Left = left;
        if (Left){
            type = "Left Leg";
        } else {
            type = "Right Leg";
        }
    }

    float health = 100.f;
    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }
    public String getType() {
        return type;
    }
}
class Body{
    String type = "Body";
    float health = 100.f;
    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }
    public String getType() {
        return type;
    }
}

class Human{
    public Human(String name) {
        this.name = name;
    }

    String name;
   Head mainHead = new Head();
   Hand leftHand = new Hand(true);
   Hand rightHand = new Hand(false);
   Body mainBody = new Body();
   Leg rightLeg = new Leg(false);
   Leg leftLeg = new Leg(true);
   boolean bFine = true;

   void CheckHealth(){
       System.out.printf("State of %s's %s is (%f)",this.name,mainHead.getType(),mainHead.getHealth());
       if(mainHead.getHealth() < 100.f){bFine = false;};
       System.out.println();
       System.out.printf("State of %s's %s is (%f)",this.name,mainBody.getType(),mainBody.getHealth());
       if(mainBody.getHealth() < 100.f){bFine = false;};
       System.out.println();
       System.out.printf("State of %s's %s is (%f)",this.name,leftHand.getType(),leftHand.getHealth());
       if(leftHand.getHealth() < 100.f){bFine = false;};
       System.out.println();
       System.out.printf("State of %s's %s is (%f)",this.name,rightHand.getType(),rightHand.getHealth());
       if(rightHand.getHealth() < 100.f){bFine = false;};
       System.out.println();
       System.out.printf("State of %s's %s is (%f)",this.name,leftLeg.getType(),leftLeg.getHealth());
       if(leftLeg.getHealth() < 100.f){bFine = false;};
       System.out.println();
       System.out.printf("State of %s's %s is (%f)",this.name,rightLeg.getType(),rightLeg.getHealth());
       if(rightLeg.getHealth() < 100.f){bFine = false;};
       System.out.println();
       if(bFine){
           System.out.printf("%s's total state is fine!",this.name);
       }else {
           System.out.printf("%s's total state is not fine!",this.name);
       }
       System.out.println();

    }
}


public class CircleTest {

    public static void main(String[] args) {
	Circle New = new Circle();
	New.setDiameter(15.f);
	System.out.println();
    Human John = new Human("John");
    John.CheckHealth();
    Book HP = new Book("Harry Potter", 300,2001,"Johan Rowling");
    HP.ShowStats();

    }
}
