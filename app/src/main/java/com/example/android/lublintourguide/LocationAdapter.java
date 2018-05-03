package com.example.android.lublintourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private static final String LOG_TAG = LocationAdapter.class.getSimpleName();

    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context   is the current context (i.e. Activity) that the adapter is being created in.
     * @param locations is the list of {@link Location}s to be displayed.
     */
    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);


            Location currentLocation = getItem(position);

            TextView locationName = (TextView) listItemView.findViewById(R.id.location_name);
            locationName.setText(currentLocation.getObjectName());

            TextView locationDescription = (TextView) listItemView.findViewById(R.id.location_description);
            locationDescription.setText(currentLocation.getObjectDescription());

            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
            if (currentLocation.hasImage()) {
                imageView.setImageResource(currentLocation.getImageResourceId());
                imageView.setVisibility(View.VISIBLE);
            } else {
                imageView.setVisibility(View.GONE);
            }
        }
        return listItemView;
    }
}