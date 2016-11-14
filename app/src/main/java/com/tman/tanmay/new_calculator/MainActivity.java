package com.tman.tanmay.new_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView finalAns=(TextView) findViewById(R.id.textView);
        final Calculator obj=new Calculator();
        obj.setTextView(finalAns);

        Button add=(Button) findViewById(R.id.buttonadd);
        Button sub=(Button) findViewById(R.id.buttonsub);
        Button mul=(Button) findViewById(R.id.buttonmul);
        Button div=(Button) findViewById(R.id.buttondiv);
        Button equal=(Button) findViewById(R.id.buttonequal);

        Button one=(Button) findViewById(R.id.button1);
        Button two=(Button) findViewById(R.id.button2);
        Button three=(Button) findViewById(R.id.button3);
        Button four=(Button) findViewById(R.id.button4);
        Button five=(Button) findViewById(R.id.button5);
        Button six=(Button) findViewById(R.id.button6);
        Button seven=(Button) findViewById(R.id.button7);
        Button eight=(Button) findViewById(R.id.button8);
        Button nine=(Button) findViewById(R.id.button9);
        Button zero=(Button) findViewById(R.id.button_0);

        Button c=(Button) findViewById(R.id.buttonc);
        Button del=(Button) findViewById(R.id.buttondel);

        View.OnClickListener Listener1=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('1');}};
        View.OnClickListener Listener2=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('2');}};
        View.OnClickListener Listener3=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('3');}};
        View.OnClickListener Listener4=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('4');}};
        View.OnClickListener Listener5=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('5');}};
        View.OnClickListener Listener6=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('6');}};
        View.OnClickListener Listener7=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('7');}};
        View.OnClickListener Listener8=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('8');}};
        View.OnClickListener Listener9=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('9');}};
        View.OnClickListener Listener0=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('0');}};


        View.OnClickListener plusListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('+');}};
        View.OnClickListener subListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('-');}};
        View.OnClickListener mulListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('*');}};
        View.OnClickListener divListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('/');}};
        View.OnClickListener equalListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('=');}};

        View.OnClickListener cListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('c');}};
        View.OnClickListener delListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {obj.calc('d');}};

        zero.setOnClickListener(Listener0);
        one.setOnClickListener(Listener1);
        two.setOnClickListener(Listener2);
        three.setOnClickListener(Listener3);
        four.setOnClickListener(Listener4);
        five.setOnClickListener(Listener5);
        six.setOnClickListener(Listener6);
        seven.setOnClickListener(Listener7);
        eight.setOnClickListener(Listener8);
        nine.setOnClickListener(Listener9);

        c.setOnClickListener(cListener);
        del.setOnClickListener(delListener);

        add.setOnClickListener(plusListener);
        sub.setOnClickListener(subListener);
        mul.setOnClickListener(mulListener);
        div.setOnClickListener(divListener);
        equal.setOnClickListener(equalListener);
        //TextView finalAns=(TextView) findViewById(R.id.textview);
    }

}

