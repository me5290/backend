package 과제.과제7;

public class Controller {
    public static boolean signup(MemberDto memberArray){
        boolean result = MemberDao.signup(memberArray);
        return result;
    }

    public static boolean login(MemberDto memberArray){
        boolean result = MemberDao.login(memberArray);
        return result;
    }

    public static boolean idSearch(MemberDto memberArray){
        boolean result = MemberDao.login(memberArray);
        return result;
    }

    public static boolean pwSearch(MemberDto memberArray){
        boolean result = MemberDao.login(memberArray);
        return result;
    }
}
