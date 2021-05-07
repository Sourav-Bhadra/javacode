class out{
    public void Outer(){
        System.out.println("outer class");
    }
}


public class staticProgram {
    static{
        System.out.println("1st print");
    }
    public static void main(String[] args) {
        out o=new out();
        o.Outer();
        System.out.println("last print");
    }
    static{
        System.out.println("2nd print");
    }
    
}
