package com.example.bai1_fix;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ThoiTietAdapter  extends BaseAdapter {
    private Context context;
    private int layout;
    private List<ThoiTiet> Thoi_Tiet_List;

    public ThoiTietAdapter(Context context, int layout, List<ThoiTiet> thoi_Tiet_List) {
        this.context = context;
        this.layout = layout;
        Thoi_Tiet_List = thoi_Tiet_List;
    }

    @Override
    public int getCount() {
        return Thoi_Tiet_List.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);

        TextView txtThu = (TextView) convertView.findViewById(R.id.thu1);
        TextView txtNhietDo =(TextView) convertView.findViewById(R.id.nhietdo);
        ImageView imageView = (ImageView) convertView.findViewById((R.id.image));

        ThoiTiet thoiTiet = Thoi_Tiet_List.get(position);
        txtThu.setText(thoiTiet.getThu());
        txtNhietDo.setText(thoiTiet.getNhietDo());
        imageView.setImageResource(thoiTiet.getImage());

        return convertView;
    }
}
