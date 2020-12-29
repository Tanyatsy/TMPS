# Topic: *Lab3: Behavioral Design Patterns*
------
## Description :
Behavioral design patterns, which I have used :

   * Chain of Responsibility
   * Iterator
   * Observer

   In this project I've implemented 3 behavioral design patterns. I have extended my project with "Observer" app. 
   Behavioral design patterns helped me to effective communication between many entities of a the app.

## Theory :

Behavioral Patterns are concerned with providing solutions regarding object interaction - how they communicate,
how are some dependent on others,
and how to segregate them to be both dependent and independent and provide both flexibility
and testing capabilities.

## Implementation :
 **Chain of Responsibility**
 
 The Chain of Responsibility pattern is widely used.
 It defines a chain of objects, that collectively, one after another, process the request - where each processor in the chain has its own processing logic.
 So when we build a phone, each part has its own logic.
 
 Below you can see how the Chain of Responsibility pattern is implemented by classes:
 ![](/DesignPatterns/screenshots/Chain.png)
 
 I have implemented PhoneBuilderResponsibility.java class in order to prioritize all features of the phone implementation.
  ~~~
       public static int MANUFACTURER = 1;
       public static int BACK_PANEL = 2;
       public static int FRONT_PANEL = 3;
       public static int OS_TYPE = 4;
       public static int CAMERA = 5;
       public static int DRIVERS = 6;
  ~~~

  This abstract class contains authority levels
  So, implementation of manufacturer has more highly priority than the driver installation.
  Each of these phone parts provide their own processing logic.
  
  
  **Iterator**
  
The Iterator pattern is used as the core pattern of Java's Collection Framework. It's used to access the members of collections all the while hiding the underlying implementation.   

Below you can see how the Iterator is implemented by classes:
 
 ![](/DesignPatterns/screenshots/Iterator.png)
 
This iterator will be stored in a container of sorts. In our case, a work Section.java interface:
 ~~~
   public Iterator getIterator(String[] models);
 ~~~
In order to iterate some array of needed products ot phone models I have used this logic:
 ~~~
    @Override
       public Iterator getIterator(String[] models) {
           return new ModelIterator(models);
       }
   
       private class ModelIterator implements Iterator {
           int index;
           private String[] models;
   
           ModelIterator(String [] models){
               this.models = models;
           }
   
           @Override
           public boolean hasNext() {
               if(index < models.length) {
                   return true;
               }
               return false;
           }
   
           @Override
           public Object next() {
               if(this.hasNext()) {
                   return models[index++];
               }
               return null;
           }
       }
 ~~~

 **Observer**
 
The Observer pattern is used to monitor the state of a certain object, often in a group or one-to-many relationship. In such cases, most of the time, the changed state of a single object can affect the state of the rest, so there must be a system to note the change and alert the other objects.
 
 Below you can see how the Observer is implemented by classes:
  
  ![](/DesignPatterns/screenshots/Observer.png)
  
To illustrate this pattern via client -> worker flow implementation:
So, when the product has state "not ready" we know not only worker state, but and the client state, because they are dependent of each other.
~~~
public Client(Phone phone) {
        this.phone = phone;
        this.phone.attach(this);
    }

    @Override
    public void update() {
        System.out.println("\n~~~~~~Observer status~~~~~~");
        if(this.phone.getState().equalsIgnoreCase("ready for sell")) {
            System.out.println("\nClient is happy with finished phone!\n");
        } else if(this.phone.getState().equalsIgnoreCase("not ready")){
            System.out.println("Client is unhappy with finished phone!\n");
        } else if(this.phone.getState().equalsIgnoreCase("ready to test")){
            System.out.println("Client is ready for testing his phone!\n");
        }
    }
~~~


## Output :

   Below you can see how the output of my program:
  
  ![](/DesignPatterns/screenshots/Lab3Output1.png)
  ![](/DesignPatterns/screenshots/Lab3Output2.png)