# 🔌 ElectroMart – Sistema de Gestión de Electrodomésticos Inteligentes (Java)

Proyecto desarrollado en **Java**, como parte del Avance del curso **Introducción a la Programacion Orientada a Objetos con Java – EanX**.  
El objetivo es crear un sistema orientado a objetos para administrar distintos tipos de electrodomésticos inteligentes utilizando:

✅ Clases abstractas  
✅ Herencia  
✅ Polimorfismo  
✅ Upcasting  
✅ Sobrescritura de métodos  
✅ ArrayList con objetos hijos  

A pesar de ser un proyecto académico, está estructurado profesionalmente para usarse como parte de tu **portafolio en GitHub**.

---

## 🚀 Funcionalidades principales

- ✅ Clase abstracta base **SmartElectrodomestico**  
- ✅ Clases hijas: **Televisor** y **Celular**  
- ✅ Sobrescritura de métodos (polimorfismo)  
- ✅ Métodos comunes y métodos específicos por tipo  
- ✅ Búsqueda de equipos por número de serie  
- ✅ Eliminación de dispositivos  
- ✅ Inventario gestionado con `ArrayList`  
- ✅ Simulación completa de encendido, apagado, conexión a Internet y volumen  
- ✅ Código limpio, modular y fácil de extender  

---

## 📁 Estructura del proyecto

```plaintext
src/
├── Main.java                         # Punto de entrada
├── Inventario.java                   # Gestión y almacenamiento de equipos
├── SmartElectrodomestico.java        # Clase abstracta padre
├── Televisor.java                    # Clase hija que hereda funcionalidad
├── Celular.java                      # Clase hija que hereda funcionalidad
├── AccionesDispositivo.java          # Interface común (encender, apagar, etc.)
└── Marca.java                        # Clase auxiliar del módulo previo (no eliminada)
```

---

📌 Conceptos de POO aplicados

✅ Abstracción
✅ Herencia
✅ Polimorfismo (sobrescritura)
✅ Upcasting
✅ Listas polimórficas
✅ Encapsulamiento
✅ Métodos concretos y abstractos

---

## 🚀 Ejecución del proyecto

Sigue estos pasos para usar el proyecto en tu equipo:

### 1️⃣ Clonar el repositorio

```bash
git clone https://github.com/ma-sarmiento/ElectroMart.git
cd ElectroMart
```

### 2️⃣ Abrir en IntelliJ IDEA
```bash

File → Open

Seleccionar la carpeta del proyecto

Confirmar que src/ esté configurado como Sources Root

```

### 3️⃣ Ejecutar Main.java
```bash
Right click → Run 'Main'

```
---

📦 Requisitos del proyecto

Java OpenJDK 17+ (cualquier versión funciona)

IntelliJ, VSCode o cualquier IDE compatible

No necesita dependencias externas

---

💡 Notas adicionales

Los valores son generados directamente en el código, como exige el instructivo académico.

No se requiere entrada por consola.

El proyecto fue organizado con enfoque profesional para ser llevado como portafolio personal.

---

🔐 Nota: Por razones académicas, el enunciado original del proyecto no se publica en este repositorio.
Solo se incluye la implementación requerida.
