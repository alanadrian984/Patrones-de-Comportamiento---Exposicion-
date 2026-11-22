# Patrones de Comportamiento (GoF) — Programación II

Repositorio de apoyo con ejemplos prácticos de código para la exposición de **Programación Orientada a Objetos**.

## Integrantes
* **Alan Ledesma**
* **Victor Palacios**
* **Francisco Arboleda**

---

## Introducción

Los **Patrones de Comportamiento** del catálogo *Gang of Four* (GoF)[cite: 1] son **11 soluciones de diseño** enfocadas en **cómo interactúan los objetos, cómo se comunican y cómo se reparten responsabilidades** en tiempo de ejecución[cite: 1].

Su objetivo principal es evitar clases monolíticas llenas de condicionales (`if/else` o `switch`)[cite: 1], logrando que los objetos colaboren entre sí manteniendo un **bajo acoplamiento** mediante el uso de interfaces y la encapsulación de lo que varía[cite: 1].

---

## Patrones Ejemplificados en el Repositorio

En este proyecto nos enfocamos en la implementación de los **6 patrones más utilizados** para resolver problemas comunes de flujo y comunicación[cite: 1]:

| Patrón | Propósito principal | Caso de uso típico |
| :--- | :--- | :--- |
| **1. Observer** | Define una dependencia uno-a-muchos para notificar cambios de estado automáticamente sin acoplar emisor y receptores[cite: 1]. | Sistemas de eventos y notificaciones a suscriptores[cite: 1]. |
| **2. Strategy** | Encapsula una familia de algoritmos en clases separadas para intercambiarlos en tiempo de ejecución[cite: 1]. | Selección dinámica de métodos de pago o cálculo de rutas[cite: 1]. |
| **3. Command** | Convierte una petición en un objeto independiente para encolar, registrar o deshacer operaciones[cite: 1]. | Historial de acciones (*Deshacer / Rehacer*) o botones de control[cite: 1]. |
| **4. State** | Permite que un objeto altere su comportamiento cuando cambia su estado interno[cite: 1]. | Máquinas de estado (ej. estados de un reproductor multimedia)[cite: 1]. |
| **5. Iterator** | Permite recorrer los elementos de una colección secuencialmente sin exponer su estructura interna[cite: 1]. | Recorrido uniforme sobre listas, árboles o colecciones personalizadas[cite: 1]. |
| **6. Template Method** | Define el esqueleto de un algoritmo en una clase base y delega pasos específicos a las subclases[cite: 1]. | Flujos de procesamiento con pasos fijos y variaciones puntuales (ej. generación de reportes)[cite: 1]. |

> **Nota:** El catálogo GoF de comportamiento se completa con otros 5 patrones de alcance más específico: **Mediator**, **Memento**, **Chain of Responsibility**, **Visitor** e **Interpreter**[cite: 1].

---

## Estructura del Proyecto

```text
├── src/
│   ├── observer/
│   ├── strategy/
│   ├── command/
│   ├── state/
│   ├── iterator/
│   └── template_method/
└── README.md

