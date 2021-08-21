package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {


    ArrayList<DataSet> data;

    FragmentActivity activity;

    Context context;

    public ListAdapter(ArrayList<DataSet> data, FragmentActivity activity, Context context)
    {
        this.data = data;
        this.activity = activity;
        this.context = context;
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.item_view;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        DataSet currentData = data.get(position);

        holder.getImage_view().setImageResource(currentData.getmImageIDSet());

        holder.getImage_view().setClipToOutline(true);

        holder.getName_view().setText(currentData.getmNameSet());

        holder.getLocation_view().setPaintFlags(holder.getLocation_view().getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        holder.getLocation_view().setText(currentData.getmLocationSet());

        holder.getLocation_view().setOnClickListener(v -> {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + currentData.getmNameSet() + ",Deoghar");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            context.startActivity(mapIntent);
        });

        if(currentData.hasContact()) {
            holder.getContact_view().setText(currentData.getmContactSet());
            holder.getContact_container_view().setVisibility(View.VISIBLE);
        }
        else
        {
            holder.getContact_container_view().setVisibility(View.GONE);
        }

        holder.getDesc_view().setText(currentData.getmDescSet());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
