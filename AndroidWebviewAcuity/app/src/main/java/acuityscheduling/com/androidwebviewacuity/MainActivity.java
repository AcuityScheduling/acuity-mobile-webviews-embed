package acuityscheduling.com.androidwebviewacuity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView scheduler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scheduler = (WebView) findViewById(R.id.acuity_scheduler);

        initAcuity();
    }

    private void initAcuity(){

        // Enable Javascript
        WebSettings webSettings = scheduler.getSettings();
        webSettings.setJavaScriptEnabled(true);

        scheduler.loadData("<iframe src=\"https://app.acuityscheduling.com/schedule.php?owner=12808744\" width=\"100%\" height=\"800\" frameBorder=\"0\"></iframe>\n" +
                        "<script src=\"https://d3gxy7nm8y4yjr.cloudfront.net/js/embed.js\" type=\"text/javascript\"></script>", "text/html",
                "utf-8");


    }
}
