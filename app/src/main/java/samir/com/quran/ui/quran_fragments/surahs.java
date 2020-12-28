package samir.com.quran.ui.quran_fragments;

import java.util.List;


public class surahs {

   private  int number;
   private String name;
   private String englishName;
   private String englishNameTranslation;
   private String revelationType;
   private List<ayahs> ayahs;

    public surahs() {
    }

    public surahs(int number, String name, String englishName, String englishNameTranslation, String revelationType, List<ayahs> ayahs) {
        this.number = number;
        this.name = name;
        this.englishName = englishName;
        this.englishNameTranslation = englishNameTranslation;
        this.revelationType = revelationType;
        this.ayahs = ayahs;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getEnglishNameTranslation() {
        return englishNameTranslation;
    }

    public void setEnglishNameTranslation(String englishNameTranslation) {
        this.englishNameTranslation = englishNameTranslation;
    }

    public String getRevelationType() {
        return revelationType;
    }

    public void setRevelationType(String revelationType) {
        this.revelationType = revelationType;
    }

    public List<ayahs> getAyahs() {
        return ayahs;
    }

    public void setAyahs(List<ayahs> ayahs) {
        this.ayahs = ayahs;
    }
}
