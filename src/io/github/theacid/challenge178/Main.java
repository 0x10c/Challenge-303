package io.github.theacid.challenge178;

class SingletonMain {
    private static SingletonMain singleton;

    private SingletonMain() {}

    static {
        singleton = new SingletonMain();
    }

    private static SingletonMain getInstance() {
        return singleton;
    }

    private void PrintSomething() {
        System.out.println("Hello. My name is singleton");
    }

    public static void main(String[] args) {
        SingletonMain singleton = getInstance();
        singleton.PrintSomething();
    }
}
