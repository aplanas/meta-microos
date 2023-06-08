SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-apiserver-1.21.14-2.1.aarch64.rpm"
RPM_HASH = "5de442e1aa478986e1f9b743cde873207f5b6a92f21da0458621361915081b3b405453e6e59cbfcea450c075472e0c0ece63d65a05bfddaf06c7abd48e39e03d"

RPROVIDES:${PN} += "kubernetes-apiserver-provider kubernetes1.21-apiserver kubernetes1.21-apiserver(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
