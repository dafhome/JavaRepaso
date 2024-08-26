import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Cursos> cursos = new ArrayList<>();

        Cursos c1 = new Cursos("Ironhack", "Barcelona", 7500, false);
        Cursos c2 = new Cursos("LeWagon", "Barcelona", 500, true);
        Cursos c3 = new Cursos("UPC", "Castelldefels", 1500, false);

        cursos.add(c1);
        cursos.add(c2);
        cursos.add(c3);

        // System.out.println(cursos.get(0));
        // System.out.println(cursos.get(1));
        // System.out.println(cursos.get(2));

        for (int i=0; i<cursos.size(); i++){
            System.out.println(cursos.get(i));
        }

    }
}
