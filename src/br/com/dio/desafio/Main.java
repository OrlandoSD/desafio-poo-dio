package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
     public static void main (String[] args){

         Curso curso1 = new Curso();

         curso1.setTitulo("curso Java");
         curso1.setDescricao("descricao curso java");
         curso1.setCargaHoraria(8);

         Curso curso2 = new Curso();

         curso2.setTitulo("curso Js");
         curso2.setDescricao("descricao curso js");
         curso2.setCargaHoraria(16);

         Mentoria mentoria =new Mentoria();

         mentoria.setTitulo("mentoria java");
         mentoria.setDescricao("descricao mentoria java");
         mentoria.setData(LocalDate.now());

         /*System.out.println(curso1);
           System.out.println(curso2);
           System.out.println(mentoria)*/

         Bootcamp bootcamp = new Bootcamp();
         bootcamp.setNome("Bootcamp java Developer");
         bootcamp.setDescricao("Descrição Bootcamp java Developer");
         bootcamp.getConteudos().add(curso1);
         bootcamp.getConteudos().add(curso2);
         bootcamp.getConteudos().add(mentoria);

         Dev devCarla = new Dev();
         devCarla.setNome("Carla");
         devCarla.inscreverBootcamp(bootcamp);
         System.out.println("Conteúdos Inscritos Carla: " + devCarla.getConteudosInscritos());
         devCarla.progredrir();
         devCarla.progredrir();
         System.out.println("_");
         System.out.println("Conteúdos Inscritos Carla: " + devCarla.getConteudosInscritos());
         System.out.println("Conteúdos Concluídos Carla: " + devCarla.getConteudoConcluidos());
         System.out.println("XP:" + devCarla.calcularTotalXP());

         System.out.println("---------------------------");

         Dev devMarco = new Dev();
         devMarco.setNome("Carla");
         devMarco.inscreverBootcamp(bootcamp);
         System.out.println("Conteúdos Inscritos Marco: " + devMarco.getConteudosInscritos());
         devMarco.progredrir();
         devMarco.progredrir();
         devMarco.progredrir();
         devMarco.progredrir();
         System.out.println("_");
         System.out.println("Conteúdos Inscritos Marco: " + devMarco.getConteudosInscritos());
         System.out.println("Conteúdos Concluídos Marco: " + devMarco.getConteudoConcluidos());
         System.out.println("XP:" + devMarco.calcularTotalXP());


    }
}
