package Builder;

public class HomeBuilder {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new GoldHouseBuilder());
        Builder.House house = director.BuildHouse();
        System.out.println(house);
    }
}

class House {
    int windows;
    int doors;
    int walls;
    String style;

    public void setWindows(int windows) {this.windows = windows;}
    public void setDoors(int doors) {this.doors = doors;}
    public void setWalls(int walls) {this.walls = walls;}
    public void setStyle(String style) {this.style = style;}

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", doors=" + doors +
                ", walls=" + walls +
                ", style='" + style + '\'' +
                '}';
    }
}

abstract class HouseBuilder{
    Builder.House house;
    void createHouse(){house = new Builder.House();}

    abstract void buildWindows();
    abstract void buildDoors();
    abstract void buildWalls();
    abstract void buildStyle();

    Builder.House getHouse(){return house;}
}

class WoodHouseBuilder extends Builder.HouseBuilder {
    void buildWindows() {house.setWindows(2);}
    void buildDoors() {house.setDoors(1);}
    void buildWalls() {house.setWalls(4);}
    void buildStyle() {house.setStyle("Regular house");}
}

class StoneHouseBuilder extends Builder.HouseBuilder {
    void buildWindows() {house.setWindows(2);}
    void buildDoors() {house.setDoors(1);}
    void buildWalls() {house.setWalls(4);}
    void buildStyle() {house.setStyle("Small castle");}
}

class GoldHouseBuilder extends Builder.HouseBuilder {
    void buildWindows() {house.setWindows(2);}
    void buildDoors() {house.setDoors(1);}
    void buildWalls() {house.setWalls(4);}
    void buildStyle() {house.setStyle("Palace");}
}

class Director{
    Builder.HouseBuilder builder;
    void setBuilder(Builder.HouseBuilder b){builder = b;}

    Builder.House BuildHouse(){
        builder.createHouse();
        builder.buildWindows();
        builder.buildWalls();
        builder.buildDoors();
        builder.buildStyle();
        Builder.House house = builder.getHouse();
        return house;
    }
}