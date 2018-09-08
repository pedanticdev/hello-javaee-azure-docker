# Build
mvn clean package && docker build -t com.pedantic/hello-jib .

# RUN

docker rm -f hello-jib || true && docker run -d -p 8080:8080 -p 4848:4848 --name hello-jib com.pedantic/hello-jib 