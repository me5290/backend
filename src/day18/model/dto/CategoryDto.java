package day18.model.dto;

public class CategoryDto {
    // 필드
    private int cateno;
    private String catetitle;

    // 생성자
    public CategoryDto(){}

    // 메소드
    public int getCateno() {
        return cateno;
    }

    public void setCateno(int cateno) {
        this.cateno = cateno;
    }

    public String getCatetitle() {
        return catetitle;
    }

    public void setCatetitle(String catetitle) {
        this.catetitle = catetitle;
    }
}
