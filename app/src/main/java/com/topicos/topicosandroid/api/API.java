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

        User u1 = new User(1, "2013051065", "JEFFERSSON GALVÃO ARAUJO");
        User u2 = new User(2, "2013049325", "LILIAN KETLYN FREIRE DO REGO");
        User u3 = new User(3, "2012003027", "MAYCHELL FERNANDES DE OLIVEIRA");
        User u4 = new User(4, "2011078758", "PABLO GABRIEL RODRIGUES NEVES BEDOYA");
        User u5 = new User(5, "2013022967", "VICTOR VILAR RAPOZO");

    }

    public List<Subject> getSubjects() {
        List<Subject> subjects = new ArrayList<>();

        subjects.add(new Subject(1, "DIM0533", "TÓPICOS ESPECIAIS EM ENGENHARIA DE SOFTWARE III", 4));
        subjects.add(new Subject(2, "IMD0409", "DESENVOLVIMENTO DE SISTEMAS WEB II", 4));
        subjects.add(new Subject(3, "IMD0403", "PROGRAMAÇÃO COM BANCO DE DADOS", 4));
        subjects.add(new Subject(4, "IMD0411", "INTRODUÇÃO À GOVERNANÇA E GESTÃO DE TI", 4));
        subjects.add(new Subject(5, "IMD0410", "PROGRAMAÇÃO CONCORRENTE E DISTRIBUÍDA", 4));
        subjects.add(new Subject(6, "IMD0406", "PROTOCOLO E SERVIÇOS DE INTERNET", 4));
        subjects.add(new Subject(7, "IMD0422", "SISTEMAS DE INTELIGÊNCIA EMPRESARIAL", 4));

        return subjects;
    }

    public List<Task> getTasks(int idUser) throws ParseException {

        List<Subject> subjects = getSubjects();

        List<Task> taskList = new ArrayList<>();

        taskList.add(new Task(1, "Leitura e discussao do artigo Communicating, Cooperating Teams",
                "Ler o artigo Communicating, Cooperating Teams (anexo a tarefa).",
                sdf.parse("12/08/2015 00:00:00"), sdf.parse("19/08/2015 23:59:00"), subjects.get(0), "Aberta"));

        taskList.add(new Task(2, "Leitura e discussao - Awareness",
                "Ler o artigo A review of awareness in distributed collaborative software engineering (anexo a tarefa).",
                sdf.parse("19/08/2015 00:00:00"), sdf.parse("26/08/2015 23:59:00"), subjects.get(0), "Aberta"));

        taskList.add(new Task(3, "Responder questionário do artigo sobre Agile Teams.",
                "Responder as perguntas a seguir e enviar em arquivo .pdf",
                sdf.parse("30/09/2015 23:00:00"), sdf.parse("07/10/2015 23:59:00"), subjects.get(0), "Aberta"));

        taskList.add(new Task(4, "Descrição proposta de projeto", "Tarefa para submissão de sua proposta de projeto para a disciplina.",
                sdf.parse("24/08/2015 00:00:00"), sdf.parse("04/09/2015 23:59:00"), subjects.get(1), "Enviada"));

        taskList.add(new Task(5, "Análise das competências de um gestor de TI e papel na estratégia",
                "Atividade Individual", sdf.parse("27/08/2015 00:00:00"), sdf.parse("03/09/2015 23:59:00"), subjects.get(3), "Enviada"));

        taskList.add(new Task(6, "Prática de JDBC e DAO", "Baixe o arquivo PDF contendo a descrição do trabalho.",
                sdf.parse("14/08/2015 22:00:00"), sdf.parse("31/08/2015 23:59:00"), subjects.get(2), "Aberta"));

        taskList.add(new Task(7, "Trabalho Avaliativo TCP", "Etapa II - Trabalho Avaliativo TCP",
                sdf.parse("29/09/2015 00:00:00"), sdf.parse("09/10/2015 23:59:00"), subjects.get(5), "Enviada"));

        taskList.add(new Task(8, "Atividade: Estudo de Caso (E-Commerce)", "Responda as perguntas que se encontram no final do arquivo.",
                sdf.parse("25/08/2015 21:45:00"), sdf.parse("27/08/2015 23:59:00"), subjects.get(6), "Aberta"));

        return taskList;
    }
}
