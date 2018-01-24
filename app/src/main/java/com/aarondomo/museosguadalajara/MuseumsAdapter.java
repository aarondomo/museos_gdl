package com.aarondomo.museosguadalajara;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
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
        this.context = context;
        this.museums = museums;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.museum_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        Museum museum = museums.get(position);

        // set the data in items
        holder.icon.setImageResource(museum.getIcon());
        holder.title.setText(museum.getName());
        holder.subtitle.setText(museum.getPhone());

        holder.mainImage.setImageResource(museum.getPhoto());

        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a toast with person title on item click
                Toast.makeText(context, museums.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return museums != null ? museums.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView icon;

        private final TextView title;
        private final TextView subtitle;

        private final ImageView mainImage;

        public ViewHolder(View itemView) {
            super(itemView);

            icon = (ImageView) itemView.findViewById(R.id.iconMuseum);

            title = (TextView) itemView.findViewById(R.id.title_text);
            subtitle = (TextView) itemView.findViewById(R.id.subtitle_text);

            mainImage = (ImageView)itemView.findViewById(R.id.mainImage);


        }

    }
}