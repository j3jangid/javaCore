//package com.groot.listeners;
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class GenricNextWindow implements ActionListener {
//    Frame frame1;
//    String classNme;
//    public GenricNextWindow(Frame frame1, String classNme){
//        this.classNme=classNme;
//        this.frame1=frame1;
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        try{
//            frame1.dispose();
//            Class<?> cl=  Class.forName(classNme);
//            Frame f= (Frame)cl.getDeclaredConstructor().newInstance();
//
//        }catch (Exception e1){
//            e1.printStackTrace();
//        }
//    }
//}
