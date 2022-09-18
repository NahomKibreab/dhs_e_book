package com.nkahom.dhsbook;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    public static String CARD_ID = "com.nknahom.dhsbook.CARD_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPdf(View view){
        Intent intent = new Intent(this, PdfViewer.class);
        String cardId = view.getTag().toString();
        Log.d("cardId: ", cardId);
        intent.putExtra(CARD_ID,cardId);
        startActivity(intent);
    }
}