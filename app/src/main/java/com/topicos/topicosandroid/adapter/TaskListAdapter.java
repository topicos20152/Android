package com.topicos.topicosandroid.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.topicos.topicosandroid.R;
import com.topicos.topicosandroid.domain.Task;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by maychellfernandesdeoliveira on 06/10/2015.
 */
public class TaskListAdapter extends RecyclerView.Adapter<TaskListAdapter.CustomViewHolder> {

    private Context ctx;
    private List<Task> tasks;

    public TaskListAdapter(Context ctx, List<Task> tasks) {
        this.ctx = ctx;
        this.tasks = tasks;
    }

    @Override
    public TaskListAdapter.CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_row, null);

        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TaskListAdapter.CustomViewHolder customViewHolder, int i) {
        Task task = tasks.get(i);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM");

        customViewHolder.title.setText(task.getName());
        customViewHolder.status.setText(task.getStatus());
        customViewHolder.beginsAt.setText(dateFormat.format(task.getDateStart()));
        customViewHolder.endsAt.setText(dateFormat.format(task.getDateEnd()));
    }

    @Override
    public int getItemCount() { return tasks.size(); }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView title, status, beginsAt, endsAt;

        public CustomViewHolder(View view) {
            super(view);

            this.title = (TextView) view.findViewById(R.id.title);
            this.status = (TextView) view.findViewById(R.id.status);
            this.beginsAt = (TextView) view.findViewById(R.id.begins_at);
            this.endsAt = (TextView) view.findViewById(R.id.ends_at);
        }
    }
}
