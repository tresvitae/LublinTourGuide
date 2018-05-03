package com.example.android.lublintourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations.
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getContext().getString(R.string.grand_hotel),
                getContext().getString(R.string.grand_hotel_description), R.drawable.grand_hotel));
        locations.add(new Location(getContext().getString(R.string.hotel_europa),
                getContext().getString(R.string.hotel_europa_description), R.drawable.europa));
        locations.add(new Location(getContext().getString(R.string.hotel_ilan),
                getContext().getString(R.string.hotel_ilan_description), R.drawable.ilan));

        /**
         * Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
         * adapter knows how to create list items for each item in the list.
         *
         */
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
