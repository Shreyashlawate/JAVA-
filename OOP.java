package JAVADSA;
import bank.Bank;



//class Pen{
//    String color;
//    String type;
//    public  void write(){
//        System.out.println("writing something");
//    }
//    public void PrintColour(){
//        System.out.println(this.color);
//        System.out.println(this.type);
//    }
//        }
//        class Student{
//    String name;
//    int rollno;
//    int dob;
//
//    public void PrintStudInfo(){
//        System.out.println(this.name);
//        System.out.println(this.rollno);
//        System.out.println(this.dob);
//    }
   //Constructors
//    Student(String name,int rollno,int dob){
//        this.name=name;
//        this.rollno=rollno;
//        this.dob=dob;

  //  }//This was for Copy constructor
//    Student(Student s2){
//        this.name=s2.name;
//        this.rollno=s2.rollno;
//        this.dob=s2.dob;
//    }
    //Student(){



     //   }
//class Student{
//    String name;
//    int age;
//    public void printinfo(String name){
//        System.out.println(name);
//    }
//    public void printinfo(int age){
//        System.out.println(age);
//    }
//    public void printinfo(String name,int age){
//        System.out.println(name+" "+age);
//    }
//     }
//public class JAVADSA.OOP {
//    public static void main(String args[]) {
////        Pen pen1=new Pen();
////        pen1.color="blue";
////        pen1.type= "Gel";
////
////        Pen pen2=new Pen();
////        pen2.color="Black";
////        pen2.type="Gel";
////
////        pen1.PrintColour();
////        pen2.PrintColour();
//
//        Student shreyash=new Student();
//        shreyash.name="Shreyash";
//        shreyash.rollno=43;
//        shreyash.dob=882003;
//        Student s2=new Student(shreyash);
//
//
//        s2.PrintStudInfo();
//    }
//}
//}
//    POLYMORPHISM
//     class Student {
//         String name;
//         int age;
//
//
//
//
//    public void Printinfo(int age){
//        System.out.println(age);
//    }
//    public void Printinfo(String name,int age){
//        System.out.println(name+ " "+age);
//    }
//}
//public class JAVADSA.OOP{
//    public void main(String[] args) {
//        Student s1 =new Student();
//        s1.name="Shreyash";
//        s1.age=21;
//        s1.Printinfo(s1.age);
//
//    }
//}
//public static void main(String[] args) {
//    Student s1 =new Student();
//    s1.name="Shreyash";
//    s1.age=21;
//    s1.printinfo(s1.age);
//    s1.printinfo(s1.name);

//}  //INHERITANCE
//
//Singlelevel inheritance
//class Shape{
//    public void area(){
//        System.out.println("Displays area");
//    }
//}
//class Triangle  extends Shape{
//      public void area(int l,int h){
//          System.out.println(1/2*l*h);
//      }
//}
//Multilevel Inheritance
//class EquilateralTriangle extends JAVADSA.Triangle{
//   public void area(int l,int h){
//    System.out.println(1/2*l*h);
//
//}
//}

//hierarchial Inheritance
//class Circle extends JAVADSA.Shape {
//    public void area(int r){
//        System.out.println((3.14)*r*r);
//    }
//}
// abstract class Animal{
//    abstract void walk();
//    public void eat(){
//        System.out.println("Animal eats");
//    }
//
//
//}
//class Horse extends Animal{
//    public void walk(){
//        System.out.println("Walks on 4 legs");
//
//    }
//}
//class Chicken extends Animal{
//    public void walk(){
//        System.out.println("Walks on 2 legs");
//
//    }
//}

//Interfaces
interface Animal{
     void walk();
}
//Multiple interfaces
interface Herbivore {
    void eats();
}
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("Walks on 4 four legs");
    }
    public void eats(){
        System.out.println("eats only grass");
    }
}

public class OOP{

//    public static void main(String[] args) {
// bank.Account account1=new bank.Account();
// account1.name="customer1";
public static void main(String[] args) {
    Horse horse1=new Horse();
    horse1.walk();
    horse1.eats();
}


    }


