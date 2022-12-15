

# Projeto Produtos

Projeto CRUD Produtos finalizado, esse projeto foi desenvolvido em Java e utilizando o banco de dados MySQL, irá valer como avaliação da matéria de Java, lecionada pelo professor Dr. Wiliam Carlos Galvão, essa matéria é do curso de ADS da FATEC Santana de Parnaíba.

## Local Database for easy and fast deployment

Go to **/docker/postgres_** and take a look at docker-compose.yml.

Notice there are two environment variables needed  **_${DB_USER}_** and **_${DB_PASS}_**. You can set them int the .env file
located in the same directory as the docker-compose.yml file or set them in the command line or in the system environment.

Go to **_core/docker/postgres/script_** and take a look at the .sql files.

Now let's go to **_core/docker/postgres_** and run the following commands:
```shell script
docker-compose up
```
OR
```shell script
docker-compose up -d
```


## Running the application in dev mode



## Packaging and running the application

	