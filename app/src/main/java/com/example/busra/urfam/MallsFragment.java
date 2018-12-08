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
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.information_list, container, false);

        final ArrayList<Information> information = new ArrayList<Information>();

        information.add(new Information(R.string.malls_about_one, R.string.malls_address_one, R.string.malls_call_one, R.drawable.urfacity_avm));
        information.add(new Information(R.string.malls_about_two, R.string.malls_address_two, R.string.malls_call_two, R.drawable.piazzaavm));
        information.add(new Information(R.string.malls_about_three, R.string.malls_address_three, R.string.malls_call_three, R.drawable.novada_avm));
        information.add(new Information(R.string.malls_about_four, R.string.malls_address_four, R.string.malls_call_four, R.drawable.park_avm));

        InformationAdapter adapter = new InformationAdapter(getActivity(), information, R.color.category_colors);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
