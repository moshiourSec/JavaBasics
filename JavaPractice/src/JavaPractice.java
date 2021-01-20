
import java.lang.reflect.Method;

class A {
    private void display()
    {
        System.out.println("private method is invoked");
    }
}

class JavaPractice{
    public static void main(String[] args)throws Exception{

        Class c = Class.forName("A");
        Object o= c.newInstance();
        Method m =c.getDeclaredMethod("display", null);
        m.setAccessible(true);
        m.invoke(o, null);
        System.out.println("Check new branch");
    }


}
