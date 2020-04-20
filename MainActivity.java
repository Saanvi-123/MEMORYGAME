
package com.saanvi.memorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private static final long START_TIME_IN_MILLIS = 600000;

    private TextView mTextViewCountDown;
    private Button mButtonStartPause;
    private Button mButtonReset;

    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning;
    Button one1, two2, three3, four4, five5, six6, seven7, eight8, nine9,
            ten10, eleven11, twelve12, thirteen13, fourteen14, fifteen15, sixteen16;


    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    public int maxCounter = 0;
    public int scoreCounter;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button ten;
    Button eleven;
    Button twelve;
    Button thirteen;
    Button fourteen;
    Button fifteen;
    Button sixteen;
    Button score;
    TextView output;
    Integer[] images = {R.drawable.cheetah, R.drawable.chick, R.drawable.fox, R.drawable.giraffe,
            R.drawable.owl, R.drawable.panda, R.drawable.sheep, R.drawable.tiger, R.drawable.cheetah,
            R.drawable.chick, R.drawable.fox, R.drawable.giraffe, R.drawable.owl, R.drawable.panda,
            R.drawable.sheep, R.drawable.tiger};
    List<Integer> imageList = Arrays.asList(images);

    Button[] buttons = {one, two, three, four, five, six, seven, eight, nine, ten, eleven,
            twelve, thirteen, fourteen, fifteen, sixteen};
    List<Integer> buttonList = Arrays.asList(images);

    ArrayList arrayList = new ArrayList<Integer>();
//    ArrayList unmatchedButtons = new ArrayList<Integer>();
    ArrayList unmatchedButtons = new ArrayList<Button>();
    Button[] unmatchedButtonsArray = new Button[16];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Collections.shuffle(imageList);
        imageList.toArray(images);
        List<Button> unmatchedImages = Arrays.asList(buttons);
        arrayList.add(0, 1);
        arrayList.add(1, 2);
//        Collections.shuffle(buttonList);
//        buttonList.toArray(buttons);
//        static Integer[] images = {R.drawable.cheetah, R.drawable.chick, R.drawable.fox, R.drawable.giraffe,
//                R.drawable.owl, R.drawable.panda, R.drawable.sheep, R.drawable.tiger, R.drawable.cheetah,
//                R.drawable.chick, R.drawable.fox, R.drawable.giraffe, R.drawable.owl, R.drawable.panda,
//                R.drawable.sheep, R.drawable.tiger};
//        static List<Integer> imageList = Arrays.asList(images);
//        Collections.shuffle(imageList);
//        imageList.toArray(images);
//        Button[] buttons = {one, two, three, four, five, six, seven, eight, nine, ten, eleven,
//                twelve, thirteen, fourteen, fifteen, sixteen};
//        List<Integer> buttonList = Arrays.asList(images);
//        Collections.shuffle(buttonList);
//        buttonList.toArray(buttons);
//        ArrayList arrayList = new ArrayList<Integer>();
//        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
//
//        List<Integer> intList = Arrays.asList(intArray);
//
//        Collections.shuffle(intList);
//
//        intList.toArray(intArray);
//
//        System.out.println(Arrays.toString(intArray));
//
//       Integer[] images = { R.drawable.cheetah, R.drawable.chick, R.drawable.fox, R.drawable.giraffe, R.drawable.owl, R.drawable.panda, R.drawable.sheep, R.drawable.tiger, R.drawable.cheetah, R.drawable.chick, R.drawable.fox, R.drawable.giraffe, R.drawable.owl, R.drawable.panda, R.drawable.sheep, R.drawable.tiger };
//        List<Integer> imagelist = Arrays.asList(images);
//      Collections.shuffle(imagelist);
//        imagelist.toArray(images);
//        System.out.println();
//        List<Integer> images;
//        images = new ArrayList<Integer>();
//        images.add(R.drawable.cheetah);
//        images.add(R.drawable.chick);
//        images.add(R.drawable.fox);
//        images.add(R.drawable.giraffe);
//        images.add(R.drawable.owl);
//        images.add(R.drawable.panda);
//        images.add(R.drawable.sheep);
//        images.add(R.drawable.tiger);
//        Button[] buttons = { one, two, three, four, five, six, seven, eight, nine, ten, eleven,
//                twelve, thirteen, fourteen, fifteen, sixteen };
//        List<Integer> buttons;
//        buttons = new ArrayList<Integer>();
//        buttons.add(R.id.button1);
//        buttons.add(R.id.button2);
//        buttons.add(R.id.button3);
//        buttons.add(R.id.button4);
//        buttons.add(R.id.button5);
//        buttons.add(R.id.button6);
//        buttons.add(R.id.button7);
//        buttons.add(R.id.button8);
//        buttons.add(R.id.button9);
//        buttons.add(R.id.button10);
//        buttons.add(R.id.button11);
//        buttons.add(R.id.button12);
//        buttons.add(R.id.button13);
//        buttons.add(R.id.button14);
//        buttons.add(R.id.button15);
//        buttons.add(R.id.button16);
        one = (Button) findViewById(R.id.button1);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eight = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);
        ten = (Button) findViewById(R.id.button10);
        eleven = (Button) findViewById(R.id.button11);
        twelve = (Button) findViewById(R.id.button12);
        thirteen = (Button) findViewById(R.id.button13);
        fourteen = (Button) findViewById(R.id.button14);
        fifteen = (Button) findViewById(R.id.button15);
        sixteen = (Button) findViewById(R.id.button16);
//        Button[] buttons = { one, two, three, four, five, six, seven, eight, nine, ten, eleven,
//                twelve, thirteen, fourteen, fifteen, sixteen };

        mTextViewCountDown = findViewById(R.id.text_view_countdown);
        mButtonStartPause = findViewById(R.id.button_start_pause);
        mButtonReset = findViewById(R.id.button_reset);

        mButtonStartPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTimerRunning) {
                    pauseTimer();
                } else {
                    startTimer();
                }
            }
        });
        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });
        updateCountDownText();
    }

    public void onClick(View v) {

        final int id = v.getId();
        score = (Button) findViewById(R.id.score);
        if (mTimerRunning) {
            if (arrayList.get(0) != arrayList.get(1)) {
                if (maxCounter == 0) {
                    switch (id) {
                        case R.id.button1:
                            one.setBackgroundResource(images[0]);
                            arrayList.add(images[0]);
                            maxCounter++;
                            break;
                        case R.id.button2:
                            two.setBackgroundResource(images[1]);
                            arrayList.add(images[1]);
                            maxCounter++;
                            break;
                        case R.id.button3:
                            three.setBackgroundResource(images[2]);
                            arrayList.add( images[2]);
                            maxCounter++;
                            break;
                        case R.id.button4:
                            four.setBackgroundResource(images[3]);
                            arrayList.add( images[3]);
                            maxCounter++;
                            break;
                        case R.id.button5:
                            five.setBackgroundResource(images[4]);
                            arrayList.add( images[4]);
                            maxCounter++;
                            break;
                        case R.id.button6:
                            six.setBackgroundResource(images[5]);
                            arrayList.add( images[5]);
                            maxCounter++;
                            break;
                        case R.id.button7:
                            seven.setBackgroundResource(images[6]);
                            arrayList.add( images[6]);
                            maxCounter++;
                            break;
                        case R.id.button8:
                            eight.setBackgroundResource(images[7]);
                            arrayList.add( images[7]);
                            maxCounter++;
                            break;
                        case R.id.button9:
                            nine.setBackgroundResource(images[8]);
                            arrayList.add(images[8]);
                            maxCounter++;
                            break;
                        case R.id.button10:
                            ten.setBackgroundResource(images[9]);
                            arrayList.add(images[9]);
                            maxCounter++;
                            break;
                        case R.id.button11:
                            eleven.setBackgroundResource(images[10]);
                            arrayList.add(images[10]);
                            maxCounter++;
                            break;
                        case R.id.button12:
                            twelve.setBackgroundResource(images[11]);
                            arrayList.add(images[11]);
                            maxCounter++;
                            break;
                        case R.id.button13:
                            thirteen.setBackgroundResource(images[12]);
                            arrayList.add(images[12]);
                            maxCounter++;
                            break;
                        case R.id.button14:
                            fourteen.setBackgroundResource(images[13]);
                            arrayList.add(images[13]);
                            maxCounter++;
                            break;
                        case R.id.button15:
                            fifteen.setBackgroundResource(images[14]);
                            arrayList.add(images[14]);
                            maxCounter++;
                            break;
                        case R.id.button16:
                            sixteen.setBackgroundResource(images[15]);
                            arrayList.add(images[15]);
                            maxCounter++;
                            break;
                    }                unmatchedButtons.toArray(unmatchedButtonsArray);

                } else if (maxCounter == 1) {
                    switch (id) {
                        case R.id.button1:
                            one.setBackgroundResource(images[0]);
                            arrayList.add(1, images[0]);
                            maxCounter++;
                            break;
                        //help me
                        case R.id.button2:
                            two.setBackgroundResource(images[1]);
                            arrayList.add(1, images[1]);
                            maxCounter++;
                            break;
                        case R.id.button3:
                            three.setBackgroundResource(images[2]);
                            arrayList.add(1, images[2]);
                            maxCounter++;
                            break;
                        case R.id.button4:
                            four.setBackgroundResource(images[3]);
                            arrayList.add(1, images[3]);
                            maxCounter++;
                            break;
                        case R.id.button5:
                            five.setBackgroundResource(images[4]);
                            arrayList.add(1, images[4]);
                            maxCounter++;
                            break;
                        case R.id.button6:
                            six.setBackgroundResource(images[5]);
                            arrayList.add(1, images[5]);
                            maxCounter++;
                            break;
                        case R.id.button7:
                            seven.setBackgroundResource(images[6]);
                            arrayList.add(1, images[6]);
                            maxCounter++;
                            break;
                        case R.id.button8:
                            eight.setBackgroundResource(images[7]);
                            arrayList.add(1, images[7]);
                            maxCounter++;
                            break;
                        case R.id.button9:
                            nine.setBackgroundResource(images[8]);
                            arrayList.add(1, images[8]);
                            maxCounter++;
                            break;
                        case R.id.button10:
                            ten.setBackgroundResource(images[9]);
                            arrayList.add(1, images[9]);
                            maxCounter++;
                            break;
                        case R.id.button11:
                            eleven.setBackgroundResource(images[10]);
                            arrayList.add(1, images[10]);
                            maxCounter++;
                            break;
                        case R.id.button12:
                            twelve.setBackgroundResource(images[11]);
                            arrayList.add(1, images[11]);
                            maxCounter++;
                            break;
                        case R.id.button13:
                            thirteen.setBackgroundResource(images[12]);
                            arrayList.add(1, images[12]);
                            maxCounter++;
                            break;
                        case R.id.button14:
                            fourteen.setBackgroundResource(images[13]);
                            arrayList.add(1, images[13]);
                            maxCounter++;
                            break;
                        case R.id.button15:
                            fifteen.setBackgroundResource(images[14]);
                            arrayList.add(1, images[14]);
                            maxCounter++;
                            break;
                        case R.id.button16:
                            sixteen.setBackgroundResource(images[15]);
                            arrayList.add(1, images[15]);
                            maxCounter++;
                            break;
                    }
                    unmatchedButtons.toArray(unmatchedButtonsArray);

                }
                else if(maxCounter == 2){
                    maxCounter= 0;
                    one.setBackgroundResource(R.drawable.question_mark);
                    two.setBackgroundResource(R.drawable.question_mark);
                    three.setBackgroundResource(R.drawable.question_mark);
                    four.setBackgroundResource(R.drawable.question_mark);
                    five.setBackgroundResource(R.drawable.question_mark);
                    six.setBackgroundResource(R.drawable.question_mark);
                    seven.setBackgroundResource(R.drawable.question_mark);
                    eight.setBackgroundResource(R.drawable.question_mark);
                    nine.setBackgroundResource(R.drawable.question_mark);
                    ten.setBackgroundResource(R.drawable.question_mark);
                    eleven.setBackgroundResource(R.drawable.question_mark);
                    twelve.setBackgroundResource(R.drawable.question_mark);
                    thirteen.setBackgroundResource(R.drawable.question_mark);
                    fourteen.setBackgroundResource(R.drawable.question_mark);
                    fifteen.setBackgroundResource(R.drawable.question_mark);
                    sixteen.setBackgroundResource(R.drawable.question_mark);

//                    one1 = (Button) unmatchedButtonsArray[0];
//                    two2 = (Button) unmatchedButtonsArray[1];
//                    three3 = (Button) unmatchedButtonsArray[2];
//                    four4 = (Button) unmatchedButtonsArray[3];
//                    five5 = (Button) unmatchedButtonsArray[4];
//                    six6 = (Button) unmatchedButtonsArray[5];
//                    seven7 = (Button) unmatchedButtonsArray[6];
//                    eight8 = (Button) unmatchedButtonsArray[7];
//                    nine9 = (Button) unmatchedButtonsArray[8];
//                    ten10 = (Button) unmatchedButtonsArray[9];
//                    eleven11 = (Button) unmatchedButtonsArray[10];
//                    twelve12 = (Button) unmatchedButtonsArray[11];
//                    thirteen13 = (Button) unmatchedButtonsArray[12];
//                    fourteen14 = (Button) unmatchedButtonsArray[13];
//                    fifteen15 = (Button) unmatchedButtonsArray[14];
//                    sixteen16 = (Button) unmatchedButtonsArray[15];
//                    one1.setBackgroundResource(R.drawable.question_mark);
//                    two2.setBackgroundResource(R.drawable.question_mark);
//                    three3.setBackgroundResource(R.drawable.question_mark);
//                    four4.setBackgroundResource(R.drawable.question_mark);
//                    five5.setBackgroundResource(R.drawable.question_mark);
//                    six6.setBackgroundResource(R.drawable.question_mark);
//                    seven7.setBackgroundResource(R.drawable.question_mark);
//                    eight8.setBackgroundResource(R.drawable.question_mark);
//                    nine9.setBackgroundResource(R.drawable.question_mark);
//                    ten10.setBackgroundResource(R.drawable.question_mark);
//                    eleven11.setBackgroundResource(R.drawable.question_mark);
//                    twelve12.setBackgroundResource(R.drawable.question_mark);
//                    thirteen13.setBackgroundResource(R.drawable.question_mark);
//                    fourteen14.setBackgroundResource(R.drawable.question_mark);
//                    fifteen15.setBackgroundResource(R.drawable.question_mark);
//                    sixteen16.setBackgroundResource(R.drawable.question_mark);
//                    maxCounter = 0;
                    }

                }


            }
            else if(arrayList.get(0) == arrayList.get(1)){
                arrayList.clear();
                scoreCounter++;
                score.setText(scoreCounter);
            }
        }



    private void startTimer() {
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                Button[] buttons = { one, two, three, four, five, six, seven, eight, nine, ten, eleven,
                        twelve, thirteen, fourteen, fifteen, sixteen };
                mTimerRunning = false;
                mButtonStartPause.setText("START");
                mButtonStartPause.setVisibility(View.INVISIBLE);
                mButtonReset.setVisibility(View.VISIBLE);
                for(int i = 0; i <= 15; i++){
                    buttons[i].setBackgroundResource(R.drawable.question_mark);
                    maxCounter = 0;
                    scoreCounter = 0;
                }
            }
        }.start();

        mTimerRunning = true;
        mButtonStartPause.setText("PAUSE");
        mButtonReset.setVisibility(View.INVISIBLE);
    }
    private void pauseTimer() {
        mCountDownTimer.cancel();
        mTimerRunning = false;
        mButtonStartPause.setText("START");
        mButtonReset.setVisibility(View.VISIBLE);
    }
    private void resetTimer() {
        Button[] buttons = { one, two, three, four, five, six, seven, eight, nine, ten, eleven,
                twelve, thirteen, fourteen, fifteen, sixteen };
        mTimeLeftInMillis = START_TIME_IN_MILLIS;
        updateCountDownText();
        mButtonReset.setVisibility(View.INVISIBLE);
        mButtonStartPause.setVisibility(View.VISIBLE);
        for(int i = 0; i <= 15; i++){
            buttons[i].setBackgroundResource(R.drawable.question_mark);
            maxCounter = 0;
            scoreCounter = 0;
            score.setText(scoreCounter);
        }
    }

    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(),"%02d:%02d", minutes, seconds);
        mTextViewCountDown.setText(timeLeftFormatted);
    }
}