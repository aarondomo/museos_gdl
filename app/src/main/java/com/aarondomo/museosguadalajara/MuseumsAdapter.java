package com.aarondomo.museosguadalajara;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.aarondomo.museosguadalajara.pojos.Museum;

import java.util.List;

public class MuseumsAdapter extends RecyclerView.Adapter<MuseumsAdapter.ViewHolder> {

    private List<Museum> museums;
    private Context context;

    public MuseumsAdapter(Context context, List<Museum> museums) {
        this.museums = museums;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.museum_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        // set the data in items
        holder.name.setText(museums.get(position).getName());
        holder.hours.setText(museums.get(position).getHours());

        holder.museumIcon.setImageResource(museums.get(position).getIcon());
        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a toast with person name on item click
                Toast.makeText(context, museums.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return museums != null ? museums.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView museumIcon;

        private final TextView name;
        private final TextView hours;

        private final CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);

            museumIcon = (ImageView) itemView.findViewById(R.id.museumIcon);

            cardView = (CardView) itemView.findViewById(R.id.museumCardView);

            name = (TextView) itemView.findViewById(R.id.name);
            hours = (TextView) itemView.findViewById(R.id.hours);


        }

    }
}