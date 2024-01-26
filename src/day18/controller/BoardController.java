package day18.controller;

import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;
import day18.model.dto.MemberDto;

import java.util.ArrayList;

public class BoardController {
    // 싱글톤
    private BoardController(){}
    private static BoardController boardController = new BoardController();
    public static BoardController getInstance(){
        return boardController;
    }

    // 카테고리 조회
    public ArrayList<CategoryDto> categorySearch(){
        ArrayList<CategoryDto> result = BoardDao.getInstance().categorySearch();

        return result;
    }

    // 글쓰기
    public int write(BoardDto boardDto){
        int result;

        boardDto.setMno(MemberController.getInstance().loginMno);

        result = BoardDao.getInstance().write(boardDto);

        return result;
    }
}
