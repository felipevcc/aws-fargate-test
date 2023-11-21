# AWS Fargate Test

Test deployment of a simple springboot service on AWS Fargate

Command to build the java project:
```bash
./gradlew build
```

Commands to build the image with the [`Dockerfile`](https://github.com/felipevcc/aws-fargate-test/blob/main/user-service/Dockerfile) and run the container to test its operation:

```bash
docker build -t user-service .
docker images
docker run -p 8080:8080 user-service
```

Install AWS CLI for PowerShell: [AWS-CLI](https://aws.amazon.com/es/cli/)

Command to configure AWS CLI:

```bash
aws configure
```

Command to upload the image to the ECR repository:

```bash
aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 173364527511.dkr.ecr.us-east-1.amazonaws.com

docker tag user-service:latest 173364527511.dkr.ecr.us-east-1.amazonaws.com/user-service:latest

docker push 173364527511.dkr.ecr.us-east-1.amazonaws.com/user-service:latest
```

Here is a complete guide to deploy the service on AWS Fargate: [Guide](https://drive.google.com/file/d/1O3taCwQlVrPi3-F7cn9NKeQsUjZf9c_V/view?usp=sharing)
