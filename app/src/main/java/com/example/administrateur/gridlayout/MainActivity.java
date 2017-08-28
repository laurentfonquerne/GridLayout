package com.example.administrateur.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import net.sourceforge.jeval.*;

public class MainActivity extends AppCompatActivity {

    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = (TextView)findViewById(R.id.txtResult);
    }
    public void touche(View v) {
        Button b = (Button) v;
        String str = b.getText().toString();
        String result = txtResult.getText().toString();
        result = result + str;
        txtResult.setText(result);
    }

    public void toucheEgal(View v) {
        Evaluator evaluator = new Evaluator();
        String result = txtResult.getText().toString();
        try {
           txtResult.setText(evaluator.evaluate(result));}
        catch(Exception ex){
           Toast.makeText(this,"erreur de syntaxe",Toast.LENGTH_LONG).show();}





    }
    public void toucheClear(View v) {
        String data = "";
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
        txtResult.setText(data);
    }
}
