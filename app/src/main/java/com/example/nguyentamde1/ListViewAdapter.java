package com.example.nguyentamde1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;
import com.example.nguyentamde1.Model.dsmodel;

import org.w3c.dom.Text;

public class ListViewAdapter extends ArrayAdapter <dsmodel> {
    private Context mContext;
    private int mResources;
    private List<dsmodel> mList;

    public ListViewAdapter(Context context, int resource, List<dsmodel> objects) {
        super(context, resource, (List<dsmodel>) objects);
        this.mContext = context;
        this.mResources = resource;
        this.mList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (viewHolder == null) {
            convertView = LayoutInflater.from(mContext).inflate(mResources, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.textViewten = convertView.findViewById(R.id.txtten);
            viewHolder.textViewma = convertView.findViewById(R.id.txtma);
            viewHolder.btnAvartar = convertView.findViewById(R.id.item_btnBook);
            viewHolder.textViewso = convertView.findViewById(R.id.txtso);
            viewHolder.text147 =convertView.findViewById(R.id.lv_tet);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final dsmodel model = mList.get(position);
        viewHolder.btnAvartar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("dsmodel",  model);
                mContext.startActivity(intent);
            }
        });
        viewHolder.textViewten.setText(String.valueOf(model.getTen()));
        viewHolder.textViewma.setText(String.valueOf(model.getMa()));
        viewHolder.textViewso.setText(String.valueOf(model.getSo()));
        viewHolder.text147.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("dsmodel",  model);
                mContext.startActivity(intent);
            }
        });
        return  convertView;
    }

    public class ViewHolder{


        ImageView btnAvartar;
        LinearLayout text147;
        TextView textViewten;
        TextView textViewma;
        TextView textViewso;
    }
}
