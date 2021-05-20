class B{
    public void disp(){
        System.out.println("123");
    }
}
public class Sample {
    public static void main(String[] args) {
        B obj=new B(){

//            public  void disp(){
//                System.out.println("asd");
//            }
        };
        obj.disp();
    }
}
