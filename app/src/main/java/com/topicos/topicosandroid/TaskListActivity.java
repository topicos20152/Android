package com.topicos.topicosandroid;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.topicos.topicosandroid.adapter.TaskListAdapter;
import com.topicos.topicosandroid.dao.Dao;
import com.topicos.topicosandroid.domain.Subject;
import com.topicos.topicosandroid.domain.Task;
import com.topicos.topicosandroid.domain.User;

import java.util.List;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class TaskListActivity extends AppCompatActivity {

    public static Subject subject = new Subject();
    private RecyclerView mRecyclerView;
    private TaskListAdapter mAdapter;
    private TextView lbl_subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        lbl_subject = (TextView) findViewById(R.id.subject);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onResume() {
        super.onResume();
        lbl_subject.setText(subject.getName());
        loadData();
    }

    private void loadData() {
        User user = new User();
        Dao dao = new Dao();
        List<Task> tasks = dao.getTasks(user);

        mAdapter = new TaskListAdapter(this, tasks);
        mRecyclerView.setAdapter(mAdapter);
    }
}
