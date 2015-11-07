package com.topicos.topicosandroid.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.topicos.topicosandroid.R;
import com.topicos.topicosandroid.TaskDetailsActivity;
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
        final Task task = tasks.get(i);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

        customViewHolder.title.setText(task.getName());
        customViewHolder.endsAt.setText(dateFormat.format(task.getDateEnd()));

        customViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(ctx.getApplicationContext(), TaskDetailsActivity.class);
                it.putExtra("TASK_ID", task.getId());
                ctx.startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() { return tasks.size(); }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView title, endsAt;

        public CustomViewHolder(View view) {
            super(view);

            this.title = (TextView) view.findViewById(R.id.title);
            this.endsAt = (TextView) view.findViewById(R.id.ends_at);
        }
    }
}
