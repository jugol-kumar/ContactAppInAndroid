package com.example.examproject;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.examproject.databinding.FragmentContactDetailsBinding;
import com.example.examproject.models.Contact;

import static android.content.Intent.ACTION_SENDTO;
import static android.content.Intent.createChooser;

public class ContactDetails extends Fragment {

    FragmentContactDetailsBinding binding;

    public ContactDetails() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentContactDetailsBinding.inflate(inflater);

        // get data using bundle with key
//        Bundle bundle = getArguments();
//        final String contactName    = bundle.getString("contactName");
//        final String phoneNumber    = bundle.getString("phoneNumber");
//        final String contactAddress = bundle.getString("contactAddress");



        //get data using serializable
//        final Contact contact = (Contact) getArguments().getSerializable("contactInfo");


        //get data using safeargs
        final Contact contact = ContactDetailsArgs.fromBundle(getArguments()).getContact();
        String name = ContactDetailsArgs.fromBundle(getArguments()).getContactName();


        binding.contactNameTV.setText(name);
        binding.numberTv.setText(contact.getContactNumber());
        binding.address.setText(contact.getContactAddress());



        sendMail();
        return binding.getRoot();
    }

    private void sendMail() {
        binding.emailIV.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("*/*");
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"jk23717933@gmail.com"});
            intent.putExtra(Intent.EXTRA_SUBJECT, "Pleae send this mail on this address");
            intent.putExtra(Intent.EXTRA_TEXT, "this is my message full body.");
            Intent chooser = Intent.createChooser(intent, "");
            try {
                startActivity(chooser);
            }catch (ActivityNotFoundException e){
                Toast.makeText(view.getContext(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}