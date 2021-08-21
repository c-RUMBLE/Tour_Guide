package com.example.android.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RestaurantsFragment extends Fragment {

    ArrayList<DataSet> data = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataSet();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recycler_fragment,container,false);

        // Add the following lines to create RecyclerView
        // Add RecyclerView member
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(new ListAdapter(data, getActivity(), getContext()));

        return view;
    }

    private void initDataSet() {
        data.add(new DataSet(R.drawable.resta_bikaner,
                "Bikaner Restaurant",
                "Williams Town, Deoghar, Jharkhand 814112",
                "77638 01526",
                "Rated 4.1 based on 755 Ratings."));
        data.add(new DataSet(R.drawable.resta_mayur,
                "Mayur Restaurant",
                "Jain Mandir Rd, Castairs Town, Bompas Town, Deoghar, Jharkhand 814112",
                "74850 96481",
                "Rated 4.0 based on 446 Ratings."));
        data.add(new DataSet(R.drawable.resta_ambar,
                "Ambar Restaurant",
                "S.B Roy Road,opposite shitla mandir, near Bajla chowk, Deoghar, Jharkhand 814112",
                "89108 95797",
                "Rated 3.9 based on 134 Ratings."));
        data.add(new DataSet(R.drawable.resta_kozy,
                "Kozy - The Art of Fine Dining",
                "Court Rd, VIP Chowk, Deoghar, Jharkhand 814112",
                "Rated 4.2 based on 89 Ratings."));
        data.add(new DataSet(R.drawable.resta_laziz_zaika,
                "Laziz Zaika",
                "Tower Chowk Rd, Williams Town, Deoghar, Jharkhand 814112",
                "Rated 5.0 based on 21 Ratings."));
        data.add(new DataSet(R.drawable.resta_dominos,
                "Domino's",
                "Ground Floor, Hotel Manorma International Satsang Chowk, Jharkhand 814112",
                "1800 208 1234",
                "Rated 3.9 based on 506 Ratings."));
        data.add(new DataSet(R.drawable.resta_4_guys,
                "4 Guys Restaurant",
                "Bypass road, opp. Kali mandir, Purandaha, Bompas Town, Deoghar, Jharkhand 814112",
                "62020 77601",
                "Rated 3.7 based on 274 Ratings."));
        data.add(new DataSet(R.drawable.resta_veda_inn,
                "Veda Inn",
                "B-6, Assam Express Road, Tower Chowk Rd, Deoghar, Jharkhand 814112",
                "82947 99646",
                "Rated 3.9 based on 407 Ratings."));
        data.add(new DataSet(R.drawable.resta_banjara,
                "Banjara Restaurant",
                "B-6, Babadham Station Rd, Shivganga Muhalla, Deoghar, Jharkhand 814112",
                "Rated 4.2 based on 55 Ratings."));
        data.add(new DataSet(R.drawable.resta_moti_mahal,
                "Moti Mahal Delux-Restaurant",
                "Hotel Rajkamal Complex, Station Rd, Williams Town, Deoghar, Jharkhand 814112",
                "Rated 3.9 based on 370 Ratings."));
        data.add(new DataSet(R.drawable.resta_bawarchi,
                "Bawarchi Restaurant",
                "Williams Town, Deoghar, Jharkhand 814112",
                "Rated 3.9 based on 389 Ratings."));
        data.add(new DataSet(R.drawable.resta_kamdhenu,
                "Hotel Kamdhenu",
                "Near, Tower Chowk Rd, Shivganga Muhalla, Deoghar, Jharkhand 814112",
                "84048 44854",
                "Rated 3.9 based on 1184 Ratings."));
        data.add(new DataSet(R.drawable.resta_aapki_handi,
                "Aapki Handi",
                "Near Central Plaza, Williams Town, Deoghar, Jharkhand 814112",
                "70799 71111",
                "Rated 3.9 based on 506 Ratings."));
    }
}
