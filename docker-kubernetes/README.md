curl -s http://localhost:8080/api/config

######1. Order
vault kv2 > vault kv1 > application.yml
````
springcloud.vault.config.order=1
````

######2. Centralize config with Spring Cloud Config (Git,Vault)
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

######3. Centralize config with vault, authentication by KUBERNETES
````
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-vault-config</artifactId>
</dependency>
````

````
spring.cloud.vault:
  authentication: KUBERNETES
  kubernetes:
    role: my-dev-role
    kubernetes-path: kubernetes
    service-account-token-file: /var/run/secrets/kubernetes.io/serviceaccount/token
````


######4. Enable secret kv version 2
````
    kv:
        enabled: true

=====================================

spring.cloud.vault:
    kv:
        enabled: true
        backend: secret
        profile-separator: '/'
        default-context: application
        application-name: my-app  
````
Enabled setting this value to false disables the secret backend config usage
http://cloud.spring.io/spring-cloud-static/spring-cloud-vault/2.0.1.RELEASE/single/spring-cloud-vault.html#vault.config.backends.kv.versioned