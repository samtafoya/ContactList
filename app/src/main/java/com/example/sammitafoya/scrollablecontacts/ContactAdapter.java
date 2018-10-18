package com.example.sammitafoya.scrollablecontacts;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<Contact> {
    public ContactAdapter(Activity context, ArrayList<Contact> contactLit) {

        super(context, 0, contactLit);

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        //Get the contact object located at this position in the list
        Contact currentContact = getItem(position);

        //Check if item is being reused
        //otherwise inflate the view
        View myContactItem = convertView;
        if(myContactItem == null) {
            myContactItem =  LayoutInflater.from(getContext()).inflate(R.layout.contact_item, null);
        }

        //Reference each view in the contact item and add the data content
        TextView name_text = myContactItem.findViewById(R.id.nameView);
        TextView relationship_text = myContactItem.findViewById(R.id.relationshipView);
        ImageView photo_image = myContactItem.findViewById(R.id.imageView);

        name_text.setText(currentContact.name);
        relationship_text.setText(currentContact.relationship);
        photo_image.setImageResource(currentContact.imageID);

        //Return item layout containing the textviews and photo
        return myContactItem;
    }
}
