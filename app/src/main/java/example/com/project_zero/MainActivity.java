package example.com.project_zero;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public TextView title;
    public Button spotify_streamer;
    public Button scores_app;
    public Button library_app;
    public Button build_it_bigger;
    public Button xyz_reader;
    public Button own_app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (TextView)findViewById(R.id.title_textview);
        spotify_streamer = (Button)findViewById(R.id.spotifyStreamerbutton);
        scores_app = (Button)findViewById(R.id.scoresAppbutton);
        library_app = (Button)findViewById(R.id.libraryApp);
        build_it_bigger = (Button)findViewById(R.id.build_big);
        xyz_reader = (Button)findViewById(R.id.xyz);
        own_app = (Button)findViewById(R.id.own_app);

        spotify_streamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,R.string.spotify_message,Toast.LENGTH_SHORT).show();
            }
        });
        scores_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,R.string.score_message,Toast.LENGTH_SHORT).show();
            }
        });
        library_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,R.string.library_message,Toast.LENGTH_SHORT).show();
            }
        });
        build_it_bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,R.string.build_message,Toast.LENGTH_SHORT).show();
            }
        });
        xyz_reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,R.string.xyz_message,Toast.LENGTH_SHORT).show();
            }
        });
        own_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,R.string.own_app_message,Toast.LENGTH_SHORT).show();
            }
        });


    }




















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
