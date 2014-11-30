/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Interfaz.InterfazPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class ParMasProximo {
    Point p1v,p2v;
    private int cont = 0;
    public ArrayList <Logica.Point> aplicarPMP(ArrayList <Logica.Point> vpoints){
        ArrayList <Logica.Point> res = new ArrayList<Logica.Point>(); 
        int distancia =100;
        int p1x,p2x,p1y,p2y,i,j = 0;
        //p1v;
        //Point p2v;
        for(i = 0;i < vpoints.size();i++)
        {
            for(j = i+1; j < vpoints.size()-1;j++)
            {
                Point p1 = vpoints.get(i);
                Point p2 = vpoints.get(j);
                p1x = p1.getX();
                p1y = p1.getY();
                p2x = p2.getX();
                p2y = p2.getY();
                int diferencia = Math.abs(p1x-p2x);
                if(diferencia<distancia)
                {
                    distancia =  diferencia;
                    p1v = p1;
                    p2v = p2;
                }
            }
        }
        cont = i*j;
        res.add(p1v);
        res.add(p2v);
        return res;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
