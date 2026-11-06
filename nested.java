class Outer {
    int x = 10;
    static int y = 20;

    static class StaticNested {
     void display()
     {
      System.out.println("static nested class");
      System.out.println("static value:"+y);
      class Inner{
        void display()
        {
            System.out.println("non static inner class");
            System.out.println("outer value :"+ x);
        }
      }
      public static void main(string[] args)
      {
        Outer.StaticNested obj1 = new Outer.StaticNested();
        obj1.display();
        Outer outer = new Outer();
        Outer.Inner obj2 = Outer.new Inner();
        obj2.display();
      }
     }
    }
}