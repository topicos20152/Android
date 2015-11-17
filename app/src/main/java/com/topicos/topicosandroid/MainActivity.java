package com.topicos.topicosandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.topicos.topicosandroid.dao.SubjectDao;
import com.topicos.topicosandroid.domain.Subject;
import com.topicos.topicosandroid.domain.User;
import com.topicos.topicosandroid.utils.Parameter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Subject> subjects;
    private Spinner spinnerSubject;
    private Button buttonOpenTasks;
    private Intent intent;

    private Drawer drawer;
    private AccountHeader accountHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Mocking user with the same data from api
        if(Parameter.user == null)
            Parameter.user = new User("563cc7738995e50003000001", "123456", "Android Test", "android_test");

        SubjectDao dao = new SubjectDao();
        subjects = dao.getSubjects(Parameter.user);
        // Here will be used the DAO to get a list of subjects and fill the list of strings

        spinnerSubject = (Spinner) findViewById(R.id.spinnerSubject);
        ArrayAdapter<Subject> adapter = new ArrayAdapter<Subject>(this, android.R.layout.simple_spinner_item, subjects);
        spinnerSubject.setAdapter(adapter);

        buttonOpenTasks = (Button) findViewById(R.id.buttonOpenTasks);
        buttonOpenTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, TaskListActivity.class);
                TaskListActivity.subject = (Subject) spinnerSubject.getSelectedItem();
                startActivity(intent);
            }
        });

        drawer = new DrawerBuilder().withActivity(this)
                .withToolbar(toolbar)
                .build();
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
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
}
