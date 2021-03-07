package AbstractFactory;

public class Main1 {
    public static void main(String[] args) {
        FurnitureFactory factory = getFurnitureByStyle("Modern");
    }
    private static FurnitureFactory getFurnitureByStyle(String style){
        switch(style){
            case "Victorian":
                System.out.println("Victorian chair has legs");
                System.out.println("Victorian chair has soft seat");
                System.out.println("Chair created!");
                System.out.println("Square Victorian Style Coffee Table \nCoffee table created!");
                System.out.println("Victorian sofa has legs");
                System.out.println("Victorian sofa has soft seat");
                System.out.println("Sofa created!");
                System.out.println("Victorian furniture created!");
                return new VictorianFurnitureFactory();
            case "Modern":
                System.out.println("Modern chair hasn't legs");
                System.out.println("Modern chair has solid seat");
                System.out.println("Chair created!");
                System.out.println("Round Modern Style Coffee Table \nCoffee table created!");
                System.out.println("Modern sofa has legs");
                System.out.println("Modern sofa has soft seat");
                System.out.println("Sofa created!");
                System.out.println("Modern furniture created!");
                return new ModernFurnitureFactory();
            default:
                throw new RuntimeException("Unsupported Style: " + style);
        }
    }
}
interface Chair{
    boolean hasLegs();
    void sitOn();
}

interface CoffeeTable{
    void shape();
}

interface Sofa{
    boolean hasLegs();
    void sitOn();
}

interface FurnitureFactory{
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}

class VictorianChair implements Chair{

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Soft seat");
    }
}
class VictorianCoffeeTable implements CoffeeTable{
    @Override
    public void shape() {
        System.out.println("Square table");
    }
}

class VictorianSofa implements Sofa{

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Soft seat");
    }
}

class ModernChair implements Chair{

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("Solid seat");
    }
}
class ModernCoffeeTable implements CoffeeTable{
    @Override
    public void shape() {
        System.out.println("Round table");
    }
}

class ModernSofa implements Sofa{

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("Solid seat");
    }
}

class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}