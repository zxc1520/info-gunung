package id.afif.infogunung;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detail);

        catchData();
    }

    private void catchData() {
        ImageView img = findViewById(R.id.img_item);
        TextView tvName = findViewById(R.id.detail_name);
        TextView tvDetail = findViewById(R.id.detail_detail);

        img.setImageResource(getIntent().getIntExtra("img_url", 0));
        tvName.setText(getIntent().getStringExtra("name"));
        tvDetail.setText(getIntent().getStringExtra("detail"));
    }
}
