package com.example.android.lublintourguide;


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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new

                Location("Perłowa Pijalnia Piwa","Każde "+
                "z naszych piw pełne jest pasji i zaangażowania, którymi chcemy się z Wami "+
                "podzielić. Owoc naszej ciężkiej pracy powstaje z najlepszych odmian słodu "+
                "oraz szlachetnych gatunków polskich chmieli, uprawianych przez dziesiątki"+
                " lat na Lubelszczyźnie w rodzinnych chmielnikach.",R.drawable.perla));
        locations.add(new

                Location("Czarcia Łapa","A morze"+
                " inaczej - powstała z zamiłowania do znakomitej kuchni, z miłości do gotowania i"+
                " ludzi z którymi dzielimy się naszą pasją. \n"+
                "Chcemy by każdy mógł znaleźć dla siebie chwilę, miedzy domem a pracą i "+
                "spędził czas inaczej, miło, przyjemnie, swobodnie, jedocześnie delektując się "+
                "daniami kuchni Morza Śródziemnego.",R.drawable.czarcia_lapa));
        locations.add(new

                Location("RESTAURACJA BelEtage","Restauracja "+
                "BelEtage to jeden z najbardziej eleganckich lokali, jakie oferuje Lublin. "+
                "Nasza restauracja jest popularnym miejscem organizacji kolacji, bankietów "+
                "i kameralnych przyjęć weselnych. Wybór wyśmienitych dań wywodzących się z"+
                " kuchni całego świata, proponowanych przez szefa kuchni Artura Górę, zyskał "+
                "uznanie nie tylko wśród lubelskich smakoszy, ale również wśród gości hotelowych "+
                "przyjeżdżających tu z całego świata. Restauracja BelEtage to także profesjonalna, "+
                "miła obsługa gwarantująca satysfakcję Gości przychodzących tu zarówno na "+
                "„szybki lunch”, jak i wystawną kolację.\nBelEtage może na dwóch poziomach "+
                "pomieścić do 150 osób, a w ciepłych miesiącach naszą ofertą kulinarną "+
                "można również raczyć się na hotelowym tarasie.",R.drawable.beletage));

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
