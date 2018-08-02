package com.payroll.govtjutemillpayrollsystem.domain;
// Generated Jul 21, 2018 8:35:28 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * JobType generated by hbm2java
 */
@Entity
@Table(name="job_type"
    ,catalog="govt_jute_mill_payroll"
    , uniqueConstraints = @UniqueConstraint(columnNames="job_type_cd") 
)
public class JobType  implements java.io.Serializable {


     private Integer jobTypeId;
     private int jobTypeCd;
     private String jobTypeName;
     private Set<MasterData> masterDatas = new HashSet<MasterData>(0);

    public JobType() {
    }

	
    public JobType(int jobTypeCd, String jobTypeName) {
        this.jobTypeCd = jobTypeCd;
        this.jobTypeName = jobTypeName;
    }
    public JobType(int jobTypeCd, String jobTypeName, Set<MasterData> masterDatas) {
       this.jobTypeCd = jobTypeCd;
       this.jobTypeName = jobTypeName;
       this.masterDatas = masterDatas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="job_type_id", unique=true, nullable=false)
    public Integer getJobTypeId() {
        return this.jobTypeId;
    }
    
    public void setJobTypeId(Integer jobTypeId) {
        this.jobTypeId = jobTypeId;
    }

    
    @Column(name="job_type_cd", unique=true, nullable=false)
    public int getJobTypeCd() {
        return this.jobTypeCd;
    }
    
    public void setJobTypeCd(int jobTypeCd) {
        this.jobTypeCd = jobTypeCd;
    }

    
    @Column(name="job_type_name", nullable=false, length=45)
    public String getJobTypeName() {
        return this.jobTypeName;
    }
    
    public void setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="jobType")
    public Set<MasterData> getMasterDatas() {
        return this.masterDatas;
    }
    
    public void setMasterDatas(Set<MasterData> masterDatas) {
        this.masterDatas = masterDatas;
    }




}


