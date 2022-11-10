# ThreadsPractice

*Thread (Java):* es un flujo de control dentro de un programa, el cual permite tener múltiples procesos corriendo de forma simultanea.

Un Hilo presenta distintos estados desde su creación hasta el final de su ejecución. Estos estados son:

*New (Nuevo):* El hilo (thread), ha sido creado pero no inicializado, es decir, no se ha ejecutado todavía en método start(). Se producirá un error IllegalThreadStateException si se intenta ejecutar cualquier método de la clase sin ejecutar el método start().

*Runneable (Ejecutable):* Cuando el método start() se ejecuta crea los recursos del sistema necesarios para ejecutar el hilo, y llama al método run() del thread.

*Blocked or not Runneable (Bloqueado):* En este estado el hilo se encuentra en ejecución, pero no existe una tarea o hay una actividad del mismo hilo que lo impide.

*Dead (Muerto o Finalizado):* Un hilo puede morir de dos formas: por causas naturales o siendo asesinado (parado). Una muerte natural se produce cuando su método run() termina normalmente, mientras que una muerte provocada se produce cuando existe una instrucción que obligue al hilo a finalizar sin haber concluido su tarea por completo.

*Sincronización de Hilos:* Permite controlar el tiempo y la forma de ejecución de varios hilos ejecutandose de manera simultanea, cuya finalidad, es evitar que un hilo provoque el entorpecimiento de otro hilo al momento de estar ejecutando sus respectivas tareas o bien, para establecer  el orden de ejecución en los programas para utilizar hilos. (Sirve para evitar el Deadlock)

*ThreadLocal (Java):* es una clase que permite asociar un dato con el Thread que ejecuta el código, teniendo una variable global en la aplicación con la referencia a la clase ThreadLocal que permite acceder desde cualquier punto de la aplicación.

*Consideraciones:*
Uno de los mayores peligros de las variables globales es la concurrencia si varios hilos modifican el dato global, como el dato asociado a ThreadLocal es local al hilo no hay peligro, simplemente debemos asegurarnos de que una vez el hilo de ejecución termine limpiar el dato para que la siguiente petición en una aplicación web que procese ese hilo no use una dato anterior de otra petición.
