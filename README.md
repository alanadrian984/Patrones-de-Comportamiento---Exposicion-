# Patrones de Comportamiento (GoF) — Programación II

Repositorio de apoyo con ejemplos prácticos de código para la exposición de Programación Orientada a Objetos.

## Integrantes
* Alan Ledesma
* Victor Palacios
* Francisco Arboleda

## Introducción

Los **Patrones de Comportamiento** del catálogo *Gang of Four* (GoF) son 11 soluciones de diseño enfocadas en cómo interactúan los objetos, cómo se comunican y cómo se reparten responsabilidades en tiempo de ejecución.

Su objetivo principal es evitar clases monolíticas llenas de condicionales (`if/else` o `switch`), logrando que los objetos colaboren entre sí manteniendo un bajo acoplamiento mediante el uso de interfaces y la encapsulación de lo que varía.

## Patrones Ejemplificados en el Repositorio

En este proyecto nos enfocamos en la implementación de los 6 patrones más utilizados para resolver problemas comunes de flujo y comunicación:

| Patrón | Propósito principal | Caso de uso típico |
| :--- | :--- | :--- |
| **1. Observer** | Define una dependencia uno-a-muchos para notificar cambios de estado automáticamente sin acoplar emisor y receptores. | Sistemas de eventos y notificaciones a suscriptores. |
| **2. Strategy** | Encapsula una familia de algoritmos en clases separadas para intercambiarlos en tiempo de ejecución. | Selección dinámica de métodos de pago o cálculo de rutas. |
| **3. Command** | Convierte una petición en un objeto independiente para encolar, registrar o deshacer operaciones. | Historial de acciones (Deshacer / Rehacer) o botones de control. |
| **4. State** | Permite que un objeto altere su comportamiento cuando cambia su estado interno. | Máquinas de estado (por ejemplo, estados de un reproductor multimedia). |
| **5. Iterator** | Permite recorrer los elementos de una colección secuencialmente sin exponer su estructura interna. | Recorrido uniforme sobre listas, árboles o colecciones personalizadas. |
| **6. Template Method** | Define el esqueleto de un algoritmo en una clase base y delega pasos específicos a las subclases. | Flujos de procesamiento con pasos fijos y variaciones puntuales (por ejemplo, generación de reportes). |

El catálogo GoF de comportamiento se completa con otros 5 patrones de alcance más específico: **Mediator**, **Memento**, **Chain of Responsibility**, **Visitor** e **Interpreter**. 

## Criterios Clave de Diseño

* **Composición sobre herencia:** Delegar comportamientos a objetos externos (*Strategy*, *State*) aporta mayor flexibilidad que extender jerarquías rígidas.
* **Programar contra interfaces:** Reduce la dependencia directa entre clases concretas.
* **Evitar sobreingeniería:** Identificar primero el problema de acoplamiento o rigidez antes de aplicar un patrón.

## Referencia
* Gamma, E., Helm, R., Johnson, R., & Vlissides, J. (1994). *Design Patterns: Elements of Reusable Object-Oriented Software*.
