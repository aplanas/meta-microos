SUMMARY = "Application Deployment Engine for Kubernetes"
DESCRIPTION = "Rio is an Application Deployment Engine for Kubernetes that can be layered on top of any standard Kubernetes cluster. Consisting of a few Kubernetes custom resources and a CLI to enhance the user experience, users can easily deploy services to Kubernetes and automatically get continuous delivery, DNS, HTTPS, routing, monitoring, autoscaling, canary deployments, git-triggered builds, and much more. All it takes to get going is an existing Kubernetes cluster and the rio CLI."
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "rio-0.8.0-1.8.aarch64.rpm"
RPM_HASH = "b250d99ae76f256acf19177de5b656abf9b868c17e05fa9d0f0670ac8d8c36f517bd1951f223ef34962e5bcd7c5abb13ff06705c2faee9712f2ce1fc3dad9ca6"

RPROVIDES:${PN} += "rio rio(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
