# Topic: *Lab1: Creational Design Patterns*
------
## Description :
Creational design patterns, which I have used :

   * Singleton
   * Prototype
   * Builder
   * Factory Method
   * Abstract Factory
   
## Implementation of the programm:
In this project I've implemented 5 creational design patterns in order to create "PhoneFabric" app. Any user can create a phone with individual characteristics. A Phone class contains 5 properties and has *get* and *set* of each methods.
In this directory also is implemnted builder and prototype pattern. Prototype pattern implemented via method called *clone()* which is used to return a clone of the object if it exists in the ArrayList of all phones which contains in _**AbstractFactory**_ class.

The Singleton Pattern is implemented in _**FactoryCreator**_ class. Constructor get possibility of instantiated from _getInstance()_ method which is a static one.

The builder pattern ensures that a program can create different objects by the same creational process.
In my project in order to create phone you should specify some parametrs:
~~~
    private String frontPanel;
    private String backPanel;
    private String manufacturer;
    private String camera;
    private String osType;
~~~
After that depends on "manufacturer" and "osType" the program will create specified product Object with help of _**AbstractFactory**_ class. 

After you have been created yout desired phone you can also create some prototype of it.
