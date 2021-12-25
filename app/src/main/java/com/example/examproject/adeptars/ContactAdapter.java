package com.example.examproject.adeptars;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.examproject.HomeFragmentDirections;
import com.example.examproject.R;
import com.example.examproject.databinding.SingleRowBinding;
import com.example.examproject.models.Contact;

import java.io.Serializable;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactAdapterHolder> {

    // create adapter class constructor method
    private final List<Contact> contactList;
    public ContactAdapter(List<Contact> contactList) {
        this.contactList = contactList;
    }



    @NonNull
    @Override
    public ContactAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        final SingleRowBinding binding = SingleRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

//        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row, parent, false);
        return  new ContactAdapterHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapterHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.bind(contact);
//        bind(contact, holder);
    }

    private void bind(Contact contact, ContactAdapterHolder holder) {
//        holder.userNameTV.setText(contact.getContactName());
        // send data to fragment with bundle
//        holder.infoIV.setOnClickListener(v -> {
//            Bundle bundle = new Bundle();
//            bundle.putString("contactName", contact.getContactName());
//            bundle.putString("phoneNumber", contact.getContactNumber());
//            bundle.putString("contactAddress", contact.getContactAddress());
//            Navigation.findNavController(v).navigate(R.id.toContactDetails, bundle);
//
//        });


        // send data to fragment with serializable
//        holder.infoIV.setOnClickListener(view -> {
//            Bundle bundle = new Bundle();
//            bundle.putSerializable("contactInfo",contact);
//            Navigation.findNavController(view).navigate(R.id.toContactDetails, bundle);
//        });
//

        //send data to fragment using safeargs
//        holder.infoIV.setOnClickListener(view -> {
//            final HomeFragmentDirections.ToContactDetailsAction action = HomeFragmentDirections.toContactDetailsAction(contact.getContactAddress(), contact);
//            action.setContactName("THis is Another COntact Name");
//            Navigation.findNavController(view).navigate(action);
//        });
//
//
//
//        // call message and email system.
//        holder.callIV.setOnClickListener(view -> {
//            Toast.makeText(view.getContext(), "calling", Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(Intent.ACTION_DIAL);
//            intent.setData(Uri.parse("tel:"+contact.getContactNumber()));
//            try{
//                view.getContext().startActivity(intent);
//            }catch (ActivityNotFoundException e){
//                Toast.makeText(view.getContext(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
//            }
//
//        });
//
//        holder.messageIV.setOnClickListener(view -> {
//            Toast.makeText(view.getContext(), "calling", Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(Intent.ACTION_SENDTO);
//            intent.setData(Uri.parse("sms:"+contact.getContactNumber()));
//            intent.putExtra("sms_body", "This is my sms body");
//            Intent chosser = Intent.createChooser(intent, "");
//            try{
//                view.getContext().startActivity(chosser);
//            }catch (ActivityNotFoundException e){
//                Toast.makeText(view.getContext(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
//            }
//
//        });
//
//        holder.locationIV.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("geo:0,0?q="+contact.getContactAddress()));
//                Intent chosser = Intent.createChooser(intent, "Chose One");
//                try {
//                    view.getContext().startActivity(chosser);
//                }catch (ActivityNotFoundException e){
//                    Toast.makeText(view.getContext(),e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }


    // this is inner class
    public static class ContactAdapterHolder extends RecyclerView.ViewHolder {
        private final SingleRowBinding binding;
        public ContactAdapterHolder(SingleRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Contact contact) {
                // send data to fragment with bundle
//        holder.infoIV.setOnClickListener(v -> {
//            Bundle bundle = new Bundle();
//            bundle.putString("contactName", contact.getContactName());
//            bundle.putString("phoneNumber", contact.getContactNumber());
//            bundle.putString("contactAddress", contact.getContactAddress());
//            Navigation.findNavController(v).navigate(R.id.toContactDetails, bundle);
//
//        });


                // send data to fragment with serializable
//        holder.infoIV.setOnClickListener(view -> {
//            Bundle bundle = new Bundle();
//            bundle.putSerializable("contactInfo",contact);
//            Navigation.findNavController(view).navigate(R.id.toContactDetails, bundle);
//        });
//

                //send data to fragment using safeargs
            binding.infoButtonIV.setOnClickListener(view -> {
                final HomeFragmentDirections.ToContactDetailsAction action = HomeFragmentDirections.toContactDetailsAction(contact.getContactAddress(), contact);
                action.setContactName("THis is Another COntact Name");
                Navigation.findNavController(view).navigate(action);
            });



                // call message and email system.
            binding.callIV.setOnClickListener(view -> {
                Toast.makeText(view.getContext(), "calling", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+contact.getContactNumber()));
                try{
                    view.getContext().startActivity(intent);
                }catch (ActivityNotFoundException e){
                    Toast.makeText(view.getContext(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }

            });

            binding.messageIV.setOnClickListener(view -> {
                Toast.makeText(view.getContext(), "calling", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("sms:"+contact.getContactNumber()));
                intent.putExtra("sms_body", "This is my sms body");
                Intent chosser = Intent.createChooser(intent, "");
                try{
                    view.getContext().startActivity(chosser);
                }catch (ActivityNotFoundException e){
                    Toast.makeText(view.getContext(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }

            });

            binding.locationIV.setOnClickListener(view -> {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:0,0?q="+contact.getContactAddress()));
                Intent chosser = Intent.createChooser(intent, "Chose One");
                try {
                    view.getContext().startActivity(chosser);
                }catch (ActivityNotFoundException e){
                    Toast.makeText(view.getContext(),e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }



}
