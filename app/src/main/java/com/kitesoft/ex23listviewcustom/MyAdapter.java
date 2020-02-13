package com.kitesoft.ex23listviewcustom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class MyAdapter extends BaseAdapter {

    //멤버변수
    ArrayList<Member> members;//참조변수
    LayoutInflater inflater;

    //생성자
    public MyAdapter(ArrayList<Member> members, LayoutInflater inflater){
        this.members= members;
        this.inflater= inflater;
    }

    //이 아답터객체가 만들어낼 View객체의 수를 리턴
    @Override
    public int getCount() {
        return members.size();//데이터의 개수
    }

    @Override
    public Object getItem(int position) {
        return members.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        //리스트뷰에 보여질 항목(Item) 하나의 View객체를 생성
        // xml로 View의 모양을 설계하고 이를 객체로 만들어서(부플리다) 사용

        // listview_item.xml문서를 읽어서 View객채로
        //만들어주는 객체를 이용해서 View 생성

        //혹시 재활용할 View가 없는가??
        if( view == null ){
            //new View
            view = inflater.inflate(R.layout.listview_item, null);
        }

        //만들어진 View에 값들을 대입..(bind View)
        Member member= members.get(position);

        ImageView iv= view.findViewById(R.id.item_img);
        TextView tvName= view.findViewById(R.id.item_tv_name);
        TextView tvNation= view.findViewById(R.id.item_tv_nation);

        iv.setImageResource(member.imgId);
        tvName.setText(member.name);
        tvNation.setText(member.nation);

        return view;
    }
}












