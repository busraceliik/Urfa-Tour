package com.example.busra.urfam;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class InformationAdapter extends ArrayAdapter<Information> {

    private int mColorResourceId;


    public InformationAdapter(Context context, ArrayList<Information> information, int colorResourceId) {
        super(context, 0, information);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Information currentInformation = (Information) getItem(position);

        TextView aboutTextView = (TextView) listItemView.findViewById(R.id.about);

        aboutTextView.setText(currentInformation.getAboutId());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);

        addressTextView.setText(currentInformation.getAddressId());

        TextView callNumberTextView = (TextView) listItemView.findViewById(R.id.call_number);

        callNumberTextView.setText(currentInformation.getCallNumber());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        imageView.setImageResource(currentInformation.getImageId());

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
