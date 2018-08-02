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
 * SalaryTranAllowance generated by hbm2java
 */
@Entity
@Table(name="salary_tran_allowance"
    ,catalog="govt_jute_mill_payroll"
)
public class SalaryTranAllowance  implements java.io.Serializable {


     private Integer salaryTranAllowId;
     private MasterData masterData;
     private SalaryTran salaryTran;
     private double totalBasic;
     private double houseRentAllow;
     private double medicalAllow;
     private double mohargoAllow;
     private double childEduction;
     private double convenceAllow;
     private double tiffinAllow;
     private double telephoneAllow;
     private double otAllow;
     private double encashPay;
     private double others;

    public SalaryTranAllowance() {
    }

    public SalaryTranAllowance(MasterData masterData, SalaryTran salaryTran, double totalBasic, double houseRentAllow, double medicalAllow, double mohargoAllow, double childEduction, double convenceAllow, double tiffinAllow, double telephoneAllow, double otAllow, double encashPay, double others) {
       this.masterData = masterData;
       this.salaryTran = salaryTran;
       this.totalBasic = totalBasic;
       this.houseRentAllow = houseRentAllow;
       this.medicalAllow = medicalAllow;
       this.mohargoAllow = mohargoAllow;
       this.childEduction = childEduction;
       this.convenceAllow = convenceAllow;
       this.tiffinAllow = tiffinAllow;
       this.telephoneAllow = telephoneAllow;
       this.otAllow = otAllow;
       this.encashPay = encashPay;
       this.others = others;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="salary_tran_allow_id", unique=true, nullable=false)
    public Integer getSalaryTranAllowId() {
        return this.salaryTranAllowId;
    }
    
    public void setSalaryTranAllowId(Integer salaryTranAllowId) {
        this.salaryTranAllowId = salaryTranAllowId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="employee_id", nullable=false)
    public MasterData getMasterData() {
        return this.masterData;
    }
    
    public void setMasterData(MasterData masterData) {
        this.masterData = masterData;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="salary_tran_id", nullable=false)
    public SalaryTran getSalaryTran() {
        return this.salaryTran;
    }
    
    public void setSalaryTran(SalaryTran salaryTran) {
        this.salaryTran = salaryTran;
    }

    
    @Column(name="total_basic", nullable=false, precision=22, scale=0)
    public double getTotalBasic() {
        return this.totalBasic;
    }
    
    public void setTotalBasic(double totalBasic) {
        this.totalBasic = totalBasic;
    }

    
    @Column(name="house_rent_allow", nullable=false, precision=22, scale=0)
    public double getHouseRentAllow() {
        return this.houseRentAllow;
    }
    
    public void setHouseRentAllow(double houseRentAllow) {
        this.houseRentAllow = houseRentAllow;
    }

    
    @Column(name="medical_allow", nullable=false, precision=22, scale=0)
    public double getMedicalAllow() {
        return this.medicalAllow;
    }
    
    public void setMedicalAllow(double medicalAllow) {
        this.medicalAllow = medicalAllow;
    }

    
    @Column(name="mohargo_allow", nullable=false, precision=22, scale=0)
    public double getMohargoAllow() {
        return this.mohargoAllow;
    }
    
    public void setMohargoAllow(double mohargoAllow) {
        this.mohargoAllow = mohargoAllow;
    }

    
    @Column(name="child_eduction", nullable=false, precision=22, scale=0)
    public double getChildEduction() {
        return this.childEduction;
    }
    
    public void setChildEduction(double childEduction) {
        this.childEduction = childEduction;
    }

    
    @Column(name="convence_allow", nullable=false, precision=22, scale=0)
    public double getConvenceAllow() {
        return this.convenceAllow;
    }
    
    public void setConvenceAllow(double convenceAllow) {
        this.convenceAllow = convenceAllow;
    }

    
    @Column(name="tiffin_allow", nullable=false, precision=22, scale=0)
    public double getTiffinAllow() {
        return this.tiffinAllow;
    }
    
    public void setTiffinAllow(double tiffinAllow) {
        this.tiffinAllow = tiffinAllow;
    }

    
    @Column(name="telephone_allow", nullable=false, precision=22, scale=0)
    public double getTelephoneAllow() {
        return this.telephoneAllow;
    }
    
    public void setTelephoneAllow(double telephoneAllow) {
        this.telephoneAllow = telephoneAllow;
    }

    
    @Column(name="ot_allow", nullable=false, precision=22, scale=0)
    public double getOtAllow() {
        return this.otAllow;
    }
    
    public void setOtAllow(double otAllow) {
        this.otAllow = otAllow;
    }

    
    @Column(name="encash_pay", nullable=false, precision=22, scale=0)
    public double getEncashPay() {
        return this.encashPay;
    }
    
    public void setEncashPay(double encashPay) {
        this.encashPay = encashPay;
    }

    
    @Column(name="others", nullable=false, precision=22, scale=0)
    public double getOthers() {
        return this.others;
    }
    
    public void setOthers(double others) {
        this.others = others;
    }




}

