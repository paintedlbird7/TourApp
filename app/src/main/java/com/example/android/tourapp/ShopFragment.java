

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
public class ShopFragment extends Fragment {


    private int imageResourceId;

    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("1590 Berryessa Rd", "Berryessa Flea Market", R.drawable.san_jose_flea_market));
        words.add(new Word("2200 Eastridge Loop", "Eastridge Mall", R.drawable.eastridge_sign));
        words.add(new Word("1710 Tully Rd,", "Lions Plaza", R.drawable.lionplaza));
        //words.add(new Word("Celia Cruz, Dion Warwick", "Do you know the way to SJ", R.drawable.dionne_celia_cruz));


        //        words.add(new Word("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
//        words.add(new Word("grandmother", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_shop);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        //istView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


        return rootView;

    }
}