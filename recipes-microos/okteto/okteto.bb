SUMMARY = "Develop your applications directly in your Kubernetes Cluster"
DESCRIPTION = "Kubernetes has made it very easy to deploy applications to the cloud at a higher scale than ever, but the development practices have not evolved at the same speed as application deployment patterns. \
Today, most developers try to either run parts of the infrastructure locally or just test these integrations directly in the cluster via CI jobs, or the docker build/redeploy cycle. It works, but this workflow is painful and incredibly slow. \
okteto accelerates the development workflow of Kubernetes applications. You write your code locally and okteto detects the changes and instantly updates your Kubernetes applications."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "okteto-2.15.2-1.1.aarch64.rpm"
RPM_HASH = "d32496da6d2b9e894ac4dd0cb56b88fe4af43a99de8285352a7e7050fe51906fb621c08ae6799a23fcf96fa017fd9c40726330ecddd349457951368c960781d7"

RPROVIDES:${PN} += "okteto okteto(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
