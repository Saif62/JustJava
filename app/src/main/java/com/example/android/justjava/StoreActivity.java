package com.example.android.justjava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class StoreActivity extends AppCompatActivity {

    int americanoQuantity = 0;
    int espressoQuantity = 0;
    int capuccinoQuantity = 0;
    int frapuccinoQuantity = 0;

    public Button button;
    public Button submitOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        button = findViewById(R.id.back_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStoreActivity();
                finish();
            }
        });


        submitOrder = findViewById(R.id.submit_Order);
        submitOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrderSummary();
                finish();
            }
        });
    }

    public void openOrderSummary(){
        Intent intent = new Intent(this, OrderSummary.class);
        startActivity(intent);
    }

    public void openStoreActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void addAmericano(View view){
        americanoQuantity+=1;
        displayAmericanoQuantity(americanoQuantity);
        displayAmericanoPrice(americanoPrice());
        payableAmount(americanoPrice()+espressoPrice()+capuccinoPrice()+frapuccinoPrice());
    }

    public void minusAmericano(View view){
        americanoQuantity-=1;
        displayAmericanoQuantity(americanoQuantity);
        displayAmericanoPrice(americanoPrice());
        payableAmount(americanoPrice()+espressoPrice()+capuccinoPrice()+frapuccinoPrice());
    }


    public void addEspresso(View view){
        espressoQuantity+=1;
        displayEspressoQuantity(espressoQuantity);
        displayEspressoPrice(espressoPrice());
        payableAmount(americanoPrice()+espressoPrice()+capuccinoPrice()+frapuccinoPrice());
    }
    public void minusEspresso(View view){
        espressoQuantity-=1;
        displayEspressoQuantity(espressoQuantity);
        displayEspressoPrice(espressoPrice());
        payableAmount(americanoPrice()+espressoPrice()+capuccinoPrice()+frapuccinoPrice());
    }

    public void addCapuccino(View view){
        capuccinoQuantity+=1;
        displayCapuccinoQuantity(capuccinoQuantity);
        displayCapuccinoPrice(capuccinoPrice());
        payableAmount(americanoPrice()+espressoPrice()+capuccinoPrice()+frapuccinoPrice());
    }

    public void minusCapuccino(View view){
        capuccinoQuantity-=1;
        displayCapuccinoQuantity(capuccinoQuantity);
        displayCapuccinoPrice(capuccinoPrice());
        payableAmount(americanoPrice()+espressoPrice()+capuccinoPrice()+frapuccinoPrice());
    }

    public void addFrapuccino(View view){
        frapuccinoQuantity+=1;
        displayFrapuccinoQuantity(frapuccinoQuantity);
        displayFrapuccinoPrice(frapuccinoPrice());
        payableAmount(americanoPrice()+espressoPrice()+capuccinoPrice()+frapuccinoPrice());
    }

    public void minusFrapuccino(View view){
        frapuccinoQuantity-=1;
        displayFrapuccinoQuantity(frapuccinoQuantity);
        displayFrapuccinoPrice(frapuccinoPrice());
        payableAmount(americanoPrice()+espressoPrice()+capuccinoPrice()+frapuccinoPrice());
    }

    public int americanoPrice(){
        return americanoQuantity*10;
    }

    public int espressoPrice(){
        return espressoQuantity*10;
    }

    public int capuccinoPrice(){
        return capuccinoQuantity*7;
    }

    public int frapuccinoPrice(){
        return frapuccinoQuantity*9;
    }


    public void displayAmericanoQuantity(int number){
        TextView americanoQuantityTextView = findViewById(R.id.quantity_text_view);
        americanoQuantityTextView.setText(String.valueOf(number));
    }

   public void displayAmericanoPrice(int number){
       TextView americanoPriceTextView = findViewById(R.id.price_value_text);
       americanoPriceTextView.setText(String.valueOf(number));
   }

   public void displayEspressoQuantity(int number){
       TextView espressoQuantityTextView = findViewById(R.id.quantity_text_view2);
       espressoQuantityTextView.setText(String.valueOf(number));
   }

   public void displayEspressoPrice(int number){
       TextView espressoPriceTextView = findViewById(R.id.price_value_text2);
       espressoPriceTextView.setText(String.valueOf(number));
   }

   public void displayCapuccinoQuantity(int number){
       TextView capuccinoQuantityTextView = findViewById(R.id.quantity_text_view3);
       capuccinoQuantityTextView.setText(String.valueOf(number));
   }
   public void displayCapuccinoPrice(int number){
       TextView capuccinoPriceTextView = findViewById(R.id.price_value_text3);
       capuccinoPriceTextView.setText(String.valueOf(number));
   }

   public void displayFrapuccinoQuantity(int number){
       TextView frapuccinoQuantityTextView = findViewById(R.id.quantity_text_view4);
       frapuccinoQuantityTextView.setText(String.valueOf(number));
   }
   public void displayFrapuccinoPrice(int number){
       TextView frapuccinoPriceTextView = findViewById(R.id.price_value_text4);
       frapuccinoPriceTextView.setText(String.valueOf(number));
   }

   public void payableAmount(int number){
       TextView amountTextView = findViewById(R.id.total_price);
       amountTextView.setText(String.valueOf(number));
   }

}
