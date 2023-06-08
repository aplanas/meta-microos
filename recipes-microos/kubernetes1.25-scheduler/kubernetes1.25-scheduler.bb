SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-scheduler-1.25.9-1.1.aarch64.rpm"
RPM_HASH = "8601172dd909708f2c463f8add2fdc43e332a186462f6ead24a6f0ceed1084a9801e60e54b7cc6b98cbf546d01e082f2512d18c6cc0cdb1f1681331d274b906c"

RPROVIDES:${PN} += "kubernetes-scheduler-provider kubernetes1.25-scheduler kubernetes1.25-scheduler(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
