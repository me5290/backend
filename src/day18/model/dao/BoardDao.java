package day18.model.dao;

public class BoardDao extends Dao{
    private BoardDao(){}
    private static BoardDao boardDao = new BoardDao();
    public static BoardDao getInstance(){
        return boardDao;
    }
}
