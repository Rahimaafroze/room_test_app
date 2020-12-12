package com.example.roomtestapp.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.roomtestapp.ContactEntity;

import java.util.List;

@Dao
public interface ContactDao {
    @Insert
    void insertNewContact(ContactEntity contactEntity);
    @Update
    void updateContact(ContactEntity contactEntity);
    @Delete
    void deleteContact(ContactEntity contactEntity);

    @Query("select * from tbl_contact")
    List<ContactEntity> getAllContacts();
}
