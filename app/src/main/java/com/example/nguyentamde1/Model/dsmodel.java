package com.example.nguyentamde1.Model;

import com.example.nguyentamde1.ListViewActivity;

import java.util.List;
import java.io.Serializable;
public class dsmodel implements Serializable {
    public dsmodel(int mId,String mTen, String mMa, String mSo){
        this.Ten = mTen;
        this.Ma = mMa;
        this.So = mSo;
        this.Id = mId;
    }

    public dsmodel(ListViewActivity listViewActivity, int item_listview, List<dsmodel> modelList) {
    }

    public int getId() {
        return Id;
    }

    public String getTen() {
        return Ten;
    }

    public String getMa() {
        return Ma;
    }

    public String getSo() {
        return So;
    }

    private int Id;
    private String Ten;
    private String Ma;
    private String So;
}
