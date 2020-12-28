package samir.com.quran.ui.asmaa_allah;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import samir.com.quran.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Assmaa_Allah_fragment extends Fragment {

    public Assmaa_Allah_fragment() {
        // Required empty public constructor
    }
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_assmaa__allah_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.re);
        mLayoutManager = new LinearLayoutManager(getActivity());
        /* RecyclerView.LayoutManager la = new StaggeredGridLayoutManager(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS, StaggeredGridLayoutManager.VERTICAL);*/
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ArrayList<NameModel> arrayList=new ArrayList<NameModel>();
        arrayList.add(new NameModel("الله","আল্লাহ্‌","আল্লাহ্","Allah" ));
        arrayList.add(new NameModel("الرحيم","আর রহিম","পরম করুনাময়","Ar-Rahim" ));
        arrayList.add(new NameModel("الرحمن ","আর রহমান","পরম দাতা ও দয়ালু","Ar-Rahman" ));
        arrayList.add(new NameModel("الجبار","আল জাব্বার","পরাক্রমশালী","Al-Jabbar" ));
        arrayList.add(new NameModel("العزيز","আল ʿআজিজ","প্রবল","Al-Aziz"  ));
        arrayList.add(new NameModel("المهيمن","আল মুহায়মিন","রক্ষণ ব্যবস্থাকারী","Al-Muhaymin" ));
        arrayList.add(new NameModel("المؤمن","আল মুʿমিন","একমাত্র নিরাপত্তা দান কারী","Al-Mu'min"));
        arrayList.add(new NameModel("السلام","আস সালাম","শান্তি বিধায়ক","As-Salam" ));
        arrayList.add(new NameModel("القدوس","আল কুদ্দুস","নিষ্কলুষ","Al-Quddus" ));
        arrayList.add(new NameModel("الملك","আল মালিক","সর্বাধিকারী","Al-Malik" ));

        arrayList.add(new NameModel("الوهاب","আল ওয়াহহাব","মহা বদান্য","Al-Wahhab" ));
        arrayList.add(new NameModel("القهار","আল কাহহার","মহাপরাক্রান্ত","Al-Qahhar" ));
        arrayList.add(new NameModel("الغفار","আল গাফফার ","মহাক্ষমাশীল","Al-Ghaffar" ));
        arrayList.add(new NameModel("المصور","আল মুসাওবির","রুপদানকারী","Al-Musawwir" ));
        arrayList.add(new NameModel("البارئ","আল বারী","উন্মেষকারী","Al-Bari'" ));
        arrayList.add(new NameModel("الخالق","আল খালিক ","সৃষ্টিকারী","Al-Khaliq" ));
        arrayList.add(new NameModel("المتكبر","আল মুতাকাব্বির ","অহংকারের ন্যায্য অধিকারী","Al-Mutakabbir" ));
        arrayList.add(new NameModel("الرافع","আর রাফি","উন্নয়নকারী","Ar-Rafi" ));
        arrayList.add(new NameModel("الخافض","আল খাফিদ ","অবনমনকারী","Al-Khafid" ));
        arrayList.add(new NameModel("الباسط","আল বাসিত ","সম্প্রসারণকারী","Al-Basit" ));

        arrayList.add(new NameModel("القابض","আল কাবিদ","সংকোচনকারী","Al-Qabid" ));
        arrayList.add(new NameModel("العليم","আল আলীম ","মহাজ্ঞানী","Al-`Alim" ));
        arrayList.add(new NameModel("الفتاح","আল ফাত্তাহ ","মহাবিজয়ী","Al-Fattah" ));
        arrayList.add(new NameModel("الرزاق","আর রাজ্জাক","জীবিকাদাতা","Ar-Razzaq" ));
        arrayList.add(new NameModel("اللطيف","আল লাতিফ ","সুক্ষ দক্ষতাসম্পন্ন","Al-Latif" ));
        arrayList.add(new NameModel("العدل","আল ʿআদি","ন্যায়নিষ্ঠ","Al-`Adl" ));
        arrayList.add(new NameModel("الحكم","আল হাকাম","মিমাংসাকারী","Al-Hakam" ));
        arrayList.add(new NameModel("البصير","আল বাসির","সর্বদ্রষ্টা","Al-Basir" ));
        arrayList.add(new NameModel("السميع","আস সামী","সর্বশ্রোতা","As-Sami" ));
        arrayList.add(new NameModel("المذل","আল মুযিল ","হতমানকারী","Al-Mudhill" ));

        arrayList.add(new NameModel("المعيد","আল মুʿইদ","সম্মানদাতা","Al-Mu'id" ));
        arrayList.add(new NameModel("الكبير","আল কাবীর","মহৎ","Al-Kabir" ));
        arrayList.add(new NameModel("العلي","আল ʿআলী","অত্যুচ্চ","Al-Ali" ));
        arrayList.add(new NameModel("الشكور","আশ শাকুর ","গুণগ্রাহী","Ash-Shakur" ));
        arrayList.add(new NameModel("الغفور","আল গফুর","ক্ষমাশীল","Al-Ghafur" ));
        arrayList.add(new NameModel("العظيم","আল ʿআজীম ","মহিমাময়","Al-Azim" ));
        arrayList.add(new NameModel("الحليم","আল হালীম","সহিষ্ণু","Al-Halim" ));
        arrayList.add(new NameModel("الخبير","আল খাবীর","সর্বজ্ঞ","Al-Khabir" ));
        arrayList.add(new NameModel("المجيب","আল মুজিব","প্রার্থনা গ্রহণকারী","Al-Mujib" ));
        arrayList.add(new NameModel("الرقيب","আর রাকীব ","নিরীক্ষণকারী","Ar-Raqib" ));

        arrayList.add(new NameModel("الكريم","আল কারীম ","মহামান্য","Al-Karim" ));
        arrayList.add(new NameModel("الجليل","আল জালীল","প্রতাপশালী","Al-Jalil" ));
        arrayList.add(new NameModel("الحسيب","আল হাসীব","মহাপরীক্ষক","Al-Hasib" ));
        arrayList.add(new NameModel("المقيت","আল মুকিত","আহার্যদাতা","Al-Muqit" ));
        arrayList.add(new NameModel("الحفيظ"," আল হাফীজ","মহারক্ষক","Al-Hafiz" ));
        arrayList.add(new NameModel("الحق"," আল হাক্ক","সত্য","Al-Haqq" ));
        arrayList.add(new NameModel("الشهيد"," আশ শাহীদ","প্রত্যক্ষকারী","Ash-Shahid" ));
        arrayList.add(new NameModel("الباعث"," আল বাইছ","পুনরুত্থানকারী","Al-Ba'ith" ));
        arrayList.add(new NameModel("المجيد"," আল মাজীদ","গৌরবময়","Al-Majid" ));
        arrayList.add(new NameModel("الودود"," আল ওয়াদুদ ","প্রেমময়","Al-Wadud"  ));

        arrayList.add(new NameModel("الحكيم"," আল হাকীম","বিচক্ষণ","Al-Hakim" ));
        arrayList.add(new NameModel("الواسع"," আল ওয়াসি","সর্বব্যাপী","Al-Wasi" ));
        arrayList.add(new NameModel("المبدئ","আল মুবদী ","আদি স্রষ্টা","Al-Mubdi'"));
        arrayList.add(new NameModel("المحصى"," আল মুহসী  ","হিসাব গ্রহণকারী","Al-Muhsi" ));
        arrayList.add(new NameModel("الحميد"," আল হামিদ ","প্রশংসিত","Al-Hamid" ));
        arrayList.add(new NameModel("الولى"," আল ওয়ালী ","অভিভাবক ","Al-Waliyy" ));
        arrayList.add(new NameModel("المتين"," আল মাতীন","দৃড়তাসম্পন্ন","Al-Matin" ));
        arrayList.add(new NameModel("القوى"," আল কায়ুয়ী","শক্তিশালী","Al-Qawiyy" ));
        arrayList.add(new NameModel("الوكيل","আল ওয়াকীল ","তত্বাবধায়ক","Al-Wakil" ));
        arrayList.add(new NameModel("المجيد"," আল মাজিদ ","মহান","Al-Majid" ));

        arrayList.add(new NameModel("الواجد"," আল ওয়াজিদ","অবধারক","Al-Wajid"  ));
        arrayList.add(new NameModel("القيوم","আল কায়্যুম ","স্বয়ং স্থিতিশীল","Al-Qayyum" ));
        arrayList.add(new NameModel("الحي","আল হায়্যু","জীবিত","Al-Hayy" ));
        arrayList.add(new NameModel("المميت","আল মুমীত","মরণদাতা","Al-Mumit" ));
        arrayList.add(new NameModel("المحيى"," আল মুহয়ী","জীবনদাতা","Al-Muhyi" ));
        arrayList.add(new NameModel("المعيد"," আল মুʿঈদ","পুনঃ সৃষ্টিকারী","Al-Mu'id" ));
        arrayList.add(new NameModel("الأول","আল আওয়াল","অনাদী","Al-Awwal"  ));
        arrayList.add(new NameModel("المؤخر","আল মুʾয়াখখীর","পশ্চাদবর্তীকারী","Al-Mu'akhkhir" ));
        arrayList.add(new NameModel("المقدم"," আল মুকাদ্দিম","অগ্রবর্তীকারী","Al-Muqaddim" ));
        arrayList.add(new NameModel("المقتدر"," আল মুকতাদীর","পরাক্রম","Al-Muqtadir" ));

        arrayList.add(new NameModel("القادر"," আল কাদীর","শক্তিশালী","Al-Qadir" ));
        arrayList.add(new NameModel("الصمد"," আস সামাদ","অভাবমুক্ত","As-Samad"  ));
        arrayList.add(new NameModel("الواحد"," আল ওয়াহিদ","একক","Al-Wahid"  ));
        arrayList.add(new NameModel("التواب"," আত তাওয়াব","তওবা গ্রহণকারী","At-Tawwab" ));
        arrayList.add(new NameModel("البر"," আল বার্র ","ন্যায়বান","Al-Barr" ));
        arrayList.add(new NameModel("المتعالي","আল মুতাʿআলী","সুউচ্চ","Al-Muta'ali" ));
        arrayList.add(new NameModel("الوالي","আল ওয়ালী","কার্যনির্বাহক","Al-Wali" ));
        arrayList.add(new NameModel("الباطن","আল বাতিন","গুপ্ত","Al-Batin"));
        arrayList.add(new NameModel("الظاهر","আল জাহির ","প্রকাশ্য","Az-Zahir" ));
        arrayList.add(new NameModel("الأخر","আল আখির","অনন্ত","Al-Akhir" ));

        arrayList.add(new NameModel("المقسط","আল মুকসিত","ন্যায়পরায়ণ","Al-Muqsit" ));
        arrayList.add(new NameModel(" الجلال والإكرام"," যুল জালাল ওয়ালইকরাম","মহিমান্বিত ও মাহাত্ম্যপূর্ণ","Dhu-al-Jalal wa-al-Ikram"));
        arrayList.add(new NameModel("مالك الملك"," মালিকুল মুলক","রাজ্যের মালিক","Malik-al-Mulk" ));
        arrayList.add(new NameModel("الرؤوف","আর রাʾউফ","কোমল হৃদয়","Ar-Ra'uf" ));
        arrayList.add(new NameModel("العفو"," আল আʿওউফ","ক্ষমাকারী","Al-'Afuww" ));
        arrayList.add(new NameModel("المنتقم","আল মুনতাকীম","প্রতিশোধ গ্রহণকারী","Al-Muntaqim" ));
        arrayList.add(new NameModel("الهادي"," আল হাদী ","পথ প্রদর্শক","Al-Hadi" ));
        arrayList.add(new NameModel("النافع"," আন নাফী","কল্যাণকর্তা","An-Nafi'" ));
        arrayList.add(new NameModel("الضار","আদ দারর","( তাগুতের) অকল্যাণকর্তা","Ad-Darr" ));
        arrayList.add(new NameModel("المانع","আল মানি","প্রতিরোধকারী","Al-Mani'" ));

        arrayList.add(new NameModel("المغني","আল মুগনী","অভাব মোচনকারী","Al-Mughni" ));
        arrayList.add(new NameModel("الغني","আল গানী","সম্পদশালী","Al-Ghani" ));
        arrayList.add(new NameModel("الجامع","আল জামি","একত্রীকরণকারী","Al-Jami'" ));
        arrayList.add(new NameModel("الصبور","আস সাবুর ","ধৈর্যশীল","As-Sabur" ));
        arrayList.add(new NameModel("الرشيد","আর রশীদ ","সত্যদর্শী"," Ar-Rashid" ));
        arrayList.add(new NameModel("الوارث","আল ওয়ারিছ ","উত্তরাধিকারী","Al-Warith" ));
        arrayList.add(new NameModel("الباقي","আল বাকী","চিরস্থায়ী","Al-Baqi" ));
        arrayList.add(new NameModel("البديع","আল বাদী","অভিনব সৃষ্টিকারী","Al-Badi" ));
        arrayList.add(new NameModel("النور","আন নূর","জ্যোতি","An-Nur"  ));

        RecyclerAdapter adapter=new RecyclerAdapter(getActivity(),arrayList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;
    }




    }


