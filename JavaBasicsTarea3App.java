
public class JavaBasicsTarea3App {
	
	public static void main(String[] args) {
		
		int X = 7;
		int Y = 22;
		double N = 12.5;
		double M = 8.2;
		
		//Print de los valores de las variables
		System.out.println("Variable X = "+X+"\nVariable Y = "+Y+"\nVariable M = "+M+"\nVariable N = "+N);
		
		//Print de las operaciones entre X y Y
		System.out.println("La suma de "+X+" y "+Y+" da "+(X+Y));
		
		System.out.println("La resta "+X+" menos "+Y+" da "+(X-Y));
		
		System.out.println("La multiplicación de "+X+" y "+Y+" da "+(X*Y));
		
		System.out.println("La división de "+X+" entre "+Y+" da "+(X/Y));
		
		System.out.println("El resto de la división entre "+X+" y "+Y+" es "+(X%Y));
		
		//Print de las operaciones entre N y M
		System.out.println("La suma de "+N+" y "+M+" da "+(N+M));
					
		System.out.println("La resta "+N+" menos "+M+" da "+(N-M));
					
		System.out.println("La multiplicación de "+N+" y "+M+" da "+(N*M));
					
		System.out.println("La división de "+N+" entre "+M+" da "+(N/M));
					
		System.out.println("El resto de la división entre "+N+" y "+M+" es "+(N%M));
		
		//Print de operaciones mixtas entre X Y y N M
		System.out.println("La suma de "+X+" y "+N+" da "+(X+N));
		
		System.out.println("La división de "+Y+" entre "+M+" da "+(Y/M));
		
		System.out.println("El resto de la división entre "+Y+" y "+M+" es "+(Y%M));
		
		//Print del doble, suma y producto de todas las variables
		System.out.println("El doble de X es "+(X*2)+"\nEl doble de Y es "+(Y*2)+"\nEl doble de N es "+(N*2)+"\nEl doble de M es "+(M*2));
		System.out.println("La suma de X + Y + N + M es "+(X+Y+N+M));
		System.out.println("El producto de X * Y * N * M es "+(X*Y*N*M));

	}

}
