# Usando uma imagem base do OpenJDK 21
FROM gradle:8.10.2-jdk-21-and-22-jammy AS build

# Diretório de trabalho no contêiner
WORKDIR /app

# Copia os arquivos do projeto
COPY . .

# Executa o Gradle para construir o projeto
RUN gradle build --no-daemon

# Fase final
FROM openjdk:21-jdk-slim

# Diretório de trabalho no contêiner
WORKDIR /app

# Copia o arquivo JAR gerado da fase de build
COPY --from=build /app/build/libs/volo-api-*.jar app.jar

# Expõe a porta que a aplicação irá rodar
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]