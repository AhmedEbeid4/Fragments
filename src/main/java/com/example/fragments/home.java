package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class home extends Fragment {
    TextView txt;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_home, container, false);
        txt = (TextView) v.findViewById(R.id.txta);
        //setBtn();
        return v;
    }
//    private void setBtn(){
//
//        if (!profile.getTxt().equals(null)){
//            txt.setText(txt.getText().toString());
//        }
//    }
}