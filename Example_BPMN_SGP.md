# Aplicacion de BPMN en **S**istema de **G**estion de **P**royectos **S**ena
## Sistema de Gestión de Proyectos SENA

### 🔧 Introducción
El sistema centralizará la gestión de proyectos formativos del SENA.  
Actualmente, un instructor debe revisar múltiples documentos enviados por WhatsApp, correo o Drive, dificultando verificar qué entregables están completos.

---

## 🧰 Ejemplo práctico aplicado
El instructor José recibe proyectos de 24 aprendices de ADSO.  
Cada grupo envía documentos por diferentes medios y sin una estructura común.  

Con el sistema propuesto, José podrá ver en un solo panel:
- Qué grupos han entregado la fase 1.
- Cuántos están atrasados.
- Qué entregables faltan.
- El porcentaje total de avance.

---

## 1️⃣ Problema Central: Brecha en el Seguimiento
El sistema actual no permite saber cuánto ha avanzado el equipo en tiempo real.

### 🧰 Ejemplo aplicado
El grupo *“Innovatech”* reporta que va en 70%, pero el instructor no tiene forma de verificarlo porque la última evidencia enviada fue hace dos semanas.  

El sistema mostrará:
- Fecha de última actualización
- Tareas pendientes
- Evidencias cargadas
- Avance real calculado automáticamente

---

## 2️⃣ Perspectiva y Requisitos del Instructor

Los instructores piden rapidez y claridad para revisar muchos proyectos al mismo tiempo.

### 🔹 2.1 Funcionalidades MVP (con ejemplos)
| Funcionalidad           | Ejemplo aplicado                                                                 |
|-------------------------|-------------------------------------------------------------------------------|
| 📈 Medición de Progreso | “Proyecto X – Fase 2 completada – 45% total”                                   |
| ⏰ Gestión de Plazos     | Alerta: “Entrega de fase 1 del grupo Y vence en 24 horas”                     |
| 📋 Entregables definidos| Para la fase 2 se muestran: Diagrama BPMN, Documento de Requerimientos, Mockups|

### 🔹 2.2 Visualizaciones Sugeridas (con ejemplos concretos)
*📅 Calendario Académico Integrado – Ejemplo*  
| Fecha     | Evento                        |
|-----------|-------------------------------|
| Feb 12    | Revisión de fase 1 (Grupo A)  |
| Feb 15    | Entrega final (Grupo C)       |
| Feb 17    | Retroalimentación general      |

*📊 Dashboard – Ejemplo*  
- 12 proyectos en verde (al día)  
- 5 en amarillo (riesgo moderado)  
- 3 en rojo (retrasados)  
- 42 tareas completadas hoy  
- 9 entregas pendientes para esta semana

*📬 Notificaciones – Ejemplo*  
> “El aprendiz Lina acaba de subir el entregable: Documento de Arquitectura”

---