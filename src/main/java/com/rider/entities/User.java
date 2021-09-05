package com.rider.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String useEmail;
	private String userMobile;
	private String userDob;
	private String userGender;
	private String userAddress;
	private String userLicenceNo;
	private String userBikeNo;
	private String userPassword;
	private String role;
	private boolean status;
	
	
	public User() {
		super();
		
	}

	public User(String userName, String useEmail, String userMobile, String userDob, String userGender,
			String userAddress, String userLicenceNo, String userBikeNo, String userPassword, String role,
			boolean status) {
		super();
		this.userName = userName;
		this.useEmail = useEmail;
		this.userMobile = userMobile;
		this.userDob = userDob;
		this.userGender = userGender;
		this.userAddress = userAddress;
		this.userLicenceNo = userLicenceNo;
		this.userBikeNo = userBikeNo;
		this.userPassword = userPassword;
		this.role = role;
		this.status = status;
	}

	public User(String userName, String useEmail, String userMobile, String userDob, String userGender,
			String userAddress, String userLicenceNo, String userBikeNo, String userPassword) {
		super();
		this.userName = userName;
		this.useEmail = useEmail;
		this.userMobile = userMobile;
		this.userDob = userDob;
		this.userGender = userGender;
		this.userAddress = userAddress;
		this.userLicenceNo = userLicenceNo;
		this.userBikeNo = userBikeNo;
		this.userPassword = userPassword;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUseEmail() {
		return useEmail;
	}

	public void setUseEmail(String useEmail) {
		this.useEmail = useEmail;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserDob() {
		return userDob;
	}

	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserLicenceNo() {
		return userLicenceNo;
	}

	public void setUserLicenceNo(String userLicenceNo) {
		this.userLicenceNo = userLicenceNo;
	}

	public String getUserBikeNo() {
		return userBikeNo;
	}

	public void setUserBikeNo(String userBikeNo) {
		this.userBikeNo = userBikeNo;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", useEmail=" + useEmail + ", userMobile="
				+ userMobile + ", userDob=" + userDob + ", userGender=" + userGender + ", userAddress=" + userAddress
				+ ", userLicenceNo=" + userLicenceNo + ", userBikeNo=" + userBikeNo + ", userPassword=" + userPassword
				+ ", role=" + role + ", status=" + status + "]";
	}
	
	
	
	
	
	
}
