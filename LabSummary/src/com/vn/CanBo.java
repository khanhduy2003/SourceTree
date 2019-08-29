package com.vn;

public class CanBo {
	public static String name;
	public static int birthday;
	public static String gender;
	public static String address;

	public CanBo(String name, int birthday, String gender, String address) {
		super();
		CanBo.name = name;
		CanBo.birthday = birthday;
		CanBo.gender = gender;
		CanBo.address = address;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		CanBo.name = name;
	}

	public static int getBirthday() {
		return birthday;
	}

	public static void setBirthday(int birthday) {
		CanBo.birthday = birthday;
	}

	public static String getGender() {
		return gender;
	}

	public static void setGender(String gender) {
		CanBo.gender = gender;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		CanBo.address = address;
	}

}
