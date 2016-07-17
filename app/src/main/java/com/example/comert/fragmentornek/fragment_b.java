package com.example.comert.fragmentornek;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Comert on 1.07.2016.
 */



public class fragment_b extends Fragment {
    String veri;
    TextView degis;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b,container,false);
        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);

        degis = (TextView) getActivity().findViewById(R.id.tvsayac);
    }

    public void yaziyiDegis(String gelenVeri) {
        this.veri = gelenVeri;
        degis.setText(veri);

    }

}
