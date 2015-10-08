package com.topicos.topicosandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.topicos.topicosandroid.dao.Dao;
import com.topicos.topicosandroid.domain.Subject;
import com.topicos.topicosandroid.domain.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Subject> subjects;
    private Spinner spinnerSubject;
    private Button buttonOpenTasks;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Mock object for subject
        User user = new User();
        Dao dao = new Dao();
        subjects = dao.getSubjects(user);
        // Here will be used the DAO to get a list of subjects and fill the list of strings

        spinnerSubject = (Spinner) findViewById(R.id.spinnerSubject);
        ArrayAdapter<Subject> adapter = new ArrayAdapter<Subject>(this, android.R.layout.simple_spinner_item, subjects);
        spinnerSubject.setAdapter(adapter);

        buttonOpenTasks = (Button) findViewById(R.id.buttonOpenTasks);
        buttonOpenTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, TaskListActivity.class);
                TaskListActivity.subject = subjects.get(0);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
