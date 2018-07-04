# Spring Cloud Microservices
Microserviços com Spring Cloud, Eureka, Hystrix e Node.

### Instruções
- Rodar as aplicações na seguinte sequência: config server, eureka server e, por fim, sidecar server.
- Antes de rodar o sidecar server é importante rodar o microserviço node server com o comando "npm start".
- Dentro da pasta "config" estão as configurações que o config server usa para gerenciar todos os microservições. Portanto, é importante ajustar a uri que fica em "src/main/resources/application.yml" de acordo com o diretório em que baixou o microserviço.
- Dentro da pasta "config" deve ser criado um repositório git vazio. Comando "git init".
- Para testar o Hystrix faça uma requisição get para "http://localhost:9093/exemplo/". Pode ser usado o Postman para tal!
