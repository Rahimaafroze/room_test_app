package com.example.roomtestapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.roomtestapp.databinding.FragmentHomeBinding;


public class homeFragment extends Fragment {
    private FragmentHomeBinding binding;


    public homeFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       binding = FragmentHomeBinding.inflate(inflater);
       binding.addBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Navigation.findNavController(view)
                       .navigate(R.id.action_homeFragment_to_newContactFragment);
           }
       });
       return binding.getRoot();
    }
}