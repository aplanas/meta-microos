SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-client-common-1.24.13-2.1.aarch64.rpm"
RPM_HASH = "ace306bf3d6bae4bfffd9c425fdc2ff4acc8558a070800445da1f606720a16b3fb94c70c7e767a8cfc4b9ebc36b3ff69962756cea1ceb033bd199fe6074cb642"

RPROVIDES:${PN} += "kubernetes-client-common kubernetes1.24-client-common kubernetes1.24-client-common(aarch-64)"
RDEPENDS:${PN} += "/bin/sh kubernetes1.24-client"

inherit rpm
