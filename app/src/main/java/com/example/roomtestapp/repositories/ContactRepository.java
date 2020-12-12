package com.example.roomtestapp.repositories;

import android.content.Context;

import com.example.roomtestapp.ContactDB;
import com.example.roomtestapp.ContactEntity;

public class ContactRepository {
    private Context context;

    public ContactRepository(Context context) {
        this.context = context;
    }
    public void insertContact(ContactEntity contactEntity){
        ContactDB.dbExecutorService.execute(new Runnable() {
            @Override
            public void run() {
                //runs on background threads
            }
        });
    }
}
