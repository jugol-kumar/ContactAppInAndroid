package com.example.examproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.examproject.adeptars.ContactAdapter;
import com.example.examproject.databinding.FragmentHomeBinding;
import com.example.examproject.models.Contact;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // initializing home fragment
        binding = FragmentHomeBinding.inflate(inflater);

        // create adapter and layout
        ContactAdapter contactAdapter = new ContactAdapter(Contact.__getAllContacts());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        // call layout binding
        binding.contactRV.setLayoutManager(linearLayoutManager);
        binding.contactRV.setAdapter(contactAdapter);

        return binding.getRoot();
    }
}