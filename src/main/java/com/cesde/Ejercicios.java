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
            return "El número mayor es: num1";
        }
        else if (num2>num1) {
            return "El número mayor es: num2";
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
        
        return "";
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
        // Implementar solución
        return 0;
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
        // Implementar solución
        return "";
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
        // Implementar solución
        return 0;
    }
}
