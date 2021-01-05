class Application {

    String name;

    void run(String[] args) {
        System.out.println(name);
        for (String arguments : args) {
            System.out.println(arguments);
        }
    }
}