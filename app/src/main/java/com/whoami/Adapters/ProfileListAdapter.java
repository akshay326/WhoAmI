package com.whoami.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.whoami.R;

import java.util.List;

public class ProfileListAdapter extends RecyclerView.Adapter<ProfileListAdapter.myViewHolder>{
    private List<String> keys,values;
    private LayoutInflater inflater;

    public ProfileListAdapter(Context context, List<String> keys, List<String> values){
        this.keys = keys;
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    public int getItemCount() {
        return keys.size();
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_element_list_view_result, parent, false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        holder.key.setText(keys.get(position));
        holder.value.setText(values.get(position));
    }


    class myViewHolder extends RecyclerView.ViewHolder{
        TextView key;
        TextView value;


        myViewHolder(View itemView) {
            super(itemView);
            key = itemView.findViewById(R.id.keyCustomListView);
            value = itemView.findViewById(R.id.valueCustomListView);
        }
    }
}
