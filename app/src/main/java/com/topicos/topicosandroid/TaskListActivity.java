package com.topicos.topicosandroid;

import android.app.ListActivity;
import android.os.Bundle;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class TaskListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
    }
}
