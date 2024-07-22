import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        
        Curso curso3 = new Curso();
        curso3.setTitulo("curso python");
        curso3.setDescricao("descrição curso python");
        curso3.setCargaHoraria(10);
        
        Curso curso4 = new Curso();
        curso4.setTitulo("curso c++");
        curso4.setDescricao("descrição curso c++");
        curso4.setCargaHoraria(15);
        
        Curso curso5 = new Curso();
        curso5.setTitulo("curso c#");
        curso5.setDescricao("descrição curso c#");
        curso5.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());
        
        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de python");
        mentoria2.setDescricao("descrição mentoria python");
        mentoria2.setData(LocalDate.now());
        
        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("mentoria de c++");
        mentoria3.setDescricao("descrição mentoria c++");
        mentoria3.setData(LocalDate.now());
        
        Mentoria mentoria4 = new Mentoria();
        mentoria4.setTitulo("mentoria de c#");
        mentoria4.setDescricao("descrição mentoria c#");
        mentoria4.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        
        Bootcamp bootcampPython = new Bootcamp();
        bootcampPython.setNome("Bootcamp Python Developer");
        bootcampPython.setDescricao("Descrição Bootcamp Python Developer");
        bootcampPython.getConteudos().add(curso3);
        bootcampPython.getConteudos().add(mentoria2);
        
        Bootcamp bootcampC = new Bootcamp();
        bootcampC.setNome("Bootcamp C++/C# Developer");
        bootcampC.setDescricao("Descrição Bootcamp C++/C# Developer");
        bootcampC.getConteudos().add(curso4);
        bootcampC.getConteudos().add(curso5);
        bootcampC.getConteudos().add(mentoria3);
        bootcampC.getConteudos().add(mentoria4);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        
        System.out.println("-------");
        
        Dev devHumberto = new Dev();
        devHumberto.setNome("Humberto");
        devHumberto.inscreverBootcamp(bootcampPython);
        System.out.println("Conteúdos Inscritos Humberto:" + devHumberto.getConteudosInscritos());
        devHumberto.progredir();
        devHumberto.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Humberto:" + devHumberto.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Humberto:" + devHumberto.getConteudosConcluidos());
        System.out.println("XP:" + devHumberto.calcularTotalXp());

        System.out.println("-------");
        
        Dev devFeliphe = new Dev();
        devFeliphe.setNome("Feliphe");
        devFeliphe.inscreverBootcamp(bootcampC);
        System.out.println("Conteúdos Inscritos Feliphe:" + devFeliphe.getConteudosInscritos());
        devFeliphe.progredir();
        devFeliphe.progredir();
        devFeliphe.progredir();
        devFeliphe.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Feliphe:" + devFeliphe.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Feliphe:" + devFeliphe.getConteudosConcluidos());
        System.out.println("XP:" + devFeliphe.calcularTotalXp());
    }

}
