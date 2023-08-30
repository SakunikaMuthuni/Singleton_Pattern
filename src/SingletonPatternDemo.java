public class SingletonPatternDemo {
    public static void main(String[] args){
        //getting SingletonObject instance
        SingleObject object1=SingleObject.getInstance();
        SingleObject object2=SingleObject.getInstance();

        //SingleObject ob1=new SingleObject();
        //Compile Error SingletonObject has private access

        //check the both instance are same
        System.out.print("The both Instance are Same? :");
        System.out.println(object1==object2);

        //call a method from a SingletonObject instance
        object1.doSomething();

    }
}
