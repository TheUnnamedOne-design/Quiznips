package com.example.quiznips_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class easylevel extends AppCompatActivity {

    public static int counter=4;
    Button btn,backbutton;


    private String question_no="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easylevel);


        ImageView imageView[] = new ImageView[20];
        TextView txt[] = new TextView[20];

        Button button_array[] = new Button[20];

        String hold = "", hold_button_serial_number = "";
        btn = findViewById(R.id.counter);
        backbutton = findViewById(R.id.easy_levels_back);


        int a1, a3;

        for (a1 = 21; a1 <= 40; a1++) {
            Integer int_no = new Integer(a1);
            Integer btn_no = new Integer(a1 - 20);
            String number_hold = int_no.toString();
            String btn_number_hold = btn_no.toString();
            hold = "imageView" + number_hold;
            hold_button_serial_number = "button" + btn_number_hold;
            int resID = getResources().getIdentifier(hold, "id", getPackageName());
            int resID2 = getResources().getIdentifier(hold_button_serial_number, "id", getPackageName());
            imageView[a1 - 21] = findViewById(resID);
            button_array[a1 - 21] = findViewById(resID2);
        }

        String hold2 = "";
        for (a3 = 8; a3 <= 27; a3++) {
            Integer int_no = new Integer(a3);
            String number_hold = int_no.toString();
            hold2 = "textView" + number_hold;
            int resID = getResources().getIdentifier(hold2, "id", getPackageName());
            txt[a3 - 8] = findViewById(resID);
        }

        for (a1 = 0; a1 <= 19; a1++) {
            imageView[a1].setImageResource(R.drawable.level_lock);
        }

        for (a3 = 0; a3 <= 19; a3++) {
            txt[a3].setText(" ");
        }


        int a2, a4;
        for (a2 = 0; a2 < counter; a2++) {
            imageView[a2].setImageResource(R.drawable.orange_levels_button);
            Integer holder = new Integer(a2 + 1);
            String number = holder.toString();
            txt[a2].setText(number);
        }


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter <= 19) {
                    counter++;

                    int a2;
                    for (a2 = 0; a2 < counter; a2++) {
                        imageView[a2].setImageResource(R.drawable.orange_levels_button);
                        Integer holder = new Integer(a2 + 1);
                        String number = holder.toString();
                        txt[a2].setText(number);
                    }
                }

            }

        });


        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        buttons_pressed_label:
        {

            button_array[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    question_no="1";
                    Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                    intent.putExtra("LEVEL_CONFIGURATION", "1");
                    startActivity(intent);

                }
            });

            button_array[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    question_no="2";
                    Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                    intent.putExtra("LEVEL_CONFIGURATION", "2");
                    startActivity(intent);

                }
            });
        }


        button_array[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                question_no="3";
                Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                intent.putExtra("LEVEL_CONFIGURATION", "3");
                startActivity(intent);

            }
        });


        button_array[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                question_no="4";
                Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                intent.putExtra("LEVEL_CONFIGURATION", "4");
                startActivity(intent);

            }
        });


            button_array[4].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=5)
                    {
                        question_no="5";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION", "5");
                        startActivity(intent);
                    }


                }
            });



            button_array[5].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=6)
                    {
                        question_no="6";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION", "6");
                        startActivity(intent);
                    }


                }
            });



            button_array[6].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=7)
                    {
                        question_no="7";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION","7");
                        startActivity(intent);
                    }


                }
            });



            button_array[7].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=8)
                    {
                        question_no="8";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION","8");
                        startActivity(intent);
                    }


                }
            });



            button_array[8].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=9)
                    {
                        question_no="9";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION","9");
                        startActivity(intent);
                    }

                }
            });




            button_array[9].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=10)
                    {
                        question_no="10";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION","10");
                        startActivity(intent);
                    }


                }
            });



            button_array[10].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=11)
                    {
                        question_no="11";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION","11");
                        startActivity(intent);
                    }

                }
            });



            button_array[11].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=12)
                    {
                        question_no="12";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION","12");
                        startActivity(intent);
                    }


                }
            });



            button_array[12].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=13)
                    {
                        question_no="13";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION","13");
                        startActivity(intent);
                    }


                }
            });



            button_array[13].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=14)
                    {
                        question_no="14";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION","14");
                        startActivity(intent);
                    }


                }
            });



            button_array[14].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=15)
                    {
                        question_no="15";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION","15");
                        startActivity(intent);
                    }

                }
            });



            button_array[15].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=16)
                    {
                        question_no="16";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION","16");
                        startActivity(intent);
                    }

                }
            });



            button_array[16].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=17)
                    {
                        question_no="17";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION","17");
                        startActivity(intent);
                    }

                }
            });



            button_array[17].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=18)
                    {
                        question_no="18";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION","18");
                        startActivity(intent);
                    }

                }
            });



            button_array[18].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=19)
                    {
                        question_no="19";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION","19");
                        startActivity(intent);
                    }

                }
            });



            button_array[19].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(counter>=20)
                    {
                        question_no="20";
                        Intent intent = new Intent(easylevel.this, easy_questions_lets_play.class);
                        intent.putExtra("LEVEL_CONFIGURATION","20");
                        startActivity(intent);
                    }

                }
            });

    }


}