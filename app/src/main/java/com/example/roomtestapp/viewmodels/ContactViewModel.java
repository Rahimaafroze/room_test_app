package com.example.roomtestapp.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.roomtestapp.ContactEntity;
import com.example.roomtestapp.repositories.ContactRepository;

public class ContactViewModel extends AndroidViewModel {
    private ContactRepository contactRepository;
    public ContactViewModel(@NonNull Application application) {
        super(application);
        contactRepository = new ContactRepository(application);

    }
    public void addContact(ContactEntity contactEntity){
        contactRepository.insertContact(contactEntity);

    }
}
