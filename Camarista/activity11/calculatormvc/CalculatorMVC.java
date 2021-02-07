package calculatormvc;

public class CalculatorMVC {
    public static void main(String[] args) {
        CalculatorView calMain = new CalculatorView();
        new CalculatorController(calMain);
    }

}
