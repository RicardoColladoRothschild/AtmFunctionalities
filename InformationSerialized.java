

import java.io.Serializable;
import java.io.*;

public class InformationSerialized{
   private Object oClass;
   //1 = deposit, 2 = widthraw, 3= check balance.
   private int option;
    public InformationSerialized(Object o, int option){
        this.oClass = o;
        this.option = option;
    }

    public void serializar(){

        if(option==1){
           
           
            try{


                    FileOutputStream fos = new FileOutputStream("balance.data");
                    ObjectOutputStream w = new ObjectOutputStream(fos);


            }catch(Exception e){}
            catch(ClassNotFoundException classNotFound){}
        }
    }
}
