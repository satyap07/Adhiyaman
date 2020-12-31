package com.example.adhiyaman;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class InviteFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_invite, container, false);

        ImageView facebook = rootView.findViewById(R.id.facebook);
        ImageView whatsapp = rootView.findViewById(R.id.whatsapp);
        ImageView twitter = rootView.findViewById(R.id.twitter);
        ImageView telegram = rootView.findViewById(R.id.telegram);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "App shared via Facebook!!!", Toast.LENGTH_SHORT).show();
            }
        });

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "App shared via Whatsapp!!!", Toast.LENGTH_SHORT).show();
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "App shared via Twitter!!!", Toast.LENGTH_SHORT).show();
            }
        });

        telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "App shared via Telegram!!!", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
