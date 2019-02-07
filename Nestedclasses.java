package nestedclasses;

public class Nestedclasses {

    public static void main(String[] args) {
        A tmp =new A();
    }
    
}

class A
{
    A()
    { System.out.println("ı am from outer class A");
    }
    class B
    {
        B(){
            System.out.println("ı am from inner class");
            tmp =5;
        }
    }
    
    private int tmp;
    
    
    
}


