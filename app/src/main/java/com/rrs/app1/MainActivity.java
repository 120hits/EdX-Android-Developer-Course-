package com.rrs.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//  display method grabs the text view which holds the count and edits its text properties
    private void display(int number ){
    TextView quantityTextView = (TextView) findViewById(R.id.textView);
        quantityTextView.setText(""+number);
    }

    //method when the button is pressed
//  this method increments the count and gives the number of the count to the display
    //alt + enter will import the View library and remove the RED VIEW text
    public void submitCount(View view){ //View will be red highlighted in the beginning
        count += 1; //implement the count
        display(count); //display the count (field)
    }
}


/*
* we are going to add a variable that holds the count, we will call in count will be equal to 0
* Next we are gonna create a method that given the number it displays the number on the account
*   holder, the text view with the 0 counter
*   We need to create a private void method with the param of int number
* Inside the display method we need to reference to the 0 counter text view
*   TextView quantityTextView = (TextView)
* Next we need to find the text view by using the find view by id
*   the id name can be located by going in the design section and clicking on the text view
* Next we are gonna set the text of quantity to add to new number
* NOW our display method function that takes the text view and modifies its text
*   examples modifies 0 to the number given
* NExt we need to create another method when the button is pressed
*   the method is called submitCount
*       the param for this method will get a red highlighted for View
*           we need to hit alt + enter to import the View library
*   Next implement count and add 1 to it
*   Next call the display method with the param of count
* Next we need to implement when the button is pressed that it will call the submit count method
*   go to the design part and tap the button and head over to the properties
*       go to on click box and select submit count aka our method
* Now when the button is pressed it will call submit count and it will increment it by 1
*
*
*
*
*
*
* */