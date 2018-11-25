package com.example.k.jaeng_fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyFragments extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.listitem, container, false);

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

        ArrayList<word>words = new ArrayList<word>();
        words.add(new word("Sofu","Grand Father",R.drawable.family_grandfather));
        words.add(new word("Sobo", "Grandmother",R.drawable.family_grandmother));
        words.add(new word("Chichi", "Father",R.drawable.family_father));
        words.add(new word("Haha", "Mother",R.drawable.family_mother));
        words.add(new word("Musume", "Daughter",R.drawable.family_daughter));
        words.add(new word("Musuko", "Son",R.drawable.family_son));
        words.add(new word("Ane", "Elder Sister",R.drawable.family_older_sister));
        words.add(new word("Ani", "Elder Brother",R.drawable.family_older_brother));
        words.add(new word("Imouto", "Younger Sister",R.drawable.family_younger_sister));
        words.add(new word("Otouto", "Younger Brother",R.drawable.family_younger_brother));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapterFamily adapter = new WordAdapterFamily(this, words, R.color.Blue);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }



}


