SUMMARY = "Kubernetes yaml file to run Multus containers"
DESCRIPTION = "Multus is a CNI plugin which provides multiple network interfaces in \
containers. It allows to use many CNI plugins at the same time and supports all \
plugins which implement the CNI specification. \
 \
This package contains the yaml file requried to download and run Multus \
containers in a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "3.6"

RPM_NAME = "multus-k8s-yaml-3.6-1.8.noarch.rpm"
RPM_HASH = "032939d55b8de2cec2e7b9c8fd2f2823eaab65cd817d8411896f85e48090bc40198f4c3dedc6a88adb89b27dfdff32c5821e5ea5e4a61a5e58f540333f3d3204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "multus-k8s-yaml"
RDEPENDS:${PN} += ""

inherit rpm
