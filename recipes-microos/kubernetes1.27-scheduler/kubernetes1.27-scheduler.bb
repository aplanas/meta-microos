SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-scheduler-1.27.1-1.1.aarch64.rpm"
RPM_HASH = "fb140d98ef1d1a806da3546dfce271f30ba6bc6242eac7b343b0efe6deba2cbebed486ee2e5a8e0c7738bf782bca36399a72b8e26d7d32d578e93e21d9ef7fea"

RPROVIDES:${PN} += "kubernetes-scheduler-provider kubernetes1.27-scheduler kubernetes1.27-scheduler(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
