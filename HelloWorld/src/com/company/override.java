

class parent {
   public void display() {
       System.out.println("super class");
   }
   public void display(int x) {
       System.out.println("parameterized super class");
   }
   public void display(int x, int y) {
    System.out.println("parameterized super class x and y");
}

    // parent(){
    //     System.out.println("parent constructor");
    // }

    // parent(int x){
    //     System.out.println("parent constructor "+x);
    // }

}

class child extends parent {
    // child() {

    //     System.out.println("parameterized child class with parent class parameterized");
    // }

    // child(int x, int y) {
    //     super(x);
    //     System.out.println("parameterized child class with parent class parameterized "+y);
    // }


   
   public void display(int x, int y) {
       System.out.println("child class");
   }
   public void display(int x){
       System.out.println("parameterized child class "+x);
   }
   public void display(){
    System.out.println("Without parameterized child class ");
}

}


public class override {
    public static void main(String[] args) {
        child s = new child();
        s.display();
    }
}
