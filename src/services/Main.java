package services;

import java.sql.SQLException;
import java.util.ArrayList;

import models.DanhSachKhoanThu;
import models.HoNopTien;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
//		DanhSachKhoanThu ds = new DanhSachKhoanThu();
		HoNopTien hoNT = new HoNopTien();
		hoNT.setIdHoKhau(4);
//		ds.setTenKhoanThu("Xay muong");
		KhoanThuService ser = new KhoanThuService();
		ArrayList<DanhSachKhoanThu> dsKT = ser.cacHoDaNop(hoNT);
		for(int i = 0; i < dsKT.size(); i++) {
			System.out.println(dsKT.get(i).getTenKhoanThu() + "\t" + dsKT.get(i).getSoTien());
		}
//		ser.themKhoanThu(ds);
//		ArrayList<HoNopTien> hoNopTien = ser.getHoNopTien();
	}

}
