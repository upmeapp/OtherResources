package assaf.zfani.otherresources;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources resources =getResources();
        InputStream is= resources.openRawResource(R.raw.charboosh);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;
        try {
            while ((line=br.readLine())!=null)
            {
                Log.i("file content",line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
