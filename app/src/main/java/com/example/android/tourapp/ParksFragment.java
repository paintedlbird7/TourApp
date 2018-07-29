package com.example.android.tourapp;

/**
 * Created by rosaperez on 7/19/18.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class ParksFragment extends Fragment {


    private int imageResourceId;

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("647 King Rd", "Emma Prusch Farm Park", R.drawable.emmapruschfarmhouse));
        words.add(new Word("15350 Penitencia Creek Rd", "Alum Rock Park", R.drawable.alum_rock_park));
        words.add(new Word("7281 Mt Hamilton Rd", "Mount Halmiton", R.drawable.mt_hamilton));
        //words.add(new Word("Celia Cruz, Dion Warwick", "Do you know the way to SJ"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_parks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        //listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


        return rootView;
    }
}