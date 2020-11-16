# Topic: *Lab2: Structural Design Patterns*
------
## Description :
Structural design patterns, which I have used :

   * Adapter
   * Bridge
   * Proxy
   * Decorator
   
   In this project I've implemented 4 structural design patterns. I have extended my project with "PhoneFabric" app. 
   Structural design patterns helped me to divide and structure many features of a the app.

## Theory :

Structural design patterns are concerned with how classes and objects can be composed, to form larger structures.

The structural design patterns simplifies the structure by identifying the relationships.

These patterns focus on, how the classes inherit from each other and how they are composed from other classes.

## Implementation :
 **Adapter**
 
 An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. An Adapter wraps an existing class with a new interface so that it becomes compatible with the client’s interface.
 
 Below you can see how the Adapter is implemented by classes:
 
 ![](/DesignPatterns/screenshots/Adapter.png)
  ~~~
    public String buildPhoneWithButtons(String osType);
    public String buildTabletPhone(String osType);
  ~~~
    
  These two interfaces are unrelated. Yes, they share the theme, but they're unrelated as far as code is concerned.
  At this point, I've implemented Adapter class.
  
  
  **Bridge**
  
  Bridge is a structural design pattern that divides business logic or huge class into separate class hierarchies that can be developed independently.
   
  Below you can see how the Bridge is implemented by classes:
 
 ![](/DesignPatterns/screenshots/Bridge.png)
 
 A bridge class(PhoneAccessories class) is created that segregates the abstract Accessories class from its implementation:
 ~~~
  public class PhoneAccessories extends Accessories{
     String nameOfWidget;
     String brand;
     
     public PhoneAccessories(String nameOfWidget, String brand, Widgets widgets) {
         super(widgets);
         this.nameOfWidget = nameOfWidget;
         this.brand = brand;
     }
 
     @Override
     public void showWidget() {
       widgets.showWidget(nameOfWidget, brand);
       }
    }
~~~

 **Proxy**
 
 The Proxy pattern allows us to create an intermediary that acts as an interface to another resource, while also hiding the underlying complexity of the component.
 
   Below you can see how the Proxy is implemented by classes:
  
  ![](/DesignPatterns/screenshots/Proxy.png)
  
 I've define a common interface for the original and proxy class:
 ~~~
public interface File {
    void printName();
    void printType();
}

public class ProxyFile implements File {
    private FileImpl file;

    private String fileName;
    private String fileType;

    public ProxyFile(String fileName) {
        this.fileName = fileName;
        this.fileType = fileName.substring(fileName.lastIndexOf(".") + 1);
    }


    @Override
    public void printName() {
        if (file == null) {
            file = new FileImpl(fileName, fileType);
        } else {
            file.printName();
        }
    }

    @Override
    public void printType() {
        if (file == null) {
            file = new FileImpl(fileName, fileType);
        } else {
            file.printType();
        }
    }
}
~~~

 **Decorator**
 
 A Decorator pattern can be used to attach additional responsibilities to an object either statically or dynamically. A Decorator provides an enhanced interface to the original object.
 
 
   Below you can see how the Decorator is implemented by classes:
  
  ![](/DesignPatterns/screenshots/Decorator.png)
  
   I've implemented Iphone interface, I'll define a Simple Phone class which I will, using the Decorator pattern, make susceptible to change during runtime:
   
 ~~~
public class SimplePhone implements IPhone {
    @Override
    public void colorAssemble() {
        System.out.println("It is basic phone!");
    }
}

public abstract class PhoneDecorator implements IPhone {
    IPhone iPhone;

    public PhoneDecorator(IPhone iPhone) {
        this.iPhone = iPhone;
    }

    @Override
    public void colorAssemble() {
        this.iPhone.colorAssemble();
    }
}
~~~

## Output :

   Below you can see how the output of my program:
  
  ![](/DesignPatterns/screenshots/MainOutput.png)