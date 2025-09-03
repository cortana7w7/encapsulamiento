package org.example;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria() {
        this.saldo = 0;
    }

    public  CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
        return saldo;
    }

    public double retirar (double monto){
         if (monto < saldo ) {
             saldo -= monto;

             return saldo;
         }

        return monto;
    }

    public double getSaldo () {
        return saldo;
    }

}
