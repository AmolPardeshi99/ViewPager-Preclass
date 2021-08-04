package com.example.viewpager_preclass;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentC extends Fragment {

    public static final String ARG_PARAM1 = "param1";
    private TextView mTvData;
    private String mParam1;

    public FragmentC() {
        // Required empty public constructor
    }

    public static FragmentC newInstance(String data) {
        FragmentC fragmentC = new FragmentC();
        Bundle bundle1 = new Bundle();
        bundle1.putString(FragmentB.ARG_PARAM1,data);
        fragmentC.setArguments(bundle1);
        return fragmentC;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTvData = view.findViewById(R.id.tvData);
        if (getArguments() != null) {
            String data = getArguments().getString(ARG_PARAM1);
            mTvData.setText(data);
        }
    }
}