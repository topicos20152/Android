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

    public API() {
    }

    public void populate() throws ParseException {


        Subject s1 = new Subject(1, "DIM0533", "TÓPICOS ESPECIAIS EM ENGENHARIA DE SOFTWARE III", 4);
        Subject s2 = new Subject(2, "IMD0409", "DESENVOLVIMENTO DE SISTEMAS WEB II", 4);
        Subject s3 = new Subject(3, "IMD0403", "PROGRAMAÇÃO COM BANCO DE DADOS", 4);
        Subject s4 = new Subject(4, "IMD0411", "INTRODUÇÃO À GOVERNANÇA E GESTÃO DE TI", 4);
        Subject s5 = new Subject(5, "IMD0410", "PROGRAMAÇÃO CONCORRENTE E DISTRIBUÍDA", 4);
        Subject s6 = new Subject(6, "IMD0406", "PROTOCOLO E SERVIÇOS DE INTERNET", 4);
        Subject s7 = new Subject(7, "IMD0422", "SISTEMAS DE INTELIGÊNCIA EMPRESARIAL", 4);

        Task t1 = new Task(1, "Leitura e discussao do artigo Communicating, Cooperating Teams",
                "Ler o artigo Communicating, Cooperating Teams (anexo a tarefa).",
                sdf.parse("12/08/2015 00:00:00"), sdf.parse("19/08/2015 23:59:00"), s1, "Aberta");

        Task t2 = new Task(2, "Leitura e discussao - Awareness",
                "Ler o artigo A review of awareness in distributed collaborative software engineering (anexo a tarefa).",
                sdf.parse("19/08/2015 00:00:00"), sdf.parse("26/08/2015 23:59:00"), s1, "Aberta");

        Task t3 = new Task(3, "Responder questionário do artigo sobre Agile Teams.",
                "Responder as perguntas a seguir e enviar em arquivo .pdf",
                sdf.parse("30/09/2015 23:00:00"), sdf.parse("07/10/2015 23:59:00"), s1, "Aberta");

        Task t4 = new Task(4, "Descrição proposta de projeto", "Tarefa para submissão de sua proposta de projeto para a disciplina.",
                sdf.parse("24/08/2015 00:00:00"), sdf.parse("04/09/2015 23:59:00"), s2, "Enviada");

        Task t5 = new Task(5, "Análise das competências de um gestor de TI e papel na estratégia",
                "Atividade Individual", sdf.parse("27/08/2015 00:00:00"), sdf.parse("03/09/2015 23:59:00"), s4, "Enviada");

        Task t6 = new Task(6, "Prática de JDBC e DAO", "Baixe o arquivo PDF contendo a descrição do trabalho.",
                sdf.parse("14/08/2015 22:00:00"), sdf.parse("31/08/2015 23:59:00"), s3, "Aberta");

        Task t7 = new Task(7, "Trabalho Avaliativo TCP", "Etapa II - Trabalho Avaliativo TCP",
                sdf.parse("29/09/2015 00:00:00"), sdf.parse("09/10/2015 23:59:00"), s6, "Enviada");

        Task t8 = new Task(8, "Atividade: Estudo de Caso (E-Commerce)", "Responda as perguntas que se encontram no final do arquivo.",
                sdf.parse("25/08/2015 21:45:00"), sdf.parse("27/08/2015 23:59:00"), s7, "Aberta");

        User u1 = new User(1, "2013051065", "JEFFERSSON GALVÃO ARAUJO");
        User u2 = new User(2, "2013049325", "LILIAN KETLYN FREIRE DO REGO");
        User u3 = new User(3, "2012003027", "MAYCHELL FERNANDES DE OLIVEIRA");
        User u4 = new User(4, "2011078758", "PABLO GABRIEL RODRIGUES NEVES BEDOYA");
        User u5 = new User(5, "2013022967", "VICTOR VILAR RAPOZO");

    }

    public List<Task> getTasks(int idUser){
        List<Task> taskList = new ArrayList<>();
        //taskList.add(t1);
        //taskList.add(t2);
        //taskList.add(t3);
        //taskList.add(t4);
        //taskList.add(t5);
        //taskList.add(t6);
        //taskList.add(t7);
        //taskList.add(t8);

        return taskList;
    }
}
