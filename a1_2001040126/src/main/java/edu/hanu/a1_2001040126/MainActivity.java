package edu.hanu.a1_2001040126;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RadioButton btnHiragana, btnKatakana;
    TextView titleText;
    ArrayList<Item> hiraImg, kataImg;
    private RecyclerView recyclerItem;
    private ItemAdapter itemAdapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        createHiraganaList();
        createKatakanaList();
        itemAdapter = new ItemAdapter(MainActivity.this, hiraImg);
        recyclerItem.setAdapter(itemAdapter);
        recyclerItem.setLayoutManager(new GridLayoutManager(MainActivity.this, 5));

        btnHiragana.setOnClickListener(view -> {
            titleText.setText(R.string.txt_hiragana);
            itemAdapter = new ItemAdapter(MainActivity.this, hiraImg);
            recyclerItem.setAdapter(itemAdapter);
            recyclerItem.setLayoutManager(new GridLayoutManager(MainActivity.this, 5));
        });

        btnKatakana.setOnClickListener(view -> {
            titleText.setText(R.string.txt_katakana);
            itemAdapter= new ItemAdapter(MainActivity.this, kataImg);
            recyclerItem.setAdapter(itemAdapter);
            recyclerItem.setLayoutManager(new GridLayoutManager(MainActivity.this, 5));
        });

    }



    protected void initView() {
        btnHiragana = findViewById(R.id.btnHiragana);
        btnKatakana = findViewById(R.id.btnKatakana);
        recyclerItem = findViewById(R.id.recycleView);
        titleText = findViewById(R.id.titleText);
    }
    protected void createHiraganaList() {
        hiraImg = new ArrayList<>();
        hiraImg.add(new Item(R.drawable.a,R.raw.a));
        hiraImg.add(new Item(R.drawable.i,R.raw.i));
        hiraImg.add(new Item(R.drawable.u,R.raw.u));
        hiraImg.add(new Item(R.drawable.e,R.raw.e));
        hiraImg.add(new Item(R.drawable.o,R.raw.o));

        hiraImg.add(new Item(R.drawable.ka,R.raw.ka));
        hiraImg.add(new Item(R.drawable.ki,R.raw.ki));
        hiraImg.add(new Item(R.drawable.ku,R.raw.ku));
        hiraImg.add(new Item(R.drawable.ke,R.raw.ke));
        hiraImg.add(new Item(R.drawable.ko,R.raw.ko));

        hiraImg.add(new Item(R.drawable.sa,R.raw.sa));
        hiraImg.add(new Item(R.drawable.shi,R.raw.shi));
        hiraImg.add(new Item(R.drawable.su,R.raw.su));
        hiraImg.add(new Item(R.drawable.se,R.raw.se));
        hiraImg.add(new Item(R.drawable.so,R.raw.so));

        hiraImg.add(new Item(R.drawable.ta,R.raw.ta));
        hiraImg.add(new Item(R.drawable.chi,R.raw.chi));
        hiraImg.add(new Item(R.drawable.tsu,R.raw.tsu));
        hiraImg.add(new Item(R.drawable.te,R.raw.te));
        hiraImg.add(new Item(R.drawable.to,R.raw.to));

        hiraImg.add(new Item(R.drawable.na,R.raw.na));
        hiraImg.add(new Item(R.drawable.ni,R.raw.ni));
        hiraImg.add(new Item(R.drawable.nu,R.raw.nu));
        hiraImg.add(new Item(R.drawable.ne,R.raw.ne));
        hiraImg.add(new Item(R.drawable.no,R.raw.no));

        hiraImg.add(new Item(R.drawable.ha,R.raw.ha));
        hiraImg.add(new Item(R.drawable.hi,R.raw.hi));
        hiraImg.add(new Item(R.drawable.fu,R.raw.fu));
        hiraImg.add(new Item(R.drawable.he,R.raw.he));
        hiraImg.add(new Item(R.drawable.ho,R.raw.ho));

        hiraImg.add(new Item(R.drawable.ma,R.raw.ma));
        hiraImg.add(new Item(R.drawable.mi,R.raw.mi));
        hiraImg.add(new Item(R.drawable.mu,R.raw.mu));
        hiraImg.add(new Item(R.drawable.me,R.raw.me));
        hiraImg.add(new Item(R.drawable.mo,R.raw.mo));

        hiraImg.add(new Item(R.drawable.ya,R.raw.ya));
        hiraImg.add(new Item(R.drawable.empty,-1));
        hiraImg.add(new Item(R.drawable.yu,R.raw.yu));
        hiraImg.add(new Item(R.drawable.empty,-1));
        hiraImg.add(new Item(R.drawable.yo,R.raw.yo));

        hiraImg.add(new Item(R.drawable.ra,R.raw.ra));
        hiraImg.add(new Item(R.drawable.ri,R.raw.ri));
        hiraImg.add(new Item(R.drawable.ru,R.raw.ru));
        hiraImg.add(new Item(R.drawable.re,R.raw.re));
        hiraImg.add(new Item( R.drawable.ro, R.raw.wo));

        hiraImg.add(new Item( R.drawable.wa,  R.raw.wa));
        hiraImg.add(new Item( R.drawable.empty,-1));
        hiraImg.add(new Item( R.drawable.empty,-1));
        hiraImg.add(new Item( R.drawable.empty,-1));
        hiraImg.add(new Item( R.drawable.wo,R.raw.wo));

        hiraImg.add(new Item(R.drawable.n,R.raw.n));
    }



    protected void createKatakanaList() {
        kataImg = new ArrayList<>();
        kataImg.add(new Item(R.drawable.a1,R.raw.a));
        kataImg.add(new Item(R.drawable.i1,R.raw.i));
        kataImg.add(new Item(R.drawable.u1,R.raw.u));
        kataImg.add(new Item(R.drawable.e1,R.raw.e));
        kataImg.add(new Item(R.drawable.o1,R.raw.o));

        kataImg.add(new Item(R.drawable.ka1,R.raw.ka));
        kataImg.add(new Item(R.drawable.ki1,R.raw.ki));
        kataImg.add(new Item(R.drawable.ku1,R.raw.ku));
        kataImg.add(new Item(R.drawable.ke1,R.raw.ke));
        kataImg.add(new Item(R.drawable.ko1,R.raw.ke));

        kataImg.add(new Item(R.drawable.sa1,R.raw.sa));
        kataImg.add(new Item(R.drawable.shi1,R.raw.shi));
        kataImg.add(new Item(R.drawable.su1,R.raw.su));
        kataImg.add(new Item(R.drawable.se1,R.raw.se));
        kataImg.add(new Item(R.drawable.so1,R.raw.so));

        kataImg.add(new Item(R.drawable.ta1,R.raw.ta));
        kataImg.add(new Item(R.drawable.chi1,R.raw.chi));
        kataImg.add(new Item(R.drawable.tsu1,R.raw.tsu));
        kataImg.add(new Item(R.drawable.te1,R.raw.te));
        kataImg.add(new Item(R.drawable.to1,R.raw.to));

        kataImg.add(new Item(R.drawable.na1,R.raw.na));
        kataImg.add(new Item(R.drawable.ni1,R.raw.ni));
        kataImg.add(new Item(R.drawable.nu1,R.raw.nu));
        kataImg.add(new Item(R.drawable.ne1,R.raw.ne));
        kataImg.add(new Item(R.drawable.no1,R.raw.no));

        kataImg.add(new Item(R.drawable.ha1,R.raw.ha));
        kataImg.add(new Item(R.drawable.hi1,R.raw.hi));
        kataImg.add(new Item(R.drawable.fu1,R.raw.fu));
        kataImg.add(new Item(R.drawable.he1,R.raw.he));
        kataImg.add(new Item(R.drawable.ho1,R.raw.ho));

        kataImg.add(new Item(R.drawable.ma1,R.raw.ma));
        kataImg.add(new Item(R.drawable.mi1,R.raw.mi));
        kataImg.add(new Item(R.drawable.mu1,R.raw.mu));
        kataImg.add(new Item(R.drawable.me1,R.raw.me));
        kataImg.add(new Item(R.drawable.mo1,R.raw.mo));

        kataImg.add(new Item(R.drawable.ya1,R.raw.ya));
        kataImg.add(new Item(R.drawable.empty,-1));
        kataImg.add(new Item(R.drawable.yu1,R.raw.yu));
        kataImg.add(new Item(R.drawable.empty,-1));
        kataImg.add(new Item(R.drawable.yo1,R.raw.yo));

        kataImg.add(new Item(R.drawable.ra1,R.raw.ra));
        kataImg.add(new Item(R.drawable.ri1,R.raw.ri));
        kataImg.add(new Item(R.drawable.ru1,R.raw.ru));
        kataImg.add(new Item(R.drawable.re1,R.raw.re));
        kataImg.add(new Item( R.drawable.ro1, R.raw.wo));

        kataImg.add(new Item( R.drawable.wa1,  R.raw.wa));
        kataImg.add(new Item( R.drawable.empty,-1));
        kataImg.add(new Item( R.drawable.empty,-1));
        kataImg.add(new Item( R.drawable.empty,-1));
        kataImg.add(new Item( R.drawable.wo1,R.raw.wo));

        kataImg.add(new Item(R.drawable.n1,R.raw.n));
    }
}
