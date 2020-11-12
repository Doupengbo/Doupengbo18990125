package com.example.zy7.bean;

import com.example.zy7.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "海绵手指", "永恒之钻", "决心", "如日中天", "冲破藩篱", "无人之境","有为青年","人生何处不青山"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "海绵手指，杀人不止",
            "永恒之钻，腿给抖断",
            "暗金决心，战场精英",
            "如日中天，星爆神仙",
            "冲破藩篱，吵到暂停",
            "无人之境，境无止境",
            "有为青年，不起雷钳",
            "人生何处不青山，下把Eco我能翻"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {39, 34,25,35,13,35,90, 89};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.music1, R.drawable.music2, R.drawable.music3,R.drawable.music4,
            R.drawable.music5, R.drawable.music6, R.drawable.music7,R.drawable.music8
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.m1b, R.drawable.m2b, R.drawable.m3b,R.drawable.m4b,
            R.drawable.m5b, R.drawable.m6b, R.drawable.m7b,R.drawable.m8b
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
