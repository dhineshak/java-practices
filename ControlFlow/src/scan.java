class grandparent{
    grandparent(){
        System.out.println("cons1");
    }
    public void disp(){
        System.out.println("1");
    }
}
class parent extends grandparent{
    parent(){
        System.out.println("cons2");
    }
    public void disp1()
    {
        System.out.println("2");
    }
}

public class scan extends parent{
    scan(){
        System.out.println("cons3");
    }

    public void disp()
    {

        System.out.println("3");

    }
    public static void main(String[] args) {
        parent obj1=new scan();
        grandparent obj2=new parent();
        obj2.disp();
//       scan obj=new scan();
//       obj.disp();
    }

}
