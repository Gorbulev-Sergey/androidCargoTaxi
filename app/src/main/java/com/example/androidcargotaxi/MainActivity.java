package com.example.androidcargotaxi;

import static com.google.firebase.messaging.Constants.MessageNotificationKeys.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    WebView webViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*FirebaseMessaging.getInstance().getToken()
                .addOnCompleteListener(task -> {
                    if (!task.isSuccessful()) {
                        Log.w(TAG, "Fetching FCM registration token failed", task.getException());
                        return;
                    }

                    // Get new FCM registration token
                    String token = task.getResult();

                    // Log and toast
                    String msg = token.toString();
                    Log.d("Мой токен", msg);
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                });*/

        /*FirebaseMessaging.getInstance().subscribeToTopic("orders")
                .addOnCompleteListener(task -> {
                    if (!task.isSuccessful()) {
                        Toast.makeText(MainActivity.this, "Ошибка подписки", Toast.LENGTH_LONG).show();
                    }
                    Toast.makeText(MainActivity.this, "Подписка оформлена", Toast.LENGTH_LONG).show();
                });*/

        FirebaseMessaging.getInstance().subscribeToTopic("orders");

        webViewMain = findViewById(R.id.webViewMain);
        webViewMain.setWebViewClient(new WebViewClient());
        webViewMain.getSettings().setJavaScriptEnabled(true);
        webViewMain.getSettings().setDatabaseEnabled(true);
        webViewMain.getSettings().setDomStorageEnabled(true);
        webViewMain.loadUrl("https://svelte-cargo-taxi.netlify.app/driver");

    }
}