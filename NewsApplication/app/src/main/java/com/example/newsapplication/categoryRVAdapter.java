package com.example.newsapplication;
import android.widget.TextView
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class categoryRVAdapter extends RecyclerView.Adapter<categoryRVAdapter.ViewHolder> {
    private ArrayList<categoryRVModal> categoryRVModals;
    private Context context;
    private CategorClickInterface categorClickInterface;

    public categoryRVAdapter(ArrayList<categoryRVModal> categoryRVModals, Context context, CategorClickInterface categorClickInterface) {
        this.categoryRVModals = categoryRVModals;
        this.context = context;
        this.categorClickInterface = categorClickInterface;
    }

    public categoryRVAdapter(ArrayList<categoryRVModal> categoryRVModals, Context context){
        this.categoryRVModals = categoryRVModals;
        this.context = context;
    }

    @NonNull
    @Override
    public categoryRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_rv_item,parent,flase);
        return new categoryRVAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull categoryRVAdapter.ViewHolder holder, int position){
        categoryRVModal categoryRVModal = categoryRVModals.get(position);
        holder.categoryTV.setText(categoryRVModal.getCategory());
        Picasso.get().load(categoryRVModal,getCategoryImageUrl()).into(holder.categoryIV);
        holder.itemView.setOnClickListener(new View.OnClickListener()){
            @Override
                    public void onClick(View v) {
                categorClickInterface.onCategoryClick(position);
            }
        };

    }
    @Override
    public int getItemCount() {
        return categoryRVModals.size();
    }

    public interface CategorClickInterface{
        void onCategoryClick(int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView categoryTV;
        private ImageView categoryIV;
        public ViewHolder(@NonNull View itemView) {
            super(itenView);
            categoryTV = itemView.findViewById(R.id.idTVCategory);
            categoryIV = itemView.findViewById(R.id.idIVCategory);
        }

    }
}
