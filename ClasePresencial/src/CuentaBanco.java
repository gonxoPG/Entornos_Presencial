public class CuentaBanco {
    private int saldo;
    private String password;

    public CuentaBanco (int saldoInicial, String password){

        this.saldo=saldoInicial;
        this.password=password;
    }

    public int retirar (int cantidad, String pass){

        if (password.equals(pass)){ // podríamos llamar a "passwordCorrecta(pass)"
            if (saldo>=cantidad){
                saldo-=cantidad;
                return saldo;
            }else{
                return -1; //saldo negativo
            }
        }else{
            return -2; //contraseña incorrecta
        }
    }

    public boolean passwordCorrecta (String pass){
        return password.equals(pass);
    }
}
