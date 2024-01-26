package day18.model.dto;

public class BoardDto {
    // 필드
    private int bno;
    private String btitle;
    private String bcontent;
    private int bview;
    private int mno;
    private int cateno;

    // 생성자
    public BoardDto(){}

    public BoardDto(String btitle, String bcontent) {
        this.btitle = btitle;
        this.bcontent = bcontent;
    }

    // 메소드

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public int getBview() {
        return bview;
    }

    public void setBview(int bview) {
        this.bview = bview;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public int getCateno() {
        return cateno;
    }

    public void setCateno(int cateno) {
        this.cateno = cateno;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "bno=" + bno +
                ", btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", bview=" + bview +
                ", mno=" + mno +
                ", cateno=" + cateno +
                '}';
    }
}
