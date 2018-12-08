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
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.information_list, container, false);

        final ArrayList<Information> information = new ArrayList<Information>();

        information.add(new Information(R.string.places_about_one, R.string.places_address_one, R.string.places_call_one, R.drawable.balikligol));
        information.add(new Information(R.string.places_about_two, R.string.places_address_two, R.string.places_call_two, R.drawable.halfeti));
        information.add(new Information(R.string.places_about_three, R.string.places_address_three, R.string.places_call_three, R.drawable.urfa_eski));
        information.add(new Information(R.string.places_about_four, R.string.places_address_four, R.string.places_call_four, R.drawable.harran));
        information.add(new Information(R.string.places_about_five, R.string.places_address_five, R.string.places_call_five, R.drawable.kale));

        InformationAdapter adapter = new InformationAdapter(getActivity(), information, R.color.category_colors);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
