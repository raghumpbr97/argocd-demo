Gitops operator - Argocd PROJECT

        
This project covers setting up a CI/CD pipeline using Jenkins, install EKS cluster, deploy gitops opertor - Argocd and Argo Rollouts.
       Installing and configuring Jenkins on a Linux server. 
       Setting up Docker, configuring Jenkins to use Docker, and handling permissions. 
       Configuring AWS CLI, installing kubectl and eksctl. 
       Creating an EKS cluster with eksctl. 
       Installing necessary Jenkins plugins and setting up credentials. 
       Creating a Jenkins pipeline to: 
     •  Checkout code from GitHub. 
     •  Perform a SonarQube scan. 
     •  Build the project using Maven. 
     •  Build Docker Image using Docker file and push Docker images to Docker Hub. 
     •  Update deployment configurations and push them to a Git repository. 
     •  Deploy the application to Kubernetes using ArgoCD with canary deployment strategy .
       Deploying Argocd
       Deploy Argocd Rollout


Pre-requisites 
1.      Java application code hosted on a Git repository 
2.      Server Requirements:
     Linux server for Jenkins , Docker, Sonarqube setup with an instance type “t2.large” and a EKS Cluster to deploy container application. 
3. Software Requirements: 
    •   Jenkins 
    •   Docker 
    •   Maven 
    •   SonarQube 
    •   Kubernetes CLI (kubectl) , eksctl for managing EKS clusters 
    •   EKS Kubernetes cluster 
    •   Gitops operator - Argo CD and Argo Rollouts
