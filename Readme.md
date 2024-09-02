GitOps operator - Argocd PROJECT
        
This project covers setting up a CI/CD pipeline using Jenkins, install EKS cluster, deploy gitops opertor - Argocd and Argo Rollouts.
1. Install and configure Jenkins on a Linux server. 
2. Setup Docker, configure Jenkins to use Docker, and handling permissions. 
3. Configure AWS CLI, install kubectl and eksctl. 
4. Create an EKS cluster with eksctl. 
5. Install necessary Jenkins plugins and setting up credentials. 
    Create a Jenkins pipeline to: 
     •  Checkout code from GitHub. 
     •  Perform a SonarQube scan. 
     •  Build the project using Maven. 
     •  Build Docker Image using Docker file and push Docker images to Docker Hub. 
     •  Update deployment configurations and push them to a Git repository. 
6. Deploy the application to Kubernetes using ArgoCD with canary deployment strategy.

Pre-requisites 
1. Java application code hosted on a Git repository 
2. Server Requirements:
     Linux server for Jenkins , Docker, Sonarqube setup with an instance type “t2.large” and a EKS Cluster to deploy container application. 
3. Software Requirements: 
    •   Jenkins 
    •   Docker 
    •   Maven 
    •   SonarQube 
    •   Kubernetes CLI (kubectl) , eksctl for managing EKS clusters 
    •   EKS Kubernetes cluster 
    •   Gitops operator - Argo CD and Argo Rollouts
