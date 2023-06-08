SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-client-1.27.1-1.1.aarch64.rpm"
RPM_HASH = "3de62b8656e852634a966ae2587e2cae7395e69e9417f2e8fe7d3db41d796d2555d63f1fcccb320a108ff601375efa575a3858985e3ea329a89b7ef9d5283c7e"

RPROVIDES:${PN} += "kubernetes-client-provider kubernetes1.27-client kubernetes1.27-client(aarch-64)"
RDEPENDS:${PN} += "kubernetes1.27-client-common update-alternatives"

inherit rpm
