package Activity11;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorView calView = new CalculatorView();
        new CalculatorController(calView);
    }

}
