
# Practicando Spring Boot: Challenge Literalura
---

# 📚 Gestor de Libros - API Gutendex

Este proyecto es una aplicación de consola desarrollada en **Java con Spring Boot** que consume la API pública de [Gutendex](https://gutendex.com/), la cual ofrece información sobre libros de dominio público. La aplicación permite consultar, filtrar y almacenar libros y autores en una base de datos local utilizando **JPA**.

---

## 🚀 Funcionalidades principales

- 🔍 Buscar libros por título
- 📄 Listar todos los libros almacenados en la base de datos
- ✍️ Listar todos los autores registrados
- 🌐 Filtrar libros por idioma
- 👤 Listar autores vivos en un año determinado

---

## 🛠️ Tecnologías y herramientas utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **pgAdmin para la gestión y desarrollo de bases de datos PostgreSQL
- **Jackson** (para conversión de JSON)
- **HttpClient** (para consumo de la API externa)
- **Maven**

---

## 🧱 Estructura del proyecto

src/
├── main/
│ ├── java/
│ │ └── com.ejemplo.gutendex/
│ │ ├── model/ # Entidades: Libro, Autor
│ │ ├── repository/ # Interfaces de JPA: LibroRepository, AutorRepository
│ │ ├── service/ # Lógica de negocio
│ │ ├── principal/ # Clase Principal con menú interactivo
│ │ └── api/ # Consumo de la API y conversión de datos
│ └── resources/
│ └── application.properties # Configuración de la base de datos


---

## 🧪 Cómo ejecutar el proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/AndresMena1979/Challenge-Literalura

    Entra al directorio:

cd Challenge-Literalura

Ejecuta la aplicación desde tu IDE (IntelliJ, VSCode, etc.) o con Maven:

    ./mvnw spring-boot:run

    El menú de consola te guiará para interactuar con la aplicación.

🧠 Aprendizajes

Durante el desarrollo de esta aplicación pude reforzar y practicar:

    Consumo de APIs externas REST en Java

    Manipulación de datos JSON y su mapeo a objetos Java

    Uso de Spring Boot y Spring Data JPA para persistencia de datos

    Diseño limpio y separación de responsabilidades (modelo, lógica, persistencia)

📌 Notas
   
    La API de Gutendex no requiere autenticación y permite realizar filtros por parámetros como título, autor, idioma, etc.


🪪 Licencia

Este proyecto se desarrolla con fines educativos y está bajo la licencia MIT.
✨ Autor

Andres Fernando Mena
Aprendis en desarrollo Backend Java | ONE - Oracle Next Education
