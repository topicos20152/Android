package com.topicos.topicosandroid.api;

import com.topicos.topicosandroid.domain.Subject;
import com.topicos.topicosandroid.domain.Task;
import com.topicos.topicosandroid.domain.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class API {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    public API() {}

    public void populate() {

        User u1 = new User("1", "2013051065", "JEFFERSSON GALVÃO ARAUJO");
        User u2 = new User("2", "2013049325", "LILIAN KETLYN FREIRE DO REGO");
        User u3 = new User("3", "2012003027", "MAYCHELL FERNANDES DE OLIVEIRA");
        User u4 = new User("4", "2011078758", "PABLO GABRIEL RODRIGUES NEVES BEDOYA");
        User u5 = new User("5", "2013022967", "VICTOR VILAR RAPOZO");

    }

    public List<Subject> getSubjects() {
        List<Subject> subjects = new ArrayList<>();

        subjects.add(new Subject("1", "DIM0533", "TÓPICOS ESPECIAIS EM ENGENHARIA DE SOFTWARE III", 4));
        subjects.add(new Subject("2", "IMD0409", "DESENVOLVIMENTO DE SISTEMAS WEB II", 4));
        subjects.add(new Subject("3", "IMD0403", "PROGRAMAÇÃO COM BANCO DE DADOS", 4));
        subjects.add(new Subject("4", "IMD0411", "INTRODUÇÃO À GOVERNANÇA E GESTÃO DE TI", 4));
        subjects.add(new Subject("5", "IMD0410", "PROGRAMAÇÃO CONCORRENTE E DISTRIBUÍDA", 4));
        subjects.add(new Subject("6", "IMD0406", "PROTOCOLO E SERVIÇOS DE INTERNET", 4));
        subjects.add(new Subject("7", "IMD0422", "SISTEMAS DE INTELIGÊNCIA EMPRESARIAL", 4));

        return subjects;
    }

}
