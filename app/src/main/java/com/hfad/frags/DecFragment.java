package com.hfad.frags;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class DecFragment extends Fragment {

    private TextView mNumber;
    private Button mButton;
    private int mCounter = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dec, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mNumber = requireActivity().findViewById(R.id.number);
        mButton = requireActivity().findViewById(R.id.button);


        mButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                mCounter++;
                mNumber.setText(Integer.toString(mCounter));

            }

        });


    }
}