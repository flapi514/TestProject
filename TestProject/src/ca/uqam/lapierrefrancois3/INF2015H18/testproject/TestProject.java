/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uqam.lapierrefrancois3.INF2015H18.testproject;

import java.sql.Connection;

/**
 *
 * @author flapi
 */
public class TestProject {
    
    private final Connection con;
    
    TestProject(){
        
        con = null;
    }
    
    TestProject(Connection con){
        this.con = con;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestProject project = new TestProject();
    }
    
}
