package activity11;

public class Act11 {
    public static void main(String [] args)
    {
       act11View aC11View = new act11View();
       new act11Controller(act11View);
       
    }

    private static class act11View {

        public act11View() {
        }
    }
}