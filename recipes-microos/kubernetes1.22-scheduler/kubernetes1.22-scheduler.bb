SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-scheduler-1.22.17-2.1.aarch64.rpm"
RPM_HASH = "11e1872a0e2d240436911b5f577ffd49efe195d68531f38e41d5d4319ffff6647f9d7096dbdd47f8a6b6a4cc1bf5094f95b138cf3a27866abe9fbbbf4c9d1806"

RPROVIDES:${PN} += "kubernetes-scheduler-provider kubernetes1.22-scheduler kubernetes1.22-scheduler(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
