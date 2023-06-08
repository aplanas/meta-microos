SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes-scheduler-1.27.1-30.1.aarch64.rpm"
RPM_HASH = "4c647ab1461d924c1dab28b9a9ae03af511156419a9b64cdf9ad51fc1d3314d7d2426151eede439fea7f65327d5af1e896ddc6a06a20fc72522f7fc088c36a04"

RPROVIDES:${PN} += "kubernetes-scheduler kubernetes-scheduler(aarch-64)"
RDEPENDS:${PN} += "kubernetes1.27-scheduler"

inherit rpm
