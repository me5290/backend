package 과제.과제7;

import java.util.ArrayList;

public class MemberDao {
    static ArrayList<MemberDto> memberDtos = new ArrayList<>();
    public static boolean signup(MemberDto memberArray){
        for (int i = 0; i < memberDtos.size(); i++){
            if (memberDtos.get(i).getId().equals(memberArray.getId())) {
                System.out.println("중복된 아이디입니다");
            }
            return false;
        }
        memberDtos.add(memberArray);

        return true;
    }

    public static boolean login(MemberDto memberArray){
        for(int i = 0; i < memberDtos.size(); i++){
            if(memberDtos.get(i).getId().equals(memberArray.getId())){
                if(memberDtos.get(i).getPw().equals(memberArray.getPw())){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean idSearch(MemberDto memberArray){
        for (int i = 0; i < memberDtos.size(); i++){
            if(memberDtos.get(i).getName().equals(memberArray.getName()) && memberDtos.get(i).getPw().equals(memberArray.getPw())){
                return true;
            }
        }
        return false;
    }

    public static boolean pwSearch(MemberDto memberArray){
        for (int i = 0; i < memberDtos.size(); i++){
            if(memberDtos.get(i).getId().equals(memberArray.getId()) && memberDtos.get(i).getPhone().equals(memberArray.getPhone())){
                return true;
            }
        }
        return false;
    }
}
