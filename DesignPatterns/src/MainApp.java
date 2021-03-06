import AbstractFactory.AbstractFactory;
import Adapter.BuilderImplementation;
import Bridge.Accessories;
import Bridge.Headphones;
import Bridge.PhoneAccessories;
import Bridge.Watches;
import Builder.Phone;
import Builder.PhoneBuilder;
import ChainofResponsibility.*;
import Decorator.*;
import Factory.FactoryCreator;
import Iterator.Iterator;
import Iterator.IteratorRepository;
import Observer.Client;
import Observer.Manager;
import Observer.Worker;
import PhonePanels.BackPanels;
import PhonePanels.FrontPanels;
import Proxy.File;
import Proxy.ProxyFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        while (true) {
            try {
                String manufacturer = "";
                Phone phone = new Phone();
                new Client(phone);
                new Manager(phone);
                new Worker(phone);

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("\nEnter the new manufacturer(or the brand) of the desired phone ");
                System.out.println("---> or press enter if you want to EXIT");
                System.out.println("---> ");
                 manufacturer = br.readLine();
                if (manufacturer.length() == 0)
                    break;

                FactoryCreator creator = FactoryCreator.getInstance();
                AbstractFactory phoneFactory = creator.getFactory(manufacturer.toLowerCase());
                if(creator.isUnknown){
                    String[] models = {"apple", "google", "lenovo", "microsoft"};
                    IteratorRepository iteratorRepository = new IteratorRepository();

                    System.out.println("\nEnter smt. from the following list: ");
                    for(Iterator iterator = iteratorRepository.getIterator(models);
                        iterator.hasNext();) {
                        String employee = (String)iterator.next();
                        System.out.println("" + employee);
                    }

                    System.out.println("\n ---> or press enter if you want to EXIT");
                    System.out.println("---> ");
                     manufacturer = br.readLine();
                    if (manufacturer.length() == 0)
                        break;
                     creator = FactoryCreator.getInstance();
                     phoneFactory = creator.getFactory(manufacturer.toLowerCase());
                }

                if (AbstractFactory.prototypes.isEmpty())
                    System.out.println("new prototype");

                phone.setState("not ready");

                BackPanels[] possibleValuesBackPanel = BackPanels.values();
                System.out.println("\nEnter the back panel material of your phone(for example: " + Arrays.toString(possibleValuesBackPanel) + ") ");
                System.out.println("---> ");
                String backPanel = br.readLine();
                FrontPanels[] possibleValuesFrontPanel = FrontPanels.values();
                System.out.println("\nEnter the front panel material of your phone(for example: " + Arrays.toString(possibleValuesFrontPanel) + ") ");
                System.out.println("---> ");
                String frontPanel = br.readLine();
                System.out.println("\nEnter the os type of the phone: ");
                System.out.println("---> ");
                String osType = br.readLine();
                while (phoneFactory.getBuilder(osType.toLowerCase()) == null) {
                    System.out.println("enter one more time: ");
                    osType = br.readLine();
                }
                System.out.println("\nEnter the camera resolution of the current phone: ");
                System.out.println("---> ");
                String resolution = br.readLine();

                PhoneBuilderResponsibility phoneBuilderResponsibility = getChainOfPhoneComponents();
                phoneBuilderResponsibility.buildPhone(PhoneBuilderResponsibility.MANUFACTURER, "manufacturer - " + manufacturer);
                System.out.println();
                phoneBuilderResponsibility.buildPhone(PhoneBuilderResponsibility.BACK_PANEL,"back panel - " + backPanel);
                System.out.println();
                phoneBuilderResponsibility.buildPhone(PhoneBuilderResponsibility.FRONT_PANEL, "front panel - " +frontPanel);
                System.out.println();
                phoneBuilderResponsibility.buildPhone(PhoneBuilderResponsibility.OS_TYPE,"os - " + osType);
                System.out.println();
                phoneBuilderResponsibility.buildPhone(PhoneBuilderResponsibility.CAMERA, "camera - " + resolution);
                System.out.println();
                phoneBuilderResponsibility.buildPhone(PhoneBuilderResponsibility.DRIVERS, "");
                System.out.println();

                PhoneBuilder builder = phoneFactory.getBuilder(osType.toLowerCase());
                builder.addFrontPanel(frontPanel);
                builder.addBackPanel(backPanel);
                builder.addManufacturer(manufacturer);
                builder.addOsType(osType);
                builder.addCamera(resolution);
                AbstractFactory.prototype.put(manufacturer.toLowerCase(), builder.getPhone());
                System.out.println(builder.getInfoAboutOsType());

                phone.setState("ready to test");

                System.out.println("\nDo you want tablet phone or phone with buttons ?");
                System.out.println("---> ");
                String phoneType = br.readLine();

                BuilderImplementation builderImpl = new BuilderImplementation();
                builderImpl.buildPhone(phoneType, osType);

                System.out.println("\nDo you want add some accessories widget for your phone: watches or headphones ?");
                System.out.println("---> ");
                String accessoriesType = br.readLine();

                Accessories watches = new PhoneAccessories(accessoriesType,manufacturer, new Watches());
                Accessories headPhones = new PhoneAccessories(accessoriesType,manufacturer, new Headphones());
                if(accessoriesType.equalsIgnoreCase("watches"))
                    watches.showWidget();
                else if(accessoriesType.equalsIgnoreCase("headphones"))
                    headPhones.showWidget();

                System.out.println("\nDo you want add some files in your phone: please write a file ?");
                System.out.println("---> ");
                String fileName = br.readLine();
                if (fileName.length() == 0)
                    break;
                File file = new ProxyFile(fileName);
                file.printName();
                while (true) {
                    System.out.println("\nIn order to see file name write ~print name~");
                    System.out.println("---> ");
                    String fileAction = br.readLine();
                    if (fileAction.length() == 0)
                        break;
                    if(fileAction.equalsIgnoreCase("print name")){
                        file.printName();
                    }
                }

                System.out.println("\nDo you want add some color of the  phone? please choose between:\n lavender\n black\n white");
                System.out.println("---> ");
                String phoneColor = br.readLine();
                switch (phoneColor){
                    case "lavender":
                        IPhone lavenderPhone = new LavenderPhone(new SimplePhone());
                        lavenderPhone.colorAssemble();
                        break;
                    case "white":
                        IPhone whitePhone = new WhitePhone(new SimplePhone());
                        whitePhone.colorAssemble();
                        break;
                    case"black":
                        IPhone blackPhone = new BlackPhone(new SimplePhone());
                        blackPhone.colorAssemble();
                        break;
                }

                phone.setState("ready for sell");

                System.out.println("\nDo you want create a prototype(Answer true or false)");
                System.out.println("---> ");
                boolean isYesToCreatePrototype = Boolean.parseBoolean(br.readLine());
                if (isYesToCreatePrototype && AbstractFactory.prototype.size() != 0) {
                    createPrototype(manufacturer, backPanel, frontPanel, osType, resolution);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void createPrototype(String manufacturer, String backPanel, String frontPanel, String osType, String resolution) {
        Phone prototype = AbstractFactory.getPrototype(manufacturer.toLowerCase());
        System.out.println("Prototype successfully created!");
        prototype.setBackPanel(backPanel);
        prototype.setFrontPanel(frontPanel);
        prototype.setOsType(osType);
        prototype.setCamera(resolution);
        AbstractFactory.setNewPrototype(manufacturer.toLowerCase());
        for (Phone phone : AbstractFactory.prototypes) {
            System.out.println(phone.toString());
        }
    }

    private static PhoneBuilderResponsibility getChainOfPhoneComponents() {
        PhoneBuilderResponsibility manufacturer = new Manufacturer(PhoneBuilderResponsibility.MANUFACTURER);
        PhoneBuilderResponsibility backPanel = new BackPanel(PhoneBuilderResponsibility.BACK_PANEL);
        PhoneBuilderResponsibility frontPanel = new FrontPanel(PhoneBuilderResponsibility.FRONT_PANEL);
        PhoneBuilderResponsibility osType = new OSType(PhoneBuilderResponsibility.OS_TYPE);
        PhoneBuilderResponsibility camera = new Camera(PhoneBuilderResponsibility.CAMERA);
        PhoneBuilderResponsibility drivers = new Drivers(PhoneBuilderResponsibility.DRIVERS);


        manufacturer.setNextPhoneBuilderResponsibility(backPanel);
        backPanel.setNextPhoneBuilderResponsibility(frontPanel);
        frontPanel.setNextPhoneBuilderResponsibility(osType);
        osType.setNextPhoneBuilderResponsibility(camera);
        camera.setNextPhoneBuilderResponsibility(drivers);

        return manufacturer;
    }
}

