/**
 * Created by ruhul on 11/6/16.
 */
public class FactoryMain {

    public static void main(String args[]){
        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS os = operatingSystemFactory.getInstance("powerful");
        os.specification();
    }
}
