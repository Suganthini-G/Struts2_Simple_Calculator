/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.form.calculator;

/**
 *
 * @author Sugaa
 */
public class calculatorAction extends ActionSupport {
    private float n1;
    private float n2;
    private float ans;
    private int op;
    
    public calculatorAction() {
    }
    
    public String execute() throws Exception {
        
        calculator cal = new calculator();
        
        switch(op){
            case 1:
                ans = cal.add(n1,n2); 
                break;
            case 2:
                ans = cal.sub(n1,n2); 
                break;
            case 3:
                ans = cal.mul(n1,n2); 
                break;
            case 4:
                ans = cal.div(n1,n2); 
                break;
            default:
                return ERROR;
        }
        
        return SUCCESS;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getAns() {
        return ans;
    }

    public void setAns(float ans) {
        this.ans = ans;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }
    
}
