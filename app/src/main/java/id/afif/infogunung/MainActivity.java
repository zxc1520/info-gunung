package id.afif.infogunung;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import java.util.ArrayList;

import id.afif.infogunung.collection.Mountain;
import id.afif.infogunung.collection.MountainData;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMountain;
    private ArrayList<Mountain> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMountain = findViewById(R.id.rv_content);
        rvMountain.setHasFixedSize(true);

        list.addAll(MountainData.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        rvMountain.setLayoutManager(new LinearLayoutManager(this));
        MountainAdapter mountainAdapter = new MountainAdapter(list);
        rvMountain.setAdapter(mountainAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        switch (itemId) {
            case R.id.action_about:
                Intent in = new Intent(MainActivity.this, AboutMe.class);
                startActivity(in);
                break;
        }
    }

    private void animate(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        LayoutAnimationController layoutAnimationController = AnimationUtils
                .loadLayoutAnimation(context, R.anim.item_down);

        recyclerView.setLayoutAnimation(layoutAnimationController);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }

}