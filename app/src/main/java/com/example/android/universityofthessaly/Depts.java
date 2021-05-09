package com.example.android.universityofthessaly;

class Depts {

    private final int dStartingColor;
    private final int dDeptName;

    public Depts(int StartingColor, int DeptName){
        dStartingColor = StartingColor;
        dDeptName = DeptName;
    }

    public int getStartingColor(){
        return dStartingColor;
    }

    public int getDeptname(){
        return dDeptName;
    }
}
