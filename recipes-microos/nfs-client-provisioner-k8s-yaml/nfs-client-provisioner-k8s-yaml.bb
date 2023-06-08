SUMMARY = "Yaml file to deploy nfs-client-provisioner"
DESCRIPTION = "Yaml files to deploy the nfs-client-provisioner. nfs-client is an automatic provisioner that uses an existing and already configured NFS server to support dynamic provisioning of Kubernetes Persistent Volumes via Persistent Volume Claims. Persistent volumes are provisioned as ${namespace}-${pvcName}-${pvName}."
LICENSE = "Apache-2.0"

PV = "4.0.0+git20210204.23ecb30"

RPM_NAME = "nfs-client-provisioner-k8s-yaml-4.0.0+git20210204.23ecb30-1.10.aarch64.rpm"
RPM_HASH = "b1fc73e58aa3f48012d4e7d73d2ea7e9e9ad386b005dbf061cd8ac00314ed646276902caf1b48b1f39bd838002be177c027e488e4400173019487ec3215ee9cd"

RPROVIDES:${PN} += "nfs-client-provisioner-k8s-yaml nfs-client-provisioner-k8s-yaml(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
