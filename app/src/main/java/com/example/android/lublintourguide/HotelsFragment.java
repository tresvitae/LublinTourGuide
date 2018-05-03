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
        locations.add(new Location("IBB Grand Hotel Lublinianka", "Grand Hotel " +
                "zachwyci Cię nie tylko swoją architekturą. We wnętrzach tego ponad stuletniego, " +
                "eklektycznego budynku o przebogatej, zdobionej wieloma detalami elewacji, znajdują " +
                "się  elegancko wyposażone pokoje, przestronny z pięknym widokiem apartament, " +
                "wygodne dla kilkuosobowej rodziny studio, restauracja BelEtage, sale konferencyjne " +
                "oraz orientalne Shirin SPA.", R.drawable.grand_hotel));
        locations.add(new Location("Hotel Europa", "Nasza perełka XIX " +
                "wiecznej architektury, zlokalizowana jest w samym centrum Lublina, tuż przy " +
                "Placu Litewskim, w odległości zaledwie 350 metrów od Starego Miasta.\nKomfortowe " +
                "pokoje i apartamenty, elegancka restauracja, kawiarnia i siłownia oraz bogata " +
                "oferta centrum konferencyjnego – to tylko część tego, co mamy do zaoferowania w " +
                "naszym hotelu.", R.drawable.europa));
        locations.add(new Location("Hotel Ilan", "W historycznym gmachu " +
                "Jeszywas Chachmej Lublin, dawnej największej i najbardziej prestiżowej szkoły " +
                "rabiniczej na świecie, mieście się Hotel Ilan****. Jest to miejsce, gdzie " +
                "tradycja żydowska łączy się z jakością i najwyższym standardem. Doskonała " +
                "lokalizacja w centrum Lublina, zaledwie 800 m od Starego Miasta, oraz " +
                "dostępność komunikacyjna gwarantuje sprawne dotarcie i korzystanie z licznych " +
                "atrakcji kulturalnych i turystycznych jakie proponuje nasze miasto.", R.drawable.ilan));


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
