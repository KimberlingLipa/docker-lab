# Docker Lab: Microservicio

Este proyecto es una demostración de cómo construir, ejecutar y desplegar un microservicio utilizando Docker y Docker Compose. El microservicio está construido en Java y utiliza Gradle para la construcción del proyecto.

## Requisitos Previos

Antes de empezar, asegúrate de tener instalados los siguientes programas:

- **Docker**: [Descargar Docker](https://www.docker.com/products/docker-desktop)
- **Docker Compose**: Normalmente viene instalado junto con Docker.

## Descripción

Este repositorio contiene el `Dockerfile` y el archivo `docker-compose.yml` necesarios para construir y ejecutar el microservicio en un contenedor Docker.

### Estructura del Proyecto

- `Dockerfile`: Define la imagen base y los pasos necesarios para construir el microservicio.
- `docker-compose.yml`: Configura los servicios necesarios para ejecutar el microservicio en contenedores Docker.
- `src/`: Código fuente del microservicio.

## Enlaces Útiles

- **Repositorio GitHub**: [docker-lab en GitHub](https://github.com/KimberlingLipa/docker-lab.git)
- **Docker Hub (Imagen)**: [kimberling17/upsjb-microservicio en Docker Hub](https://hub.docker.com/repository/docker/kimberling17/upsjb-microservicio/tags)

## Guía de Uso

### 1. **Clonar el Repositorio**

Clona este repositorio en tu máquina local:

```bash
git clone https://github.com/KimberlingLipa/docker-lab.git
cd docker-lab
