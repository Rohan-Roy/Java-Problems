import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewObject implements Cloneable{
    // @Override
    // protected Object clone() throws CloneNotSupportedException{
    //     return super.clone();
    // }

    void show(String str){
        System.out.println(str);
    }
    
    public static void main(String... args){
        NewObject n1 = new NewObject();
        try {
            //option 1
            NewObject n2 = (NewObject) n1.clone();
            n2.show("cloned object");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //option 2
        //java.lang.Class.newInstance() is deprecated
        try {
            NewObject n3 = (NewObject) Class.forName("NewObject").newInstance();
            n3.show("object created using Class.newInstance()");
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //option 3
        Constructor<NewObject> constructor;
        try {
            constructor = NewObject.class.getConstructor();
            NewObject obj = constructor.newInstance();
            obj.show("object created using Constructor.newInstance()");
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}