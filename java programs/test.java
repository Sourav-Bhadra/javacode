// // nested inner calss
// class outer{
//     int x=10;
//     class inner{
//         int y =20;
//         public void display(){
//             System.out.println("inner display");
//             System.out.println(x);
//             System.out.println(y+1);
//         }
//     }
//     public void outerDisplay(){
//         inner i = new inner();
//         System.out.println("outer display");
//         i.display();
//         System.out.println(i.y);
//     }
// }


// class test{
//     public static void main(String[] args) {
//         outer o =new outer();
//         o.outerDisplay();
//         outer.inner i = new outer().new inner();
//         i.display();
//     }
// }