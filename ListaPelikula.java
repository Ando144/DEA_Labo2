import java.util.ArrayList;
import java.util.Iterator;

import listasSimples.UnorderedDoubleLinkedList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ListaPelikula {
    private UnorderedDoubleLinkedList<Pelikula> lista;

    public ListaPelikula(){

	this.lista= new UnorderedDoubleLinkedList<Pelikula>();
    }
    private getIteradorea()
    {
        return this.lista.iterator();
    }
    public void gehituPelikula(Pelikula pPelikula){
        this.lista.addToRear(pPelikula);
    }
    public void reseat(){
        this.lista.first=null;
        //this.lista.count =o;
    }
    public void ezabatuPelikula(Pelikula pPelikula){
        this.lista.remove(pPelikula);
    }
    public void ezabatuAktorea(Aktore pAktore)
    {
        Iterator<Pelikula> itr = this.getIteradorea();
        while(itr.hasNext()){
            Pelikula pelikula = itr.next();
            if(pelikula.badagoAktorea(pAktore)){
                pelikula.ezabatuAktorea(pAktore);
            }
        }
    }

    public int getTamaina(){
        return this.lista.size();
    }
    public boolean pelikulaDago(Pelikula pPelikula){
        return this.lista.contains(pPelikula);
    }
    public boolean badagoPelikula(String pIzenburua){
        boolean badago = false;
        Pelikula pelikula = null;
        Iterator<Pelikula> itr = this.getIteradorea();
        while(itr.hasNext() && !badago){
            pelikula = itr.next();
            if(pelikula.getIzenBurua().equals(pIzenburua)){
                badago = true;
            }
        }
        return badago;
    }
    public void inprimatu(){
        Iterator<Pelikula> itr = this.getIteradorea();
        while(itr.hasNext()){
            Pelikula pelikula = itr.next();
            System.out.println(pelikula.getIzenBurua());
            System.out.println(" + ");
            System.out.println(pelikula.getEstrenaldia());
        }
    }

    //metodo para pasar las pelikulas a un txt con su nombre y año de estreno
   /*  public void pasatuTxtraPelikulak(String txt) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(txt))) {
            for (Pelikula pelikula : lista) {
                writer.write(pelikula.getIzenBurua());
                writer.newLine();
            }
        }
    }*/
} 

