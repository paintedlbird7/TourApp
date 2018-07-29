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
 * {@link Fragment} that displays a list of parks.
 */
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of parks.
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.king_rd), getString(R.string.emma_prusch_farm), R.drawable.emmapruschfarmhouse));
        words.add(new Word(getString(R.string.penetencia_creek), getString(R.string.alum_rock_park), R.drawable.alum_rock_park));
        words.add(new Word(getString(R.string.mt_hamilton), getString(R.string.mount_halmiton), R.drawable.mt_hamilton));

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

        return rootView;
    }
}