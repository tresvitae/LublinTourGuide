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
 * Activities that contain this fragment must implement the
 * {@link ParksFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ParksFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Ogród Saski", "Zdecydowanie najbardziej " +
                "reprezentacyjnym parkiem Lublina jest Ogród Saski. Nie sposób nie doceniać wartości tego " +
                "obiektu dla naszego miasta i to nie tylko ze względu na walory rekreacyjne, ale przede wszystkim " +
                "na historyczne i przyrodnicze.", R.drawable.ogrod_saski));
        locations.add(new Location("Park Bronowice", "Pomysłodawcą powstania ogrodu " +
                "miejskiego pomiędzy ulicami Fabryczną i Łęczyńską był nie kto inny jak Feliks Bieczyński – " +
                "twórca Ogrodu Saskiego. Zamysłem Bieczyńskiego była jak najmniejsza ingerencja w istniejącą " +
                "zieleń. Zaproponował wykorzystanie prawie sześciu hektarów zadrzewień znajdujących się w " +
                "przybrzeżnym pasie rzeki Czechówki. Miasto Lublin pieczę nad parkiem objęło w 1875 roku.",
                R.drawable.park_bronowicki));

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
