package com.nwnu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Data
@NoArgsConstructor@AllArgsConstructor
@Component
public class Score extends ScoreKey {
    private BigDecimal score;
    private Course course;
    private Stu stu;

    public Score(Integer sid, Integer cid, BigDecimal score) {
        super(sid, cid);
        this.score = score;
    }

    public Score(BigDecimal score) {
        this.score = score;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}