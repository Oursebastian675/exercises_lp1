package com.cesde;

public class Ejercicios {

    /**
     * La función compara dos números y devuelve un mensaje indicando cuál es mayor
     * o si son iguales.
     * 
     * @param num1
     * @param num2
     * @return El método compara dos números `num1` y `num2` y devuelve los
     *         siguientes mensajes:
     *         El número mayor es: num1
     *         El número mayor es: num2
     *         Los dos números son iguales.
     */
    public String ejercicio1(int num1, int num2) {

        if (num1>num2) {
            return "El número mayor es: 10";
        }
        else if (num2>num1) {
            return "El número mayor es: 10";
        }
        else if (num1==num2) {
            return "Los dos números son iguales.";
            
        }
        return null;
    }
    // ----------------------------------------------------------------------------------------

    /**
     * La función determina si un estudiante ha aprobado o reprobado un examen en
     * función de su nota (menor a 3.5->reprobado, mayor o igual a 3.5->aprobado).
     * 
     * @param calificacion El parámetro "calificación" representa la calificación o
     *                     puntaje de un
     *                     estudiante en un examen de 0.0 - 5.0.
     * @return El método compara la calificación y devuelve los siguientes mensajes:
     *         ¡Felicidades! Usted ha aprobado el examen.
     *         Lo siento, usted ha reprobado el examen.
     */
    public String ejercicio2(double calificacion) {
        if (calificacion<=3.4) {
            return "Lo siento, usted ha reprobado el examen.";
        }
        else if (calificacion>=3.5) {
            return "¡Felicidades! Usted ha aprobado el examen.";
        }
        return null;
    }

    // ----------------------------------------------------------------------------------------

    /**
     * La función calcula el precio final tras aplicar un descuento del 10% si el
     * precio original es igual o superior a 50000.
     * 
     * @param precio El parámetro "precio" en el código dado representa el precio
     *               original de un
     *               producto.
     * @return El método devuelve el precio final después de aplicar un descuento
     *         basado en el precio de entrada.           
     */
    public double ejercicio3(double precio) {
         if (precio >= 50000) {
            return precio * 0.9; // Aplicar descuento del 10%
        } else {
            return precio; // No se aplica descuento
        }
    }
         public static void main(String[] args) {
        Ejercicio ejercicio = new Ejercicio();
        double precioOriginal = 60000;
        double precioFinal = ejercicio.ejercicio3(precioOriginal);
        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Precio final: " + precioFinal);
    }
    

    // ----------------------------------------------------------------------------------------

    /**
     * La función calcula el área de un cuadrado, triángulo o círculo según el tipo
     * de figura ingresada
     * y las dimensiones correspondientes.
     * 
     * @param tipoFigura      tipoFigura es un número entero que representa el tipo
     *                        de figura geométrica:
     *                        1-Cuadrado, 2-Triángulo, 3-círculo
     * @param ladoCuadrado    El parámetro `ladoCuadrado` representa la longitud del
     *                        lado de un cuadrado.
     * @param baseTriangulo   El parámetro `baseTriangulo` representa la base de un
     *                        triángulo.
     * @param alturaTriangulo El parámetro `alturaTriangulo` representa la altura de
     *                        un triángulo.
     * @param radioCirculo    El parámetro `radioCirculo` representa el radio de un
     *                        círculo.
     * @return El método devuelve un String que indica el área de la figura
     *         especificada:
     *         Si el parámetro `tipoFigura` es 1, 2, 3 devuelve el mensaje:
     *         El área de la figura es: + area
     *         Si el parámetro `tipoFigura` es diferente de 1, 2, 3 devuelve el
     *         mensaje:
     *         Tipo de figura no válida.
     */
    public String ejercicio4(int tipoFigura, double ladoCuadrado, double baseTriangulo, double alturaTriangulo,
            double radioCirculo) {
       double area = 0.0;
        switch (tipoFigura) {
            case 1: // Cuadrado
                area = ladoCuadrado * ladoCuadrado;
                break;
            case 2: // Triángulo
                area = (baseTriangulo * alturaTriangulo) / 2;
                break;
            case 3: // Círculo
                area = Math.PI * radioCirculo * radioCirculo;
                break;
            default:
                return "Tipo de figura no válida.";
        }
        return "El área de la figura es: " + area;
    }

public static void main() {
    

        Ejercicio ejercicio4 = new Ejercicio ();
        int tipoFigura = 3; // Tipo de figura: 1-Cuadrado, 2-Triángulo, 3-Círculo
        double ladoCuadrado = 0; // Longitud del lado del cuadrado
        double baseTriangulo = 0; // Base del triángulo
        double alturaTriangulo = 0; // Altura del triángulo
        double radioCirculo = 5; // Radio del círculo
        String resultado = ejercicio4.ejercicio4(tipoFigura, ladoCuadrado, baseTriangulo, alturaTriangulo,
                radioCirculo);
        System.out.println(resultado);
    }
        
  // ----------------------------------------------------------------------------------------

    /**
     * La función devuelve el menor de tres enteros dados.
     * 
     * @param num1
     * @param num2
     * @param num3
     * @return El método devuelve el más pequeño de los tres enteros de entrada
     *         `num1`,
     *         `num2` y `num3`.
     */
    

    
     public int ejercicio5(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        } else {
            return num3;}
     }
        public static void mai() {
        Ejercicio ejercicio = new Ejercicio();
        int num1 = 5;
        int num2 = 3;
        int num3 = 8;
        int menor = ejercicio.ejercicio5(num1, num2, num3);
        System.out.println("El menor de los tres números es: " + menor);
    
    

    }
}
