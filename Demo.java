class Demo {
    static int b = 20;
    int c = 30;// instance

    public static void main(String[] args) {
        int a = 10;// local variable
        Demo ref = new Demo();
        System.out.println(a);
        System.out.println(Demo.b);
        System.out.println(ref.c);
    }

}
