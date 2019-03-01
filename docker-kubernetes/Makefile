TAG=$(shell git describe --tags --long)
HASH=$(git rev-parse --short HEAD)

build:
	mvn clean package -DskipTests
    docker build -t docker-kubernetes:$(HASH)

version:
	echo $(TAG)

hash:
	echo $(HASH)