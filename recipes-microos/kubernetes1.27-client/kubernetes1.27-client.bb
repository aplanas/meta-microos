SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-client-1.27.1-1.2.aarch64.rpm"
RPM_HASH = "806cd7dca0908d3e53d2c238890da8ee7cf6054994ceea06595a97dccffa8185adfff3b12d2c44dae164eb5130b7cf1429134f357cfedbfc2a367dcb6f1d7c07"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.27-client \
kubernetes1.27-client(aarch-64)"
RDEPENDS:${PN} += "kubernetes1.27-client-common \
update-alternatives"

inherit rpm
