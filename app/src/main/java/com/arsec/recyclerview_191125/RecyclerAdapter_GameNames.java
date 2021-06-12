package com.arsec.recyclerview_191125;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter_GameNames extends RecyclerView.Adapter<RecyclerAdapter_GameNames.ViewHolder> {

    ArrayList<Game> gameTitles;
    Context context;

    public RecyclerAdapter_GameNames(ArrayList<Game> gameTitles, Context context) {
        this.gameTitles = gameTitles;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerAdapter_GameNames.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recyclerview_gameview, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter_GameNames.ViewHolder holder, int position) {
        holder.txtVw_GameName.setText(gameTitles.get(position).getGameTitle());
        holder.txtVw_GameYear.setText(Integer.toString(gameTitles.get(position).getReleaseYear()));

        // On item Removal
        holder.btn_DelRecyclerItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameTitles.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return gameTitles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtVw_GameName;
        TextView txtVw_GameYear;
        Button btn_DelRecyclerItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // Connecting the Recycler view elements
            txtVw_GameName = itemView.findViewById(R.id.txtVw_GameName);
            txtVw_GameYear = itemView.findViewById(R.id.txtVw_GameYear);
            btn_DelRecyclerItem = itemView.findViewById(R.id.btn_DelRecyclerItem);
        }
    }
}
