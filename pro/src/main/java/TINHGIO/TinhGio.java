/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TINHGIO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nguyenquanghuy
 */
public class TinhGio {
    private String maNguoiChoi, tenNguoiChoi;
    private Date gioVao, gioRa;
    private long tongGioChoi;

    public TinhGio(String maNguoiChoi, String tenNguoiChoi, String gioVao, String gioRa) throws ParseException{
        this.maNguoiChoi = maNguoiChoi;
        this.tenNguoiChoi = tenNguoiChoi;
        this.gioVao = new SimpleDateFormat("hh:mm").parse(gioVao);
        this.gioRa = new SimpleDateFormat("hh:mm").parse(gioRa);
        this.tongGioChoi = tongGioChoi(this.gioVao, this.gioRa);
    }
    
    private long tongGioChoi(Date gioVao, Date gioRa) {
        long tong = (gioRa.getTime() - gioVao.getTime())/60000;
        return tong;
    }
    
    public long getTongGioChoi() {
        return tongGioChoi;
    }

    @Override
    public String toString() {
        return maNguoiChoi + " " + tenNguoiChoi + " " + tongGioChoi/60 + " gio " + tongGioChoi%60 + " phut";
    }
    
    
}
