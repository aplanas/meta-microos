SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-kubelet-common-1.27.1-1.1.aarch64.rpm"
RPM_HASH = "77bbf49ae720e5af86677f0d4b94f72d34960014ec9fa0f1dd448f7c6b37482c36a29ded878ec1d13862fda5de19cdfac23a797812c24129cca9a999a825dc59"

RPROVIDES:${PN} += "kubernetes-kubelet-common kubernetes1.27-kubelet-common kubernetes1.27-kubelet-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cri-runtime kubernetes-kubelet1.27"

inherit rpm
