SUMMARY = "Go from Docker Compose to Kubernetes"
DESCRIPTION = "kompose is a tool to help users who are familiar with docker-compose move to Kubernetes. kompose takes a Docker Compose file and translates it into Kubernetes resources. kompose is a convenience tool to go from local Docker development to managing your application with Kubernetes. Transformation of the Docker Compose format to Kubernetes resources manifest may not be exact, but it helps tremendously when first deploying an application on Kubernetes."
LICENSE = "Apache-2.0"

PV = "1.26.1"

RPM_NAME = "kompose-1.26.1-1.8.aarch64.rpm"
RPM_HASH = "70bc4e1d0b49a037f49c5efa1c8e2671ff89c4ecf1a63b8afcfb5ef2fffe4900d0aac2f7386226b74f4241dc3b45c02b37ceb8d0d0b8d8780dde549b011fcfde"

RPROVIDES:${PN} += "kompose kompose(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
