class Learning
{
    int x;
    private static int y;
    public void f1()
    {
        System.out.println("Instance F1 running");
    }
    public static void f2()
    {
        y=4;
        System.out.println("Static f2 running");
    }
    
}
class Exam
{
    public static void main(String[] args) {
       Learning l=new Learning();
        Learning.f2();
        l.f1();
    }
} 