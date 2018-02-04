package com.rpise;
public class E1 extends RuntimeException{
     int errno;
     public E1(int errno){
         this.errno = errno;
     }
     public int getErrorno(){
         return errno;
     }
}

