# 🪵 Semana 01 – Introducción al Paradigma Orientado a Objetos

**Estudiante:** Rubiel Rodríguez Rodríguez  
**Ficha:** 3228970B  
**Dominio:** Taller de Carpintería “Madera y Arte”

## 📍 Contexto del Dominio

Madera y Arte es un taller de carpintería ubicado en Fontibón, Bogotá. Se dedica a fabricar muebles a medida, reparar y restaurar piezas de madera.  
Cuenta con 6 carpinteros especializados y produce alrededor de 20 muebles al mes.

## 🧩 Actividad 1: Identificación de Objetos

### Objeto 1: Orden de Trabajo
**¿Qué es?** Documento o registro que detalla el trabajo a realizar (fabricación o reparación de un mueble).  
**Atributos:** número de orden, cliente, tipo de mueble, madera, costo, estado  
**Métodos:** registrarOrden(), asignarCarpintero(), calcularCosto(), actualizarEstado()

### Objeto 2: Carpintero
**¿Qué es?** Persona encargada de fabricar o reparar los muebles.  
**Atributos:** nombre, especialidad, añosExperiencia, disponibilidad  
**Métodos:** cortarMadera(), ensamblarMueble(), lijar(), entregarTrabajo()

### Objeto 3: Mueble
**¿Qué es?** Producto fabricado o reparado por el taller.  
**Atributos:** tipo, material, dimensiones, color, precio  
**Métodos:** calcularPrecio(), mostrarDetalles(), aplicarAcabado()

### Objeto 4: Cliente
**¿Qué es?** Persona que solicita la fabricación o reparación de un mueble.  
**Atributos:** nombre, teléfono, dirección, correo  
**Métodos:** realizarPedido(), consultarEstado(), realizarPago()

### Objeto 5: Material
**¿Qué es?** Insumo usado en la fabricación de los muebles.  
**Atributos:** tipo, cantidadDisponible, proveedor, costoUnitario  
**Métodos:** descontarCantidad(), registrarCompra(), consultarStock()

## ⚙️ Actividad 2: Comparación de Paradigmas

### 🧱 Programación Estructurada
```java
// Variables sueltas
String orderNumber = "ORD-001";
String furnitureType = "Mesa de comedor";
double price = 850000;

// Función para mostrar la información
void showOrder() {
    System.out.println("Orden: " + orderNumber);
    System.out.println("Mueble: " + furnitureType);
    System.out.println("Precio: $" + price);
}
```

### 🧩 Programación Orientada a Objetos (POO)
```java
public class WorkOrder {
    String orderNumber;
    String furnitureType;
    double price;

    public WorkOrder(String orderNumber, String furnitureType, double price) {
        this.orderNumber = orderNumber;
        this.furnitureType = furnitureType;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Orden No.: " + orderNumber);
        System.out.println("Mueble: " + furnitureType);
        System.out.println("Precio: $" + price);
    }
}
```

## ☕ Actividad 3: Primera Clase Simple

### WorkOrder.java
```java
public class WorkOrder {
    String orderNumber;
    String furnitureType;
    double price;

    public WorkOrder(String orderNumber, String furnitureType, double price) {
        this.orderNumber = orderNumber;
        this.furnitureType = furnitureType;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Orden No.: " + orderNumber);
        System.out.println("Mueble: " + furnitureType);
        System.out.println("Precio: $" + price);
        System.out.println("--------------------------------");
    }
}
```

### Main.java
```java
public class Main {
    public static void main(String[] args) {
        WorkOrder orden1 = new WorkOrder("ORD-001", "Mesa de comedor", 850000);
        WorkOrder orden2 = new WorkOrder("ORD-002", "Biblioteca", 1200000);
        WorkOrder orden3 = new WorkOrder("ORD-003", "Cama King Size", 950000);

        orden1.showInfo();
        orden2.showInfo();
        orden3.showInfo();
    }
}
```

## 🪚 Actividad 4: Múltiples Objetos

### Main.java
```java
public class Main {
    public static void main(String[] args) {
        WorkOrder o1 = new WorkOrder("ORD-001", "Mesa de Comedor", 850000);
        WorkOrder o2 = new WorkOrder("ORD-002", "Biblioteca", 1200000);
        WorkOrder o3 = new WorkOrder("ORD-003", "Cama King Size", 950000);
        WorkOrder o4 = new WorkOrder("ORD-004", "Escritorio Ejecutivo", 680000);
        WorkOrder o5 = new WorkOrder("ORD-005", "Closet a Medida", 1500000);

        o1.showInfo();
        o2.showInfo();
        o3.showInfo();
        o4.showInfo();
        o5.showInfo();
    }
}
```

### Salida esperada en consola
```
Orden No.: ORD-001
Mueble: Mesa de Comedor
Precio: $850000
--------------------------------
Orden No.: ORD-002
Mueble: Biblioteca
Precio: $1200000
--------------------------------
Orden No.: ORD-003
Mueble: Cama King Size
Precio: $950000
--------------------------------
Orden No.: ORD-004
Mueble: Escritorio Ejecutivo
Precio: $680000
--------------------------------
Orden No.: ORD-005
Mueble: Closet a Medida
Precio: $1500000
--------------------------------
```

