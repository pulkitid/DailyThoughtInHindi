package com.pulkit.dailythoughthindi;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class Words extends Activity {

    String currentDay=null;
    String currentDate=null;
    StringTokenizer dateToken;
    //boolean firstTime=true;
    int i=0;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        //Log.i("DailyThought", "Words ");
        try
        {
            //TextView tvHead = (TextView) findViewById(R.id.textViewHead);
            TextView tvMain = (TextView) findViewById(R.id.textViewMain);
            TextView tvAnmol = (TextView) findViewById(R.id.textViewAnmolVachan);
            TextView tvVachan = (TextView) findViewById(R.id.textViewVachan);

            Typeface mainfontHindi = Typeface.createFromAsset(getAssets(),
                    "fonts/Kruti_Dev_040__Bold.ttf");
            Typeface subMainfontHindi = Typeface.createFromAsset(getAssets(),
                    "fonts/Kruti_Dev_040__Thin.ttf");
            Typeface mangalb = Typeface.createFromAsset(getAssets(),
                    "fonts/mangalb.ttf");
            Typeface mangal = Typeface.createFromAsset(getAssets(),
                    "fonts/MANGAL.TTF");

            //tvHead.setTypeface(mangalb);
            tvMain.setTypeface(mangal);
            tvAnmol.setTypeface(mangalb);
            tvVachan.setTypeface(mangal);

            prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            //Log.i("DailyThought", "current--> "+prefs.getString("current", ""));
            //Log.i("DailyThought", "first--> "+prefs.getString("first", ""));

            //prefs.edit().putBoolean("first",false).commit();


            if (prefs.getString("first", "")=="")
            {
                //Log.i("DailyThought", "IF ");

                currentDate = new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new Date());
                //Log.i("DailyThought", "currentDate " + currentDate);
                dateToken = new StringTokenizer((currentDate), ".");
                while (dateToken.hasMoreTokens()) {
                    dateToken.nextToken();
                    dateToken.nextToken();
                    currentDay = dateToken.nextToken();
                    //Log.i("DailyThought", "currentDay " + currentDay);
                    break;
                }
                prefs.edit().putString("current", currentDay).commit();
                prefs.edit().putString("first", "first").commit();

            } else {
                //Log.i("DailyThought", "Else ");
                currentDay = prefs.getString("current", "");

            }
            //}
            //}

            if (currentDay.equals("1")){
                //Log.i("DailyThought", "1");
                //tvHead.setText("आज का विचार");
                tvMain.setText("शिखर चूमना है तो पुरुषार्थ करें|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("जो प्रसन्न रहते हैं, उनके मन में कभी आलस्य नहीं आता| आलस्य एक बहुत बड़ा विकार है|");
            }
            if (currentDay.equals("2")){
                //Log.i("DailyThought", "2");
                //tvHead.setText("आज का विचार");
                tvMain.setText("दुखों का छुटकारा धन से नहीं धर्म से होता हैं|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("होठों पर मुस्कान हर मुश्किल कार्य को आसान कर देती है|");
            }
            if (currentDay.equals("3")){
                //Log.i("DailyThought", "3");
                //tvHead.setText("आज का विचार");
                tvMain.setText("जीवन के सिद्धांत ही व्यक्ति को ऊपर उठाते हैं|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("गुण की पूजा सर्वत्र होती है, सम्पति की नहीं|");
            }
            if (currentDay.equals("4")){
                //Log.i("DailyThought", "4");
                //tvHead.setText("आज का विचार");
                tvMain.setText("जीवन में सदा वे बीज बोएँ, जिन्हें काटते समय खेद और कटुता न हो|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("दूसरों के दोष ना देखो, अपने अन्दर के दोष देखो तो निर्दोष बन जाओगे|");
            }
            if (currentDay.equals("5")){
                //Log.i("DailyThought", "5");
                //tvHead.setText("आज का विचार");
                tvMain.setText("एक संस्कारित बालक का निर्माण सौ विधालयों को बनाने के समान है|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("जो प्रसन्न रहते है, उनके मन में कभी आलस्य नहीं आता। आलस्य एक बहुत बड़ा विकार है।");
            }
            if (currentDay.equals("6")){
                //Log.i("DailyThought", "6");
                //tvHead.setText("आज का विचार");
                tvMain.setText("विफलता मात्र एक पड़ाव है, मंज़िल नहीं|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("प्रसन्नता चेहरे का सच्चा सौंदर्य है| चिड़चिड़े स्वभाव का व्यक्ति वास्तव में कुरूप है|");
            }
            if (currentDay.equals("7")){
                //Log.i("DailyThought", "7");
                //tvHead.setText("आज का विचार");
                tvMain.setText("जीवन भर विद्यार्थी बने रहें ताकि ज्ञान-प्राप्ति के द्वार खुले रहें|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("ईश्वर की स्मृति से ही हम सदगति प्राप्त कर सकते हैं|");
            }
            if (currentDay.equals("8")){
                //Log.i("DailyThought", "8");
                //tvHead.setText("आज का विचार");
                tvMain.setText("हर हाल में मस्त रहो, मन की शांति पाने का यह प्रथम और अंतिम मंत्र है|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("आत्मा का परमात्मा से मिलना ही सर्वश्रेष्ठ है|");
            }
            if (currentDay.equals("9")){
                //Log.i("DailyThought", "9");
                //tvHead.setText("आज का विचार");
                tvMain.setText("समझदार इंसान वही, जो किसी से उमीद न रखे|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("सभी परिस्थितियों में संतुलन बनाये रखना प्रसन्नता की चाबी है|");
            }
            if (currentDay.equals("10")){
                //Log.i("DailyThought", "10");
                //tvHead.setText("आज का विचार");
                tvMain.setText("माता पिता के मन से निकला हुआ आशीर्वाद, जन्म जन्मांतर  रक्षा करता है|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("दुःखो  से भरी इस दुनिया में वास्तविक सम्पति धन नही, संतुष्टता है|");
            }
            if (currentDay.equals("11")){
                //Log.i("DailyThought", "11");
                //tvHead.setText("आज का विचार");
                tvMain.setText("यदि जीवन में गम नहीं होगा तो जीवन में खुशियों का अहसास ही नहीं होगा|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("ईमानदार व सचे दिल वाला व्यक्ति स्वयं को सदा हल्का व तनावमुक्त महसूस करता है|");
            }
            if (currentDay.equals("12")){
                //Log.i("DailyThought", "12");
                //tvHead.setText("आज का विचार");
                tvMain.setText("पैसा अच्छा सेवक है, पर सच्चा साथी नहीं|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("अपनी इन्द्रियों पर सम्पूर्ण नियंत्रण ही सच्ची विजय है|");
            }
            if (currentDay.equals("13")){
                //Log.i("DailyThought", "13");
                //tvHead.setText("आज का विचार");
                tvMain.setText("दया सब गुणों में श्रेष्ठ है|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("ब्रह्मचर्य ही परमात्मा के समीप जाने का साधन है|");
            }
            if (currentDay.equals("14")){
                //Log.i("DailyThought", "14");
                //tvHead.setText("आज का विचार");
                tvMain.setText("जो कर्तव्य से बचता है, लाभ से वंचित रहता है|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("अपने दुःखो को भूलने के लिए परमात्मा को याद करो|");
            }
            if (currentDay.equals("15")){
                //Log.i("DailyThought", "15");
                //tvHead.setText("आज का विचार");
                tvMain.setText("संकट के समय धीरज रखना ही मानो आधी लड़ाई जीत लेना है|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("अपने मन को स्थिर रखकर सभी परिस्थितियों में धैर्य बनाये रखें|");
            }
            if (currentDay.equals("16")){
                //Log.i("DailyThought", "16");
                //tvHead.setText("आज का विचार");
                tvMain.setText("सोचो कि आज का दिन फिर नहीं आयेगा|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("जो स्वयं को हर परिस्थिति के अनुसार ढालना जानता है, उसे जीवन जीने की कला आ जाती है|");
            }
            if (currentDay.equals("17")){
                //Log.i("DailyThought", "17");
                //tvHead.setText("आज का विचार");
                tvMain.setText("मनुष्य मालिक नहीं प्रभु का मुनीम है|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("अगर आप हर कार्य खुशी से करें तो कोई भी कार्य मुश्किल नहीं लगेगा|");
            }
            if (currentDay.equals("18")){
                //Log.i("DailyThought", "18");
                //tvHead.setText("आज का विचार");
                tvMain.setText("कठिनाइयाँ ही व्यक्ति  को निखारती हैं|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("यदि भरसक प्रयत्न करने पर भी सफलता नहीं मिलती तो परमात्मा पर छोड़ दें|");
            }
            if (currentDay.equals("19")){
                //Log.i("DailyThought", "19");
                //tvHead.setText("आज का विचार");
                tvMain.setText("सफलता पूर्णत: हमारी शक्ति पर निर्भर है|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("आप स्वयं को जितना अच्छी तरह समझेंगे, शान्त व सुखी रहना उतना ही सहज हो जायेगा|");
            }
            if (currentDay.equals("20")){
                //Log.i("DailyThought", "20");
                //tvHead.setText("आज का विचार");
                tvMain.setText("कायर व्यक्ति हमेशा भाग्य को कोसता है|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("जो व्यक्ति नम्रता के आधार पर सबसे तालमेल बनाये रख सकता है, वह महान है|");
            }
            if (currentDay.equals("21")){
                //Log.i("DailyThought", "21");
                //tvHead.setText("आज का विचार");
                tvMain.setText("सुख और सम्पत्ति मिले, तो भी भगवान का भजन मत छोड़ो|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("चिंताग्रस्त व्यक्ति मृत्यु से पहले कई बार मरता है|");
            }
            if (currentDay.equals("22")){
                //Log.i("DailyThought", "22");
                //tvHead.setText("आज का विचार");
                tvMain.setText("जिसने अहंकार छोड़ दिया, वह भवसागर से तर गया|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("सफलता मन की शीतलता से उत्पन्न होती है| ठण्डा लोहा ही गर्म लोहे को काट व मोड़ सकता है|");
            }
            if (currentDay.equals("23")){
                //Log.i("DailyThought", "23");
                //tvHead.setText("आज का विचार");
                tvMain.setText("महान व्यक्ति का पहला लक्ष्य उसकी नम्रता है|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("परमात्मा को पाने के बाद और कुछ पाने की आवश्यकता नहीं रह जाती|");
            }
            if (currentDay.equals("24")){
                //Log.i("DailyThought", "24");
                //tvHead.setText("आज का विचार");
                tvMain.setText("आप जीवन में कितने भी ऊँचे क्यों न उठ जाएँ पर अपनी गरीबी और कठिनाई के दिन कभी मत भूलिए|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("जन्म का अंत है मृत्यु, और मृत्यु का अंत है जन्म|");
            }
            if (currentDay.equals("25")){
                //Log.i("DailyThought", "25");
                //tvHead.setText("आज का विचार");
                tvMain.setText("सावधान पल भर का क्रोध आपका पूरा भविष्य बिगाड़ सकता है|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("परमात्मा में असीम शक्ति है, अगर आपके मन पर कोई बोझ है तो उसे परमात्मा को दे दो|");
            }
            if (currentDay.equals("26")){
                //Log.i("DailyThought", "26");
                //tvHead.setText("आज का विचार");
                tvMain.setText("मान-सम्मान सदा औरों को देने के लिए होता है, औरों से लेने के लिए नहीं|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("यदि हम अपनी प्रशंसा सुनकर खुश होते हैं तो निन्दा से दुख भी अवश्य होगा|");
            }
            if (currentDay.equals("27")){
                //Log.i("DailyThought", "27");
                //tvHead.setText("आज का विचार");
                tvMain.setText("कष्ट सहन करने का अभ्यास जीवन की सफलता का परम सूत्र है|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("जब हम क्रोध की अग्नि में जलते हैं तो इसका धुआँ हमारी ही आँखों में जाता है|");
            }
            if (currentDay.equals("28")){
                //Log.i("DailyThought", "28");
                //tvHead.setText("आज का विचार");
                tvMain.setText("धन्य वह है, जो आशा नहीं रखता, क्योंकि उसे कभी निराश नहीं होना पड़ता|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("चाहे कोई व्यक्ति कितना भी बुरा हो, उसमें कोई न कोई गुण अवश्य होता है|");
            }
            if (currentDay.equals("29")){
                //Log.i("DailyThought", "29");
                //tvHead.setText("आज का विचार");
                tvMain.setText("जिसके पास उम्मीद है, वह लाख बार हारकर भी नहीं हारता|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("जहाँ बुद्धि प्रयोग करने की आवश्यकता है, वहाँ बल प्रयोग करने से कोई लाभ नहीं होता|");
            }
            if (currentDay.equals("30")){
                //Log.i("DailyThought", "30");
                //tvHead.setText("आज का विचार");
                tvMain.setText("शर्म की अमीरी से इज़्ज़त की ग़रीबी अच्छी है|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("तुम्हें जो प्राप्त करना है उसे तलवार से नहीं मुस्कान से प्राप्त करो|");
            }
            if (currentDay.equals("31")){
                //Log.i("DailyThought", "30");
                //tvHead.setText("आज का विचार");
                tvMain.setText("ग़लती कर देना मामूली बात है, पर उसे स्वीकार कर लेना बड़ी बात है|");
                tvAnmol.setText("अनमोल वचन");
                tvVachan.setText("सबको सम्मान देने वाला व्यक्ति सदा सम्मान से रहता है|");
            }

            //tvHead.setTextSize(50);
            tvMain.setTextSize(32);
            tvAnmol.setTextSize(50);
            tvVachan.setTextSize(29);

            /*Intent openClockIntent = new Intent(AlarmClock.ACTION_SET_ALARM);
            openClockIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            openClockIntent.putExtra(AlarmClock.EXTRA_HOUR, 10);
            context.startActivity(openClockIntent);*/

            //#ffff00 - Yellow, #ffffff - White, #000000 - Black, #FF8C00 - Orange

            if (!currentDay.equals("32")) {
                Button next = (Button) findViewById(R.id.buttonNext);
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            //Toast.makeText(getApplicationContext(), "अगले पृष्ठ जल्द ही आ जाएगा", Toast.LENGTH_LONG).show();
                            //Log.i("DailyThought", "Next currentDay old ="+currentDay);
                            i = Integer.parseInt(currentDay);
                            i++;
                            if (i<32) {
                                currentDay = String.valueOf(i);
                                //Log.i("SpiritualWords", " Next currentDay new =" + currentDay);
                                prefs.edit().putString("current", currentDay).commit();

                                //currentDay = "31";
                                Intent mainIntent = new Intent(Words.this, Words.class);
                                Words.this.startActivity(mainIntent);
                            } else {
                                //Log.i("DailyThought", " i =" + i);
                                Toast.makeText(getApplicationContext(), "आप अंतिम पृष्ठ पर है|", Toast.LENGTH_LONG).show();
                            }
                        } catch (Exception e)
                        {
                            //e.printStackTrace();
                        }
                    }
                });
            }

            if (!currentDay.equals("00")) {
                //Log.i("DailyThought", "check2");
                Button previous = (Button) findViewById(R.id.buttonPrevious);
                previous.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            //Toast.makeText(getApplicationContext(), "पिछले पृष्ठ नहीं", Toast.LENGTH_LONG).show();
                            //Log.i("DailyThought", "Next currentDay old ="+currentDay);
                            i = Integer.parseInt(currentDay);
                            i--;
                            if (i>0) {

                                //Log.i("DailyThought", "Back i =" + i);
                                currentDay = String.valueOf(i);
                                //Log.i("DailyThought", "Next currentDay new =" + currentDay);
                                prefs.edit().putString("current", currentDay).commit();
                                Intent mainIntent = new Intent(Words.this, Words.class);
                                Words.this.startActivity(mainIntent);
                            } else {
                                //Log.i("DailyThought", " i =" + i);
                                Toast.makeText(getApplicationContext(), "आप प्रथम पृष्ठ पर है|", Toast.LENGTH_LONG).show();
                            }
                        } catch (Exception e)
                        {
                            //e.printStackTrace();
                        }
                    }
                });
            }

        }catch (Exception e)
        {
            //Log.i("DailyThought", "Exception");
            //e.printStackTrace();
        } finally {
            //Log.i("DailyThought", "Finally");
        }

    }

}
