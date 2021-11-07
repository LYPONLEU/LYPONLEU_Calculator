package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    private Button add, sub, mul, div;
    private Button clear_entry, clear, equal, sign, backspace;
    private TextView text1, text2;
    private String input, answer;
    private boolean phepTinh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 textview the hien phep tinh va ket qua
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);

        input = "";
        answer = "";
        phepTinh = false;
        //Cac buttons

        b1 = (Button) findViewById(R.id.num1);
        b2 = (Button) findViewById(R.id.num2);
        b3 = (Button) findViewById(R.id.num3);
        b4 = (Button) findViewById(R.id.num4);
        b5 = (Button) findViewById(R.id.num5);
        b6 = (Button) findViewById(R.id.num6);
        b7 = (Button) findViewById(R.id.num7);
        b8 = (Button) findViewById(R.id.num8);
        b9 = (Button) findViewById(R.id.num9);
        b0 = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        clear_entry = (Button) findViewById(R.id.clear_entry);
        clear = (Button) findViewById(R.id.clear);
        equal = (Button) findViewById(R.id.equal);
        sign = (Button) findViewById(R.id.sign);
        backspace = (Button) findViewById(R.id.backspace);


        // show value of button to textview1
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = input + "1";
                displayOne();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = input + "2";
                displayOne();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = input + "3";
                displayOne();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = input + "4";
                displayOne();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = input + "5";
                displayOne();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = input + "6";
                displayOne();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = input + "7";
                displayOne();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = input + "8";
                displayOne();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = input + "9";
                displayOne();
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = input + "0";
                displayOne();
            }
        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = "-" + input;
                displayOne();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "+");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "-");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "×");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "÷");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                displayOne();
                displayTwo();
            }
        });
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backspace();
                displayOne();
            }
        });
        clear_entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear_entry();
                displayOne();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input.isEmpty()) {
                    if (phepTinh == false) {
                        input = input + " ÷ ";
                        phepTinh = true;
                    }
                }
                displayOne();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input.isEmpty()) {
                    if (phepTinh == false) {
                        input = input + " × ";
                        phepTinh = true;
                    }
                }
                displayOne();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input.isEmpty()) {
                    if (phepTinh == false) {
                        input = input + " - ";
                        phepTinh = true;
                    }
                }
                displayOne();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input.isEmpty()) {
                    if (phepTinh == false) {
                        input = input + " + ";
                        phepTinh = true;
                    }
                }
                displayOne();
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(phepTinh == true && !input.substring(input.length()-1, input.length()).equals(" ")){
                    String [] tokens = input.split(" ");
                     switch(tokens[1].charAt(0)){
                         case '+':
                             answer = Double.toString(Double.parseDouble(tokens[0])+ Double.parseDouble(tokens[2]));
                             break;
                         case '-':
                             answer = Double.toString(Double.parseDouble(tokens[0])- Double.parseDouble(tokens[2]));
                             break;
                         case '×':
                             answer = Double.toString(Double.parseDouble(tokens[0])* Double.parseDouble(tokens[2]));
                             break;
                         case '÷':
                             answer = Double.toString(Double.parseDouble(tokens[0])/ Double.parseDouble(tokens[2]));
                             break;

                     }
                     displayTwo();
                }
            }
        });


    }

    public void displayOne() {
        text1.setText(input);

    }

    public void displayTwo() {
        text2.setText(answer);

    }

    public void clear() {
        input = "";
        answer = "";
        phepTinh = false;

    }

    public void backspace() {
        if (!input.isEmpty()) {
            input = input.substring(0, input.length() - 1);
        }
    }

    public void clear_entry() {
        if (!input.isEmpty()) {
            if (input.substring(input.length() - 1, input.length()).equals(" ")) {

                input = input.substring(0, input.length() - 3);
                phepTinh = false;
            }
            else {
                input = input.substring(0, input.length()-1);
            }

        }
    }




}