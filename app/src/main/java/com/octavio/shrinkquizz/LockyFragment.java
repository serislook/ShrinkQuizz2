package com.octavio.shrinkquizz;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;


public class LockyFragment extends Fragment {


    public LockyFragment() {
        // Required empty public constructor
    }
    public static LockyFragment newInstance(){
        return new LockyFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_locky, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CheckBox happy = (CheckBox) view.findViewById(R.id.happyCb);
        final CheckBox mood = (CheckBox) view.findViewById(R.id.moodCb);
        Button button = (Button) view.findViewById(R.id.luckyBtr);

        happy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mood.setChecked(isChecked);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean answer = mood.isChecked();
                Log.d("ANSWER", String.valueOf(answer));
            }
        });
    }
}
