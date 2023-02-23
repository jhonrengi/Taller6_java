# Taller6_java
En este apartado, vamos a diseñar todos los ejercicios que hemos estado realizando pero en java.


Inicamos con el taller 1 donde basicamente observaremos como se obtiene un dato por teclado y como se imprime en pantalla.

Por esto haremos uso de las siguitentes lineas de codigo:

En primera medida, en java es sumamente importante crear una clase , al cual le llamaremos Taller1, y de esta misma forma debe que ser guardado el documento, de lo 
contrario no funcionara.

la forma de crear una clase es la siguiente:

public class (nombre){

}

Ahora, dentro de la clase, se debe que ubicar el main(), el cual es el que nos dara el funcionamiento del  programa. lo declaramos de la siguiente forma:

public static void main (String [] arg){

}

Todo lo que vayamos a programar debe que estar dentro del main. Uniendo todo queda de las siguiente forma:

![image](https://user-images.githubusercontent.com/122764419/220987528-4144a9fd-bf7c-40b5-a269-ad4dc7bbced8.png)


ahora, para poder obtener un dato por teclado, es necesario hacer uso de la libreria Scanner, la cual se importa de la siguiente forma:

import java.util.Scanner;

realizado esto, se crea una variable la cual tendra el funcionamiento de guardar la informacion que se digite por teclado, pero esta variable tiene que ser guardada dentro de otra variable.
tal como se observa a continuacion:

primero declaramos la varibale que sera de tipo Scanner:

![image](https://user-images.githubusercontent.com/122764419/220988182-48105eb3-b6fe-4ac5-85e8-d17d86722b32.png)

Como la variable dato es tipo Scanner, esta puede contener cualquier tipo de variable, ya sea String, int, double etc.

Luego declaramos las variables las cuales deseamos que se guarden la informacion que se obtiene por teclado:

![image](https://user-images.githubusercontent.com/122764419/220988689-76e4e0df-0e41-4fb7-a1ba-597d745cb268.png)

Las variables creadas fueron nombre y apellido, ambas de tipo String, por lo tanto, vamos a preguntarle al usuario por estos datos de la siguiente forma:

Empecemos con el nombre, para esto tenemos que solicitarle al usuario que porfavor digite su nombre en la consola. esto lo podemos hacer por medio de un 
System.out.print().

![image](https://user-images.githubusercontent.com/122764419/220989222-142f85bd-ec70-4ae9-995f-ab420b28c78f.png)

inmediatamente realizado esto, se tiene que pedir el dato, por esta razon, llamamos la variable que declaramos para obtener el nombre del usuario , pero tambien
tenemos que hacer uso de la variable de tipo Scanner, quien es la que realmente obtiene el dato que se digita por consola. de la siguiente forma:

![image](https://user-images.githubusercontent.com/122764419/220989616-3c657436-8675-4300-9bea-8a760f63d39e.png)

El netxLine() sigifinca que la variable en donde se esta gaurdado la informacion capturada es de tipos String, lo que significa que varia dependiendo del tipo que sea la variable que se declare.

Realizamos el mimos proceso para el apellido e imprimimos los datos obtenidos:

![image](https://user-images.githubusercontent.com/122764419/220990048-2be827ee-0124-43a5-ad74-f5df354c1577.png)

De esta forma se realiza el taller 1.





