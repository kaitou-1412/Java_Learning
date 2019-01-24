class result
{
    int x=7;
    int y=9;
    public static void swap(result ob1)
    {
        int temp;
        temp=ob1.x;
        ob1.x=ob1.y;
        ob1.y=temp;
        System.out.println("Inside Function "+ob1.x+" "+ob1.y);
    }
    public static void main (String args[])
    {
        int x=7;
        int y=9;
        System.out.println("Before Function "+x+" "+y);
        result ob=new result();
        swap(ob);
        System.out.println("After  Function "+x+" "+y);
    }
}