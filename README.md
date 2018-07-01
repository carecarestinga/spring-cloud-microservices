# Spring Cloud Microservices
Microserviços com spring cloud, eureka e node

### Instruções
- Rodar as aplicações na seguinte sequência: config server, eureka server e, por fim, sidecar server.
- Antes de rodar o sidecar server é importante rodar o microserviço node server com o comando "npm start".
- Dentro da pasta "config-routes" estão as configurações que o config server usa para gerenciar todos os microservições. Portanto, é importante ajustar a uri que fica em "src/main/resources/application.yml" de acordo com o diretório em que baixou o microserviço.
