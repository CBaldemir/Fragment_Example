package com.example.comert.fragmentornek;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static android.view.View.*;

/**
 * Created by Comert on 1.07.2016.
 */
public class fragment_a extends Fragment implements OnClickListener {

    Button button;
    int counter=0;
    Communicator com;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_a,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button=(Button)getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
        com=(Communicator)getActivity();
    }

    @Override
    public void onClick(View view) {
    counter++;
        com.respond("Butona"+ counter+ " kere tıklandı");
    }
}
