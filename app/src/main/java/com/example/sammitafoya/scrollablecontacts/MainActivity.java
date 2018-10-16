package com.example.sammitafoya.scrollablecontacts;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public Contact contact;
    public LayoutInflater layoutInflater;
    public LinearLayout internal_linearLayout;
    public ArrayList<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        //Layout Inflater
        layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        internal_linearLayout = findViewById(R.id.internalLayout);

        //Contact List
        contactList = new ArrayList<Contact>();

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

        for(int i = 0; i < contactList.size(); i++ ) {
           LinearLayout myContactItem = (LinearLayout) LayoutInflater.from(getBaseContext()).inflate(R.layout.contact_item, null);

           TextView name_text = myContactItem.findViewById(R.id.nameView);
           TextView relationship_text = myContactItem.findViewById(R.id.relationshipView);
           ImageView photo_image = myContactItem.findViewById(R.id.imageView);

           name_text.setText(contactList.get(i).name);
           relationship_text.setText(contactList.get(i).relationship);
           photo_image.setImageResource(contactList.get(i).imageID);

           internal_linearLayout.addView(myContactItem);

        }
    }
}
