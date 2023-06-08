SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-kubelet-common-1.24.13-2.1.aarch64.rpm"
RPM_HASH = "ce1915ddaa266130ea87de801fdc2e590eba49485ca49263bdb70637fc88d4102b8dad150cd9b0d012157dbe5aa3b4f6dee3f5d106a53f5fbcdc70eb57025d17"

RPROVIDES:${PN} += "kubernetes-kubelet-common kubernetes1.24-kubelet-common kubernetes1.24-kubelet-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cri-runtime kubernetes-kubelet1.24"

inherit rpm
