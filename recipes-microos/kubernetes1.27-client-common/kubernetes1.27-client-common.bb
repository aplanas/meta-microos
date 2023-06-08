SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-client-common-1.27.1-1.1.aarch64.rpm"
RPM_HASH = "2d93ec622fd1b306b00512f96e5aefc4d29250f679de1a62e953d855c1b4b7cd42466bb4686ffd221da3bf746cd9c463c99869a13d2ebbfa0cafc2bddabb7176"

RPROVIDES:${PN} += "kubernetes-client-common kubernetes1.27-client-common kubernetes1.27-client-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh kubernetes1.27-client"

inherit rpm
