package main;

public class practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		
		// User 1 fer la suma dels elements de sumArray
		
        int suma = 0;
        
        for (int i = 0; i < sumArray.length; i++) {
            suma += sumArray[i];
        }

        System.out.println("El resultado de la suma es: " + suma);
		
		// User 2 fer la resta dels elements de subArray
		
        // Creo la variable para guardar el resultado
		int resultado = subArray[0] - subArray[1] - subArray[2] - subArray[3] - subArray[4];
        
		// Muestro el resultado
        System.out.println("El resultado de la resta es: " + resultado);
        
		
		// User 3 fer la multiplicació dels elements de prodArray
		
		int resultado = 1;
		
        for (int i = 0; i < prodArray.length; i++) {  // Recorro los numeros del array y multiplico cada uno de ellos
            resultado *= prodArray[i];
        }
        System.out.println("El resultado de la multiplicacion del array es: " + resultado); // Muestro el resultado
	}

}
