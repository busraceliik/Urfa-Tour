package com.example.busra.urfam;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.information_list,container,false);

        final ArrayList<Information> information = new ArrayList<Information>();

        information.add(new Information( R.string.museum_about_one,R.string.museum_address_one,R.string.museum_call_one,R.drawable.urfa_muzesi));
        information.add(new Information( R.string.museum_about_two,R.string.museum_address_two,R.string.museum_call_two,R.drawable.muzik_muzesi));
        information.add(new Information( R.string.museum_about_three,R.string.museum_address_three,R.string.museum_call_three,R.drawable.culinary_museum));
        information.add(new Information( R.string.museum_about_four,R.string.museum_address_four,R.string.museum_call_four,R.drawable.oyuncak_muzesi));
        information.add(new Information( R.string.museum_about_five,R.string.museum_address_five,R.string.museum_call_five,R.drawable.kent_muzesi));

        InformationAdapter adapter = new InformationAdapter(getActivity(), information, R.color.category_colors);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
