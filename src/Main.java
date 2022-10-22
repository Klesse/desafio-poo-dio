import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java","Muito bom",60);
        Curso curso2 = new Curso("Javascript","Mediano",60);
        Mentoria mentoria1 = new Mentoria("Docker","Ao vivo", LocalDate.now());

        //Conteudo curso2 = new Curso("Javascript","Mediano",60); //Polimorfismo

        /*System.out.println(curso1);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Pedro: " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("Conteudos inscritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos concluídos Pedro: " + devPedro.getConteudosConcluidos());

        System.out.println("================================================================");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos inscritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos concluídos Joao: " + devJoao.getConteudosConcluidos());






    }
}