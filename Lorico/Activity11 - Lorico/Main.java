package MVC;

public class Main {

    public static void main(String[] args) {
        View guiView = new View();
        new Controller(guiView);
    }
}
