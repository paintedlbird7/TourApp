

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
 * {@link Fragment} that displays a list of shopping places.
 */
public class ShopFragment extends Fragment {

    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of malls or places to shop.
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.berryessa_rd), getString(R.string.flea_market), R.drawable.san_jose_flea_market));
        words.add(new Word(getString(R.string.eastridge_loop), getString(R.string.eastridge_mall), R.drawable.eastridge_sign));
        words.add(new Word(getString(R.string.tully_rd), getString(R.string.lions_plaza), R.drawable.lionplaza));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_shop);

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