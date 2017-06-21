package com.solga.fifty2.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.solga.fifty2.R;
import com.solga.fifty2.data.network.res.GetTasksRes;

import java.util.List;

public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.TasksViewHolder> {

    private Context mContext;
    private List<GetTasksRes.Task> mTasks;
    private CustomClickListener mCustomClickListener;



    public TasksAdapter(List<GetTasksRes.Task> tasks, CustomClickListener customClickListener) {
            mTasks = tasks;
            mCustomClickListener = customClickListener;
            }

    public void setTaks(List<GetTasksRes.Task> tasks) {
            mTasks = tasks;
            notifyDataSetChanged();
            }

    @Override
    public TasksAdapter.TasksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            mContext = parent.getContext();
            View convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tasks_list, parent, false);
            return new TasksViewHolder(convertView, mCustomClickListener);
            }

    @Override
    public void onBindViewHolder(TasksAdapter.TasksViewHolder holder, int position) {
            GetTasksRes.Task task = mTasks.get(position);

            holder.mDescTask.setText(task.getDescTask());
            }

    @Override
    public int getItemCount() {
            return mTasks.size();
            }


    public static class TasksViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected TextView mDescTask;
        ImageView mSettings;

        public CustomClickListener mListener;

        public TasksViewHolder(View itemView, CustomClickListener customClickListener) {
            super(itemView);
            this.mListener = customClickListener;
        //    mSettings = (ImageView) itemView.findViewById(R.id.settings_img);
    /* mCommands = (ImageView) itemView.findViewById(R.id.commands_img);
            mTrack = (ImageView) itemView.findViewById(R.id.track_img);
            mNameDevice = (TextView) itemView.findViewById(R.id.name_device_txt);
            mTypeDevice = (TextView) itemView.findViewById(R.id.type_device_txt);
            mIMEIDevice = (TextView) itemView.findViewById(R.id.imei_device_txt);
                mUniqDevice = (TextView) itemView.findViewById(R.id.uniq_device_txt);
                mDateRegDevice = (TextView) itemView.findViewById(R.id.date_reg_device_txt);

            mSettings.setOnClickListener(this);
            mCommands.setOnClickListener(this);
            mTrack.setOnClickListener(this);*/
        }

        @Override
        public void onClick(View v) {
            if (mListener!=null){
                mListener.onDeviceItemClickListener(getAdapterPosition(),v);
            }
        }
    }

    public interface CustomClickListener{
        void onDeviceItemClickListener(int position, View view);    }

}