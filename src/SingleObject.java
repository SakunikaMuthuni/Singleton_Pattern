public class SingleObject {

    //private static instance of the SingletonObject class
    private static SingleObject instance=new SingleObject();

    //Make the default constructor private
    // to prevent other objects from using the new operator with the Singleton class.
    private SingleObject(){
        //setting code here
    }

    //Public static method to provide global access to the Singleton Instance
    public static SingleObject getInstance(){
        return instance;
    }

    //other methods and attributes of the SingletonObject class
    public void doSomething(){
        System.out.println("SingletonObject is doing something");
    }
}
