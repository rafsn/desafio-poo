import br.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descri??o curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Javascript");
        curso2.setDescricao("descri??o curso Javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descri??o mentoria Java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descri??o Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rafael " + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rafael " + devRafael.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rafael " + devRafael.getConteudosConcluidos());
        System.out.println("XP: " + devRafael.calcularTotalXp());


        System.out.println("-----------");

        Dev devJao = new Dev();
        System.out.println("-");
        devJao.setNome("João");
        devJao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João " + devJao.getConteudosInscritos());
        devJao.progredir();
        devJao.progredir();
        devJao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João " + devJao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João " + devJao.getConteudosConcluidos());
        System.out.println("XP: " + devJao.calcularTotalXp());
    }
}
