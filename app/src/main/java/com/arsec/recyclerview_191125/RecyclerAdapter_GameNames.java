package com.arsec.recyclerview_191125;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter_GameNames extends RecyclerView.Adapter<RecyclerAdapter_GameNames.ViewHolder> {
    @NonNull
    @Override
    public RecyclerAdapter_GameNames.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recyclerview_gameview, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter_GameNames.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtVw_GameName;
        TextView txtVw_GameYear;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtVw_GameName = itemView.findViewById(R.id.txtVw_GameName);
            txtVw_GameYear = itemView.findViewById(R.id.txtVw_GameYear);
        }
    }
}
