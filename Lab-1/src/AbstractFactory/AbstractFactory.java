package AbstractFactory;

import Builder.Phone;
import Builder.PhoneBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractFactory {
    public static Map<String, Phone> prototype = new HashMap<>();
    public static List<Phone> prototypes = new ArrayList<>();

    public static Phone getPrototype(String manufacturer) {
        try {
            return prototype.get(manufacturer).clone();
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void setNewPrototype(String manufacturer) {
        try {
            prototypes.add(prototype.get(manufacturer).clone());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public abstract PhoneBuilder getBuilder(String osType);
}


