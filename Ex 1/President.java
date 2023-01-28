package com.example.Exercise6;

import android.widget.ArrayAdapter;

public class President {
    private String Name;
    private int Start;
    private int End;
    private String Msg;

    public President(String Name, int Start, int End, String Msg){
     this.Name = Name;
     this.Start = Start;
     this.End = End;
     this.Msg = Msg;
    }
    public static void setAdapter(ArrayAdapter arrayAdapter) {
    }
    public String getName() {
        return Name;
    }

    public int getStart() {
        return Start;
    }

    public int getEnd() {
        return End;
    }

    public String getMsg() {
        return Msg;
    }

    public String getPresidents(){
        return Name;
    }

    public String toString(){
        return Name;
    }
}