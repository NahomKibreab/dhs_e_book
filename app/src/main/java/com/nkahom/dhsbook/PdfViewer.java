package com.nkahom.dhsbook;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewer extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.CARD_ID);

        viewPdf(message);
    }

    public void viewPdf(String cardId) {
        Log.d("cardId: ",cardId);
        switch (cardId) {
            case "card_1":
                pdfView = findViewById(R.id.pdfView);
                pdfView.fromAsset("dhs_1.pdf").load();
                break;
            case "card_2":
                pdfView = findViewById(R.id.pdfView);
                pdfView.fromAsset("dhs_2.pdf").load();
                break;
            default:
                break;
        }
    }
}