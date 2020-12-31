package com.example.adhiyaman;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ContentAdapter implements ListAdapter {

    ArrayList<VideoDetail> arrayList;
    Context context;


    public ContentAdapter(ArrayList<VideoDetail> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;

    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int i) {
        return true;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        VideoDetail videoDetail = arrayList.get(i);
        if(view==null) {

            LayoutInflater layoutInflater = LayoutInflater.from(context);
            view = layoutInflater.inflate(R.layout.content_list_view, null);
            View view1 = view.findViewById(R.id.vertical_line);
            View view2 = view.findViewById(R.id.horizonatl_line);
            LinearLayout linearLayout1 = view.findViewById(R.id.outer_linear_layout);
            LinearLayout linearLayout2 = view.findViewById(R.id.inner_linear_layout);
            View view3 = view.findViewById(R.id.vertical_thick_line);
            ImageView imageView = view.findViewById(R.id.tick_image);
            TextView tittle= view.findViewById(R.id.chapter_name);
            tittle.setText(videoDetail.getVideoName());

            }
        return view;

    }

    @Override
    public int getItemViewType(int i) {
        return i;
    }

    @Override
    public int getViewTypeCount() {
        return arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
