package com.example.bai1_fix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvThoiTiet;
    ArrayList<ThoiTiet> thoiTietArrayList;
    ThoiTietAdapter adapter;
    EditText editText1, editText2;
    Button button1, button2, button3;
    int viTri = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        thoiTietArrayList = new ArrayList<>();

        thoiTietArrayList.add(new ThoiTiet("Monday", "19^C", R.drawable.ic_baseline_cloud_queue_24));
        thoiTietArrayList.add(new ThoiTiet("Tuesday", "19^C", R.drawable.ic_baseline_cloud_queue_24));
        thoiTietArrayList.add(new ThoiTiet("Thursday", "19^C", R.drawable.ic_baseline_cloud_queue_24));
        thoiTietArrayList.add(new ThoiTiet("Friday", "19^C", R.drawable.ic_baseline_cloud_queue_24));

        adapter = new ThoiTietAdapter(this, R.layout.dong_thoi_tiet, thoiTietArrayList);
        lvThoiTiet.setAdapter(adapter);

        Xoa();
        Them();
        Update();

    }

    public void AnhXa() {
        lvThoiTiet = (ListView) findViewById(R.id.lv1);
        editText1 = (EditText) findViewById(R.id.edt1);
        editText2 = (EditText) findViewById(R.id.edt2);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);


    }

    public void Xoa() {
        lvThoiTiet.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                thoiTietArrayList.remove(position);
                adapter.notifyDataSetChanged();
                return false;
            }
        });
    }

    public void Them() {
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NgayThang = editText1.getText().toString();
                String nhietdo = editText2.getText().toString();
                thoiTietArrayList.add(new ThoiTiet(NgayThang, nhietdo, R.drawable.ic_baseline_cloud_queue_24));
                adapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "haha", Toast.LENGTH_LONG).show();

            }
        });
    }

    public void Update() {

        lvThoiTiet.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                viTri = position;
                editText1.setText(thoiTietArrayList.get(viTri).getThu());
                editText2.setText(thoiTietArrayList.get(viTri).getNhietDo());
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thoiTietArrayList.set(viTri, new ThoiTiet(
                        editText1.getText().toString(),
                        editText2.getText().toString(),
                        R.drawable.ic_baseline_cloud_queue_24));
            }
        });
    }
}