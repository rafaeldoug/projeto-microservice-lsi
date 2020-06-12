André Lucas Fragoso Moreira(https://github.com/lucasfragoso7)
[Rafael 'Doug' Marques Nascimento](https://github.com/rafaeldoug)
[Thales Lindberg](https://github.com/thaleslindberg)
# projeto-microservice-lsi
[Passo a passo para criação do Spring Cloud Config, Eureka (Service Discovery) e Zuul (Api Gateway)](http://www.daniel-abella.com/unifacisa/arquitetura/material/aula06.pdf)

## Pré requisito
- Maven 3
- Java 8

## Preparando ambiente

- ```cd projeto-microservice-lsi```
- ```mvn clean package```

## Executando

Config Server (Spring Cloud Config)
- ```cd config-server```
- ```mvn spring-boot:run``` 

Service Discovery (Eureka)
- ```cd eureka```
- ```mvn spring-boot:run```

API Gateway (Zuul)
- ```cd apigateway```
- ```mvn spring-boot:run```

API de Aluno
- ```cd aluno```
- ```mvn spring-boot:run```

API de Professor
- ```cd professor```
- ```mvn spring-boot:run```

API de Matricula
- ```cd matricula```
- ```mvn spring-boot:run```

API de Curso
- ```cd curso```
- ```mvn spring-boot:run```

API de Disciplina
- ```cd disciplina```
- ```mvn spring-boot:run```


Acessando Eureka: http://localhost:8761

## Acessando APIs

#### Diretamente
- http://localhost:8082/aluno
- http://localhost:8083/professor
- http://localhost:8084/matricula
- http://localhost:8085/curso
- http://localhost:8086/disciplina

#### Via Proxy (Zuul)
- http://localhost:8080/api/aluno
- http://localhost:8080/api/professor
- http://localhost:8080/api/matricula
- http://localhost:8080/api/curso
- http://localhost:8080/api/disciplina
