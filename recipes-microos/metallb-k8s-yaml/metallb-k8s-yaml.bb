SUMMARY = "Kubernetes yaml file to run MetalLB container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
MetalLB container in a kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "metallb-k8s-yaml-0.9.5-1.13.noarch.rpm"
RPM_HASH = "bedf5bf533d6054f4e311096a20c5ba68f70cdb0488a6b509a3a54d5576f0e0ddc3e0f557ae78d3810fed460bc0fa8c216c07e7b70935e70625f1348b713052c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metallb-k8s-yaml"
RDEPENDS:${PN} += ""

inherit rpm
