package com.example.adhiyaman;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Course> courseArrayList;
    CoursesAdapter(Context context, ArrayList<Course> courseArrayList){
        this.context = context;
        this.courseArrayList = courseArrayList;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView courseImage;
        TextView courseName;
        Button startButton;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.courseImage = itemView.findViewById(R.id.course_image);
            this.courseName = itemView.findViewById(R.id.course_name);
            this.startButton = itemView.findViewById(R.id.course_button);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.courses_recycle_view;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForListItem, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Course course = courseArrayList.get(position);
        ImageView courseImage = holder.courseImage;
        TextView courseName = holder.courseName;
        Button startButton = holder.startButton;
        courseImage.setImageResource(course.getPhotoId());
        courseName.setText(course.getCourseName());
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Fragment myFragment = new ContentFragment(course.getCourseContent());
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, myFragment).addToBackStack(null).commit();
            }
        });

    }



    @Override
    public int getItemCount() {
        if(null == courseArrayList)
            return 0;
        else
            return courseArrayList.size();
    }
}
