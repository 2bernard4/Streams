import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<Persona>();
        personas = Arrays.asList(new Persona(22,40222222, "Bernardo", "Chiletto"),
                new Persona(13,40222223, "Camila", "Antoniuccio"),
                new Persona(33,10222222, "Pancho", "Calo"),
                new Persona(28,9222222, "Gushi", "Ezcriza"),
                new Persona(10,33222222, "Tomas", "Moreno"),
                new Persona(9,7222222, "Pablo", "Fino"));

        
        List<Persona> personasMayores = (personas.stream().
                filter(persona -> persona.getEdad() > 21).
                collect(Collectors.toList()));

        List<Persona> personasMenores = (personas.stream().
                filter(persona -> persona.getEdad() < 18).
                collect(Collectors.toList()));

        List<Persona> personasMayoresDni = (personas.stream().
                filter(persona -> persona.getEdad() > 21).
                filter(persona -> persona.getDni() > 20000000).
                collect(Collectors.toList()));


        System.out.println(String.format("Mayores A 21: %s", personasMayores));

        System.out.println(String.format("Menores a 18: %s", personasMenores));

        System.out.println(String.format("Mayores a 21 y dni mayor a 20000000: %s", personasMayoresDni));
    }
}
