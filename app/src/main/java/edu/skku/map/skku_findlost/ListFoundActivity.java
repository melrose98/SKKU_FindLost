package edu.skku.map.skku_findlost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListFoundActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<MemoItem> memos;
    MemoAdapter memoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_found);

        listView = (ListView)findViewById(R.id.found_listview);
        memos = new ArrayList<MemoItem>();

        MemoItem i1 = new MemoItem("aaa", "Lee", "hello");
        memos.add(i1);

        MemoItem i2 = new MemoItem("bbb", "Kim", "world");
        memos.add(i2);

        MemoItem i3 = new MemoItem("ccc", "Kang", "moblie app");
        memos.add(i3);

        MemoItem i4 = new MemoItem("ddd", "Kang", "moblie app");
        memos.add(i4);

        memoAdapter = new MemoAdapter(this, memos);

        listView.setAdapter(memoAdapter);
    }
}
