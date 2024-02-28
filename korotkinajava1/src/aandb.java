public  class aandb {
    public int a;
    public int b;
    public static void aandb(int a, int b) {
        if (a > b) {
            System.out.println("a>b");  } else if (a < b) {
            System.out.println("a<b");  } else {
            System.out.println("a=b");  }
    }

    public static void ab(int a, int b) {
        int c = a * b;  System.out.println("a*b=" + c); }

    public static void aplusb(int a, int b) {
        int x = a + b;  System.out.println("a+b=" + x); }

    public static void aminusb(int a, int b) {
        int y = a + b;  System.out.println("a-b=" + y); }

    public static void arasdb(int a, int b) {
        float z = a / b;  System.out.println("a/b=" + z); }
}

