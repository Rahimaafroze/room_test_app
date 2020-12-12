package com.example.roomtestapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.room.Room;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.roomtestapp.databinding.FragmentNewContactBinding;
import com.example.roomtestapp.viewmodels.ContactViewModel;


public class newContactFragment extends Fragment {
    private FragmentNewContactBinding binding;
    private ContactViewModel contactViewModel;



    public newContactFragment() {
        // Required empty public constructor
    }


  
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding = FragmentNewContactBinding.inflate(inflater);
      contactViewModel = new ViewModelProvider(requireActivity()).get(ContactViewModel.class);
      binding.saveBTN.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              //Validate empty field
              final String name = binding.nameET.getText().toString();
              final String email = binding.emailET.getText().toString();
              final String phone = binding.phoneET.getText().toString();
              final ContactEntity contactEntity = new ContactEntity(name,email,phone);
              //save Database
             /*Room.databaseBuilder(getActivity(),ContactDB.class,"contact_db").build() //this takes huge memory
                    //  .getContactDao()
                    //  .insertNewContact(contactEntity); //it can be written once in contactDb using room */

             contactViewModel.addContact(contactEntity);


              Navigation.findNavController(view)
                      .navigate(R.id.action_newContactFragment_to_homeFragment);


          }

      });
        return binding.getRoot();


    }
}