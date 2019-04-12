package pojo;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * <ul>
 * 用户实体类
 * </ul>
 * <li>userName:用户姓名</li>
 * <li>password:密码</li>
 *
 */
public class User {

	@NotBlank
	private String userName;
	
	@NotBlank
	@Length(min = 6, max = 8)
	private String password;
	
	@NotNull
	private List<String> sex;
	
	// 年龄
	@NotNull
	@Min(15)
	@Max(60)
	private int age;
	
	// 专业
	private String major;
	
	// 邮箱
	@Pattern(regexp = "^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@"
			+ "([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$", message = "不是一个合法的电子邮件地址")
	private String email;
	
	// 电话
	@Pattern(regexp = "[1][3,8][3,6,9][0-9] {8}", message = "需要匹配正则表达式[1][3,8][3,6,9][0-9] {8}")
	private String phone;
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<String> getSex(){
		return sex;
	}
	
	public void setSex(List<String> sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
