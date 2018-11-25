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

public class NumbersFragment extends Fragment {


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.listitem, container, false);

            /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

            ArrayList<word>words = new ArrayList<Word>();
            words.add(new word("ichi","one",R.drawable.number_one));
            words.add(new word("ni", "two",R.drawable.number_two));
            words.add(new word("san", "three",R.drawable.number_three));
            words.add(new word("shi/yon", "four",R.drawable.number_four));
            words.add(new word("go", "five",R.drawable.number_five));
            words.add(new word("roku", "six",R.drawable.number_six));
            words.add(new word("shichi/nana", "seven",R.drawable.number_seven));
            words.add(new word("hachi", "eight",R.drawable.number_eight));
            words.add(new word("kyu/ku", "nine",R.drawable.number_nine));
            words.add(new word("ju", "ten",R.drawable.number_ten));

            // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
            // adapter knows how to create list items for each item in the list.
            wordAdapter adapter = new wordAdapter(getActivity(), words, R.color.Pink);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // activity_numbers.xml layout file.
            ListView listView = (ListView) rootView.findViewById(R.id.list);

            // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Word} in the list.
            listView.setAdapter(adapter);


            return rootView;
        }



    }


