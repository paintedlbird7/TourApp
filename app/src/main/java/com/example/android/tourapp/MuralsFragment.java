package com.example.android.tourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of murals.
 */
public class MuralsFragment extends Fragment {

    public MuralsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of artist & murals.
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.lila_gemelos), getString(R.string.heart_of_silicon_valley), R.drawable.eastridge));
        words.add(new Word(getString(R.string.carlos_rodriguez), getString(R.string.alum_rock), R.drawable.alum_rock_park));
        words.add(new Word(getString(R.string.jose_meza_v), getString(R.string.mural_de_la_raza), R.drawable.mural_de_la_raza));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_murals);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}