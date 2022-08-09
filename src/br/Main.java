package br;

import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java Iniciante");
        cursoJava.setDescricao("Neste curso, aprenda sobre o melhor da técnologia por trás da linguagem Java");
        cursoJava.setCargaHoraria(200);

        Curso cursoSpringBoot = new Curso();
        cursoSpringBoot.setTitulo("Curso Spring Boot");
        cursoSpringBoot.setDescricao("Aprenda sobre uma das maiores ferramentas do Java");
        cursoSpringBoot.setCargaHoraria(10);

        Mentoria mentoriaIntellij = new Mentoria();
        mentoriaIntellij.setTitulo("Mentoria IDE - Intellij");
        mentoriaIntellij.setDescricao("Aprenda os Atalhos, os Truques e Plugins para ser mais produtivo no Intellij");
        mentoriaIntellij.setData(LocalDate.now());

        Mentoria mentoriaMercadoJava = new Mentoria();
        mentoriaMercadoJava.setTitulo("Mentoria - Mercado Java");
        mentoriaMercadoJava.setDescricao("Saiba como trabalhar com Java");
        mentoriaMercadoJava.setData(LocalDate.now().plusDays(1));

        Bootcamp bootcampJavaPlus = new Bootcamp();
        bootcampJavaPlus.setNome("Bootcamp Java Plus");
        bootcampJavaPlus.setDescricao("Neste Bootcamp aprenda sobre Java e muito mais!");
        bootcampJavaPlus.getConteudos().add(cursoJava);
        bootcampJavaPlus.getConteudos().add(cursoSpringBoot);
        bootcampJavaPlus.getConteudos().add(mentoriaIntellij);
        bootcampJavaPlus.getConteudos().add(mentoriaMercadoJava);

        System.out.println("_____________________________________________________________");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Arthur: " + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Arthur: " + devJoao.getConteudoConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev devTaty = new Dev();
        devTaty.setNome("Melkih");
        devTaty.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("Conteúdos Inscritos Melkih: " + devTaty.getConteudoInscritos());
        devTaty.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Melkih: " + devTaty.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Melkih: " + devTaty.getConteudoConcluidos());
        System.out.println("XP: " + devTaty.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Joao");
        devMaria.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("Conteúdos Inscritos Joao: " + devMaria.getConteudoInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Joao: " + devMaria.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Joao: " + devMaria.getConteudoConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());

        System.out.println("________________________________________________");
    }
}