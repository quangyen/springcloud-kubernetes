curl -s http://localhost:8080/api/config

vault kv2 > vault kv1 > application.yml
````
springcloud.vault.config.order=1
````

Centralize config with Spring Cloud Config (Git,Vault)
````
spring:
  application:
    name: composite-service
  cloud:
    config:
      uri: localhost:8888 
      token: s.wPMgby7A4XWesThSzflcVy77 (Vault Token)
````
Currently Spring Config client does not support authentication by kubernetes auth 
https://github.com/spring-cloud/spring-cloud-config/issues/1236

Centralize config with vault, authentication by KUBERNETES
````
spring.cloud.vault:
  authentication: KUBERNETES
  kubernetes:
    role: my-dev-role
    kubernetes-path: kubernetes
    service-account-token-file: /var/run/secrets/kubernetes.io/serviceaccount/token
````
