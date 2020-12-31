package com.example.adhiyaman;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ContentFragment extends Fragment {

    String courseName;
    WebView webView;
    ListView listView;
    ArrayList<VideoDetail> arrayList = new ArrayList<VideoDetail>();


    public ContentFragment(String courseName) {
        this.courseName = courseName;
        }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_content, container, false);


        webView = rootView.findViewById(R.id.youtube_view);
        listView = rootView.findViewById(R.id.list_view);
        listView.setDivider(null);

        /**
         * Creating arraylist for the urls
         */
        arrayList.clear();
        AddYoutubeLinks();


        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings ws = webView.getSettings();
        ws.setJavaScriptEnabled(true);
        webView.loadData(arrayList.get(0).getVideoUrl(), "text/html", "utf-8");


        ContentAdapter contentAdapter = new ContentAdapter(arrayList, getContext());
        listView.setAdapter(contentAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                LinearLayout linearLayout2 = view.findViewById(R.id.inner_linear_layout);
                View view3 = view.findViewById(R.id.vertical_thick_line);
                VideoDetail videoDetail = arrayList.get(i);
                String url = videoDetail.getVideoUrl();
                view3.setBackgroundColor(Color.parseColor("#419767"));
                linearLayout2.setElevation(15);
                webView.loadData(url, "text/html", "utf-8");
            }
        });
        return rootView;
    }

    void AddYoutubeLinks(){
        // Java Basics Link
        if(courseName.compareTo("javaBeginners")==0){
            ArrayList<VideoDetail> javaBeginners = new ArrayList<>();

            javaBeginners.add(new VideoDetail("Java Session 01","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DcQPtlFlgzY\" frameborder=\"0\" allowfullscreen></iframe>"));
            javaBeginners.add(new VideoDetail("Java Session 02","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Hl-zzrqQoSE\" frameborder=\"0\" allowfullscreen></iframe>"));
            javaBeginners.add(new VideoDetail("Java Session 03","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5u8rFbpdvds\" frameborder=\"0\" allowfullscreen></iframe>"));
            javaBeginners.add(new VideoDetail("Java Session 04","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/SHIT5VkNrCg\" frameborder=\"0\" allowfullscreen></iframe>"));
            javaBeginners.add(new VideoDetail("Java Session 05","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gtQJXzi3Yns\" frameborder=\"0\" allowfullscreen></iframe>"));
            javaBeginners.add(new VideoDetail("Java Session 06","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5DdacOkrTgo\" frameborder=\"0\" allowfullscreen></iframe>"));
            javaBeginners.add(new VideoDetail("Java Session 07","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8ZaTSedtf9M\" frameborder=\"0\" allowfullscreen></iframe>"));
            javaBeginners.add(new VideoDetail("Java Session 08","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ANuuSFY2BbY\" frameborder=\"0\" allowfullscreen></iframe>"));

            arrayList = javaBeginners;

        }

        // Java Advanced Link
        if(courseName.compareTo("javaAdvanced")==0){
            ArrayList<VideoDetail> javaAdvanced = new ArrayList<>();

            javaAdvanced.add(new VideoDetail("Advanced Java Session 01","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3vTdIdzTsXw\" frameborder=\"0\" allowfullscreen></iframe>"));
            javaAdvanced.add(new VideoDetail("Advanced Java Session 02","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/twBe8SQHGTc\" frameborder=\"0\" allowfullscreen></iframe>"));
            javaAdvanced.add(new VideoDetail("Advanced Java Session 03","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/r5q5AdtF5ts\" frameborder=\"0\" allowfullscreen></iframe>"));
            javaAdvanced.add(new VideoDetail("Advanced Java Session 04","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/sATHTln70Yw\" frameborder=\"0\" allowfullscreen></iframe>"));
            javaAdvanced.add(new VideoDetail("Advanced Java Session 05","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/RCuzpKjgjMw\" frameborder=\"0\" allowfullscreen></iframe>"));
            javaAdvanced.add(new VideoDetail("Advanced Java Session 06","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/S8kyWLD5QJg\" frameborder=\"0\" allowfullscreen></iframe>"));
            javaAdvanced.add(new VideoDetail("Advanced Java Session 07","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/1Uz27N9t0aU\" frameborder=\"0\" allowfullscreen></iframe>"));
            javaAdvanced.add(new VideoDetail("Advanced Java Session 08","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hiGaZaNdue0\" frameborder=\"0\" allowfullscreen></iframe>"));

            arrayList = javaAdvanced;
        }



        // cpp Link

        if(courseName.compareTo("cpp")==0){
            ArrayList<VideoDetail> cpp = new ArrayList<>();

            cpp.add(new VideoDetail("C++ Session 01","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/tvC1WCdV1XU\" frameborder=\"0\" allowfullscreen></iframe>"));
            cpp.add(new VideoDetail("C++ Session 02","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/SWZfFNyUsxc\" frameborder=\"0\" allowfullscreen></iframe>"));
            cpp.add(new VideoDetail("C++ Session 03","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/sPv0HQ8xOaU\" frameborder=\"0\" allowfullscreen></iframe>"));
            cpp.add(new VideoDetail("C++ Session 04","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/jzV1fPOA1wc\" frameborder=\"0\" allowfullscreen></iframe>"));
            cpp.add(new VideoDetail("C++ Session 05","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/yjucJUsHSqg\" frameborder=\"0\" allowfullscreen></iframe>"));
            cpp.add(new VideoDetail("C++ Session 06","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3Iq_uFbc4L4\" frameborder=\"0\" allowfullscreen></iframe>"));
            cpp.add(new VideoDetail("C++ Session 07","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/L1z2dpCosXU\" frameborder=\"0\" allowfullscreen></iframe>"));
            cpp.add(new VideoDetail("C++ Session 08","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/jK83lln_T1k\" frameborder=\"0\" allowfullscreen></iframe>"));

            arrayList = cpp;

        }

        // python Link
        if(courseName.compareTo("python")==0){
            ArrayList<VideoDetail> python = new ArrayList<>();

            python.add(new VideoDetail("Python Session 01","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/HBxCHonP6Ro\" frameborder=\"0\" allowfullscreen></iframe>"));
            python.add(new VideoDetail("Python Session 02","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hnxIRVZ0EyU\" frameborder=\"0\" allowfullscreen></iframe>"));
            python.add(new VideoDetail("Python Session 03","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/nefopNkZmB4\" frameborder=\"0\" allowfullscreen></iframe>"));
            python.add(new VideoDetail("Python Session 04","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YbipxqSKx-E\" frameborder=\"0\" allowfullscreen></iframe>"));
            python.add(new VideoDetail("Python Session 05","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/1yUn-ydsgKk\" frameborder=\"0\" allowfullscreen></iframe>"));
            python.add(new VideoDetail("Python Session 06","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-s4wKoLO520\" frameborder=\"0\" allowfullscreen></iframe>"));
            python.add(new VideoDetail("Python Session 07","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/bk22K1m0890\" frameborder=\"0\" allowfullscreen></iframe>"));
            python.add(new VideoDetail("Python Session 08","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Neir-vgPyxw\" frameborder=\"0\" allowfullscreen></iframe>"));

            arrayList = python;

        }

    }
}
