package com.example.freels.ListPelamarPekerjaan;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.freels.R;

import java.util.ArrayList;
import java.util.List;

public class ListPelamarAdapter extends RecyclerView.Adapter implements Filterable {
    private final Context context;
    private final List<ListPelamar> dataListPelamar;
    private final List<ListPelamar> dataListPelamarFilter;
    public ListPelamar listPelamarDelete;

    public ListPelamarAdapter(Context context, List<ListPelamar> dataListPelamar) {
        this.context = context;
        this.dataListPelamar = dataListPelamar;
        this.dataListPelamarFilter = new ArrayList<>(dataListPelamar);
    }

    public class ListPelamarViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final TextView tvListNamaPelamar;
        private final TextView tvPendidikan;
        private final ImageView ivProfilePicture;
        private final ImageView ivDelete;
        private CardView cvListPelamar;
        private ListPelamar listPelamar;

        public ListPelamarViewHolder(@NonNull View itemView) {
            super(itemView);
            tvListNamaPelamar = itemView.findViewById(R.id.tvListNamaPelamar);
            tvPendidikan = itemView.findViewById(R.id.tvPendidikan);
            ivProfilePicture = itemView.findViewById(R.id.ivProfilePicture);
            ivDelete = itemView.findViewById(R.id.ivDelete);
            ivDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ListPelamar listPelamarCalonDelete = listPelamarDelete;
                    if (listPelamarCalonDelete != null) {
                        Toast.makeText(context, listPelamarCalonDelete.nama + " telah dihapus", Toast.LENGTH_SHORT).show();
                        dataListPelamar.remove(listPelamarCalonDelete);
                        dataListPelamarFilter.remove(listPelamarCalonDelete);
                        notifyDataSetChanged();
                    }
                }
            });
            cvListPelamar = itemView.findViewById(R.id.cvListPelamar);
            cvListPelamar.setOnClickListener(this);
        }

        private void setPelamar(ListPelamar lp) {
            this.listPelamar = lp;
            if (this.listPelamar.terpilih) {
                Toast.makeText(context, listPelamar.nama + " telah dipilih", Toast.LENGTH_SHORT).show();
                this.cvListPelamar.setCardBackgroundColor(Color.RED);
            } else {
                this.cvListPelamar.setCardBackgroundColor(Color.WHITE);
            }
        }

        @Override
        public void onClick(View view) {
            for (ListPelamar lp : dataListPelamar) {
                lp.terpilih = false;
            }

            this.listPelamar.terpilih = !this.listPelamar.terpilih;
            listPelamarDelete = this.listPelamar.terpilih ? this.listPelamar : null;
            notifyDataSetChanged();
        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View dataListPelamarView = LayoutInflater.from(context).inflate(R.layout.list_pelamar, parent, false);
        return new ListPelamarViewHolder(dataListPelamarView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ListPelamar listPelamar = dataListPelamarFilter.get(position);
        ListPelamarViewHolder viewHolder = (ListPelamarViewHolder) holder;

        viewHolder.tvListNamaPelamar.setText(listPelamar.nama);
        Glide.with(context).load(listPelamar.imageProfile).into(viewHolder.ivProfilePicture);
        viewHolder.tvPendidikan.setText(listPelamar.pendidikan);
        viewHolder.ivDelete.setVisibility(listPelamar.terpilih ? View.VISIBLE : View.GONE);
        viewHolder.setPelamar(listPelamar);
    }

    @Override
    public int getItemCount() {
        return this.dataListPelamarFilter.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults hasilFilter = new FilterResults();
                List<ListPelamar> listPelamarFilter = new ArrayList<>();
                if (constraint.equals("Semua Pendidikan")) {
                    listPelamarFilter.addAll(dataListPelamar);
                } else {
                    for (ListPelamar lp : dataListPelamar) {
                        if (lp.pendidikan.toLowerCase().contains(constraint.toString().toLowerCase())) {
                            listPelamarFilter.add(lp);
                        }
                    }
                }
                hasilFilter.values = listPelamarFilter;
                hasilFilter.count = listPelamarFilter.size();
                return hasilFilter;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults filterResults) {
                dataListPelamarFilter.clear();
                dataListPelamarFilter.addAll((ArrayList<ListPelamar>) filterResults.values);
                notifyDataSetChanged();
            }
        };
    }
}
