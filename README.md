# AWS Fargate Test

Test deployment of a simple springboot service on AWS Fargate

Commands to run the container:

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

Command to create a new ECR repository:

```bash
aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 173364527511.dkr.ecr.us-east-1.amazonaws.com

docker tag user-service:latest 173364527511.dkr.ecr.us-east-1.amazonaws.com/user-service:latest

docker push 173364527511.dkr.ecr.us-east-1.amazonaws.com/user-service:latest
```
