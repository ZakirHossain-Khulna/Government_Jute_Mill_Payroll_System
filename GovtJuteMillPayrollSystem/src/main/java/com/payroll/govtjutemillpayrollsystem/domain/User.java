package com.payroll.govtjutemillpayrollsystem.domain;
// Generated Jul 21, 2018 8:35:28 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="user"
    ,catalog="govt_jute_mill_payroll"
)
public class User  implements java.io.Serializable {


     private Integer userId;
     private MasterData masterData;
     private String userName;
     private String userEmail;
     private String userPass;

    public User() {
    }

    public User(MasterData masterData, String userName, String userEmail, String userPass) {
       this.masterData = masterData;
       this.userName = userName;
       this.userEmail = userEmail;
       this.userPass = userPass;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="user_id", unique=true, nullable=false)
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="employee_id", nullable=false)
    public MasterData getMasterData() {
        return this.masterData;
    }
    
    public void setMasterData(MasterData masterData) {
        this.masterData = masterData;
    }

    
    @Column(name="user_name", nullable=false, length=45)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    @Column(name="user_email", nullable=false, length=45)
    public String getUserEmail() {
        return this.userEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    
    @Column(name="user_pass", nullable=false, length=45)
    public String getUserPass() {
        return this.userPass;
    }
    
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }




}


