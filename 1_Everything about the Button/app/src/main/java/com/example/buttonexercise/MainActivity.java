package com.example.buttonexercise;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 어떤 XML 파일을 선택해서 View를 보여줄 것인지 정의함

        // 레이아웃을 담은 xml 파일에서 Id로 정의된 버튼을 정의함
        button = findViewById(R.id.button);
        textView = findViewById(R.id.Textview);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼을 클릭했을 때, 어떤 이벤트를 실행할 것인지 작성할 수 있어요
                textView.setText("Result: Button is clicked");
            }
        });
    }
}