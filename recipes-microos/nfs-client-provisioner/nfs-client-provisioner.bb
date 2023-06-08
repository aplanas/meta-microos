SUMMARY = "Automatic provisioner using an existing and already configured NFS server"
DESCRIPTION = "nfs-client is an automatic provisioner that uses an existing and already configured NFS server to support dynamic provisioning of Kubernetes Persistent Volumes via Persistent Volume Claims. Persistent volumes are provisioned as ${namespace}-${pvcName}-${pvName}."
LICENSE = "Apache-2.0"

PV = "4.0.0+git20210204.23ecb30"

RPM_NAME = "nfs-client-provisioner-4.0.0+git20210204.23ecb30-1.10.aarch64.rpm"
RPM_HASH = "a1af473a2525efbe74247c73f7ee29c0d1b7632cb177c8e96597c88e2d6e83bc8278ba43b0eec7ba9ded5594f956373130198f6f8bc09a9eb11703f519a10c84"

RPROVIDES:${PN} += "nfs-client-provisioner nfs-client-provisioner(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
