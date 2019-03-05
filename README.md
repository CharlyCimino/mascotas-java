# Mascotas en Java

## Descripción

Explicación de los conceptos básicos del paradigma orientado a objetos, utilizando como ejemplo una jerarquía de mascotas.

## Versiones

El repositorio se encuentra versionado en cuatro partes *(Ver pestaña [releases](https://github.com/caemci/mascotas-java/releases))*.

### Versión 1: Encapsulamiento

Primera versión del proyecto, con las clases `Perro`, `Gato` y `Loro` encapsuladas e independientes.

![Diagrama de clases v1](src/uml/clases-mascotas-1-java.png)

### Versión 2: Herencia

Introducción al concepto de herencia con la creación de la superclase `Mascota`.

![Diagrama de clases v2](src/uml/clases-mascotas-2-java.png)

### Versión 3: Polimorfismo

Introducción al concepto de polimorfismo por herencia. La superclase `Mascota` se vuelve abstracta y obliga a sus clases hijas a sobreescribir sus métodos abstractos. Luego cada mascota responde al mismo mensaje de maneras diferentes.

![Diagrama de clases v3](src/uml/clases-mascotas-3-java.png)

### Versión 4: Interfaces

Introducción al concepto de polimorfismo por interfaces. La aparición de una clase `Humano` que comparte ciertas características con las mascotas pero no pertenece a su jerarquía, obliga a reformular el modelo con la aparición de la interface `CapazDeComer`.

![Diagrama de clases v4](src/uml/clases-mascotas-4-java.png)

Realizado con NetBeans 8.2. Compatible con Eclipse.