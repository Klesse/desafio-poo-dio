import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java","Muito bom",60);

        Mentoria mentoria1 = new Mentoria("Docker","Ao vivo", LocalDate.now());


        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}