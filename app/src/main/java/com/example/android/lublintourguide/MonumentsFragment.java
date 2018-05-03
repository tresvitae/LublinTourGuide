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
public class MonumentsFragment extends Fragment {

    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Zamek Lubelski", "Zlokalizowane u " +
                "zbiegu Bystrzycy i Czechówki, otoczone rozlewiskami wzgórze było trudne do " +
                "zdobycia. Naturalne walory zadecydowały, że prawdopodobnie już w VI w. powstała " +
                "tu wczesnośredniowieczna osada o charakterze obronnym. Wzniesiony na wzgórzu " +
                "w I poł. XIV w. przez Kazimierza Wielkiego gotycki zamek, popadł w ruinę wskutek " +
                "działań wojennych w 2 poł. XVII w. i ostatecznie został rozebrany w XVIII " +
                "w. Z dawnego zespołu zamkowego do dzisiaj zachowała się tylko XIII-wieczna " +
                "romańska wieża zwana donżonem, gotycka kaplica pw. Świętej Trójcy oraz " +
                "fragment gotyckiej baszty zwanej żydowską. Obecny, neogotycki kompleks " +
                "budynków wzniesiono w latach 1824-26 z przeznaczeniem na więzienie, " +
                "wykorzystywane przez rosyjskie i austriackie władze zaborcze, niemieckich " +
                "okupantów a także władze PRL do 1954 r. Zabudowania zamkowe są siedzibą " +
                "Muzeum Lubelskiego, którego zbiory zgromadzono w kilku działach, m.in.: " +
                "archeologicznym, numizmatycznym, militariów czy etnograficznym. W galerii " +
                "malarstwa eksponowany jest słynny obraz Jana Matejki \"Unia Lubelska\", a " +
                "także cenne płótna twórców polskich i zagranicznych.", R.drawable.zamek));

        locations.add(new Location("Brama Krakowska", "Brama Krakowska, " +
                "jeden z symboli miasta, powstała w XIV w. wraz z murami miejskimi. Nazwę " +
                "zawdzięcza historycznemu szlakowi, który prowadził z Krakowa przez Lublin " +
                "do Wilna. Była punktem obserwacyjnym dla straży ogniowej, grano z niej " +
                "także hejnał miejski. Zamieszkiwał ją również zegarmistrz, obsługujący z" +
                "najdujący się na niej zegar. Zasadniczy zrąb gotyckich murów zbudowany " +
                "jest z cegły i kamienia, nadbudowa z zeszklonej cegły. Ośmioboczna, " +
                "otynkowana wieża powstała w połowie XVI w. Budowlę nakrywa barokowy hełm" +
                " z umieszczonym na jego szczycie monogramem SAR /Stanislaus Augustus Rex/ " +
                "i datą 1782, pochodzący z okresu przebudowy dokonanej przez Dominika " +
                "Merliniego. Obecny wygląd bramy jest wynikiem prac konserwatorsko-budowlanych " +
                "z lat 1959-64, kiedy to przywrócono jej historyczny wygląd, a wnętrze zaadaptowano " +
                "na potrzeby Muzeum Historii Miasta Lublina.", R.drawable.brama_krakowska));

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
