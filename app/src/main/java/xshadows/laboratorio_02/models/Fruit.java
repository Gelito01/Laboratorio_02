package xshadows.laboratorio_02.models;

public class Fruit {
private String name;
private int icon;
private  String origin;

public  Fruit(){}

public  Fruit(String name, int  icon, String origin){
    this.name=name;
    this.icon=icon;
    this.origin=origin;
}

    public String getName() {
        return name;
    }

    public int getIcon() {
        return icon;
    }

    public String getOrigin() {
        return origin;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}




