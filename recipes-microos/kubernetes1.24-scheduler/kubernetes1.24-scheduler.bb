SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-scheduler-1.24.13-2.2.aarch64.rpm"
RPM_HASH = "08a4ed14e9c45a839e2424ee6db1b25f489e1fa268d514a883ad81678dfda070f7603cd056c07648751c2fb98b041ac4497ad25ae2c9bcc29bb767e9e5ad0717"

RPROVIDES:${PN} += "kubernetes-scheduler-provider kubernetes1.24-scheduler kubernetes1.24-scheduler(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
