package com.topicos.topicosandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.topicos.topicosandroid.dao.TaskDao;
import com.topicos.topicosandroid.domain.Task;

import java.text.SimpleDateFormat;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class TaskDetailsActivity extends AppCompatActivity {

    private TextView subject, title, description, ends_at, status, attachment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        String id = bundle.getString("TASK_ID");

        this.subject = (TextView) findViewById(R.id.subject);
        this.title = (TextView) findViewById(R.id.title);
        this.description = (TextView) findViewById(R.id.description);
        this.ends_at = (TextView) findViewById(R.id.ends_at);
//        this.status = (TextView) findViewById(R.id.status);
//        this.attachment = (TextView) findViewById(R.id.attachment);

        Task task = getTask(id);

        if(task != null) {
            subject.setText(task.getSubject().getName());
            title.setText(task.getName());
            description.setText(task.getDescription());
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM hh:mm");
            ends_at.setText(dateFormat.format(task.getDateEnd()));
//            status.setText(task.getStatus());
//            attachment.setText(task.getAttachment());
        } else {
            Toast.makeText(TaskDetailsActivity.this, "Not found Task!", Toast.LENGTH_SHORT).show();
            finish();
        }

    }

    private Task getTask(String id) {
        TaskDao taskDao = new TaskDao();
        Task task = null;
        try {
            task = taskDao.getTask(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return task;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == android.R.id.home) {
            finish();
        }

        return true;
    }
}
