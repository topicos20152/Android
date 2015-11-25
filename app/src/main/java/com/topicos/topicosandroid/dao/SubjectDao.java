package com.topicos.topicosandroid.dao;

import com.topicos.topicosandroid.api.API;
import com.topicos.topicosandroid.api.ApiRequest;
import com.topicos.topicosandroid.domain.Subject;
import com.topicos.topicosandroid.domain.User;
import com.topicos.topicosandroid.utils.Parameter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by maychellfernandesdeoliveira on 06/11/2015.
 */
public class SubjectDao {

    public SubjectDao() {}

    public List<Subject> getSubjects() {

        List<Subject> subjects = new ArrayList<>();

        try {
            HashMap<String, String> params = new HashMap<>();
            params.put("access_token", "o1XVRi905ZXSoCG5UFr9WQ");

            List<Map<String, String>> allSubjects = new ApiRequest("users/"+ "564ce3525e5ca90003000005" +
                    "/courses", "GET", Subject.keys()).execute(params).get();
            if(allSubjects == null || allSubjects.isEmpty())
                return subjects;

            for (Map<String, String> taskMap : allSubjects) {
                Subject subject = new Subject();

                subject.setId(taskMap.get(Subject.ID));
                subject.setName(taskMap.get(Subject.NAME));

                subjects.add(subject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*

        //The data should be mocked, because I thought getSubjects was available on API, but, it wasn't.
        if(subjects == null || subjects.isEmpty()) {
            API api = new API();
            subjects = api.getSubjects();
        }
        */

        return subjects;
    }

}
