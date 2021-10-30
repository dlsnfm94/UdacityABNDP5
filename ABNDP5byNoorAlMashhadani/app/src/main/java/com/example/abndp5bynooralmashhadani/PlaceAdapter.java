package com.example.abndp5bynooralmashhadani;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.MyViewHolder> {

    private final Activity activity;
    private final ArrayList<Place> places;

    public PlaceAdapter(Activity activity, ArrayList<Place> places) {
        this.activity = activity;
        this.places = places;
    }

    public PlaceAdapter.@NotNull MyViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        Place currentPlace = places.get(position);
        myViewHolder.placeImage.setImageResource(currentPlace.getPlaceImageResourceID());
        myViewHolder.placeName.setText(currentPlace.getPlaceName());
        myViewHolder.placeLocation.setText(currentPlace.getPlaceLocation());
        myViewHolder.placeInfo.setText(currentPlace.getPlaceInfo());
    }

    public int getItemCount() {
        return places.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private final ImageView placeImage;
        private final TextView placeName;
        private final TextView placeLocation;
        private final TextView placeInfo;

        public MyViewHolder(View itemView) {
            super(itemView);
            placeImage = itemView.findViewById(R.id.image);
            placeName = itemView.findViewById(R.id.place_name);
            placeLocation = itemView.findViewById(R.id.place_location);
            placeInfo = itemView.findViewById(R.id.place_info);
        }
    }
}
