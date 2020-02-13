package com.kitesoft.ex23listviewcustom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Member> members= new ArrayList<>();

    MyAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //대량의 Data 추가작업
        members.add(new Member( R.drawable.flag_korea, "전현무", "대한민국"  ));
        members.add(new Member( R.drawable.flag_canada, "기욤패트리", "캐나다"  ));
        members.add(new Member( R.drawable.flag_china, "장위안", "중국"  ));
        members.add(new Member( R.drawable.flag_usa, "타일러", "미국"  ));
        members.add(new Member( R.drawable.flag_italy, "알베르토", "이탈리아"  ));
        members.add(new Member( R.drawable.flag_korea, "전현무", "대한민국"  ));
        members.add(new Member( R.drawable.flag_canada, "기욤패트리", "캐나다"  ));
        members.add(new Member( R.drawable.flag_china, "장위안", "중국"  ));
        members.add(new Member( R.drawable.flag_usa, "타일러", "미국"  ));
        members.add(new Member( R.drawable.flag_italy, "알베르토", "이탈리아"  ));


        listView= findViewById(R.id.listview);
        //대량의 Data를 View객체들로 만들어주는 작업을
        //수행하는 Adapter객체 생성
        adapter= new MyAdapter(members, getLayoutInflater() );
        listView.setAdapter(adapter);


        //데이터가 하나도 없을 때 보여지는 뷰설정
        //ListView 바로 아래 배치되며 자동 Gone처리되어 있는 뷰
        //만약 리스트가 비어있으면 자동 visible 됨.반대로 리스트뷰는 gone처리됨...
        listView.setEmptyView( findViewById(R.id.tv_nodata) );


        //항목을 클릭했을 때 반응하는 리스너 설정
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // 클릭한 항목의 데이터(Member객체)의 name(이름)  멤버변수 토스트로 보이기
                Toast.makeText(MainActivity.this, members.get(position).name, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
