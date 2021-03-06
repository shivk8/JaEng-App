package com.example.k.jaeng_fragments;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.k.miwok.Word;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter {
    int id;

    public wordAdapter(Context context, ArrayList<word> pWords, int rescolorid) {
        super(context,0, pWords);
        id = rescolorid;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listitem, parent, false);
        }
        word my_word= (word) getItem(position);
        TextView japTextView = (TextView) listItemView.findViewById(R.id.jap);
        japTextView.setText(my_word.getJapTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.english);
        defaultTextView.setText(my_word.getDefTranslation());
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(my_word.getResourceId());
        View textContainer = listItemView.findViewById(R.id.text);
        int color = ContextCompat.getColor(getContext(),id);
        textContainer.setBackgroundColor(color);

        return listItemView;
        //return super.getView(position, convertView, parent);
    }
}

