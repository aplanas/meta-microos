SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-controller-manager-1.23.17-3.1.aarch64.rpm"
RPM_HASH = "3391ae6a8a683dbf27e7f5aaa4ebdcc24c2461f187f32066a433e776dada46fac1780559a617dfd9942ca1299db930d3580513ccd36569f89f3d79a87adc6200"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider kubernetes1.23-controller-manager kubernetes1.23-controller-manager(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
