package com.kitesoft.ex23listviewcustom;

public class Member {

    int imgId;      //R.drawable.flag_korea
    String name ;    //"전현무"
    String nation;  //"대한민국"

    //생성(new)할때 자동으로 실행되는 메소드
    //생성자 메소드
    public Member(int imgId, String name, String nation){
        //멤버변수에 값을 대입
        this.imgId= imgId;
        this.name= name;
        this.nation= nation;
    }

}















