# AWS Fargate Test

Test deployment of a simple springboot service on AWS Fargate

Commands to run the container:

```bash
docker build -t user-service .
docker images
docker run -p 8080:8080 user-service
```
