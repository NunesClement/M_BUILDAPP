package cnns.com.example.m_buildapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int itemId = item.getItemId();
        switch (itemId){
            case R.id.menu_action_1:
                Toast msg = Toast.makeText(this, "Menu 1 déclenché", Toast.LENGTH_SHORT);
                msg.show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}