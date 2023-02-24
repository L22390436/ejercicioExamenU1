public class Main {
    public static void main(String[] args) {
        System.out.println("");

        Operacion calcularDatos = new Operacion(40,30,0);

        calcularDatos.CompararNumeros();

    }
}

class Operacion{
    float num1, num2, diferencia;

    public Operacion(float num1, float num2, float diferencia) {
        this.num1 = num1;
        this.num2 = num2;
        this.diferencia = diferencia;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(float diferencia) {
        this.diferencia = diferencia;
    }

    public void CompararNumeros(){
        diferencia = num1 - num2;

        System.out.println("La diferencia entre "+num1+" y "+num2+" es: "+diferencia);

        if(num1 % diferencia == 0 && num2 % diferencia == 0){
            System.out.println("La división de la diferencia en ambos números es exacta.");
        } else{
            System.out.println("La divisón de la diferencia no es exacta.");
        }
    }
}