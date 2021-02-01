package com.example.tp1_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView name, surname, age, skill, phone;
        EditText editName, editSurname,editAge, editSkill, editPhone;

        name = new TextView(this);
        name.setText(R.string.name_text);

        surname = new TextView(this);
        surname.setText(R.string.surname_text);

        age = new TextView(this);
        age.setText(R.string.age_text);

        skill = new TextView(this);
        skill.setText(R.string.skill_text);

        phone = new TextView(this);
        phone.setText(R.string.tel_text);


        editName = new EditText(this);
        editName.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        editSurname = new EditText(this);
        editSurname.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        editAge = new EditText(this);
        editAge.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        editSkill = new EditText(this);
        editSkill.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        editPhone = new EditText(this);
        editPhone.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        Button register = new Button(this);
        register.setText(R.string.ok_button);


        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);

        ll.addView(name);
        ll.addView(editName);
        ll.addView(surname);
        ll.addView(editSurname);
        ll.addView(age);
        ll.addView(editAge);
        ll.addView(skill);
        ll.addView(editSkill);
        ll.addView(phone);
        ll.addView(editPhone);
        ll.addView(register);

        setContentView(ll);
    }
}