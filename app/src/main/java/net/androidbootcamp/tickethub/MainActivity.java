 package net.androidbootcamp.tickethub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {

    double numOfTickets = 0;
    double ticketCost = 59.99;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declarations for interface elements
        final EditText userInput = (EditText)findViewById(R.id.editTextNumber);
        final TextView totalCost = (TextView)findViewById(R.id.txtResult);
        final Button btnFindPrice = (Button)findViewById(R.id.btnCalculate);

        btnFindPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numOfTicketsOut = String.valueOf(userInput.getText());
                double total = Double.parseDouble(numOfTicketsOut.toString()) * ticketCost;
                String result = "Total: $" + total;
                totalCost.setText(result);
            }
        });

    }
}