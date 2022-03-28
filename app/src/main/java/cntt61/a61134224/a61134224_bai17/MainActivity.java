package cntt61.a61134224.a61134224_bai17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<String> listData;
    private ArrayAdapter<String> adapter;
    private Context context;
    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        listView = (ListView) findViewById(R.id.lV);
        button = (Button) findViewById(R.id.btn);
        editText = (EditText) findViewById(R.id.eT);
        listData = new ArrayList<>();
        listData.add("Tèo");
        listData.add("Tý");
        listData.add("Bin");
        adapter = new ArrayAdapter<>(context, android.R.layout.simple_list_item_1,listData);
        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = editText.getText().toString().trim();
                listData.add(item);
                adapter.notifyDataSetChanged();
            }
        });
    }
}