/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aleksandra
 */
public class Algorytm {
    List<Integer> lista = new ArrayList();
    int y;
    
  public int Wieksza(){
      for(int i = 1; i<lista.size(); i++){
          if(lista.get(0)<lista.get(i)){
              y++;
          }
      }
      
      return y;
  }
}
