package com.example.netclanexplorer;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RefineActivity extends AppCompatActivity {
    String[] items = {"Available | Hey Let Us Connect","Away | Stay Discrete And Watch","Busy | Do Not Disturb | Will Catch Up Later",
    "SOS | Emergency! Need Assistance! HELP"};
    private boolean isRed = false;
    private SeekBar seekBar;

    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> listitems;
    private EditText editText;
    private TextView characterCount;
    private int maxCharLimit = 250;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine);

        editText = findViewById(R.id.editText); // Replace with your EditText ID
        characterCount = findViewById(R.id.characterCount); // Replace with your TextView ID

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Not needed for this example
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Not needed for this example
            }

            @Override
            public void afterTextChanged(Editable editable) {
                int currentLength = editable.toString().length();

                // Check if the character limit is exceeded
                if (currentLength > maxCharLimit) {
                    int selectionStart = editText.getSelectionStart();
                    int selectionEnd = editText.getSelectionEnd();

                    // Trim the text to the character limit
                    editable.delete(selectionStart - 1, selectionEnd);
                    editText.setText(editable);
                    editText.setSelection(selectionStart - 1);
                }

                // Update the character count TextView
                characterCount.setText(currentLength + "/" + maxCharLimit);
            }
        });

        ImageView backbtn = findViewById(R.id.imageView);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RefineActivity.this,MainActivity.class));
            }
        });

        TextView toggleLayout = findViewById(R.id.coffeetext);
        TextView bussinessText = findViewById(R.id.businesstext);
        TextView hobbytext = findViewById(R.id.hobbytext);
        TextView frienshiptext = findViewById(R.id.friendshiptext);
        TextView moviestext = findViewById(R.id.movietext);
        TextView dinningtext = findViewById(R.id.dinnigtext);
        TextView datingtext = findViewById(R.id.datingtext);
        TextView Matrimory = findViewById(R.id.Matrimonytext);
        final boolean[] isClicked = {false};

        toggleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the background color on each click
                if (isClicked[0]) {
                    v.setBackgroundResource(R.drawable.select_purpose_bg);
                    toggleLayout.setTextColor(getResources().getColor(R.color.Black));
                } else {
                    v.setBackgroundResource(R.drawable.select_purpose_red);
                    toggleLayout.setTextColor(getResources().getColor(R.color.White));

                }
                isClicked[0] = !isClicked[0];
            }
        });
        bussinessText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the background color on each click
                if (isClicked[0]) {
                    v.setBackgroundResource(R.drawable.select_purpose_bg);
                    bussinessText.setTextColor(getResources().getColor(R.color.Black));

                } else {
                    v.setBackgroundResource(R.drawable.select_purpose_red);
                    bussinessText.setTextColor(getResources().getColor(R.color.White));

                }
                isClicked[0] = !isClicked[0];
            }
        });
        hobbytext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the background color on each click
                if (isClicked[0]) {
                    v.setBackgroundResource(R.drawable.select_purpose_bg);
                    hobbytext.setTextColor(getResources().getColor(R.color.Black));

                } else {
                    v.setBackgroundResource(R.drawable.select_purpose_red);
                    hobbytext.setTextColor(getResources().getColor(R.color.White));

                }
                isClicked[0] = !isClicked[0];
            }
        });
        frienshiptext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the background color on each click
                if (isClicked[0]) {
                    v.setBackgroundResource(R.drawable.select_purpose_bg);
                    frienshiptext.setTextColor(getResources().getColor(R.color.Black));

                } else {
                    v.setBackgroundResource(R.drawable.select_purpose_red);
                    frienshiptext.setTextColor(getResources().getColor(R.color.White));

                }
                isClicked[0] = !isClicked[0];
            }
        });
        moviestext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the background color on each click
                if (isClicked[0]) {
                    v.setBackgroundResource(R.drawable.select_purpose_bg);
                    moviestext.setTextColor(getResources().getColor(R.color.Black));

                } else {
                    v.setBackgroundResource(R.drawable.select_purpose_red);
                    moviestext.setTextColor(getResources().getColor(R.color.White));

                }
                isClicked[0] = !isClicked[0];
            }
        });
        dinningtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the background color on each click
                if (isClicked[0]) {
                    v.setBackgroundResource(R.drawable.select_purpose_bg);
                    dinningtext.setTextColor(getResources().getColor(R.color.Black));

                } else {
                    v.setBackgroundResource(R.drawable.select_purpose_red);
                    dinningtext.setTextColor(getResources().getColor(R.color.White));

                }
                isClicked[0] = !isClicked[0];
            }
        });
        datingtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the background color on each click
                if (isClicked[0]) {
                    v.setBackgroundResource(R.drawable.select_purpose_bg);
                    datingtext.setTextColor(getResources().getColor(R.color.Black));

                } else {
                    v.setBackgroundResource(R.drawable.select_purpose_red);
                    datingtext.setTextColor(getResources().getColor(R.color.White));

                }
                isClicked[0] = !isClicked[0];
            }
        });
        Matrimory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the background color on each click
                if (isClicked[0]) {
                    v.setBackgroundResource(R.drawable.select_purpose_bg);
                    Matrimory.setTextColor(getResources().getColor(R.color.Black));

                } else {
                    v.setBackgroundResource(R.drawable.select_purpose_red);
                    Matrimory.setTextColor(getResources().getColor(R.color.White));

                }
                isClicked[0] = !isClicked[0];
            }
        });

        seekBar = (SeekBar) findViewById(R.id.seekbar);
        TextView seekbartext = findViewById(R.id.seekbartext);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekbartext.setText(String.valueOf(progress));

                int width = seekBar.getWidth() - seekBar.getPaddingLeft() - seekBar.getPaddingRight();
                int thumbpos = seekBar.getPaddingLeft() + width * seekBar.getProgress()/seekBar.getMax();
                seekbartext.measure(0,0);
                int txtw = seekbartext.getMeasuredWidth();
                int delta = txtw/2;
                seekbartext.setX(seekBar.getX()+thumbpos-delta);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete);
        listitems = new ArrayAdapter<String>(this,R.layout.list_item,items);

        autoCompleteTextView.setAdapter(listitems);
        autoCompleteTextView.setText("Available | Hey Let Us Connect", false);


        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
              }
        });
    }
}