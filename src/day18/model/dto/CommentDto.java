package day18.model.dto;

public class CommentDto {
    // 필드
    private int cno;
    private String comcontent;
    private int bno;
    private int mno;

    // 생성자
    public CommentDto(){}
    public CommentDto(String comcontent) {
        this.comcontent = comcontent;
    }

    // 메소드

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getComcontent() {
        return comcontent;
    }

    public void setComcontent(String comcontent) {
        this.comcontent = comcontent;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    @Override
    public String toString() {
        return "CommentDto{" +
                "cno=" + cno +
                ", comcontent='" + comcontent + '\'' +
                ", bno=" + bno +
                ", mno=" + mno +
                '}';
    }
}
