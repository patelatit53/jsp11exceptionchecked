package com.rpise;
public class E2 extends RuntimeException{
     int errno;
     public E2(int errno){
         this.errno = errno;
     }
     public int getErrorno(){
         return errno;
     }
}

