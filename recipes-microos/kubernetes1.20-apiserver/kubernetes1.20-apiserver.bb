SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-apiserver-1.20.15-2.1.aarch64.rpm"
RPM_HASH = "c6b6fbb4668c9418821861f3d28724eba339523d10e10e607a97385bd1f0e32dbccf2813de237cfc9a4767e389a94908efd4f2fa7024a817b4dde32e6e13f1fd"

RPROVIDES:${PN} += "kubernetes-apiserver-provider kubernetes1.20-apiserver kubernetes1.20-apiserver(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
