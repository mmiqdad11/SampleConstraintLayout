package com.example.sampleconstraintlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return Home_Activity.classNamaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return Home_Activity.classNamaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;

        if(view == null) {
            holder = new ViewHolder();

            view = inflater.inflate(R.layout.item_listview, null);

            holder.name = (TextView) view.findViewById(R.id.tvnama_item);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.name.setText(Home_Activity.classNamaArrayList.get(i).getName());
        return view;
    }

    Context mContext;

    LayoutInflater inflater;

    private ArrayList<ClassNama> arrayList;

    public ListViewAdapter(Context context) {
        mContext = context;

        inflater = LayoutInflater.from(mContext);

        this.arrayList = new ArrayList<ClassNama>();
    }

    public class ViewHolder{
        TextView name;
    }


}
