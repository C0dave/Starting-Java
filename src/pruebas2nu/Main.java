/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas2nu;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Arces
 */

//Clases

public class Main {
  /*  
    int x;
    int y = 3;
    
    String fname = "Alejandro";
    String fname2 = "Arce";
    int age = 13;
    
    static void Method() {
     System.out.println("Hoba");
     
     
}
    public void speed(int maxspeed){
        System.out.println("La velocidad maxima es: " + maxspeed);
    }
    
    
    public static void main(String[] args) {
    Main myObj = new Main();

    myObj.x = 60;
    myObj.x += 40;
    System.out.println(myObj.x);
    System.out.println(myObj.y);
    System.out.println("Mi nombre es " + myObj.fname + " mi apellido es " + myObj.fname2 +" y mi edad es "+ myObj.age);
    Method();
    myObj.speed(200);
  }

  
    public class Person {
  private String name; 

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    this.name = newName;
    
    public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); 
    System.out.println(myObj.getName());


public class MyClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
}
class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.honk();
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
 
//Inicie aqui    
    
class animal {
public void animalsounds(){
System.out.println("El animal hace un sonido");   
  }
}
class pig extends animal {
public void pig (){
System.out.println("El cerdo hace: oink oink");
 }
} 
 class Dog extends animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
class MaIn {
public static void Mani(String[]args) {
   animal Myanimal = new animal();
   animal MyPig = new pig();
   animal MyDog = new Dog();
   Myanimal.animalsounds();
   MyPig.animalsounds();    
   MyDog.animalsounds();   
} 
}
class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}
  abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}
class Pig2 extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}
class Mai {
  public static void main(String[] args) {
    Pig2 myPig2 = new Pig2(); 
    myPig2.animalSound();
    myPig2.sleep();
  }
}    

 interface FirstInterface {
  public void myMethod(); 
}
interface SecondInterface {
  public void myOtherMethod(); 
}
class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("udsnaio");
  }
  public void myOtherMethod() {
    System.out.println("Ssmdip");
  }
}
class Main5 {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
 
  enum Level {
  LOW,
  MEDIUM,
  HIGH
}
public class Main23 {
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;

    switch(myVar) {
      case LOW:
        System.out.println("Bajo nivel");
        break;
      case MEDIUM:
         System.out.println("Medio nivel");
        break;
      case HIGH:
        System.out.println("ALto nivel");
        break;
    }
  }
}  
    
class JSX {
    public static void jska(){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nname = myobj.nextLine();
        System.out.println(nname);
    }
}   
public class alksnlc {
  public static void main(String[] args) {
    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);
  }
}
   
    
  public class Main234 {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
  }
}  
public class sde {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}  
 public class Main7 {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}  
 */
public class Main98 {
  public static void main98768(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
  }
}
public class Main0 {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
public class Main6 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();
    while(it.hasNext()) {
      Integer i = it.next();
      if(i < 10) {
        it.remove();
      }
    }
    System.out.println(numbers);
  }
}
public class Mint {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
  }
}   
public class ujajaja {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visita W3Schools!");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Partida encontrada");
    } else {
      System.out.println("Partida no encontrada");
    }
  }
}
public class Main54 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } );
  }
}

}




















