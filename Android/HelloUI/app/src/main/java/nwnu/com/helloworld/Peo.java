package nwnu.com.helloworld;

import java.util.ArrayList;

public class Peo {
    String name, sex, marry, birth, city;
    ArrayList<String> likes;

    @Override
    public String toString() {
        return "Peo{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", marry='" + marry + '\'' +
                ", birth='" + birth + '\'' +
                ", city='" + city + '\'' +
                ", likes=" + likes +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMarry() {
        return marry;
    }

    public void setMarry(String marry) {
        this.marry = marry;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<String> getLikes() {
        return likes;
    }

    public void setLikes(ArrayList<String> likes) {
        this.likes = likes;
    }

    public Peo(String name, String sex, String marry, String birth, String city, ArrayList<String> likes) {
        this.name = name;
        this.sex = sex;
        this.marry = marry;
        this.birth = birth;
        this.city = city;
        this.likes = likes;
    }
}
