package com.elmernissi.myrestufinder.MyAdapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elmernissi.myrestufinder.R;
import com.elmernissi.myrestufinder.model.Magasin;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MagasinViewHolder>{
    private List<Magasin> magasins;
    public Adapter(List<Magasin> magasins){
        this.magasins=magasins;
    }
    @NonNull
    @Override
    public Adapter.MagasinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_magasin_item,parent,false);
        return new MagasinViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MagasinViewHolder holder, int position) {
        Magasin magasin = magasins.get(position);
        holder.nomTextView.setText(magasin.getNameMagasin());
        holder.adresseTextView.setText(magasin.getAdresseMagasin());
        holder.telephoneTextView.setText(String.valueOf(magasin.getNumberPhone()));
    }

    @Override
    public int getItemCount() {
        return magasins.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setMagasins(List<Magasin> magasins) {
        this.magasins = magasins;
        notifyDataSetChanged();
    }

    public static class MagasinViewHolder extends RecyclerView.ViewHolder {
        TextView nomTextView,adresseTextView,telephoneTextView;
        public MagasinViewHolder(@NonNull View itemView) {
            super(itemView);
            nomTextView = itemView.findViewById(R.id.nomTextView);
            adresseTextView = itemView.findViewById(R.id.adresseTextView);
            telephoneTextView = itemView.findViewById(R.id.telephoneTextView);
        }
    }
}
