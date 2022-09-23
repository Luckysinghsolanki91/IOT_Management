package iotproject.smangementforuniversity;
public class Connections {
    
    
    Connections(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
