package ca.mcmaster.cas.se2aa4.a3.island.tiles;

import ca.mcmaster.cas.se2aa4.a2.io.Structs;

public class RainForest {


    private final int red, green, blue;

    public RainForest(){
        this.red = 66;
        this.green = 125;
        this.blue = 25;
    }
    public Structs.Property setColourCode(){
        String colorCode = red + "," + green + "," + blue;
        Structs.Property color = Structs.Property.newBuilder().setKey("rgb_color").setValue(colorCode).build();
        return color;
    }
}
