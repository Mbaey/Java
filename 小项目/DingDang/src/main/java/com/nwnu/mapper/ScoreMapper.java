package com.nwnu.mapper;

import com.nwnu.pojo.Score;
import com.nwnu.pojo.ScoreExample;
import com.nwnu.pojo.ScoreKey;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ScoreMapper {
    long countByExample(ScoreExample example);

    int deleteByExample(ScoreExample example);

    int deleteByPrimaryKey(ScoreKey key);

    int insert(Score record);

    int insertSelective(Score record);

    List<Score> selectByExample(ScoreExample example);
    Score selectByPrimaryKey(ScoreKey key);
    //贼恶心，不如写XML文件 参考文件
    //https://blog.csdn.net/qq_32786873/article/details/78297551
//    @Select("<script>"+
//            "select s.Sid ,  t.name stuName, t.pwd , s.Cid, c.name as courseName, c.term ,s.score from stus as t ,scores as s, courses as c where t.id=s.sid and c.id=s.cid"
//            +"<if test='startNo!=null and pageSize != null '>"
//            +""
//            + "</if>"
//            +"</script>")
    @Results({
            @Result(property = "score", column = "score"),
            @Result(property = "stu.id", column = "Sid"),
            @Result(property = "stu.name", column = "stuName"),
            @Result(property = "stu.pwd", column = "pwd"),
            @Result(property = "stu.academy", column = "academy"),
            @Result(property = "stu.classid", column = "classid"),
            @Result(property = "course.id", column = "Cid"),
            @Result(property = "course.name", column = "courseName"),
            @Result(property = "course.term", column = "term")
//            @Result(property = "orderItems", javaType = List.class, column = "id",
//                    many = @Many(select = "com.how2java.mapper.OrderItemMapper.listByOrder"))
    })
    @SelectProvider(type=ScoreDynaSqlProvider.class, method="listInnorJoin")
    List<Score> selectAllDataJoinStuAndCourse(Integer sid,  Integer cid, String cterm);
//    List<Score> selectAllDataJoinStuAndCourse(@Param("sid") Integer sid, @Param("cid") Integer cid);

    //    List<Score> selectAllDataJoinStuAndCourse();//神奇呀~~


    @Results({
            @Result(property = "score", column = "score"),
            @Result(property = "stu.id", column = "Sid"),
            @Result(property = "sid", column = "Sid"),
            @Result(property = "cid", column = "Cid"),
            @Result(property = "stu.name", column = "stuName"),
            @Result(property = "stu.pwd", column = "pwd"),
            @Result(property = "stu.academy", column = "academy"),
            @Result(property = "stu.classid", column = "classid"),
            @Result(property = "course.id", column = "Cid"),
            @Result(property = "course.name", column = "courseName"),
            @Result(property = "course.term", column = "term")
//            @Result(property = "orderItems", javaType = List.class, column = "id",
//                    many = @Many(select = "com.how2java.mapper.OrderItemMapper.listByOrder"))
    })
    @SelectProvider(type=ScoreDynaSqlProvider.class, method="listRightJoin")
    List<Score> selectAllDataRightJoinStuAndCourse(Integer sid,  Integer cid, String cterm);

    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}