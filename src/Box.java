
class Box {
    private int  length,breadth,height;
    public void setDimension(int l,int b,int h)
    {
      length=l;
      breadth=b;
      height=h;  
    }
    public void showDimension()
    {
        System.out.println("lenghth is "+length);
        System.out.println("Breadth is "+breadth);
        System.out.println("Height is "+height);
    }
}
class Example
{
    public static void main(String[]args)
     {
      Box b=new Box();
      b.setDimension(12,10,5);
      b.showDimension();
     }
}