public class main {
    public static void main(String[]args){
        Model model = new Model();
        View view = new View(1);

        new Controller(model,view);

    }
}
