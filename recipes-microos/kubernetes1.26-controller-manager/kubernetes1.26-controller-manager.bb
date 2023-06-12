SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-controller-manager-1.26.4-1.2.aarch64.rpm"
RPM_HASH = "9afc9f8839e4e9ee1fbe94df398a318e0dbe7365af34c893f59dfb6dceec04ec6853f6ffa22a3424647217f238f0e2709d8f661a30a30717b9634d3c69b89a6d"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.26-controller-manager \
kubernetes1.26-controller-manager(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
