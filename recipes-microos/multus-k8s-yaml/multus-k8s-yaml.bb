SUMMARY = "Kubernetes yaml file to run Multus containers"
DESCRIPTION = "Multus is a CNI plugin which provides multiple network interfaces in \
containers. It allows to use many CNI plugins at the same time and supports all \
plugins which implement the CNI specification. \
 \
This package contains the yaml file requried to download and run Multus \
containers in a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "3.6"

RPM_NAME = "multus-k8s-yaml-3.6-1.9.noarch.rpm"
RPM_HASH = "f3a80736fc2637f2434154c693db06ed5eef9d67d698444afd218b04e3fa5bd67922c7cbbb1f6899a54d7bfe2651fd63b7f2c23b4657c16d9c73aea106e15d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "multus-k8s-yaml"
RDEPENDS:${PN} += ""

inherit rpm
