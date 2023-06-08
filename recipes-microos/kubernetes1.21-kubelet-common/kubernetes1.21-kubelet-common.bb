SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-kubelet-common-1.21.14-2.1.aarch64.rpm"
RPM_HASH = "d57b7409372a3edd1146ecdbf451052890ab20843271d801a755cf0ec1a963c9d107992454fb0d7b7835c7e97b6ab23a181845b2bbf24379478bd0e9dd0613d3"

RPROVIDES:${PN} += "kubernetes-kubelet-common kubernetes1.21-kubelet-common kubernetes1.21-kubelet-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cri-runtime kubernetes-kubelet1.21"

inherit rpm
