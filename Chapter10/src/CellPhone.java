import java.io.Serializable;

public class CellPhone implements Serializable {
    private String model; //attribute
    private String brand; //attribute

    public CellPhone(String m, String b){  //default constructor
      model = m;
      brand = b;
    }
    
    public CellPhone(){  //default constructor
        model = "";
        brand = "";
 
      }

    public void printPhone(){ //another method
      System.out.println("You have a " + brand + " " + model);
    }

    public void setModel(String mod){ //setter or mutator
      model = mod;
    }

    public String getModel(){
      return model;
    }

    public void setBrand(String bran){ //setter or mutator
      brand = bran;
    }
}
