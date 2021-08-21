package com.example.android.tourguide;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    public TextView name_view, location_view, contact_view, desc_view;

    public ImageView image_view;

    public View contact_container_view;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        name_view = itemView.findViewById(R.id.item_name_text);
        location_view = itemView.findViewById(R.id.item_location_text);
        contact_view = itemView.findViewById(R.id.item_contact_text);
        contact_container_view = itemView.findViewById(R.id.contact_container);
        desc_view = itemView.findViewById(R.id.item_desc_text);
        image_view = itemView.findViewById(R.id.item_image);
    }

    public TextView getName_view() {
        return name_view;
    }

    public TextView getContact_view() {
        return contact_view;
    }

    public View getContact_container_view() {
        return contact_container_view;
    }

    public TextView getDesc_view() {
        return desc_view;
    }

    public TextView getLocation_view() {
        return location_view;
    }

    public ImageView getImage_view() {
        return image_view;
    }
}
