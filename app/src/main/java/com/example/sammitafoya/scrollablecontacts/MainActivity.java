package com.example.sammitafoya.scrollablecontacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        //Contact List
        contactList = new ArrayList<>();

        contactList.add(new Contact("John", "Father", R.drawable.male1));
        contactList.add(new Contact("Merilee", "Mother", R.drawable.female2));
        contactList.add(new Contact("Nikki", "Sister", R.drawable.female1));
        contactList.add(new Contact("Dante", "Brother", R.drawable.male2));
        contactList.add(new Contact("Gracie", "Dog", R.drawable.female3));
        contactList.add(new Contact("Blue", "Dog", R.drawable.male3));
        contactList.add(new Contact("John", "Father", R.drawable.male1));
        contactList.add(new Contact("Merilee", "Mother", R.drawable.female2));
        contactList.add(new Contact("Nikki", "Sister", R.drawable.female1));
        contactList.add(new Contact("Dante", "Brother", R.drawable.male2));
        contactList.add(new Contact("Gracie", "Dog", R.drawable.female3));
        contactList.add(new Contact("Blue", "Dog", R.drawable.male3));
        contactList.add(new Contact("John", "Father", R.drawable.male1));
        contactList.add(new Contact("Merilee", "Mother", R.drawable.female2));
        contactList.add(new Contact("Nikki", "Sister", R.drawable.female1));
        contactList.add(new Contact("Dante", "Brother", R.drawable.male2));
        contactList.add(new Contact("Gracie", "Dog", R.drawable.female3));
        contactList.add(new Contact("Blue", "Dog", R.drawable.male3));
        contactList.add(new Contact("John", "Father", R.drawable.male1));
        contactList.add(new Contact("Merilee", "Mother", R.drawable.female2));
        contactList.add(new Contact("Nikki", "Sister", R.drawable.female1));
        contactList.add(new Contact("Dante", "Brother", R.drawable.male2));
        contactList.add(new Contact("Gracie", "Dog", R.drawable.female3));
        contactList.add(new Contact("Blue", "Dog", R.drawable.male3));

        ContactAdapter contactAdapter = new ContactAdapter(this, contactList);

        ListView listView = findViewById(R.id.myList);

        listView.setAdapter(contactAdapter);
    }


}
