package com.payroll.govtjutemillpayrollsystem.domain;
// Generated Jul 21, 2018 8:35:28 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SalaryTran generated by hbm2java
 */
@Entity
@Table(name="salary_tran"
    ,catalog="govt_jute_mill_payroll"
)
public class SalaryTran  implements java.io.Serializable {


     private Integer salaryTranId;
     private MasterData masterData;
     private Date salaryTranMonth;
     private String name;
     private String designationName;
     private double basicMain;
     private String millName;
     private String departmentName;
     private String jobStatusName;
     private String salaryStatusName;
     private String jobTypeName;
     private int workingDay;
     private int leaveDay;
     private float otHour;
     private int encashDay;
     private String houseName;
     private Set<SalaryTranDeduction> salaryTranDeductions = new HashSet<SalaryTranDeduction>(0);
     private Set<SalaryTranAllowance> salaryTranAllowances = new HashSet<SalaryTranAllowance>(0);

    public SalaryTran() {
    }

	
    public SalaryTran(MasterData masterData, Date salaryTranMonth, String name, String designationName, double basicMain, String millName, String departmentName, String jobStatusName, String salaryStatusName, String jobTypeName, int workingDay, int leaveDay, float otHour, int encashDay, String houseName) {
        this.masterData = masterData;
        this.salaryTranMonth = salaryTranMonth;
        this.name = name;
        this.designationName = designationName;
        this.basicMain = basicMain;
        this.millName = millName;
        this.departmentName = departmentName;
        this.jobStatusName = jobStatusName;
        this.salaryStatusName = salaryStatusName;
        this.jobTypeName = jobTypeName;
        this.workingDay = workingDay;
        this.leaveDay = leaveDay;
        this.otHour = otHour;
        this.encashDay = encashDay;
        this.houseName = houseName;
    }
    public SalaryTran(MasterData masterData, Date salaryTranMonth, String name, String designationName, double basicMain, String millName, String departmentName, String jobStatusName, String salaryStatusName, String jobTypeName, int workingDay, int leaveDay, float otHour, int encashDay, String houseName, Set<SalaryTranDeduction> salaryTranDeductions, Set<SalaryTranAllowance> salaryTranAllowances) {
       this.masterData = masterData;
       this.salaryTranMonth = salaryTranMonth;
       this.name = name;
       this.designationName = designationName;
       this.basicMain = basicMain;
       this.millName = millName;
       this.departmentName = departmentName;
       this.jobStatusName = jobStatusName;
       this.salaryStatusName = salaryStatusName;
       this.jobTypeName = jobTypeName;
       this.workingDay = workingDay;
       this.leaveDay = leaveDay;
       this.otHour = otHour;
       this.encashDay = encashDay;
       this.houseName = houseName;
       this.salaryTranDeductions = salaryTranDeductions;
       this.salaryTranAllowances = salaryTranAllowances;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="salary_tran_id", unique=true, nullable=false)
    public Integer getSalaryTranId() {
        return this.salaryTranId;
    }
    
    public void setSalaryTranId(Integer salaryTranId) {
        this.salaryTranId = salaryTranId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="employee_id", nullable=false)
    public MasterData getMasterData() {
        return this.masterData;
    }
    
    public void setMasterData(MasterData masterData) {
        this.masterData = masterData;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="salary_tran_month", nullable=false, length=10)
    public Date getSalaryTranMonth() {
        return this.salaryTranMonth;
    }
    
    public void setSalaryTranMonth(Date salaryTranMonth) {
        this.salaryTranMonth = salaryTranMonth;
    }

    
    @Column(name="name", nullable=false, length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="designation_name", nullable=false, length=45)
    public String getDesignationName() {
        return this.designationName;
    }
    
    public void setDesignationName(String designationName) {
        this.designationName = designationName;
    }

    
    @Column(name="basic_main", nullable=false, precision=22, scale=0)
    public double getBasicMain() {
        return this.basicMain;
    }
    
    public void setBasicMain(double basicMain) {
        this.basicMain = basicMain;
    }

    
    @Column(name="mill_name", nullable=false, length=45)
    public String getMillName() {
        return this.millName;
    }
    
    public void setMillName(String millName) {
        this.millName = millName;
    }

    
    @Column(name="department_name", nullable=false, length=45)
    public String getDepartmentName() {
        return this.departmentName;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    
    @Column(name="job_status_name", nullable=false, length=45)
    public String getJobStatusName() {
        return this.jobStatusName;
    }
    
    public void setJobStatusName(String jobStatusName) {
        this.jobStatusName = jobStatusName;
    }

    
    @Column(name="salary_status_name", nullable=false, length=45)
    public String getSalaryStatusName() {
        return this.salaryStatusName;
    }
    
    public void setSalaryStatusName(String salaryStatusName) {
        this.salaryStatusName = salaryStatusName;
    }

    
    @Column(name="job_type_name", nullable=false, length=45)
    public String getJobTypeName() {
        return this.jobTypeName;
    }
    
    public void setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
    }

    
    @Column(name="working_day", nullable=false)
    public int getWorkingDay() {
        return this.workingDay;
    }
    
    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    
    @Column(name="leave_day", nullable=false)
    public int getLeaveDay() {
        return this.leaveDay;
    }
    
    public void setLeaveDay(int leaveDay) {
        this.leaveDay = leaveDay;
    }

    
    @Column(name="ot_hour", nullable=false, precision=12, scale=0)
    public float getOtHour() {
        return this.otHour;
    }
    
    public void setOtHour(float otHour) {
        this.otHour = otHour;
    }

    
    @Column(name="encash_day", nullable=false)
    public int getEncashDay() {
        return this.encashDay;
    }
    
    public void setEncashDay(int encashDay) {
        this.encashDay = encashDay;
    }

    
    @Column(name="house_name", nullable=false, length=45)
    public String getHouseName() {
        return this.houseName;
    }
    
    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="salaryTran")
    public Set<SalaryTranDeduction> getSalaryTranDeductions() {
        return this.salaryTranDeductions;
    }
    
    public void setSalaryTranDeductions(Set<SalaryTranDeduction> salaryTranDeductions) {
        this.salaryTranDeductions = salaryTranDeductions;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="salaryTran")
    public Set<SalaryTranAllowance> getSalaryTranAllowances() {
        return this.salaryTranAllowances;
    }
    
    public void setSalaryTranAllowances(Set<SalaryTranAllowance> salaryTranAllowances) {
        this.salaryTranAllowances = salaryTranAllowances;
    }




}


