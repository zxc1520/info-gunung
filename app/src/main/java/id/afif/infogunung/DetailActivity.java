package id.afif.infogunung;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private ImageView img;
    private TextView tvName, tvDetail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detail);

        getSupportActionBar().setTitle(getIntent().getStringExtra("name"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        catchData();
    }

    private void catchData() {
        img = findViewById(R.id.img_item);
        tvName = findViewById(R.id.detail_name);
        tvDetail = findViewById(R.id.detail_detail);

        img.setImageResource(getIntent().getIntExtra("img_url", 0));
        tvName.setText(getIntent().getStringExtra("name"));
        tvDetail.setText(getIntent().getStringExtra("detail"));
    }
}
