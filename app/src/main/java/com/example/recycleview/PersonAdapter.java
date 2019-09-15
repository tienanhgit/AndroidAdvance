package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder>  // Truyền viewholder vào adapter
    {

    private ArrayList<Person> people;

    public PersonAdapter(Context context, ArrayList<Person> list) {
        this.people = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivPref;
        TextView tvName,tvSurname;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPref = itemView.findViewById(R.id.ivPref);
            tvName = itemView.findViewById(R.id.tvName);
            tvSurname = itemView.findViewById(R.id.tvSurname);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Tham chiếu View đến list-item (layout)
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_items,viewGroup,false);
        // Trả về 1 view holder tham số truyền vào là 1 view(layout)
        return new ViewHolder(v);
    }

    // Hàm này sẽ chạy khi đưa dữ liệu từng item trong ArrayList vào trong ViewHolder
    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder viewHolder, int position) {
        viewHolder.itemView.setTag(people.get(position));
        viewHolder.tvName.setText(people.get(position).getName());
        viewHolder.tvSurname.setText(people.get(position).getSurname());

        if(people.get(position).getPreference()=="bus"){
            viewHolder.ivPref.setImageResource(R.drawable.bus);
        }else {
            viewHolder.ivPref.setImageResource(R.drawable.plane);
        }
    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
