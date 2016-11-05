/**
 * Created by ruhul on 11/6/16.
 */
public class OperatingSystemFactory {
    /*
    * the mighty factory method what will return expected instance :D
    * */

    public OS getInstance(String osCharacter){
        if (osCharacter.equals("powerful")){
            return new Android();
        }else if (osCharacter.equals("secure")){
            return new IOS();
        }else {
            return new Windows();
        }
    }
}
