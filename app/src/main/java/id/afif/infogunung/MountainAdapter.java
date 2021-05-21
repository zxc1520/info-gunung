package id.afif.infogunung;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import id.afif.infogunung.collection.Mountain;

public class MountainAdapter extends RecyclerView.Adapter<MountainAdapter.MountainViewHolder> {

    public ArrayList<Mountain> listMountain;

    public MountainAdapter(ArrayList<Mountain> list) {
        this.listMountain = list;
    }

    @NonNull
    @Override
    public MountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_list, parent, false);
        return new MountainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MountainAdapter.MountainViewHolder holder, int position) {
        Mountain mountain = listMountain.get(position);
        Glide.with(holder.itemView.getContext())
                .load(mountain.image)
                .apply(new RequestOptions().override(55, 55))
                .into(holder.photos);

        holder.txtName.setText(mountain.getName());
        holder.txtDetails.setText(mountain.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Memilih: " +  mountain.getName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                intent.putExtra("img_url", mountain.getImage());
                intent.putExtra("name", mountain.getName());
                intent.putExtra("detail", mountain.getDetail());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMountain.size();
    }

    public class MountainViewHolder extends RecyclerView.ViewHolder {

        ImageView photos;
        TextView txtName, txtDetails;

        public MountainViewHolder(@NonNull View itemView) {
            super(itemView);
            photos = itemView.findViewById(R.id.img_item);
            txtName = itemView.findViewById(R.id.tv_item_name);
            txtDetails = itemView.findViewById(R.id.tv_item_details);

        }
    }
}
