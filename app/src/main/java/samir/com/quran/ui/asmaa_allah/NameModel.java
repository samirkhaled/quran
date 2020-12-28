package samir.com.quran.ui.asmaa_allah;

public class NameModel {
    String banName;
    String enName;
    String bannglamean;
    String englishmean;


    public NameModel(String banName, String enName) {
        this.banName = banName;
        this.enName = enName;
    }

    public NameModel(String banName, String enName, String bannglamean, String englishmean) {
        this.banName = banName;
        this.enName = enName;
        this.bannglamean = bannglamean;
        this.englishmean = englishmean;

    }

    public String getBanName() {
        return banName;
    }

    public void setBanName(String banName) {
        this.banName = banName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getBannglamean() {
        return bannglamean;
    }

    public void setBannglamean(String bannglamean) {
        this.bannglamean = bannglamean;
    }


    public String getEnglishmean() {
        return englishmean;
    }

    public void setEnglishmean(String englishmean) {
        this.englishmean = englishmean;
    }


}
