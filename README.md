# 🚀 Nolvynta Backend

Backend oficial del ecosistema **Nolvynta**, una plataforma de comercio electrónico especializada en la venta de suplementos deportivos, nutrición y productos fitness.

Desarrollado bajo una arquitectura REST utilizando **Spring Boot**, permitiendo la gestión de productos, categorías, pedidos y futuras funcionalidades relacionadas con usuarios, autenticación y procesamiento de ventas.

---

## 📌 Características principales

* Gestión de productos.
* Gestión de categorías.
* Registro y administración de pedidos.
* Persistencia de datos con PostgreSQL.
* API REST para integración con frontend web y aplicaciones móviles.
* Arquitectura basada en capas (Controller, Service y Repository).
* Preparado para futuras integraciones con autenticación JWT.
* Escalable para microservicios y despliegue en la nube.

---

## 🛠 Tecnologías utilizadas

| Tecnología        | Versión                         |
| ----------------- | ------------------------------- |
| Java              | 21                              |
| Spring Boot       | 4.0.6                           |
| Spring Data JPA   | Última                          |
| PostgreSQL        | 17+                             |
| Maven             | 3.8+                            |
| Hibernate         | ORM                             |
| Lombok            | Reducción de código boilerplate |
| Spring Security   | En desarrollo                   |
| JWT               | Próxima implementación          |
| Swagger / OpenAPI | Próxima implementación          |

---

## 📂 Arquitectura del proyecto

```text
src/main/java
│
├── controller
│   ├── ProductoController
│   ├── CategoriaController
│   ├── PedidoController
│   └── UsuarioController
│
├── service
│   ├── ProductoService
│   ├── CategoriaService
│   ├── PedidoService
│   └── UsuarioService
│
├── repository
│   ├── ProductoRepository
│   ├── CategoriaRepository
│   ├── PedidoRepository
│   └── UsuarioRepository
│
├── model
│   ├── Producto
│   ├── Categoria
│   ├── Pedido
│   └── Usuario
│
└── config
```

---

## 🗄️ Base de datos

El proyecto utiliza PostgreSQL como motor principal de persistencia.

### Entidades implementadas

### Categoría

* id
* nombre
* descripcion
* estado
* fechaCreacion

### Producto

* id
* nombre
* descripcion
* precio
* stock
* marca
* categoria
* peso
* sabor
* image
* estado
* fecha

### Pedido

* id
* nombre
* apellidos
* numCliente
* direccion
* referencia
* producto
* cantidad
* total
* estado
* fechaPedido

---

## ⚙️ Requisitos previos

Antes de ejecutar el proyecto asegúrate de tener instalado:

* Java 21
* PostgreSQL 17 o superior
* Maven 3.8 o superior
* Git

---

## 🚀 Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/tuusuario/nolvynta-backend.git
cd nolvynta-backend
```

### 2. Configurar PostgreSQL

Crear una base de datos:

```sql
CREATE DATABASE nolvyntaDB;
```

### 3. Configurar application.properties

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nolvyntaDB
spring.datasource.username=postgres
spring.datasource.password=tu_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Ejecutar el proyecto

```bash
mvn spring-boot:run
```

---

## 🔗 Endpoints principales

### Productos

```http
GET /producto
POST /producto
PUT /producto/{id}
DELETE /producto/{id}
```

### Categorías

```http
GET /categoria
POST /categoria
PUT /categoria/{id}
DELETE /categoria/{id}
```

### Pedidos

```http
GET /pedido
POST /pedido
PUT /pedido/{id}
DELETE /pedido/{id}
```

---

## 🌐 Ecosistema Nolvynta

El proyecto está dividido en tres componentes independientes:

### Backend API

Spring Boot + PostgreSQL

### Frontend Cliente

Aplicación web enfocada en la experiencia de compra.

### Frontend Administrador

Panel de gestión para productos, categorías, pedidos y futuras funcionalidades administrativas.

---

## 📈 Estado del proyecto

### Implementado

* Entidades principales
* Persistencia con PostgreSQL
* Repositorios JPA
* Servicios
* API REST básica

### En desarrollo

* JWT Authentication
* Roles y permisos
* Swagger Documentation
* Dashboard administrativo
* Integración con Render
* Integración completa con Frontend

---

## 👨‍💻 Autor

**Ermenigildo Orbezo Martinez**
---

## 👨‍💻 Desarrollador

**Ermenigildo Orbezo Martinez**

Desarrollador Full Stack enfocado en tecnologías Java, Spring Boot, PostgreSQL y desarrollo de aplicaciones web.

### 🌐 Portafolio Profesional


### 📫 Contacto
- LinkedIn: https://www.linkedin.com/in/ermenigildo-orbezo-martinez/
- Portafolio: https://portafoliocv-liard.vercel.app/

---

⭐ Si este proyecto te resulta útil, considera darle una estrella al repositorio.

Proyecto desarrollado como parte de la construcción del ecosistema de comercio electrónico **Nolvynta**.
