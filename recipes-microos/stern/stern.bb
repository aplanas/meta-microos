SUMMARY = "Multi pod and container log tailing for Kubernetes"
DESCRIPTION = "Stern allows you to tail multiple pods on Kubernetes and multiple containers within the pod. Each result is color coded for quicker debugging. \
 \
The query is a regular expression so the pod name can easily be filtered and you don't need to specify the exact id (for instance omitting the deployment id). If a pod is deleted it gets removed from tail and if a new pod is added it automatically gets tailed. \
 \
When a pod contains multiple containers Stern can tail all of them too without having to do this manually for each one. Simply specify the container flag to limit what containers to show. By default all containers are listened to."
LICENSE = "Apache-2.0"

PV = "1.25.0"

RPM_NAME = "stern-1.25.0-1.1.aarch64.rpm"
RPM_HASH = "dacbe70560c571dbd6d8704f71e9f4982eadfb7487f6b2372b63cba0beed10e7b1ae1d653ffad3773a218d4635c45fa7226980227fc2a2bbe053ce0cbadd3882"

RPROVIDES:${PN} += "stern stern(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
