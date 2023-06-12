SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-apiserver-1.20.15-2.2.aarch64.rpm"
RPM_HASH = "7605f0fb7cc82e39c90069025a4de7067e14b6ca073789e88b0e4abd31f4b6f986d4bdc3b6eed2974be9f263dc713b517a7fde2db879c0c17ced0c32d8ee9810"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.20-apiserver \
kubernetes1.20-apiserver(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
