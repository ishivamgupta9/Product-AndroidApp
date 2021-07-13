package com.example.wedmisttraining;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class CallFragment extends Fragment {





    View v;

    public CallFragment() {

    }

    @Nullable

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_call,container,false);
        return v;
    }
}
