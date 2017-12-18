package com.jhbli.menu_eunhye;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NavigationListAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater = null;

    String[] menus = {"등원관리","셔틀버스 조회","센터연결","설정","공지사항"};
    int[] menuImg = {
            R.drawable.menu_attend,
            R.drawable.menu_bus,
            R.drawable.menu_center,
            R.drawable.menu_manage,
            R.drawable.menu_notice
        };

        NavigationListAdapter(Context con, String[] menus) {
            this.context = con;
            this.menus = menus;
            inflater = LayoutInflater.from(context);
        }

    @Override
    public int getCount() {
            return menus.length;
            }

    @Override
    public Object getItem(int i) {
            return menus.length;
            }

    @Override
    public long getItemId(int i) {
            return i;
            }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {
            ViewHolder holder;
            if(convertview == null) {

                convertview =inflater.inflate(R.layout.navigation_item,null);
                holder = new ViewHolder();
                holder.imgMenu = (ImageView) convertview.findViewById(R.id.menu_img);
                holder.txtMenu = (TextView) convertview.findViewById(R.id.menu_id);
                convertview.setTag(holder);

            } else {
                holder = (ViewHolder) convertview.getTag();
            }

            holder.txtMenu.setText(menus[i]);
            holder.imgMenu.setImageResource(menuImg[i]);
            return convertview;
            }

    public class ViewHolder {

        ImageView imgMenu;
        TextView txtMenu;

    }
}