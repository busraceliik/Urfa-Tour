package com.example.busra.urfam;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.information_list, container, false);

        final ArrayList<Information> information = new ArrayList<Information>();

        information.add(new Information(R.string.hotel_about_one, R.string.hotel_address_one, R.string.hotel_call_one, R.drawable.dedeman));
        information.add(new Information(R.string.hotel_about_two, R.string.hotel_address_two, R.string.hotel_call_two, R.drawable.hilton));
        information.add(new Information(R.string.hotel_about_three, R.string.hotel_address_three, R.string.hotel_call_three, R.drawable.elruha));
        information.add(new Information(R.string.hotel_about_four, R.string.hotel_address_four, R.string.hotel_call_four, R.drawable.manici));
        information.add(new Information(R.string.hotel_about_five, R.string.hotel_address_five, R.string.hotel_call_five, R.drawable.aslankonukevi));
        information.add(new Information(R.string.hotel_about_six, R.string.hotel_address_six, R.string.hotel_call_six, R.drawable.istiklal));
        information.add(new Information(R.string.hotel_about_seven, R.string.hotel_address_seven, R.string.hotel_call_seven, R.drawable.bakay));

        InformationAdapter adapter = new InformationAdapter(getActivity(), information, R.color.category_colors);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}
