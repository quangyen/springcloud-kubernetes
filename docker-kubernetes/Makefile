TAG=$(shell git describe --tags --long)
HASH=$(shell git rev-parse --short HEAD)

build:
    mvn clean package -DskipTests
    docker build -t docker-kubernetes:latest .

version:
	echo $(TAG)

hash:
	echo $(HASH)