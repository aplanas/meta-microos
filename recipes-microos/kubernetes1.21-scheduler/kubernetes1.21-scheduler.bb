SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-scheduler-1.21.14-2.1.aarch64.rpm"
RPM_HASH = "0ee83979208c8d76c1cf56ca1320a60512b3fe3f74bcc2a9b0311acc5514ead40ec9faba5f86e1434f250537fba04450d82e9f4bf062865a2ca82c0329f9b99c"

RPROVIDES:${PN} += "kubernetes-scheduler-provider kubernetes1.21-scheduler kubernetes1.21-scheduler(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
