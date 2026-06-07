class Aa{
    public void car()
    {
        System.out.println("car is strating");
    }
}
class Bb{
    public static void main(String args[])
    {
        Aa a=new Aa()
        {
              public void car()
    {
        System.out.println("car is moving ");
    }
        };
        a.car();
    }
}
