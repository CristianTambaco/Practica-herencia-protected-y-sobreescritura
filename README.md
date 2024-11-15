Enunciado del Problema:

Gestionar información de jugadores de fútbol de distintas posiciones: portero, defensa y delantero. La aplicación debe contar con una estructura de herencia que permita reutilizar atributos y métodos comunes entre los jugadores y definir atributos específicos según su rol en el campo.
La estructura será la siguiente:

1.	Superclase Jugador:
Atributos comunes a todos los jugadores: nombre, edad, y equipo.
Constructor para inicializar estos atributos.
Método mostrarInfo() para mostrar la información común de un jugador.

3.	Subclase Portero:
Hereda de Jugador.
Añade dos atributos específicos: atajadas (cantidad de atajadas realizadas) y golesRecibidos (cantidad de goles recibidos).
Método mostrarInfo() que sobrescribe el de la superclase para mostrar los atributos adicionales.

5.	Subclase Defensa:
Hereda de Jugador.
Añade un atributo específico: bloqueos (cantidad de bloqueos realizados).
Método mostrarInfo() que sobrescribe el de la superclase para mostrar el atributo adicional.

7.	Subclase Delantero:
Hereda de Jugador sin añadir nuevos atributos.
Método mostrarInfo() que utiliza el método de la superclase para mostrar la información.
La clase principal (Main) deberá crear instancias de cada tipo de jugador y mostrar la información correspondiente.
