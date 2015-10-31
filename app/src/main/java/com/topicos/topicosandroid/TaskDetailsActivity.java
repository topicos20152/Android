package com.topicos.topicosandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.topicos.topicosandroid.dao.TaskDao;
import com.topicos.topicosandroid.domain.Task;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class TaskDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);

        Bundle bundle = getIntent().getExtras();
        String id = bundle.getString("TASK_ID");

        getTask(id);
    }

    private void getTask(String id) {
        TaskDao taskDao = new TaskDao();

        //Criar o metodo getTask(String id) no TaskDao
        //Task task = taskDao.getTask(id);
    }
}
