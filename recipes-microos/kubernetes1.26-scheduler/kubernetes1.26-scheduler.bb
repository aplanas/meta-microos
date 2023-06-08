SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-scheduler-1.26.4-1.1.aarch64.rpm"
RPM_HASH = "92835367b3e05fec5f40ba4195d8ecf01e35e26609f9b3479ecd2d604d5dd4c12ad1587e5d3ce379f6e6ee8bd996118d6be73d9c8c65e5ad03580e9468452115"

RPROVIDES:${PN} += "kubernetes-scheduler-provider kubernetes1.26-scheduler kubernetes1.26-scheduler(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
