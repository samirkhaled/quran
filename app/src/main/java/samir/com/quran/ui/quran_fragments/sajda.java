package samir.com.quran.ui.quran_fragments;

public class sajda {

  private int id;
private   boolean recommended;
  private boolean obligatory;

    public sajda(int id, boolean recommended, boolean obligatory) {
        this.id = id;
        this.recommended = recommended;
        this.obligatory = obligatory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isRecommended() {
        return recommended;
    }

    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }

    public boolean isObligatory() {
        return obligatory;
    }

    public void setObligatory(boolean obligatory) {
        this.obligatory = obligatory;
    }
}
