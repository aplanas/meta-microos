SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-apiserver-1.25.9-1.1.aarch64.rpm"
RPM_HASH = "8800137609ac17f2f8b47f9052c66b33acad0d5f17ad316aea51c5cc5e4c6fdef3faf3d18aa5837024f0c05258ae37a4f433dd666b17baefe6625854d05bd417"

RPROVIDES:${PN} += "kubernetes-apiserver-provider kubernetes1.25-apiserver kubernetes1.25-apiserver(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
