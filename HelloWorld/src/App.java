public class App {
    // fields (variables)
    private String name;
    private static int numObjects = 0;
    // constructors (pattern to "create" on object)
    // methods

    public App() {
        numObjects++;
        name = "Jill_" + numObjects;
    }

    // public String toString() {
    //     return "I am an App object named " + name;
    // }

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        App main = new App();
        main.start();
        System.out.println("doubleNum(4) = " + main.doubleNum(4));
        int x = 10;
        System.out.println("x=" + x);
        greet();
        // the x that is in greet() does not exist any more.
        System.out.println("x=" + x);
        System.out.println(main);
        App main2 = new App();
        System.out.println(main2);
    }

    public static void greet() {
        int x = 4;
        System.out.println("Greeting! " + x);
        x = -4;
    }

    public void start() {
        System.out.println("Hello, World!");
    }

    public int doubleNum(int n) {
        return n * 2;
    }
}
