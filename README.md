# 🐾 PawStyle - Sistema de Gestión de Peluquería Canina

**PawStyle** es una aplicación de escritorio robusta diseñada para la administración de registros en una peluquería canina. El sistema implementa una arquitectura multicapa para garantizar un manejo eficiente y persistente de la información de las mascotas y sus respectivos dueños.

---

## 🎬 Demo del Proyecto

En esta sección se muestra el funcionamiento de la aplicación, desde el registro de la mascota hasta la visualización en la tabla de gestión.




---


## 🚀 Tecnologías Utilizadas

El proyecto fue desarrollado utilizando un stack tecnológico moderno, aprovechando las capacidades de **Java 21** y herramientas de gestión de nivel profesional:

* **Lenguaje:** Java 21 (JDK 21)
* **Gestor de Dependencias:** Maven (para la automatización de la construcción y manejo de librerías)
* **Persistencia:** JPA (Java Persistence API) con Hibernate/EclipseLink
* **Base de Datos:** MySQL (gestionado a través de XAMPP)
* **Interfaz Gráfica:** Java Swing (diseñado con NetBeans GUI Builder)
* **Sistema Operativo:** Desarrollado íntegramente en un entorno Linux (Kubuntu)



---

## 🛠️ Instalación y Configuración

Para poner en marcha este proyecto en tu entorno local, sigue estos pasos:

### 1. Requisitos Previos
* Tener instalado **Java 21**.
* Contar con **Maven** instalado y configurado en el PATH.
* Tener un servidor MySQL activo (XAMPP recomendado).

### 2. Configuración de la Base de Datos
1.  Inicia el módulo MySQL en XAMPP.
2.  Crea una base de datos llamada `paw_style`.
3.  El sistema está configurado para generar las tablas automáticamente al ejecutarse por primera vez gracias a la propiedad `javax.persistence.schema-generation.database.action` con valor `create`.

### 3. Compilación y Ejecución
Desde la terminal de tu sistema (Kubuntu/Linux):
```bash
# Limpiar y compilar el proyecto
mvn clean compile

# Ejecutar la aplicación
mvn exec:java -Dexec.mainClass="com.mycompany.pawstyle.PawStyle"


---

## 👤 Autor

<table border="0">
  <tr>
    <td width="150">
      <img src="https://github.com/identicons/jturriago.png" width="100" alt="Avatar">
    </td>
    <td>
      <strong>Juan Turriago</strong><br>
      🚀 Estudiante de Ingeniería de Sistemas - <em>Politécnico Grancolombiano</em><br>
      💻 Programador Java | Entusiasta de Linux<br>
      📫 <b>Contacto:</b> Puedes encontrarme en mi perfil de GitHub para futuras colaboraciones.
    </td>
  </tr>
</table>

---
*Este proyecto fue realizado con fines académicos para la formación profesional en desarrollo de software (2026).*
