package com.example.adhiyaman;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CoursesFragment extends Fragment {

    ArrayList<Course> arrayList = new ArrayList<>();
    ArrayList<VideoDetail> javaBeginners = new ArrayList<>();
    ArrayList<VideoDetail> javaAdvanced = new ArrayList<>();
    ArrayList<VideoDetail> cpp = new ArrayList<>();
    ArrayList<VideoDetail> python = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_courses, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        arrayList.clear();
        AddCourses();
        CoursesAdapter coursesAdapter = new CoursesAdapter(getContext(), arrayList);
        recyclerView.setAdapter(coursesAdapter);


        return rootView;
    }



    void AddCourses(){
        //AddYoutubeLinks();
        Course c1 = new Course(R.drawable.javabeginner, "Java For Beginners", "javaBeginners");
        Course c2 = new Course(R.drawable.javaadvanced, "Advanced Java", "javaAdvanced");
        Course c3 = new Course(R.drawable.cpp, "Deep dive into cpp", "cpp");
        Course c4 = new Course(R.drawable.python, "Basics of Python", "python");
        arrayList.add(c1);
        arrayList.add(c2);
        arrayList.add(c3);
        arrayList.add(c4);

    }
}
