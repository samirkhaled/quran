package samir.com.quran.ui.quran_fragments;

public class JsonLocalQuran {

 private int code ;
 private boolean status;
 private data data;

    public JsonLocalQuran(int code, boolean status, data data) {
        this.code = code;
        this.status = status;
        this.data = data;

    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public  data getData() {
        return data;
    }

    public void setData( data data) {
        this.data = data;
    }
}
