package com.example.sensor_10120059_IF2;
/**
 * NAMA    : Muhammad Fazrin Ar-Rahman
 * NIM     : 10120059
 * Kelas   : IF-2
 * MatKul  : Aplikasi Komputasi Bergerak
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class InfoFragmentViewPager extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_view_pager, container, false);
    }
}