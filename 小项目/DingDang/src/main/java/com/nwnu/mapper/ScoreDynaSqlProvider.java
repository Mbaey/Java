package com.nwnu.mapper;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class ScoreDynaSqlProvider {
    //https://blog.csdn.net/owen_william/article/details/51815506
    public String listRightJoin(Map<String, Object> map) {
//        0  1997
//        1  null
//        param1  1997
//        param2  null
//        Set<Map.Entry<String, Object>> entries = map.entrySet();
//        for(Map.Entry<String, Object> i : entries){
//            System.out.println(i.getKey()+"  "+i.getValue());
//        }
        Object sid = map.get("0");
        Object cid =  map.get("1");
        Object cterm =  map.get("2");
//        System.out.println(sid);
        SQL sql = new SQL()
                .SELECT("s.sid sid, c.id cid, c.name as courseName, c.term ,s.score")
                .FROM("scores s")
                .RIGHT_OUTER_JOIN("courses as c on s.cid = c.id");
//        System.out.println("listInnorJoin:  "  +sid);
        if(sid != null){
//            System.out.println("amuse");
            sql = sql.WHERE("sid="+sid).OR().WHERE("sid is null");

        }
        if(cid != null){
            sql = sql.WHERE("cid="+cid);
        }
        if(cterm!=null){
            sql = sql.WHERE("c.term like '%"+cterm+"%'");
        }

        String s =sql
                .toString();
        System.out.println(s);
        return s;
    }
    public String listInnorJoin(Map<String, Object> map) {
//        0  1997
//        1  null
//        param1  1997
//        param2  null
//        Set<Map.Entry<String, Object>> entries = map.entrySet();
//        for(Map.Entry<String, Object> i : entries){
//            System.out.println(i.getKey()+"  "+i.getValue());
//        }
        Object sid = map.get("0");
        Object cid =  map.get("1");
        Object cterm =  map.get("2");
//        System.out.println(sid);
        SQL sql = new SQL()
                .SELECT("s.Sid ,  t.name stuName, t.pwd , t.academy, t.classid, s.Cid, c.name as courseName, c.term ,s.score")
                .FROM("scores s")
                .INNER_JOIN("stus as t on s.sid = t.id")
                .INNER_JOIN("courses as c on s.cid = c.id");
//        System.out.println("listInnorJoin:  "  +sid);
        if(sid != null){
//            System.out.println("amuse");
            sql = sql.WHERE("sid="+sid);
        }
        if(cid != null){
            sql = sql.WHERE("cid="+cid);
        }
        if(cterm!=null){
            sql = sql.WHERE("c.term like '%"+cterm+"%'");
        }
        String s =sql
                .toString();
        System.out.println(s);
        return s;
    }
    public String list() {
         return new SQL()
                 .SELECT("*")
                 .FROM("scores")
                 .toString();

    }
    public String get() {
        return new SQL()
                .SELECT("*")
                .FROM("scores")
                .WHERE("id=#{id}")
                .toString();
    }
     
    public String add(){
        return new SQL()
                .INSERT_INTO("scores")
                .VALUES("name", "#{name}")
                .toString();
    }
    public String update(){
        return new SQL()
                .UPDATE("scores")
                .SET("name=#{name}")
                .WHERE("id=#{id}")
                .toString();
    }
    public String delete(){
        return new SQL()
                .DELETE_FROM("scores")
                .WHERE("id=#{id}")
                .toString();
    }
    //demo
    private String selectPersonSql() {
        return new SQL() {{
            SELECT("P.ID, P.USERNAME, P.PASSWORD, P.FULL_NAME");
            SELECT("P.LAST_NAME, P.CREATED_ON, P.UPDATED_ON");
            FROM("PERSON P");
            FROM("ACCOUNT A");
            INNER_JOIN("DEPARTMENT D on D.ID = P.DEPARTMENT_ID");
            INNER_JOIN("COMPANY C on D.COMPANY_ID = C.ID");
            WHERE("P.ID = A.ID");
            WHERE("P.FIRST_NAME like ?");
            OR();
            WHERE("P.LAST_NAME like ?");
            GROUP_BY("P.ID");
            HAVING("P.LAST_NAME like ?");
            OR();
            HAVING("P.FIRST_NAME like ?");
            ORDER_BY("P.ID");
            ORDER_BY("P.FULL_NAME");
        }}.toString();
    }
}